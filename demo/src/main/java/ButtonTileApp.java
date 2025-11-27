import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class ButtonTileApp extends Application {
    @Override
    public void start(Stage primaryStage) {

        TilePane whiteKeys = new TilePane();
        whiteKeys.setPrefColumns(7);
        whiteKeys.setHgap(1);
        whiteKeys.setAlignment(Pos.CENTER);
        for (int i = 0; i < 7; i++) {
            Button wb = new Button();
            wb.setPrefSize(50, 100);
            wb.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #000000;");
            wb.setOnAction(e -> System.out.println(" clicked!"));
            whiteKeys.getChildren().add(wb);
        }

        TilePane blackKeys = new TilePane();
        blackKeys.setPrefColumns(7);
        blackKeys.setHgap(5);
        blackKeys.setAlignment(Pos.TOP_CENTER);
        for (int i = 0; i < 7; i++) {
            if (i == 0 || i == 1 || i == 3 || i == 4 || i == 5) {
                Button bb = new Button();
                bb.setPrefSize(25, 60);
                bb.setStyle("-fx-background-color: #000000;");
                bb.setOnAction(e -> System.out.println(" clicked!"));
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
