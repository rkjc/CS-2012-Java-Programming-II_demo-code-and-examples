package controls;

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
import javafx.scene.text.Text;

public class ButtonDemo extends Application {
	protected Text text = new Text(50, 40, "JavaFX Programming");

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws URISyntaxException {

		// Create a scene and place it in the stage
		Scene scene = new Scene(getPane(), 450, 300);
		primaryStage.setTitle("ButtonDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

	protected BorderPane getPane() throws URISyntaxException {
		HBox paneForButtons = new HBox(20);

		Image img1 = new Image(getClass().getResource("weatherIcon.gif").toURI().toString());
		Image img2 = new Image(getClass().getResource("compassIcon.gif").toURI().toString());
		
		ImageView imageView1 = new ImageView(img1);
		imageView1.setFitHeight(100);
		imageView1.setFitWidth(100);
		
		ImageView imageView2 = new ImageView(img2);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(100);

		Button btLeft = new Button("Left", imageView1);
		Button btRight = new Button("Right", imageView2);
		paneForButtons.getChildren().addAll(btLeft, btRight);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setStyle("-fx-border-color: green");

		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);

		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);
		pane.setTop(paneForText);

		btLeft.setOnAction(e -> text.setX(text.getX() - 10));
		btRight.setOnAction(e -> text.setX(text.getX() + 10));

		return pane;
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}

