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

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Text messageText = new Text("Hello World! Lets learn JavaFX.");
			messageText.setFont(Font.font("Ariel", FontWeight.BOLD, 22));
			
			StackPane spane = new StackPane();


			ChangeListener<Number> stageSizeListener = (bobohbob, oldValue, newValue) -> {
				System.out.println("debug " + oldValue.toString());
				messageText.setText("Height: " + primaryStage.getHeight() + " Width: " + primaryStage.getWidth());
			};

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



	public static void main(String[] args) {
		System.out.println("working");
		Application.launch(args);
	}
}
