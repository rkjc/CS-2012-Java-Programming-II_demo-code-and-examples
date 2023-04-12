package layoutDemos;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LayoutOfLayouts2 extends Application {

	static VBox vb01;
	static Integer numCols = 4;
	static Integer numRows = 3;
	static Pane[][] paneBunch;
	Text text = new Text(50, 50, "JavaFX Programming");

	@Override // Override the start method in the Application class
	public void start(Stage theStage) {
		
		System.out.println("hey there");
		// ------------------------------------------------

		// -------------------------------------------------------------
		// -- land of Pane ---

		// Pane mp01 = new Pane();
		AnchorPane mp01 = new AnchorPane();
		mp01.setMinSize(900, 400);
		Scene scene = new Scene(mp01);
//		mp01.prefHeightProperty().bind(scene.heightProperty());
//		mp01.prefWidthProperty().bind(scene.widthProperty());
		// Pane mypane = new StackPane();
//		mp01.setPadding(new Insets(10, 10, 30, 10)); //( , , bottom , right)
//		mp01.setStyle("-fx-background-color: BLUE; -fx-border-color: orange; -fx-border-width: 4; ");

//		Pane mp02 = new Pane();
//		mp02.setStyle("-fx-background-color: darkcyan; -fx-border-color: darkred; -fx-border-width: 4; ");
//
//		Pane mp03 = new Pane();
//		mp03.setMinSize(50, 50);
//		mp03.setStyle(" -fx-border-color: black; -fx-border-width: 2; ");
//
//		Pane mp04 = new Pane();
//		mp04.setMinSize(50, 50);
//		mp04.setStyle(" -fx-border-color: black; -fx-border-width: 2; ");

		// making panes for gridbox <<<<<<<<=========================================

		paneBunch = new Pane[numCols][numRows];

		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numCols; col++) {
				paneBunch[col][row] = new Pane();
				paneBunch[col][row].setMinSize(100, 80);
				Text tmptxt = new Text("(" + String.valueOf(col) + "," + String.valueOf(row) + ")");
				tmptxt.setLayoutY(12);
//				paneBunch[col][row].setStyle(" -fx-border-color: lightgrey; -fx-border-width: 4; ");
//				paneBunch[col][row].setStyle(null);
			}
		}

		// ------------------------------------------

		// ====================================
		// === Containers for holding things ===
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
		// gp01.setPadding(new Insets(10, 10, 10, 10));
		// gp01.setHgap(5);
		// gp01.setVgap(5);
		// gp01.setLayoutX(30);
		// gp01.setLayoutY(10);
		// gp01.setMaxHeight(100);
		// gp01.setMinHeight(10);
		// gp01.setMaxWidth(100);
		// gp01.setMinWidth(100);
		// gp01.setStyle("-fx-background-color: cyan; -fx-border-color: red;
		// -fx-border-width: 1; ");

		HBox hb01 = new HBox();
		hb01.setStyle("-fx-background-color: lightgreen; -fx-border-color: blue; -fx-border-width: 2; ");
		hb01.setMinSize(150, 50);
		hb01.setMaxSize(150, 50);
		hb01.setLayoutX(80); // <- works with VBox
		hb01.setLayoutY(220);
		StackPane.setAlignment(hb01, Pos.BOTTOM_CENTER); // <- works with StackPane, does not work with PANE

		HBox hb02 = new HBox();
		hb02.setStyle("-fx-background-color: lightgreen; -fx-border-color: olive; -fx-border-width: 2; ");
		hb02.setMinSize(320, 40);

		vb01 = new VBox();
		vb01.prefHeightProperty().bind(scene.heightProperty());
		vb01.prefWidthProperty().bind(scene.widthProperty());
//		vb01.setLayoutX(15);  // <- Used in Pane, overrides margin
//		vb01.setLayoutY(5);
		// vb01.setMaxSize(900, 900);
		// vb01.setStyle("-fx-background-color: pink; -fx-border-color: violet;
		// -fx-border-width: 3; ");
		// vb01.setAlignment(Pos.TOP_LEFT);

		VBox vb02 = new VBox(30);
		vb02.setLayoutX(500); // <--- works with Pane
		vb02.setLayoutY(150);
		vb02.setMinSize(20, 70);
		vb02.setStyle("-fx-background-color: green; -fx-border-color: darkgreen; -fx-border-width: 3; ");
		vb02.setAlignment(Pos.TOP_LEFT);

		// ==================================================
		// === Content added to individual grid cells ===
		// entry box example
		GridPane gPaneSamp = new GridPane();
		gPaneSamp.setAlignment(Pos.CENTER);
		gPaneSamp.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		gPaneSamp.setHgap(5.5);
		gPaneSamp.setVgap(5.5);

		// Place nodes in the pane
		gPaneSamp.add(new Label("First Name:"), 0, 0);
		gPaneSamp.add(new TextField(), 1, 0);
		gPaneSamp.add(new Label("MI:"), 0, 1);
		gPaneSamp.add(new TextField(), 1, 1);
		gPaneSamp.add(new Label("Last Name:"), 0, 2);
		gPaneSamp.add(new TextField(), 1, 2);
		Button btAdd = new Button("Add Name");
		gPaneSamp.add(btAdd, 1, 3);
		GridPane.setHalignment(btAdd, HPos.RIGHT);
		paneBunch[1][2].getChildren().addAll(gPaneSamp);

		// ---------------------------------------------------------------
		// simple button demo content

		Label tx = new Label("Look at this awesome text!\nHidden behind the button");
		Button btn1 = new Button("Say 'Hello World'");

		btn1.setOnAction(xyz -> {
			tx.setText("you did push the button");
			System.out.println("Hello to the World!");
			System.out.println(xyz.getSource().toString());
		});

		VBox vb20 = new VBox();
		vb20.setPadding(new Insets(10, 10, 30, 10));
		vb20.setAlignment(Pos.CENTER);
		vb20.getChildren().addAll(btn1);
		paneBunch[0][0].setMinSize(300, 100);
		paneBunch[0][0].getChildren().addAll(vb20);

		paneBunch[2][1].getChildren().addAll(tx);
		
		//----------------------------------------------------
		//radio and buttons demo pane
		


		// =============================
		// Window structure and content
		MenuBar barmenu = makeMenu();
		// =======================================================================
		// -- assembly area --

		mp01.getChildren().add(vb01);
		vb01.getChildren().addAll(barmenu, gp01);

		// fill the gridPane with Panes for holding contents

		for (int col = 0; col < numCols; col++) {
			for (int row = 0; row < numRows; row++) {

				gp01.add(paneBunch[col][row], col, row);

			}
		}

		// ^^^^ Scene scene = new Scene(mp01); ^^^^ moved to top
		theStage.setTitle("Layout of Layouts"); // Set the stage title
		theStage.setScene(scene); // Place the scene in the stage
//		theStage.setX(7400); // start location on desktop. *** make sure to change or disable
//		theStage.setY(100); // start location on desktop. *** make sure to change or disable
		theStage.show(); // Display the stage
	}

	Color[] myBling = { Color.RED, Color.BLUE, Color.ORANGE, Color.AQUA, Color.VIOLET, Color.DARKCYAN, Color.DARKRED,
			Color.OLIVE, Color.PINK, Color.TURQUOISE, Color.BURLYWOOD, Color.YELLOW, Color.GREEN, Color.GREY };

	// --------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}

	// ================================================================
	public static MenuBar makeMenu() {
		MenuBar menuBar = new MenuBar();

		Menu fileMenu = new Menu("File");
		MenuItem colorItem = new MenuItem("recolor");
		colorItem.setOnAction(e -> {
			vb01.setStyle("-fx-background-color: orange; ");
		});
		MenuItem quitItem = new MenuItem("Quit");
		quitItem.setOnAction(e -> {
			System.exit(0);
		});
		fileMenu.getItems().add(colorItem);
		fileMenu.getItems().add(quitItem);

		Menu viewMenu = new Menu("View");
		MenuItem gridItem = new MenuItem("show grid");
		gridItem.setOnAction(e -> {
			setBorder(true);
		});
		MenuItem gridItem2 = new MenuItem("hide grid");
		gridItem2.setOnAction(e -> {
			setBorder(false);
		});
		viewMenu.getItems().addAll(gridItem, gridItem2);

		menuBar.getMenus().add(fileMenu);
		menuBar.getMenus().add(viewMenu);

		return menuBar;
	}

	public static void setBorder(boolean bordOn) {
		// true means show border
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numCols; col++) {
//				Text tmptxt = new Text("(" + String.valueOf(col) + "," + String.valueOf(row) +")");
//				tmptxt.setLayoutY(12);
//				//paneBunch[col][row].getChildren().add(tmptxt);
				if (bordOn) {
					paneBunch[col][row].setStyle(" -fx-border-color: lightgrey; -fx-border-width: 1; ");
				} else {
					paneBunch[col][row].setStyle(null);
				}
			}
		}

	}
}

// -- zone of shapes and nodes --
// Create a circle and set its properties
//Circle circ01 = new Circle();
// mycircle.setCenterX(25);
// mycircle.setCenterY(25);
//circ01.setRadius(10);
//circ01.setStroke(Color.RED);
//circ01.setFill(Color.SKYBLUE);
//StackPane.setAlignment(circ01, Pos.BOTTOM_CENTER);
// StackPane.setAlignment(circ01, Pos.CENTER);

//Circle circ02 = new Circle();
//circ02.setRadius(10);
//circ02.setStroke(Color.RED);
//circ02.setFill(Color.SKYBLUE);
//
//Circle circ03 = new Circle();
//circ03.setCenterX(370);
//circ03.setCenterY(400);
//circ03.setRadius(20);
//circ03.setStroke(Color.GREEN);
//circ03.setFill(Color.LIME);

// mp01.getChildren().add(vb02);

// mp02.getChildren().add(gp01);
//mp02.getChildren().add(hb01);
// mp02.getChildren().add(mycircle3)//;

//gp01.add(sp02, 0, 0);
//// gp01.add(mycircle, 0, 0);
//gp01.add(circ02, 3, 2);
//gp01.add(sp01, 2, 1);
//gp01.add(mp03, 3, 2);
//gp01.add(mp04, 2, 2);
//gp01.add(mp05, 1, 2);		// StackPane.setAlignment(mycircle, Pos.CENTER_LEFT);
// StackPane.setAlignment(mycircle, Pos.CENTER);

// -----------------------------------------------------
// --- Controls building section ----

// Label lb01 = new Label("label 01");
// lb01.setStyle

// Button btn01 = new Button("button 01");

// Create a scene and place it in the stage
// Scene scene = new Scene(mp01, 1000, 1000);

// vb01.getChildren().add(mp02);
// vb01.getChildren().add(hb02);
// vb01.getChildren().add(circ03);

//sp02.getChildren().add(circ01);

// StackPane.setAlignment(mycircle, Pos.CENTER_LEFT);
// StackPane.setAlignment(mycircle, Pos.CENTER);

// -----------------------------------------------------
// --- Controls building section ----

// Label lb01 = new Label("label 01");
// lb01.setStyle

// Button btn01 = new Button("button 01");
