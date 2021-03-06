package Ex1_FormeGeometrique;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class FormeGeometrique extends Application {

	 @Override
	 public void start(Stage primaryStage) {
      Rectangle r=new Rectangle();
	  Circle c = new Circle();
      Line l=new Line();

	  Group root = new Group();
	 
	   r.setX(98);
	   r.setY(68);
	   r.setWidth(100);
	   r.setHeight(100);
	   r.setFill(Color.RED);
	
	   c.setCenterX(150);
	   c.setCenterY(120);
	   c.setRadius(100);
	 
	   l.setStartX(1000);
	   l.setStartY(100);
	   l.setEndX(100);
	   l.setEndY(100);
	   l.setFill(Color.BLUE);
	 
	 root.getChildren().add(c);
	 root.getChildren().add(r);
	 root.getChildren().add(l);
	 
	 Scene scene = new Scene(root, 300, 250, Color.WHITE);
	 
	 primaryStage.setTitle("Ma premi?re fen?tre");
	 primaryStage.setScene(scene);
	 primaryStage.show();
	 }
	 public static void main(String[] args) {
	 launch(args);
	 }
	}