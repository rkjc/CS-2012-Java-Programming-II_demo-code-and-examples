package panesAndStuff;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DemoMain3 extends Application {
//
	Text messageText = new Text("Hello World! Lets learn JavaFX.");
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			StackPane spane = new StackPane();

//			primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
//	            @Override
//	            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//	                System.out.println("Width changed!!");
//	            }
//	        });
//
//			primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
//	            @Override
//	            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//	                System.out.println("Height changed!!");
//	            }
//	        });
			messageText.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));

			// create a new Button (Button is a subclass of Control)
			//Button btn = new Button();
			// set text inside button
			//btn.setText("Display Message");

			// --- define action event ----
			EventHandler<ActionEvent> zevent = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					// btn.setText("Hi there! You clicked the button!");
					String mssg = "i have been changed";
					messageText.setText(mssg);
				}
			};
			
			EventHandler<ActionEvent> revent = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					// btn.setText("Hi there! You clicked the button!");
					String mssg = "i have been changed";
					messageText.setText(mssg);
				}
			};

			// when button is pressed
			//btn.setOnAction(zevent);

			// ------------- assemble the GUI window -------------
			// add button to Stack Pane

			spane.getChildren().add(messageText);
			//spane.getChildren().add(btn);
			
			
			Scene scene = new Scene(spane, 400, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
			//scene.widthProperty().addListener(new InvalidationListener() {ov –> resize();});
			//scene.heightProperty().addListener(ov –> resize());
			
			EventHandler<ActionEvent> reevent = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					// btn.setText("Hi there! You clicked the button!");
					String mssg = "i have been changed";
					messageText.setText(mssg);
				}
			};
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void resize() {
		messageText.setFont(Font.font(20));
	}

	public static void main(String[] args) {
		System.out.println("working");
		Application.launch(args);
	}
}
