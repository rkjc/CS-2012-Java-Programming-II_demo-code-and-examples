package layoutDemos;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Fourtyx20TreasureButtons extends Application {

	Random rndNumGen = new Random();
	static int treasureC = 0;
	static int treasureR = 0;
	
	static Label distLabel = new Label("distance");
	static Button[][] buttArr;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

//		Make a program that has a grid of 40 x 20 miniature buttons.
//		Every time a check box is checked the program tells you how far you are from the hidden treasure box.
//		I think the easiest would be to do Cartesian distance, but I may be wrong.
//		Have it display how many tries it took to find the treasure.
//		Add a persistent leader board to show top 5 winners.

		int numCols = 40;
		int numRows = 20;
		
		treasureC = rndNumGen.nextInt(numCols);
		treasureR = rndNumGen.nextInt(numRows);
		
		Pane mypane = new Pane(); // the 10 is the space between the buttons (nodes)
		HBox hPane = new HBox(20);
		VBox vPane = new VBox(10);
		GridPane gPane = new GridPane();



		Button startButt = new Button("Start");
		startButt.setMinWidth(0);
		
		Button clear = new Button("clear");
		clear.setOnAction(xyz -> { doButton(xyz); });

		buttArr = new Button[numRows][numCols];
		//Point buttLoc = new Point(0,0);
		
		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numCols; c++) {
				buttArr[r][c] = new Button("");
				Point buttLocTemp = new Point(r,c);
				buttArr[r][c].setUserData(buttLocTemp);
				buttArr[r][c].setFont(Font.font(1));
				buttArr[r][c].setMinWidth(20);
				buttArr[r][c].setMinHeight(20);
				buttArr[r][c].setOnAction(xyz -> { doButton(xyz); });
				gPane.add(buttArr[r][c], c, r);
			}
		}
		

		hPane.getChildren().addAll(clear, distLabel);
		vPane.getChildren().add(hPane);
		vPane.getChildren().add(gPane);

		//Scene sc = new Scene(vPane, 1000, 700);
		Scene sc = new Scene(vPane);
		primaryStage.setScene(sc);
//		primaryStage.setX(7400); // start location on desktop.
//		primaryStage.setY(100);
		primaryStage.show();
	}

	public static void doButton(ActionEvent bxz) {
		Object obj = bxz.getSource();
		Point tp = new Point( (Point)((Button) obj).getUserData() );
		System.out.println( tp.locR + "  " + tp.locC);
		
		Double dist = Math.sqrt( Math.pow((tp.locR - treasureR), 2) + Math.pow((tp.locC - treasureC), 2));
		System.out.println(dist);
		distLabel.setText(dist.toString());
		if (dist == 0.0) {
			((Button) obj).setStyle("-fx-background-color: GREEN");
		} else {
			((Button) obj).setStyle("-fx-background-color: CYAN");
		}
	}
	
//--------------------------------------------------------
	public static void main(String[] args) {
		Application.launch(args);
	}
}

// ##################################################################################

class Point{
	public int locR;
	public int locC;
	public Point(int r, int c) {
		locR = r;
		locC = c;
	}
	public Point(Point p) {
		locR = p.locR;
		locC = p.locC;
	}
}
