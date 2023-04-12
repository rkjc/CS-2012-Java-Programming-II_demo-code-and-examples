package appDemos;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ControlCircleWithMouseAndKey extends Application {
	private Circle myCircle = new Circle(50);

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Hold two buttons in an HBox
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		Label mtxt = new Label("hey there");
		
		hBox.getChildren().add(mtxt);
		hBox.getChildren().add(btEnlarge);
		hBox.getChildren().add(btShrink);

		// Create and register the handler
		btEnlarge.setOnAction(e -> myCircle.setRadius(myCircle.getRadius() * 1.2));
		btShrink.setOnAction(e -> myCircle.setRadius(myCircle.getRadius() / 1.2));

		BorderPane borderPane = new BorderPane();
		BorderPane.setAlignment(hBox, Pos.CENTER);
		borderPane.setBottom(hBox);
		borderPane.setCenter(myCircle);
		//borderPane.setBottom(btEnlarge);
		//?? ONLY see arrow keys when holding a modifier key if a button is placed anywhere.
	

		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 300, 250);
		primaryStage.setTitle("ControlCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		myCircle.setOnMouseClicked(e -> {
			
			System.out.println(e.getButton());
			if (e.getButton() == MouseButton.PRIMARY) {
				myCircle.setRadius(myCircle.getRadius() * 1.1);
			} else if (e.getButton() == MouseButton.SECONDARY) {
				myCircle.setRadius(myCircle.getRadius() / 1.1);
			}
		});

		//?? ONLY see arrow keys when holding a modifier key if a button is placed anywhere.
		scene.setOnKeyPressed(e -> {
			System.out.println(e.getCode());
			if (e.getCode() == KeyCode.UP) {
				myCircle.setRadius(myCircle.getRadius() * 1.1);
			} else if (e.getCode() == KeyCode.DOWN) {
				myCircle.setRadius(myCircle.getRadius() / 1.1);
			}
		});
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	} 
}


