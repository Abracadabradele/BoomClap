
public class playNote {
    private int octaveNum;
    private String basePath;
    private static final String[] wbnotes = {"C", "D", "E", "F", "G", "A", "B"};
    private static final String[] bbnotes = {"Db", "Eb","", "Gb", "Ab", "Bb"};
    private String notepath;
    

    public playNote(int octaveNum) {
        this.octaveNum = octaveNum;
        this.basePath = "BoomClap/demo/src/main/java/audio/";

    }
    public String getFullPathWB(int buttonNum, String instrument, int octaveNum) {

            return this.basePath + instrument+ "/"+ "octave"+ Integer.toString(octaveNum)+"/"+ this.wbnotes[buttonNum-1]+ this.octaveNum +".mp3";
    }
    public String getFullPathBB(int buttonNum, String instrument, int octaveNum) {
                  return this.basePath + instrument+ "/"+ "octave"+ Integer.toString(octaveNum)+"/"+ this.bbnotes[buttonNum-1]+ this.octaveNum +".mp3";

    }


}
