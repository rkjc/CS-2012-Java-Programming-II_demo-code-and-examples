package b_singleElements;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LabelWithFontDemo_3 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {    
    // Create a pane to hold the circle 
    StackPane spane = new StackPane();
    //Pane spane = new Pane();
    
    
    // Create a label and set its properties
    Label label = new Label("JavaFX");
    label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
    
    spane.getChildren().add(label);
    

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
