package appDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

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

public class ShowImageUsingFileChooser extends Application {
	Image catImage;
	ImageView centerView;
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws FileNotFoundException, Exception {
		BorderPane bPane = new BorderPane();
		
		File imageFile1 = new File("crazyCat.jpg");	
		String imgLocStr = imageFile1.toURI().toURL().toExternalForm(); 

		catImage = new Image(imgLocStr, false); //false => does not load in background, loads immediately
		centerView = new ImageView(catImage);
		bPane.setCenter(centerView);
		

		FileChooser fc = new FileChooser();
		fc.setTitle("Open File");

		Button openBtn = new Button("Open");
		bPane.setBottom(openBtn);

		// action event
		EventHandler<ActionEvent> myBtnEvent = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				try {
					File gotFile = fc.showOpenDialog(primaryStage);
					String tempImgLocStr = gotFile.toURI().toURL().toExternalForm();
					Image tempImage = new Image(tempImgLocStr, false); //false => does not load in background, loads immediately
					ImageView tempView = new ImageView(tempImage);
					bPane.setCenter(tempView);
				} catch (MalformedURLException e1) {
					e1.printStackTrace();
				} 
			}
		};

		// when button is pressed
		openBtn.setOnAction(myBtnEvent);
		
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
