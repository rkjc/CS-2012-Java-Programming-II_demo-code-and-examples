package layoutDemos;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LayoutOfLayouts extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage theStage) {
		
		System.out.println("hey there");
		// ------------------------------------------------
		// -- zone of shapes and nodes  --
		// Create a circle and set its properties
		Circle circ01 = new Circle();
		// mycircle.setCenterX(25);
		// mycircle.setCenterY(25);
		circ01.setRadius(10);
		circ01.setStroke(Color.RED);
		circ01.setFill(Color.SKYBLUE);
		StackPane.setAlignment(circ01, Pos.BOTTOM_CENTER);
		//StackPane.setAlignment(circ01, Pos.CENTER);

		
		 Circle circ02 = new Circle(); circ02.setRadius(10);
		 circ02.setStroke(Color.RED); circ02.setFill(Color.SKYBLUE);
		  
		 Circle circ03 = new Circle(); circ03.setCenterX(370); circ03.setCenterY(400);
		 circ03.setRadius(20); circ03.setStroke(Color.GREEN);
		 circ03.setFill(Color.LIME);
		 
		
		// StackPane.setAlignment(mycircle, Pos.CENTER_LEFT);
		//StackPane.setAlignment(mycircle, Pos.CENTER);
		
		// -----------------------------------------------------
		//  --- Controls building section ----
		
		//Label lb01 = new Label("label 01");
		//lb01.setStyle
		
		//Button btn01 = new Button("button 01");

		// -------------------------------------------------------------
		//  -- land of Pane ---
		
		Pane mp01 = new Pane();
		// Pane mypane = new StackPane();
		mp01.setPadding(new Insets(10, 10, 30, 10));  //(  ,  , bottom ,  right)
		mp01.setStyle("-fx-background-color: BLUE; -fx-border-color: orange; -fx-border-width: 4; ");

		Pane mp02 = new Pane();
		mp02.setStyle("-fx-background-color: darkcyan; -fx-border-color: darkred; -fx-border-width: 4; ");
		
		Pane mp03 = new Pane();
		mp03.setMinSize(50, 50);
		mp03.setStyle(" -fx-border-color: black; -fx-border-width: 2; ");

		Pane mp04 = new Pane();
		mp04.setMinSize(50, 50);
		mp04.setStyle(" -fx-border-color: black; -fx-border-width: 2; ");

		Pane mp05 = new Pane();
		mp05.setMinSize(50, 50);
		mp05.setStyle(" -fx-border-color: black; -fx-border-width: 2; ");


		// Color.CORNSILK

		StackPane sp01 = new StackPane();
		sp01.setMinSize(50, 50);
		sp01.setStyle("-fx-background-color: CORNSILK; -fx-border-color: grey; -fx-border-width: 2; ");
		
		StackPane sp02 = new StackPane();
		// mp02.setAlignment(Pos.CENTER);
		sp02.setMinSize(50, 50);
		// mp02.setMaxSize(50, 50);
		sp02.setStyle("-fx-background-color: yellow; -fx-border-color: grey; -fx-border-width: 2; ");


		// Create a pane and set its properties
		GridPane gp01 = new GridPane();

		// gp01.setAlignment(Pos.BASELINE_RIGHT);
		gp01.setAlignment(Pos.CENTER);
		gp01.setPadding(new Insets(10, 10, 10, 10));
		gp01.setHgap(5);
		gp01.setVgap(5);
		gp01.setLayoutX(30);
		gp01.setLayoutY(10);
		// gp01.setMaxHeight(100);
		gp01.setMinHeight(10);
		// gp01.setMaxWidth(100);
		gp01.setMinWidth(100);
		gp01.setStyle("-fx-background-color: cyan; -fx-border-color: red; -fx-border-width: 1; ");


		HBox hb01 = new HBox();
		hb01.setStyle("-fx-background-color: lightgreen; -fx-border-color: blue; -fx-border-width: 2; ");
		hb01.setMinSize(150, 50);
		hb01.setMaxSize(150, 50);
		hb01.setLayoutX(80);  // <- works with VBox 
		hb01.setLayoutY(220);
		StackPane.setAlignment(hb01, Pos.BOTTOM_CENTER);  // <- works with StackPane, does not work with PANE

		HBox hb02 = new HBox();
		hb02.setStyle("-fx-background-color: lightgreen; -fx-border-color: olive; -fx-border-width: 2; ");
		hb02.setMinSize(320, 40);

		VBox vb01 = new VBox(30);
		vb01.setLayoutX(15);  // <- Used in Pane, overrides margin
		vb01.setLayoutY(5);
		//vb01.setMaxSize(900, 900);
		vb01.setStyle("-fx-background-color: pink; -fx-border-color: violet; -fx-border-width: 3; ");
		vb01.setAlignment(Pos.BOTTOM_RIGHT);
		
		VBox vb02 = new VBox(30);
		vb02.setLayoutX(500); // <--- works with Pane
		vb02.setLayoutY(150);
		vb02.setMinSize(20, 70);
		vb02.setStyle("-fx-background-color: green; -fx-border-color: darkgreen; -fx-border-width: 3; ");
		vb02.setAlignment(Pos.BOTTOM_RIGHT);

		// =======================================================================
		// -- assembly area --
		
		mp01.getChildren().add(vb01);
		//mp01.getChildren().add(vb02);
		
		mp02.getChildren().add(gp01);
		mp02.getChildren().add(hb01);
		// mp02.getChildren().add(mycircle3)//;
		
		vb01.getChildren().add(mp02);
		vb01.getChildren().add(hb02);
		vb01.getChildren().add(circ03);

		sp02.getChildren().add(circ01);

		gp01.add(sp02, 0, 0);
		// gp01.add(mycircle, 0, 0);
		gp01.add(circ02, 3, 2);
		gp01.add(sp01, 2, 1);
		gp01.add(mp03, 3, 2);
		gp01.add(mp04, 2, 2);
		gp01.add(mp05, 1, 2);

		// Create a scene and place it in the stage
		 //Scene scene = new Scene(mp01, 1000, 1000);
		Scene scene = new Scene(mp01);
		theStage.setTitle("Layout of Layouts"); // Set the stage title
		theStage.setScene(scene); // Place the scene in the stage
//		theStage.setX(7400);  // start location on desktop. *** make sure to change or disable
//		theStage.setY(100);   // start location on desktop. *** make sure to change or disable
		theStage.show(); // Display the stage
	}

	Color[] myBling = { Color.RED, Color.BLUE, Color.ORANGE, Color.AQUA, Color.VIOLET, Color.DARKCYAN, Color.DARKRED,
			Color.OLIVE, Color.PINK, Color.TURQUOISE, Color.BURLYWOOD, Color.YELLOW, Color.GREEN, Color.GREY };

	// --------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}

}

// here is a good reference
// https://docs.oracle.com/javase/8/javafx/layout-tutorial/builtin_layouts.htm#JFXLY102
