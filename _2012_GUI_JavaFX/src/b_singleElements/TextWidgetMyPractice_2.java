package b_singleElements;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextWidgetMyPractice_2 extends Application {
	// over riding the start() method from the 'Application' super class
	@Override
	public void start(Stage bobsHappyStage) { // the 'Stage' is the Window that will be opened on the desktop
		
			// make a stack page to hold all of the widgets
			//StackPane myStackPane = new StackPane();
			Pane myStackPane = new Pane();

			// ------------- making the text object -------------f

			// create a new Text object instance
			Text messageText = new Text(200, 400, "Hello gooey World!");
			
			Font prettyLetters = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 24);
			
			messageText.setFont(prettyLetters);

			// add Text shape to Stack Pane
			myStackPane.getChildren().add(messageText);

			// ------------- assemble the GUI window -------------

			Scene booZeen = new Scene(myStackPane, 400, 400);		
			bobsHappyStage.setScene(booZeen);
			
			// start it up
			bobsHappyStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}