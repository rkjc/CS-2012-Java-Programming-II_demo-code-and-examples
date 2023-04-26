package appBasicsFX;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class HelloGUImain extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// create a new Text shape
			Text messageText = new Text("Hello World! Lets learn JavaFX."); 
			
			//Text messageText2 = new Text("more text for\nthe fun of it, because\nthats what we do");
			// stack page
			StackPane groot = new StackPane();
			groot.setStyle("-fx-border-color: red");

			// add Text shape to Stack Pane
			groot.getChildren().add(messageText);
			//groot.getChildren().add(messageText2);
			
			Scene scene = new Scene(groot, 400, 400);

			primaryStage.setScene(scene);
			
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}