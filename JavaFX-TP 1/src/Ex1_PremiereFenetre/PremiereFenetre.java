package Ex1_PremiereFenetre;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PremiereFenetre extends Application {

	 @Override
	 public void start(Stage primaryStage) {
	 Group root = new Group();
	
		
	 Scene scene = new Scene(root, 300, 250, Color.WHITE);
	 
	 primaryStage.setTitle("Ma premi�re fen�tre");
	 primaryStage.setScene(scene);
	 primaryStage.show();
	 }
	 public static void main(String[] args) {
	 launch(args);
	 }
	}
