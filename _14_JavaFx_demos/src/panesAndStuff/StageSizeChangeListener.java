package panesAndStuff;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
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

public class StageSizeChangeListener extends Application {
//
	Text messageText = new Text("Hello World! Lets learn JavaFX.");

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			StackPane spane = new StackPane();
			Text messageText = new Text("Hello World! Lets learn JavaFX."); 


			ChangeListener<Number> stageSizeListener = (observable, oldValue, newValue) -> messageText.setText("Height: " + primaryStage.getHeight() + " Width: " + primaryStage.getWidth());

//			ChangeListener<? super Number> reevent = (ChangeListener<? super Number>) new EventHandler<ActionEvent>() {
//				public void handle(ActionEvent e) {
//					// btn.setText("Hi there! You clicked the button!");
//					String mssg = "i have been changed";
//					messageText.setText(mssg);
//				}
//			};
			

			primaryStage.widthProperty().addListener(stageSizeListener);
			//primaryStage.heightProperty().addListener(stageSizeListener);

			// ------------- assemble the GUI window -------------
			// add button to Stack Pane

			spane.getChildren().add(messageText);
			// spane.getChildren().add(btn);

			Scene scene = new Scene(spane, 400, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
			// scene.widthProperty().addListener(new InvalidationListener() {ov –>
			// resize();});
			// scene.heightProperty().addListener(ov –> resize());



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
