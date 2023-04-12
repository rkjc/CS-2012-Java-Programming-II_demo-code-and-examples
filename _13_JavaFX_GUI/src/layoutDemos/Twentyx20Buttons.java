package layoutDemos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Twentyx20Buttons extends Application{

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Push start get random integer 100-499 (for 20x20)
		// show 3 sec count down
		// when count equals zero
		// show random number
		// start timer
		// when button result matches random int
		// stop timer
		// Display duration
		
	
		Pane mypane = new Pane(); // the 10 is the space between the buttons (nodes)
		HBox  hPane = new HBox(20);
		VBox vPane = new VBox(10);
		GridPane gPane = new GridPane();
		
		Label buttonPushed = new Label("button pushed");	
		Label countTimer = new Label("count timer");	
		Label showRandom = new Label("random number");	
		Label durration = new Label("durration");	
		
		int numRows = 20;
		int numCols = 20;
		
		EventHandler<ActionEvent> handleButton = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent xyz) {
				Integer buttNum = parseValue(xyz);
				System.out.println(buttNum);
				buttonPushed.setText(buttNum.toString());
			}
		};
		
		Button [][] bttArr = new Button[numRows][numCols];
		
		Integer count = 100;
		for(int i = 0; i < numRows; i++) {
			for(int j = 0; j < numCols; j++) {
				bttArr[i][j] = new Button(count.toString());
				//bttArr[i][j] = new Button();
				bttArr[i][j].setOnAction(handleButton);
				gPane.add(bttArr[i][j], j, i);
				count++;
			}
		}
		

		hPane.getChildren().addAll(buttonPushed, countTimer, showRandom, durration);
		
		vPane.getChildren().add(hPane);
		vPane.getChildren().add(gPane);
		
		Scene sc = new Scene(vPane, 1000, 700);
		primaryStage.setScene(sc);
//		primaryStage.setX(7400);  // start location on desktop.
//		primaryStage.setY(100);
		primaryStage.show();
	}

	public static Integer parseValue(ActionEvent xyz) {
		String input = xyz.getSource().toString();
		Integer startVal = input.indexOf('\'');
		String subIn = input.substring(startVal+1, input.length()-1);
		return Integer.valueOf(subIn);
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}	
}
