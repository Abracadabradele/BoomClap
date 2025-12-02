import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.*;
import javafx.scene.web.*;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class ButtonTileApp extends Application {
    private MediaPlayer player;
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
     
        
        for (int i = 0; i < 7; i++) {
            Button wb = new Button(""+(i+1));
            wb.setPrefSize(50, 100);
            wb.setLayoutX(i*50);
            wb.setLayoutY(0);
            wb.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #000000;");
            wb.setOnAction(e -> {
            int buttonNum = Integer.parseInt(wb.getText());
            int octaveNum = 4;
            playNote currentNote = new playNote(octaveNum);
            String fullpath = currentNote.getFullPathWB(buttonNum);
            Media media = new Media(new File(fullpath).toURI().toString());
            player = new MediaPlayer(media);
            player.setVolume(1.0); // set volume
            player.play();
            System.out.println("note plated: " + fullpath);

        });
        wb.setOnMousePressed(e-> wb.setStyle("-fx-background-color: #FF8DA1; -fx-border-color: #000000;"));
        wb.setOnMouseReleased(e-> wb.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #000000;"));

        root.getChildren().add(wb);
        }
        
        for (int i = 0; i < 7; i++) {
            if (i == 0 || i == 1 || i == 3 || i == 4 || i == 5) {
                Button bb = new Button(""+(i+1));
                bb.setPrefSize(25, 60);
                bb.setLayoutY(0);
                double x;
                if(i==0){
                     x=37.5;
                }
                else{
                     x=((50*(i+1))-12.5);
                }

                bb.setLayoutX(x);
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
        //bb.setOnMousePressed(e-> wb.setStyle("-fx-background-color: #a34657ff; -fx-border-color: #000000;"));
        //bb.setOnMouseReleased(e-> wb.setStyle("-fx-background-color: #0000; -fx-border-color: #000000;"));
       
        root.getChildren().add(bb);
            } else{
               continue;
            }
        }
        Button plus = new Button("Increase octave");
        plus.setLayoutY(125);
        plus.setLayoutX(200);
        plus.setPrefSize(10,10);
        root.getChildren().add(plus);


        Button minus = new Button("Decrease octave");
        minus.setLayoutY(125);
        minus.setLayoutX(125);
        minus.setPrefSize(10,10);
        root.getChildren().add(minus);




    Scene scene = new Scene(root,350,175);
    primaryStage.setTitle("Dillan is so cool and smart!🤤😍-Adele");
    primaryStage.setScene(scene);
    primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
