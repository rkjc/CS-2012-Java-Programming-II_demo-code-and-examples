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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class ClockAnimationWithButton extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	    VBox vBox = new VBox(15);
	    vBox.setPadding(new Insets(15, 5, 5, 5));
	     
	
    ClockPane clock = new ClockPane(); // Create a clock

    // Create a handler for animation
    EventHandler<ActionEvent> myClockUpdater = e -> {
      clock.setCurrentTime(); // Set a new clock time
    };
    
    // ---------------------------------
	Button btn1 = new Button();
	Button btn2 = new Button();
	// set text inside button
	btn1.setText("btn 1");
	btn1.setText("btn 2");

	// action event
	EventHandler<ActionEvent> myBtn1Event = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			//todo
		}
	};
	
	EventHandler<ActionEvent> myBtn2Event = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			//todo
		}
	};

	// when button is pressed
	btn1.setOnAction(myBtn1Event);
	btn2.setOnAction(myBtn2Event);
	
    HBox hBox = new HBox(15); 
    hBox.setPadding(new Insets(15, 15, 15, 15));
    
    hBox.setStyle("-fx-background-color: blue");

    hBox.getChildren().addAll(btn1, btn2);
    
    
    vBox.getChildren().add(clock); 
    vBox.getChildren().add(hBox); 
    
    // ---------------------------------

    // Create an animation for a running clock
    Timeline myAnimation = new Timeline(new KeyFrame(Duration.millis(1000), myClockUpdater));
    
    myAnimation.setCycleCount(Timeline.INDEFINITE);
    myAnimation.play(); // Start animation
    
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(vBox, 400, 400);
    primaryStage.setTitle("ClockAnimation"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
