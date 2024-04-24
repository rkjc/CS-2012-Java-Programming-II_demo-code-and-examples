package b_singleElements;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LabelWithColoBoarderDemo_4 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {    
    // Create a pane to hold the circle 
    //Pane spane = new Pane();
    StackPane spane = new StackPane();
    
    // Create a label and set its properties
    Label dislabel = new Label("JavaFX");
    
    dislabel.setFont(Font.font(40));
    
    dislabel.setAlignment(Pos.CENTER);
    
    dislabel.setStyle("-fx-text-fill: red; -fx-background-color: yellow; -fx-border-color: green; ");
   
    dislabel.setPrefHeight(200);
    dislabel.setPrefWidth(200);
    
    
    
    // setStyle() will over write previous setStyle()
    //dislabel.setStyle("-fx-text-fill: blue;");
    
    spane.getChildren().add(dislabel);
    

    // Create a scene and place it in the stage
    Scene scene = new Scene(spane, 400, 400);
    primaryStage.setTitle("FontDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    
  }
  
  //label.setStyle("-fx-border-color: white;");

  public static void main(String[] args) {
    launch(args);
  }
}

// label.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

// label.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));

