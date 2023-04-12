package layoutDemos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ButtonsTextHBoxVBox2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Two Button VBox");
	// --------------------------------------------------------------------		
		VBox vbox1 = new VBox(10); // the attribute sets the space between nodes
		vbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		vbox1.setStyle("-fx-background-color: GREEN");
		vbox1.setAlignment(Pos.TOP_CENTER);
		
		HBox hbox1 = new HBox(10); // the attribute sets the space between nodes
		hbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		hbox1.setStyle("-fx-background-color: CYAN");
		hbox1.setAlignment(Pos.CENTER);  //?? this does work
		
//		GridPane gridBox = new GridPane();
//		gridBox.setAlignment(Pos.CENTER);
//		gridBox.setHgap(20);
//		gridBox.setPadding(new Insets(10, 10, 15, 15));
//		gridBox.setStyle("-fx-background-color: CYAN");
		
	// --------------------------------------------------------------------
		Text txt1 = new Text("Text at the top of the VBox stack");
		Text txt2 = new Text("Text at the bottom of the VBox stack");
		Button btn1 = new Button();
		Button btn2 = new Button();
		
	// --------------------------------------------------------------------		
		btn1.setText("This is Button ONE");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button One pushed");
				btn1.setStyle("-fx-background-color: hotpink");
				txt1.setText("Button ONE pushed");
				
			}
		});
		
		
		btn2.setText("This is Button TWO");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button Two pushed");
				btn1.setStyle("-fx-background-color: BLUE");
				txt1.setText("Button TWO pushed");
			}
		});
	// --------------------------------------------------------------------		

//		gridBox.add(btn1, 0, 0);
//		gridBox.add(btn2, 1, 0);
		
		hbox1.getChildren().add(btn1);
		hbox1.getChildren().add(btn2);
		
//		vbox1.getChildren().add(gridBox);

		vbox1.getChildren().add(txt1);
		vbox1.getChildren().add(txt2);
		vbox1.getChildren().add(hbox1);

		Scene sc = new Scene(vbox1, 400, 250);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}