
public class playNote {
    private int octaveNum;
    private String basePath;
    private static final String[] notepaths = {"C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B"};
    private String fullpath;
    

    public playNote(int octaveNum) {
        this.octaveNum = octaveNum;
        this.basePath = "BoomClap/demo/src/main/java/audio/" + "octave" + Integer.toString(octaveNum)+"/";
        for (int i =0; i < this.notepaths.length; i++ ) {
            this.notepaths[i] = this.notepaths[i]+this.octaveNum;
            
        }

    }

    public String getFullPath(int buttonNum) {
        return this.basePath + this.notepaths[buttonNum-1]+ ".mp3";
    }


    // general class for octave; 
    //should be abstract so each octave can extend, subbing in proper notes
}
