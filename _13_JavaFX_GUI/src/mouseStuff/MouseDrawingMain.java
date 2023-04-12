package mouseStuff;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseDrawingMain extends Application {
	
	Text txt1 = new Text("Text at the bottom of the VBox stack");
	Text txt2 = new Text("click position");
	double mouseDownX = 0.0;
	double mouseUpX = 0.0;
	double mouseDownY = 0.0;
	double mouseUpY = 9.0;
	
	Pane drawPane = new Pane();
	
	@Override
	public void start(Stage outStageObject) {
		outStageObject.setTitle("Drawing Shapes");
		//creating group object for adding canvas object to it
		Group groupObject = new Group();
		

//		// creating canvas object
//		Canvas canvasRef = new Canvas(400, 300);
//		// creating GraphicsContext for drawing the image
//		GraphicsContext graphicContext = canvasRef.getGraphicsContext2D();
		
		EventHandler<MouseEvent> mousClik = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent myz) {
				String tempTxt = "mouse clicked: " + roundOne(myz.getX() )+ " " + roundOne(myz.getY());
				txt2.setText(tempTxt);
				System.out.println(tempTxt);
			}
		};
		
		EventHandler<MouseEvent> mousLoc = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent myz) {
				String txt1cont = "x coord: " + roundOne(myz.getX()) + " - x coord: " + roundOne(myz.getY());
				txt1.setText(txt1cont);
				System.out.println("mouse Loc: " + myz.getX() + " " + myz.getY());
			}
		};
		
		EventHandler<MouseEvent> mousPress = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent myz) {
					mouseDownX = myz.getX();
					mouseDownY = myz.getX();	
			}
		};
		
		EventHandler<MouseEvent> mousRels = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent myz) {
				mouseUpX = myz.getX();
				mouseUpY = myz.getX();	
				//drawLine(graphicContext);
			}
		};
		
		
//		// setting the color to shapes
//		graphicContext.setFill(Color.DARKKHAKI);
//
//		// setting the shadow color to the shape
//		graphicContext.setStroke(Color.DARKVIOLET);

//		// setting line width
//		graphicContext.setLineWidth(6);
		
//		// adding shapes
//		graphicContext.fillOval(11, 61, 31, 31);
//		graphicContext.fillRoundRect(111, 61, 31, 31, 11, 11);
//		graphicContext.strokeRoundRect(161, 61, 31, 31, 11, 11);
//		graphicContext.fillArc(110, 111, 31, 31, 46, 241, ArcType.ROUND);
//		graphicContext.strokeArc(111, 111, 31, 31, 46, 241, ArcType.ROUND);

	    Circle circle = new Circle();
	    circle.setCenterX(100);
	    circle.setCenterY(100);
	    circle.setRadius(50);
	    circle.setStroke(Color.BLACK);
	    circle.setFill(null);
		
		Line line1 = new Line(10, 10, 50, 100);
//	    line1.endXProperty().bind(widthProperty().subtract(10));
//	    line1.endYProperty().bind(heightProperty().subtract(10));
	    line1.setStrokeWidth(5);
	    line1.setStroke(Color.GREEN);
	    drawPane.getChildren().add(line1);
		drawPane.getChildren().add(circle);
	    
		//groupObject.getChildren().add(myCircle);
		
		VBox vbox1 = new VBox(10);
		HBox hbox1 = new HBox(10);

		hbox1.getChildren().add(txt1);
		hbox1.getChildren().add(txt2);

		//groupObject.getChildren().add(canvasRef);

//		groupObject.setOnMouseClicked(mousClik);
//		groupObject.setOnMouseMoved(mousLoc);
//		groupObject.setOnMousePressed(mousPress);
//		groupObject.setOnMouseReleased(mousRels);
		
		drawPane.resize(500, 500);
		
		drawPane.setOnMouseClicked(mousClik);
		drawPane.setOnMouseMoved(mousLoc);
		drawPane.setOnMousePressed(mousPress);
		drawPane.setOnMouseReleased(mousRels);

		vbox1.getChildren().add(drawPane);
		vbox1.getChildren().add(hbox1);
		
		// creating scene object
		Scene sceneObject = new Scene(vbox1, 500, 500);
		outStageObject.setScene(sceneObject);
		outStageObject.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
	public static double roundOne(double num) {
		num = Math.round(num * 10);
		return num/10;
	}
	
	public static void drawLine(GraphicsContext graphicContext) {
		System.out.println("in draw line");
		//graphicContext.fillOval(11, 61, 31, 31);
		//Line line = new Line(100, 10, 10, 110);
//		double mouseDownX = 0.0;
//		double mouseUpX = 0.0;
//		double mouseDownY = 0.0;
//		double mouseUpY = 9.0;
		//graphicContext.strokeLine(mouseDownX, 10, 200, 200);
		
	}

}

// References
// https://stackoverflow.com/questions/5710394/how-do-i-round-a-double-to-two-decimal-places-in-java
// https://www.educba.com/javafx-canvas/?source=leftnav 

