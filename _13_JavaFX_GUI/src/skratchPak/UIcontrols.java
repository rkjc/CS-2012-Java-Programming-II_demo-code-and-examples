package skratchPak;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UIcontrols   extends Application{

	@Override
	public void start(Stage primaryStage) { // the 'Stage' is the Window that will be opened on the desktop
		try {		
			
			Node norb1;
			
			Node norb2 = new Pane();
			
			ButtonBase butbase;
			
			// make a stack page to hold all of the 
			StackPane root = new StackPane();
			
			//----------------- button code ----------------------
			// create a new Button (Button is a subclass of Control)
			ToggleButton btn = new ToggleButton();
			
			//btn.
			
			System.out.println(btn.getTypeSelector());
			// set text inside button
			btn.setText("Display Message");

			// action event
			EventHandler<ActionEvent> myBtnEvent = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					btn.setText("Hi there! You clicked the button!");
					System.out.println(btn.isSelected());
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