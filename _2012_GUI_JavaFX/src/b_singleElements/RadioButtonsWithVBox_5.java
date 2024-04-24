package b_singleElements;

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

public class RadioButtonsWithVBox_5 extends Application {

//public class ButtonDemo3_RadioButton extends ButtonDemo2_CheckBox {
//	@Override // Override the getPane() method in the super class
//	protected BorderPane getPane() throws Exception {

//	@Override // Override the start method in the Application class
//	public void start(Stage primaryStage) throws URISyntaxException {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		VBox paneForRadioButtons = new VBox(20);
		HBox hahBox = new HBox(10);
		VBox vbox2 = new VBox(20);
		
		
		paneForRadioButtons.setPadding(new Insets(20, 20, 20, 20));
		paneForRadioButtons.setStyle("-fx-border-color: green");
		paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: green");
		paneForRadioButtons.setStyle("-fx-background-color: #00ffff ");
			
		Text messageText = new Text("Radio button color change");		
		Font prettyLetters = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 24);
		messageText.setFont(prettyLetters);
		
		

		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbGreen = new RadioButton("Green");
		RadioButton rbBlue = new RadioButton("Blue");

		// paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);
		
		paneForRadioButtons.getChildren().add(rbRed);
		paneForRadioButtons.getChildren().add(rbGreen);
		paneForRadioButtons.getChildren().add(rbBlue);
		

		// pane.setLeft(paneForRadioButtons);

		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		rbBlue.setToggleGroup(group);

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

		StackPane holder = new StackPane();
		holder.setPadding(new Insets(20, 20, 20, 20));
		

		
		holder.getChildren().add(paneForRadioButtons);
		
		
		vbox2.getChildren().add(vbox2);
		vbox2.getChildren().add(messageText);
		
		
		// Create a scene and place it in the stage
		Scene radScene = new Scene(vbox2, 450, 300);
		primaryStage.setTitle("Radio button demo"); // Set the stage title
		primaryStage.setScene(radScene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}


	public static void main(String[] args) {
		launch(args);
	}

}