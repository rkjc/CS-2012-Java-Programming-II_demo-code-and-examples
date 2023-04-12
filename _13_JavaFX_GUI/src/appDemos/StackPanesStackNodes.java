package appDemos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StackPanesStackNodes  extends Application {

	@Override
	public void start(Stage primaryStage) { // the 'Stage' is the Window that will be opened on the desktop
		try {		
			// create a new Text shape
			Text messageText = new Text("StackPanes pile all of\nthe Nodes that are placed\nin it on top of each other");
			Text messgTwo = new Text("making\nthis big\na pile\nof words\nto spread\nvertically");

			// make a stack page to hold all of the Nodes
			StackPane myStackPane = new StackPane();
			
			//----------------- button code ----------------------
			// create a new Button (Button is a subclass of Control)
			Button btn = new Button();
			
			System.out.println(btn.getTypeSelector());
			// set text inside button
			btn.setText("Display Message");

			// action event
			EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					btn.setText("Hi there! You clicked the button!");
				}
			};

			// when button is pressed
			btn.setOnAction(event);

			// making a non-functional button
			Button otherBtn = new Button();
			otherBtn.setText("The Other Button");
			// ------------- assemble the GUI window -------------
			
			// try switching the order that things are added to the StackPane
			
			myStackPane.getChildren().add(messgTwo);
			
			// add button to Stack Pane
			myStackPane.getChildren().add(btn);
			
//			// add button to Stack Pane
//			root.getChildren().add(otherBtn);

			// add Text shape to Stack Pane
			myStackPane.getChildren().add(messageText);
			
			// add button to Stack Pane
			myStackPane.getChildren().add(otherBtn);

			Scene scene = new Scene(myStackPane, 400, 400);
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
