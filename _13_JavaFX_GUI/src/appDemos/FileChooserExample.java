package appDemos;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileChooserExample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		FileChooser fc = new FileChooser();
		fc.setTitle("Open File");

		BorderPane bp = new BorderPane();

		Button openBtn = new Button("Open");
		bp.setBottom(openBtn);

		// action event
		EventHandler<ActionEvent> myBtnEvent = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				File gotFile = fc.showOpenDialog(primaryStage);
				System.out.println(gotFile);
			}
		};

		// when button is pressed
		openBtn.setOnAction(myBtnEvent);

		// HBox root = new HBox();

		// root.setSpacing(20);

		Scene scene = new Scene(bp, 350, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("FileChooser Example");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}