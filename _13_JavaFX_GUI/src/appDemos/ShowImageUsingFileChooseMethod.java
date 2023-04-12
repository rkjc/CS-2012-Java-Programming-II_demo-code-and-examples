package appDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ShowImageUsingFileChooseMethod extends Application {
	Image catImage;
	ImageView centerView;
	Stage primaryStage2;

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws FileNotFoundException, Exception {
		BorderPane bPane = new BorderPane();
		bPane.setCenter(getPic("crazyCat.jpg"));

		Button openBtn = new Button("Open");
		bPane.setBottom(openBtn);

		// action event
		EventHandler<ActionEvent> myBtnEvent = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				bPane.setCenter( getPic(primaryStage) );
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

	public ImageView getPic(String fileName) throws Exception {
		File imageFile1 = new File(fileName);
		String imgLocStr = imageFile1.toURI().toURL().toExternalForm();
		Image tempImage = new Image(imgLocStr, false); // false => does not load in background, loads immediately
		ImageView tempImageView = new ImageView(tempImage);
		tempImageView.setPreserveRatio(true);
		tempImageView.setFitHeight(300);

		return tempImageView;
	}

	public ImageView getPic(Stage primaryStage) {
		try {
			FileChooser tfc = new FileChooser();
			File imageFile1 = tfc.showOpenDialog(primaryStage);
			String imgLocStr = imageFile1.toURI().toURL().toExternalForm();
			Image tempImage = new Image(imgLocStr, false); // false => does not load in background, loads immediately
			System.out.println(tempImage.getHeight());
			ImageView tempImageView = new ImageView(tempImage);
			tempImageView.setPreserveRatio(true);
			tempImageView.setFitHeight(300);

			return tempImageView;			
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	// --------------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}
