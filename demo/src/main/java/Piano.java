import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class Piano extends Application {
    private MediaPlayer player;

    @Override
    public void start(Stage primaryStage) {
        // Octave[] octaves = new Octave[12];
        // for (int i = 0; i< octaves.length; i++) {
        //     octaves[i] = new Octave(i+1);
        // }
        // Create a TilePane
        TilePane tilePane = new TilePane();
        tilePane.setPadding(new Insets(20, 10, 20, 10)); // Add padding
        tilePane.setHgap(10); // Horizontal gap between tiles
        tilePane.setVgap(10); // Vertical gap between tiles
        tilePane.setAlignment(Pos.CENTER); // Center the tiles in the pane

        // Create several buttons and add them to the TilePane
        for (int i = 1; i <= 12; i++) {
            Button button = new Button(""+i);
            button.setPrefSize(100, 100); // Set preferred size for uniform look
            // Optional: Make buttons expand to fill the tile size
            button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
            button.setOnAction(e -> {
                int buttonNum = Integer.parseInt(button.getText());
                int octaveNum =4;
                playNote currentNote = new playNote(octaveNum); //somewhere here its messing up --adding octavenum each time - 1st works, e4, second it becomes e44, third e444
                String fullpath = currentNote.getFullPath(buttonNum);
                Media media = new Media(new File(fullpath).toURI().toString());
                player = new MediaPlayer(media);
                player.setVolume(1.0); //set volume
                player.play();
        
            }); // call octave, make play noise

            tilePane.getChildren().add(button);
        }

        // Create the scene and show the stage
        Scene scene = new Scene(tilePane, 400, 400);
        primaryStage.setTitle("Button Tile Plane (JavaFX)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
