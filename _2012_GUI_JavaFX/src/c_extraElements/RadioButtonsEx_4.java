package c_extraElements;

import java.net.URISyntaxException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RadioButtonsEx_4 extends Application {

	@Override
	public void start(Stage myMainWin) throws Exception {
		// make a Pane instance to place the widget nodes into
		VBox myVboxPane = new VBox(20);
			
		// make a text instance to display text
		Text messageText = new Text("Radio button color change");		
		Font myTxtSettings = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 24);
		messageText.setFont(myTxtSettings);
		
		// make 3 radio button instances
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbGreen = new RadioButton("Green");
		RadioButton rbBlue = new RadioButton("Blue");

		// place the text and radio buttons in the VBox (order matters)
		myVboxPane.getChildren().add(messageText);
		myVboxPane.getChildren().add(rbRed);
		myVboxPane.getChildren().add(rbGreen);
		myVboxPane.getChildren().add(rbBlue);
		
		// connect the radio buttons to gether as a group
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		rbBlue.setToggleGroup(group);

		// make event handlers for each of the buttons
		rbRed.setOnAction(e -> {
			if (rbRed.isSelected()) {
				messageText.setFill(Color.RED);
			}
		});

		rbGreen.setOnAction(e -> {
			if (rbGreen.isSelected()) {
				messageText.setFill(Color.GREEN);
			}
		});

		rbBlue.setOnAction(e -> {
			if (rbBlue.isSelected()) {
				messageText.setFill(Color.BLUE);
			}
		});


		// Create a scene and place it in the stage
		Scene radScene = new Scene(myVboxPane, 450, 300);
		
		// place the Scene on the stage
		myMainWin.setScene(radScene); // Place the scene in the stage
		
		// start it up
		myMainWin.show(); // Display the stage
	}


	public static void main(String[] args) {
		launch(args);  // this triggers the start method
	}

}