package chapter14;

import java.io.File;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowImageOrg extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// Create a pane to hold the image views
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(15, 15, 15, 15));
		Image image = new Image(new File("crazyCat.jpg").toURI().toURL().toExternalForm(), false);
		pane.getChildren().add(new ImageView(image));

		ImageView imageView2 = new ImageView(image);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(100);
		pane.getChildren().add(imageView2);

		ImageView imageView3 = new ImageView(image);
		imageView3.setRotate(90);
		pane.getChildren().add(imageView3);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowImage"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}