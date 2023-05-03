package animations_demo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class ClockAnimationWithButton extends Application {
	// ----- class level variables ----
	Boolean runClock = true;

	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		Button btn1 = new Button();
		Button btn2 = new Button();
		
		// ------ making panes ------

		ClockPane clockPane = new ClockPane(); // Create a clock
		clockPane.setMinSize(400, 400);

		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(5, 5, 5, 5));

		HBox hBox = new HBox(15);
		hBox.setPadding(new Insets(15, 15, 15, 15));
		hBox.setStyle("-fx-background-color: lightblue");

		// ----- making event handlers ------
		// ---- Create a handler for animation ----
		EventHandler<ActionEvent> myClockUpdater = e -> {
			if (runClock) {
				clockPane.setCurrentTime(); // Set a new clock time
			}
		};

		// action event
		EventHandler<ActionEvent> myBtn1Event = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if (runClock) {
					runClock = false;
					btn1.setStyle("-fx-background-color: blue");
				} else {
					runClock = true;
					btn1.setStyle("-fx-background-color: #f3b");
				}
			}
		};

		EventHandler<ActionEvent> myBtn2Event = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				// todo
			}
		};

		// ----------- making controls -----------------

		// Create an animation for a running clock
		Timeline myAnimation = new Timeline(new KeyFrame(Duration.millis(1000), myClockUpdater));

		myAnimation.setCycleCount(Timeline.INDEFINITE);
		myAnimation.play(); // Start animation

		// ---- making buttons -----

		
		// set text inside button
		btn1.setText("start/stop");
		btn2.setText("button 2");
		// when button is pressed
		btn1.setOnAction(myBtn1Event);
		btn2.setOnAction(myBtn2Event);

		// ------ assembling layout ------

		hBox.getChildren().addAll(btn1, btn2);

		vBox.getChildren().add(clockPane);
		vBox.getChildren().add(hBox);

		// ---------------------------------

		StackPane sroot = new StackPane();
		sroot.getChildren().add(vBox);
		
		
		Scene scene = new Scene(sroot, 400, 500);
		// Create a scene and place it in the stage
		// Scene scene = new Scene(vBox, 400, 400);
		primaryStage.setTitle("ClockAnimation"); // Set the stage title
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
