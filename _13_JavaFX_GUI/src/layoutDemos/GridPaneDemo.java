package layoutDemos;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		GridPane gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);  // places contents in the center of the grid cell
		gPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		gPane.setHgap(5.5);
		gPane.setVgap(5.5);

		Rectangle r01 = new Rectangle(0, 0, 50, 50); // top left at location 0,0 - size 50 width x 50 50 height
		Rectangle r02 = new Rectangle(0, 0, 50, 50);
		Rectangle r03 = new Rectangle(0, 0, 50, 50);
		Rectangle r04 = new Rectangle(0, 0, 50, 50);
		Rectangle r05 = new Rectangle(0, 0, 50, 50);
		Rectangle r06 = new Rectangle(0, 0, 50, 50);
		Rectangle r07 = new Rectangle(0, 0, 50, 50);
		Rectangle r08 = new Rectangle(0, 0, 50, 50);
		Rectangle r09 = new Rectangle(0, 0, 50, 50);
		Rectangle r10 = new Rectangle(0, 0, 50, 50);

		
		r01.setFill(Color.RED);
		r02.setFill(Color.BLUE);
		r03.setFill(Color.ORANGE);
		r04.setFill(Color.AQUA);
		r05.setFill(Color.VIOLET);
		r06.setFill(Color.GREEN);
		r07.setFill(Color.DARKCYAN);
		r08.setFill(Color.OLIVE);
		r09.setFill(Color.PINK);
		r10.setFill(Color.YELLOW);
		

		// Place nodes in the pane
		gPane.add(r01, 0, 0); // put Rectangle r01 at grid location column 0, row 0
		gPane.add(r02, 0, 1); // put Rectangle r02 at grid location column 0, row 1
		gPane.add(r03, 0, 2);
		gPane.add(r04, 1, 0);
		gPane.add(r05, 1, 1);
		gPane.add(r06, 1, 2);
		gPane.add(r07, 2, 0);
		gPane.add(r08, 2, 1);
		gPane.add(r09, 2, 2);

		// GridPane.setHalignment(btAdd, HPos.RIGHT);

		// Create a scene and place it in the stage
		Scene scene = new Scene(gPane);
		primaryStage.setTitle("ShowGridPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

// -------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}