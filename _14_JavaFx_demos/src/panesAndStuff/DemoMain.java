package panesAndStuff;

import javafx.application.Application;
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

public class DemoMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		StackPane spane = new StackpaneButtonText();
		
		Scene scene = new Scene(spane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		System.out.println("working");
		Application.launch(args);
	}
}
