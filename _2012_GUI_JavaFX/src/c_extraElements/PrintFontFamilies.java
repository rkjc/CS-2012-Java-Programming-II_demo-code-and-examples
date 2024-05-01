package c_extraElements;

import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PrintFontFamilies extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the circle
		VBox vbPane = new VBox();
		ScrollPane skpane = new ScrollPane(vbPane);
		skpane.setPadding(new Insets(5, 5, 5, 20));

		List<String> fontNames = Font.getFontNames();

		for (String item : fontNames) {
			String tmpstr = (item + " - Sphinx of black quartz judge my vow");
			Text temp = new Text(tmpstr);
			temp.setFont(Font.font(item, 16));
			vbPane.getChildren().add(temp);
		}

		
		// Create a scene and place it in the stage
		Scene scene = new Scene(skpane, 700, 400);
		primaryStage.setTitle("FontDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

	public static void main(String[] args) {
		launch(args);
	}
}

