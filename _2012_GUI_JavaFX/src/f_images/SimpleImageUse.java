package f_images;

import java.net.URISyntaxException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class SimpleImageUse extends Application {
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws URISyntaxException {

		StackPane spane = new StackPane();

		Image img1 = new Image(getClass().getResource("orange-dragon.gif").toURI().toString());
		
		ImageView imageView1 = new ImageView(img1);
		imageView1.setFitHeight(400);
		imageView1.setFitWidth(400);
		
		spane.getChildren().add(imageView1);
		
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(spane, 500, 500);
		//primaryStage.setTitle("ImageDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}


	public static void main(String[] args) {
		launch(args);
	}
}

