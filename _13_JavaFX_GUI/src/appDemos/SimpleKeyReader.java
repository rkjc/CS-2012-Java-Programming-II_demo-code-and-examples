package appDemos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimpleKeyReader extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		StackPane sPane = new StackPane();

		// Create a scene and place it in the stage
		Scene scene = new Scene(sPane, 200, 150);
		primaryStage.setTitle("ControlCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		
		scene.setOnKeyPressed(e -> {
			System.out.println(e.getCode());
			
			if (e.getCode() == KeyCode.UP) {
				System.out.println("------ you pushed the UP arrow -------");
			}
			
		});

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
