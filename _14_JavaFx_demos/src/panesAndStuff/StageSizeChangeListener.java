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

			ChangeListener<Number> stageSizeListener = (bobohbob, oldValue, newValue) -> messageText
					.setText("Height: " + primaryStage.getHeight() + " Width: " + primaryStage.getWidth());

			primaryStage.widthProperty().addListener(stageSizeListener);
			primaryStage.heightProperty().addListener(stageSizeListener);

			// ------------- assemble the GUI window -------------
			
			spane.getChildren().add(messageText);
			

			Scene scene = new Scene(spane, 400, 400);
			primaryStage.setScene(scene);
			primaryStage.show();


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
