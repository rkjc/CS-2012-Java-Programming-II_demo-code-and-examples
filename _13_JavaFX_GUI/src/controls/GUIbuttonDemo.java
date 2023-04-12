package controls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUIbuttonDemo  extends Application{

	@Override
	public void start(Stage primaryStage) { // the 'Stage' is the Window that will be opened on the desktop
		try {			
			// make a stack page to hold all of the 
			StackPane root = new StackPane();
			
			//----------------- button code ----------------------
			// create a new Button (Button is a subclass of Control)
			Button btn = new Button();
			
			System.out.println(btn.getTypeSelector());
			// set text inside button
			btn.setText("Display Message");

			// action event
			EventHandler<ActionEvent> myBtnEvent = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					btn.setText("Hi there! You clicked the button!");
				}
			};

			// when button is pressed
			btn.setOnAction(myBtnEvent);

			// ------------- assemble the GUI window -------------
			// add button to Stack Pane
			root.getChildren().add(btn);

			Scene scene = new Scene(root, 250, 100);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
