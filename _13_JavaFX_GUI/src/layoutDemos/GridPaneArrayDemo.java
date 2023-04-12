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
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GridPaneArrayDemo extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
	    // Create a circle and set its properties
	    Circle mycircle = new Circle();
	    mycircle.setCenterX(25);
	    mycircle.setCenterY(25);
	    mycircle.setRadius(10);
	    mycircle.setStroke(Color.RED);
	    mycircle.setFill( Color.CYAN );
	    
	    Circle mycircle2 = new Circle();
	    mycircle2.setRadius(10);
	    mycircle2.setStroke(Color.RED);
	    mycircle2.setFill( Color.CYAN );
	    
		// Create a pane and set its properties
		GridPane gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);
		gPane.setPadding(new Insets(10,10,10,10));
		gPane.setHgap(5);
		gPane.setVgap(5);
		
		int numCols = 8;
		int numRows = 8;
		int numRects = numCols * numRows;
		
		
		Rectangle [] recArr = new Rectangle [numRects] ; 
			
		//make rectangles
		for(int i = 0; i < numRects; i++) {
			recArr [i] = new Rectangle(0, 0, 50, 50); 
		}

		Color[] myBling = { Color.RED, Color.BLUE, Color.ORANGE, Color.AQUA, Color.VIOLET,
				Color.DARKCYAN, Color.DARKRED, Color.OLIVE, Color.PINK, Color.TURQUOISE, Color.BURLYWOOD, Color.YELLOW,
				Color.GREEN, Color.GREY };
		
//		int colorIndex = 0;
//		for(int i = 0; i < numRects; i++) {
//			colorIndex = i % myBling.length;
//			System.out.println("color index " + colorIndex);
//			//recArr[i].setFill(myBling[colorIndex]); 
//			
//		}


		// Place nodes in the pane
		//gPane.add(recArr[0], 0, 0);
		
		int index = 0;
		for(int col = 0; col < numCols; col++) {
			for(int row = 0; row < numRows; row++) {
				System.out.println("in the loop " + col + " " + row + " " + index);
				//Rectangle tempRec = new Rectangle();
				//tempRec = recArr[0];
				if(row % 2 == 0 && col % 2 == 0) {
					recArr[index].setFill(Color.WHITE);
				} 
				if(row % 2 == 1 && col % 2 == 1){
					recArr[index].setFill(Color.WHITE);
				}
				gPane.add(recArr[index], col, row);
				index++;
			}	
		}
		
		gPane.add(mycircle, 0, 0);
		gPane.add(mycircle2, 3, 2);
		

		// Create a scene and place it in the stage
		Scene scene = new Scene(gPane);
		primaryStage.setTitle("ShowGridPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}


	public static void main(String[] args) {
		launch(args);
	}
}