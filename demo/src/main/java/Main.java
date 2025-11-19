import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.geometry.Pos;

public class Main extends Application {
  public static void main(String[] args) {
    launch(args);
  }
  @Override
    public void start(Stage mainStage) {
      Color backgroundColor = Color.rgb(131, 156, 201);
      Color keyColor = Color.rgb(170, 191, 191);
      Color sharpFlatKey = Color.rgb(5, 19, 46); 
      Pane bgPane = new Pane();
      bgPane.setPrefWidth(400.0);
      bgPane.setPrefHeight(400.0);
      
      Background backckground = new Background(new BackgroundFill(backgroundColor, null, null));
      bgPane.setBackground(backckground);
      


      // Label greeting = new Label();
      // greeting.("hello");
      
      VBox vBox = new VBox(bgPane);
      //vBox.getChildren().addAll(greeting);
      
      Scene scene = new Scene(vBox, 400, 400);
      mainStage.setScene(scene);
      mainStage.show();
    } 
    
  }