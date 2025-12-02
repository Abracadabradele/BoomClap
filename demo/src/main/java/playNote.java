
public class playNote {
    private int octaveNum;
    private String basePath;
    private static final String[] wbnotes = {"C", "D", "E", "F", "G", "A", "B"};
    private static final String[] bbnotes = {"Db", "Eb","", "Gb", "Ab", "Bb"};
    private String notepath;
    

    public playNote(int octaveNum) {
        this.octaveNum = octaveNum;
        this.basePath = "BoomClap/demo/src/main/java/audio/" + "octave" + Integer.toString(octaveNum)+"/";
        // for (int i =0; i < this.notepaths.length; i++ ) {
        //     this.notepath = this.notepaths[i]+this.octaveNum;
            
        // }

    }
    public String getFullPathWB(int buttonNum) {
        return this.basePath + this.wbnotes[buttonNum-1]+ this.octaveNum +".mp3";
    }
    public String getFullPathBB(int buttonNum) {
        return this.basePath + this.bbnotes[buttonNum-1]+ this.octaveNum +".mp3";
    }


    // general class for octave; 
    //should be abstract so each octave can extend, subbing in proper notes
}
