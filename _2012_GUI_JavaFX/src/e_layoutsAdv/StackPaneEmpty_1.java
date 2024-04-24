package e_layoutsAdv;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPaneEmpty_1 extends Application {

	// over riding the start() method from the 'Application' super class
	
	@Override
	public void start(Stage bobsHappyStage) { // the 'Stage' is the Window that will be opened on the desktop
		try {
			// make a stack page to hold all of the widgets
			StackPane zsplatn = new StackPane();
			
			// zsplatn.setStyle("-fx-background-color: blue");

			// ------------- assemble the GUI window -------------

			Scene booZeen = new Scene(zsplatn, 400, 400);
			bobsHappyStage.setScene(booZeen);
			bobsHappyStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
