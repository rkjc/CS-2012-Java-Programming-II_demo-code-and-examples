package d_shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		// Create a pane to hold the circle
		Pane pane = new Pane();
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 500, 400);

		// Create a circle and set its properties
		Circle circle = new Circle();
		circle.setCenterX(scene.getWidth() / 2);
		circle.setCenterY(scene.getHeight() / 2);
		circle.setRadius(100);
		circle.setStroke(Color.BLACK);
		circle.setFill(null);

		pane.getChildren().add(circle);

		System.out.println(pane.getWidth());

		primaryStage.setTitle("ShowCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		
		primaryStage.show(); // Display the stage

	}

	public static void main(String[] args) {
		launch(args);
	}
}
