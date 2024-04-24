package appHelloGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * // make sure to add these lines to the // module-info.java // file
 * 
 * 
 * module _13_JavaFX_GUI { requires javafx.base; requires javafx.graphics;
 * requires javafx.controls;
 * 
 * exports app; exports appGUI; }
 * 
 */

public class Hello_GUI extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// create a new Text shape
		Text messageText = new Text("Hello gooey World!\n Time to make some JavaFX GUI's");

		// stack page
		StackPane groot = new StackPane();

		// add Text shape to Stack Pane
		groot.getChildren().add(messageText);

		Scene scene = new Scene(groot, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

// thanks for the sample code to:
// https://www.tutorialkart.com/javafx/basic-javafx-example-application/
