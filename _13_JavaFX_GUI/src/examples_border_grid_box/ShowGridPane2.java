package examples_border_grid_box;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowGridPane2 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		// Place nodes in the pane
		pane.add(new CustomPane2("0, 0"), 0, 0);
		pane.add(new CustomPane2("1, 0"), 1, 0);
		pane.add(new CustomPane2("0, 1"), 0, 1);
		pane.add(new CustomPane2("1, 1"), 1, 1);
		pane.add(new CustomPane2("0, 2"), 0, 2);
		pane.add(new CustomPane2("1, 2"), 1, 2);
		pane.add(new CustomPane2("1, 3"), 1, 3);
		pane.add(new CustomPane2("2, 1"), 2, 1);
		
		//Button btAdd = new Button("Add Name");
		// pane.add(btAdd, 1, 3);
		//GridPane.setHalignment(btAdd, HPos.RIGHT);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowGridPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}

//Define a custom pane to hold a label in the center of the pane
class CustomPane2 extends StackPane {
	public CustomPane2(String title) {
		getChildren().add(new Label(title));
		setStyle("-fx-border-color: red");
		double topp = 11.5, rightt = 20, bottomm = 13.5, leftt = 20;
		setPadding(new Insets(topp, rightt, bottomm, leftt));
	}
}
