import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane(); // Create a new Pane

        Button button1 = new Button("Button 1");
        button1.setLayoutX(50); // Set X position
        button1.setLayoutY(50); // Set Y position
        button1.setOnAction(e->{System.out.println("Hi");});

        Button button2 = new Button("Button 2");
        button2.setLayoutX(50); // Set X position
        button2.setLayoutY(70); // Set Y position
        button2.setOnAction(e->{System.out.println("Hi");});

        root.getChildren().addAll(button1, button2); // Add buttons to the pane

        Scene scene = new Scene(root, 300, 200); // Create a scene with the pane
        primaryStage.setTitle("Pane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}