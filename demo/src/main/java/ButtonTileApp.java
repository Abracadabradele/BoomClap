import java.awt.event.KeyEvent;
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
import java.util.*;

public class ButtonTileApp extends Application {
    private MediaPlayer player;
    private int octaveNum;
    private String whiteNotes[];
    private ArrayList<Button> whiteKeys = new ArrayList<>();
    private ArrayList<Button> blackKeys = new ArrayList<>();
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        octaveNum = 4;
        
        for (int i = 0; i < 7; i++) {
            final int buttonNum = i+1;
            String string = "CDEFGAB";
            Button wb = new Button(""+string.charAt(i));
            whiteKeys.add(wb);
            wb.setPrefSize(50, 100);
            wb.setLayoutX(i*50);
            wb.setLayoutY(0);
            wb.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #000000;");
            wb.setOnAction(e -> {
            playNote currentNote = new playNote(octaveNum);
            String fullpath = currentNote.getFullPathWB(buttonNum);
            Media media = new Media(new File(fullpath).toURI().toString());
            player = new MediaPlayer(media);
            player.setVolume(1.0); // set volume
            player.play();
            System.out.println("note plated: " + fullpath);
            // x=x+1;

        });
        wb.setOnMousePressed(e-> wb.setStyle("-fx-background-color: #FF8DA1; -fx-border-color: #000000;"));
        wb.setOnMouseReleased(e-> wb.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #000000;"));

        root.getChildren().add(wb);
        }
        
        for (int i = 0; i < 7; i++) {
            if (i == 0 || i == 1 || i == 3 || i == 4 || i == 5) {
                final int buttonNum= i+1;
                String black = "CD FGA";
                Button bb = new Button(""+black.charAt(i)+"#");
                blackKeys.add(bb);
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
                bb.setStyle("-fx-background-color: #000000; -fx-font-size: 7pt; -fx-color: #ffffff; -fx-text-fill: white;");
                bb.setOnAction(e -> {
                    playNote currentNote = new playNote(octaveNum);
                    String fullpath = currentNote.getFullPathBB(buttonNum);
                    Media media = new Media(new File(fullpath).toURI().toString());
                    player = new MediaPlayer(media);
                    player.setVolume(1.0); //set volume
                    player.play();
                    System.out.println("note plated: " + fullpath);
        
                });

        
        bb.setOnMousePressed(e-> bb.setStyle("-fx-background-color: #FF8DA1; -fx-font-size: 7pt; -fx-color: #ffffff; -fx-text-fill: white;"));
        bb.setOnMouseReleased(e-> bb.setStyle("-fx-background-color: #000000; -fx-font-size: 7pt; -fx-color: #ffffff; -fx-text-fill: white;"));
       
        root.getChildren().add(bb);
            } else{
               continue;
            }
        }
        Button plus = new Button("+");
        plus.setLayoutY(125);
        plus.setLayoutX(200);
        plus.setPrefSize(10,10);
        root.getChildren().add(plus);
        Button cod = new Button(""+octaveNum);
        cod.setStyle("-fx-background-color: #ef8d9fff;");
        cod.setLayoutY(125);
        cod.setLayoutX(160);
        cod.setPrefSize(20, 20);
        root.getChildren().add(cod);
        plus.setOnAction(e -> {
            if (octaveNum == 7) {
            } else {
                octaveNum++;
                cod.setText(""+octaveNum);
            }
            System.out.println(octaveNum);
            
        });

        Button minus = new Button("-");
        minus.setLayoutY(125);
        minus.setLayoutX(125);
        minus.setPrefSize(10,10);
        minus.setOnAction(e -> {
            if (octaveNum == 1) {
            } else {
                octaveNum--;
                cod.setText(""+octaveNum);
            }
            System.out.println(octaveNum);
            
        });
        root.getChildren().add(minus);

    Scene scene = new Scene(root,350,175);
    primaryStage.setTitle("Adele is so cool and smart!🤤😍-Adele");
    primaryStage.setScene(scene);
    primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
