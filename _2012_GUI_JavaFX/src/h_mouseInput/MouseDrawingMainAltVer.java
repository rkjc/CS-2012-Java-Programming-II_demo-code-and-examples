package h_mouseInput;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseDrawingMainAltVer extends Application {

	Text txt1 = new Text("Text at the bottom of the VBox stack");
	Text txt2 = new Text("click position");
	double mouseDownX = 0.0;
	double mouseUpX = 0.0;
	double mouseDownY = 0.0;
	double mouseUpY = 9.0;

	@Override
	public void start(Stage outStageObject) {
		outStageObject.setTitle("Drawing Shapes");
		// creating group object for adding canvas object to it
		Group groupObject = new Group();
		// creating canvas object
		Canvas myCanvas = new Canvas(800, 600);
		// creating GraphicsContext for drawing the image
		GraphicsContext graphicContext = myCanvas.getGraphicsContext2D();
		
		StackPane mainPain = new StackPane();
		
		Button btn = new Button();
		// set text inside button
		btn.setText("Red");
		
		EventHandler<ActionEvent> zevent = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Color cul = Color.BLACK;
				cul = toggleColor();
				graphicContext.setFill(cul);
				graphicContext.setStroke(Color.RED);
				//graphicContext.setStroke(Color.BLUE);
			}
		};

		// when button is pressed
		btn.setOnAction(zevent);
		
		Button btn2 = new Button();
		// set text inside button
		btn.setText("Blue");
		
		EventHandler<ActionEvent> bevent = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
//				Color cul = Color.BLACK;
//				cul = toggleColor();
//				graphicContext.setFill(cul);
				graphicContext.setStroke(Color.BLUE);
			}
		};

		// when button is pressed
		btn2.setOnAction(bevent);

		EventHandler<MouseEvent> mousClik = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent myz) {
				String tempTxt = "mouse clicked: " + roundToOnePlace(myz.getX()) + " " + roundToOnePlace(myz.getY());
				txt2.setText(tempTxt);
				System.out.println(tempTxt);
			}
		};

		EventHandler<MouseEvent> mousLoc = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent myz) {
//				String txt1cont = "x coord: " + roundOne(myz.getX()) + " - x coord: " + roundOne(myz.getY());
//				txt1.setText(txt1cont);
//				System.out.println("mouse Loc: " + myz.getX() + " " + myz.getY());
			}
		};

		EventHandler<MouseEvent> mousPress = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent myz) {
				mouseDownX = roundToOnePlace(myz.getX());
				mouseDownY = roundToOnePlace(myz.getY());
				System.out.println("mouse down X: "+ roundToOnePlace(myz.getX()) + ", Y: " + roundToOnePlace(myz.getY()));
				System.out.println("mouse down X: "+ mouseDownX + ", Y: " + mouseDownY);
			}
		};

		EventHandler<MouseEvent> mousRels = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent myz) {
				mouseUpX = myz.getX();
				mouseUpY = myz.getY();
				System.out.println("mouse Up X: "+ roundToOnePlace(myz.getX()) + ", Y: " + roundToOnePlace(myz.getY()));
				System.out.println("mouse down X: "+ mouseDownX + ", Y: " + mouseDownY);
				drawLine(graphicContext);
			}
		};

		// setting the color to shapes
		graphicContext.setFill(Color.DARKKHAKI);

		// setting the shadow color to the shape
		graphicContext.setStroke(Color.DARKVIOLET);

		// setting line width
		graphicContext.setLineWidth(6);

		// adding shapes
		// graphicContext.fillOval(11, 61, 31, 31);
		graphicContext.fillRoundRect(111, 61, 31, 31, 11, 11);
		graphicContext.strokeRoundRect(161, 61, 31, 31, 11, 11);
		graphicContext.fillArc(110, 111, 31, 31, 46, 241, ArcType.ROUND);
		graphicContext.strokeArc(111, 111, 31, 31, 46, 241, ArcType.ROUND);

		// ---- making containers ----
		VBox vbox1 = new VBox(10);
		VBox vboxButtons = new VBox(10);
		HBox hbox1 = new HBox(10);
		HBox hbox2 = new HBox(10);
		
		vboxButtons.getChildren().add(btn);
		vboxButtons.getChildren().add(btn2);
		
		hbox1.getChildren().add(txt1);
		hbox1.getChildren().add(txt2);

		groupObject.getChildren().add(myCanvas);

		groupObject.setOnMouseClicked(mousClik);
		groupObject.setOnMouseMoved(mousLoc);
		groupObject.setOnMousePressed(mousPress);
		groupObject.setOnMouseReleased(mousRels);

		hbox2.getChildren().add(groupObject);
		hbox2.getChildren().add(vboxButtons);
		
		vbox1.getChildren().add(hbox2);
		vbox1.getChildren().add(hbox1);

		// creating scene object
		Scene sceneObject = new Scene(vbox1);
		outStageObject.setScene(sceneObject);
		outStageObject.show();
	}
	
	public Color toggleColor() {
		return  Color.RED;
	};

	public static void main(String[] args) {
		launch(args);
	}

	public static double roundToOnePlace(double num) {
		num = Math.round(num * 10);
		return num / 10;
	}

	public void drawLine(GraphicsContext graphicContext) {
		System.out.println("in draw line");
		// graphicContext.fillOval(11, 61, 31, 31);
		// Line line = new Line(100, 10, 10, 110);
//		double mouseDownX = 0.0;
//		double mouseUpX = 0.0;
//		double mouseDownY = 0.0;
//		double mouseUpY = 9.0;
		printLoc();
		graphicContext.strokeLine(mouseDownX, mouseDownY, mouseUpX, mouseUpY);
	}
	
	public void printLoc() {
		System.out.println(mouseDownX +" "+ mouseUpX +" "+ mouseDownY +" "+ mouseUpY);
	}

}

// References
// https://stackoverflow.com/questions/5710394/how-do-i-round-a-double-to-two-decimal-places-in-java
// https://www.educba.com/javafx-canvas/?source=leftnav 
