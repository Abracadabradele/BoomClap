import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class ButtonTileApp extends Application {
    private MediaPlayer player;
    @Override
    public void start(Stage primaryStage) {

        TilePane whiteKeys = new TilePane();
        whiteKeys.setPrefColumns(7);
        whiteKeys.setHgap(1);
        whiteKeys.setAlignment(Pos.CENTER);
        for (int i = 0; i < 7; i++) {
            Button wb = new Button(""+(i+1));
            wb.setPrefSize(50, 100);
            wb.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #000000;");
            wb.setOnAction(e -> {
                    // int buttonNum = Integer.parseInt(wb.getText());
                    // int octaveNum =4;
                    // playNote currentNote = new playNote(octaveNum);
                    // String fullpath = currentNote.getFullPathWB(buttonNum);
                    // Media media = new Media(new File(fullpath).toURI().toString());
                    // player = new MediaPlayer(media);
                    // player.setVolume(1.0); //set volume
                    // player.play();
                    // System.out.println("note plated: " + fullpath);
                    System.out.println("clicked");
                });
            whiteKeys.getChildren().add(wb);
        }

        TilePane blackKeys = new TilePane();
        blackKeys.setPrefColumns(7);
        blackKeys.setHgap(5);
        blackKeys.setAlignment(Pos.TOP_CENTER);
        for (int i = 0; i < 7; i++) {
            if (i == 0 || i == 1 || i == 3 || i == 4 || i == 5) {
                Button bb = new Button(""+(i+1));
                bb.setPrefSize(25, 60);
                bb.setStyle("-fx-background-color: #000000;");
                bb.setOnAction(e -> {
                    int buttonNum = Integer.parseInt(bb.getText());
                    int octaveNum =4;
                    playNote currentNote = new playNote(octaveNum);
                    String fullpath = currentNote.getFullPathBB(buttonNum);
                    Media media = new Media(new File(fullpath).toURI().toString());
                    player = new MediaPlayer(media);
                    player.setVolume(1.0); //set volume
                    player.play();
                    System.out.println("note plated: " + fullpath);
        
                });
                blackKeys.getChildren().add(bb);
            } else
                blackKeys.getChildren().add(new javafx.scene.layout.Region());
        }
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(whiteKeys, blackKeys);
        Scene scene = new Scene(stackPane, 500, 150);
        primaryStage.setTitle("Piano");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
