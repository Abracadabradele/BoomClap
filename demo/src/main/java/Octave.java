


public class Octave {
    private int octaveNum;
    private String basePath;
    private static final String[] notepaths = {"C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B"};
    

    public Octave(int octaveNum) {
        this.octaveNum = octaveNum;
        this.basePath = "BoomClap/demo/src/main/java/audio/" + "octave" + Integer.toString(octaveNum);
        for (int i =0; i < this.notepaths.length; i++ ) {
            this.notepaths[i] = this.notepaths[i]+ Integer.toString(octaveNum);
        }

    }
    // general class for octave; 
    //should be abstract so each octave can extend, subbing in proper notes
}
