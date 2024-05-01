package c_extraElements;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUIbuttonX5Lambda  extends Application {

	int cnt = 0;
	Label lbl1 = new Label("display label");
	
	@Override
	public void start(Stage primaryStage) { // the 'Stage' is the Window that will be opened on the desktop
		try {			
			// make a stack page to hold all of the 
			VBox vbPane = new VBox();
			vbPane.setAlignment(Pos.CENTER);
			vbPane.setSpacing(10);
			vbPane.setStyle("-fx-font-size: 16pt;");
			
			//Label lbl1 = new Label("display label");
			
			//----------------- button code ----------------------
			// create a new Button (Button is a subclass of Control)
			Button btn1 = new Button("button ONE");
			Button btn2 = new Button("button TWO");
			Button btn3 = new Button("button THREE");
			Button btn4 = new Button("button FOUR");
			Button btn5 = new Button("button FIVE");
			

			// action events
			
			// Making an event handler using external or Outer Class handler
			
			// 2 step approach
			//MyHandleActionOuter1 dothis1 = new MyHandleActionOuter1(lbl1);
			//btn1.setOnAction(dothis1);
			
			// 1 step combined approach
			btn1.setOnAction(new MyHandleActionOuter1(lbl1));
			
			// -------
			
			// Making an event handler using Inner Class handler
			
			// 2 step approach
			//MyHandleActionInner2 dothis2 = new MyHandleActionInner2();
			//btn2.setOnAction(dothis2);
			
			// 1 step combined approach
			btn2.setOnAction(new MyHandleActionInner2());
			
			// ---------
			
			// Anonymous Inner-Class Handler (2 step approach)
			EventHandler<ActionEvent> myDoAction3 = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					cnt++;
					lbl1.setText("Action THREE - You clicked the button!  " + cnt);
				}
			};

			btn3.setOnAction(myDoAction3);

			// -------------
			
			// Anonymous Inner-Class Handler (1 step combined approach)
			btn4.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					cnt++;
					lbl1.setText("Action FOUR - You clicked the button!  " + cnt);
				}	
			});
			
			// --------------
			
			// Lambda expression method
			btn5.setOnAction( e -> {
				cnt++;
				lbl1.setText("Action FIVE - You clicked the button!  " + cnt);
			});
			
			
			// ------------- assemble the GUI window -------------
			// add nodes to VBox Pane
			vbPane.getChildren().add(lbl1);
			vbPane.getChildren().add(btn1);
			vbPane.getChildren().add(btn2);
			vbPane.getChildren().add(btn3);
			vbPane.getChildren().add(btn4);
			vbPane.getChildren().add(btn5);

			Scene bleen = new Scene(vbPane, 500, 400);
			primaryStage.setScene(bleen);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	// Inner class definition
	// makes it easier to access global class variables and methods
	class MyHandleActionInner2 implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			cnt++;
			lbl1.setText("Action TWO - You clicked the button:  " + cnt);
		}
	}
}

// ---------------------------------------------------------
// Additional outer class definitions 
// could also be defined in its own class file

class MyHandleActionOuter1 implements EventHandler<ActionEvent> {
	Label lbl;
	int cnt = 0;
	
	public MyHandleActionOuter1(Label lblin) {
		this.lbl = lblin;
	}
	
	@Override
	public void handle(ActionEvent e) {
		cnt++;
		this.lbl.setText("Action ONE - You clicked the button:  " + cnt);
	}
}



