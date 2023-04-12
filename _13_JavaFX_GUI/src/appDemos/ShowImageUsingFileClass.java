package appDemos;

import java.io.File;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ShowImageUsingFileClass extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws FileNotFoundException, Exception {
		BorderPane bPane = new BorderPane();
		
		File imageFile1 = new File("crazyCat.jpg");	
		String imgLocStr = imageFile1.toURI().toURL().toExternalForm(); 

		Image catImage = new Image(imgLocStr, false); //false => does not load in background, loads immediately
		ImageView catView = new ImageView(catImage);
		bPane.setCenter(catView);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(bPane);
		primaryStage.setTitle("ShowImage"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	
//--------------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}
