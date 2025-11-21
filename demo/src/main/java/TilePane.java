import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class PianoApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a TilePane
        TilePane tilePane = new TilePane();
        tilePane.setPadding(new Insets(20, 10, 20, 10)); // Add padding
        tilePane.setHgap(10); // Horizontal gap between tiles
        tilePane.setVgap(10); // Vertical gap between tiles
        tilePane.setAlignment(Pos.CENTER); // Center the tiles in the pane

        // Create several buttons and add them to the TilePane
        for (int i = 1; i <= 9; i++) {
            Button button = new Button("Button " + i);
            button.setPrefSize(100, 100); // Set preferred size for uniform look
            // Optional: Make buttons expand to fill the tile size
            button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
            button.setOnAction(e -> System.out.println(button.getText() + " clicked!"));
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
