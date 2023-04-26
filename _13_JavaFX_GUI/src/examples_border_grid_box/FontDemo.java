package examples_border_grid_box;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FontDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {    
    // Create a pane to hold the circle 
    StackPane spane = new StackPane();
    
    
    // Create a label and set its properties
    Label label = new Label("JavaFX");
    label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
    
    spane.getChildren().add(label);
    
/*    
 * 
    // adding a graphics element
    // Create a circle and set its properties
    Circle circle = new Circle();
    circle.setRadius(70);
    circle.setStroke(Color.BLACK); 
    //using Color Class
    circle.setFill(new Color(0.5, 0.5, 0.5, 0.0));
    //circle.setFill(new Color(1.0, 0.0, 0.1, 0.5));
    //circle.setFill(Color.rgb(255, 255, 0));
    
    spane.getChildren().add(circle); // Add circle to the pane
    
 */  

    // Create a scene and place it in the stage
    Scene scene = new Scene(spane, 400, 400);
    primaryStage.setTitle("FontDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    
  }
  

  public static void main(String[] args) {
    launch(args);
  }
}
