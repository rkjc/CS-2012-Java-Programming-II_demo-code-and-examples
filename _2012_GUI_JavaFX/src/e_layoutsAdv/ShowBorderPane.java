package e_layoutsAdv;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a border pane
		BorderPane borPane = new BorderPane();

		// Place nodes in the pane
		borPane.setTop(makeAStackPane("Top"));
		borPane.setRight(makeAStackPane("Right"));
		borPane.setBottom(makeAStackPane("Bottom"));
		borPane.setLeft(makeAStackPane("Left"));
		borPane.setCenter(makeAStackPane("Center"));

		// Create a scene and place it in the stage
		Scene scene = new Scene(borPane, 400, 400);
		primaryStage.setTitle("ShowBorderPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static StackPane makeAStackPane(String title) {
		StackPane tempPane = new StackPane();
		tempPane.setStyle(" -fx-background-color: cyan; -fx-border-color: green;");
		
		Label templabel = new Label(title);
		templabel.setStyle("-fx-text-fill: red; -fx-background-color: yellow;");
		tempPane.getChildren().add(templabel);
		// -fx-border-color: green; ");
		   
		tempPane.setStyle("-fx-border-color: red");
		tempPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		return tempPane;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
