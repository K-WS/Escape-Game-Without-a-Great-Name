package unitTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import roomStructure.*;

@SuppressWarnings("unused")
public class stageTest extends Application {
	
	private static HashMap<Integer,Scene> currentViewPoints;

	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setResizable(false);
		primaryStage.setScene(currentViewPoints.get(1));
		primaryStage.show();
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		Pane xdGroup = new Pane();
		xdGroup.setStyle(
				  "-fx-background-image: url('file:data/Testing/roomTestA1.png'); "
				+ "-fx-background-repeat: stretch;"   
				+ "-fx-background-position: center center; "
				+ "-fx-background-size: 1024, 512"
				);
		
		ViewPoint firstvp = new ViewPoint(xdGroup, 1014, 512);
		currentViewPoints = new HashMap<Integer,Scene>();
		currentViewPoints.put(1, firstvp);
		
		String[] crateAddress = {"file:data/Testing/pilt.png"};
		String[] doorAddress = {"file:data/Testing/auks.png"};
		StaticProp itemExample = new StaticProp("1", null, null, crateAddress, null, false, false);
		StaticProp door = new StaticProp("2", null, null, doorAddress, null, false, false);
		
		Group itemHolder = new Group();
		Group doorHolder = new Group();
		itemHolder.getChildren().add(itemExample);
		doorHolder.getChildren().add(door);
		itemExample.Load(); 
		door.Load();
		itemHolder.setLayoutX(675);
		itemHolder.setLayoutY(29);
		
		doorHolder.setLayoutX(70);
		doorHolder.setLayoutY(-73);
		
		itemExample.setScaleX(0.545); itemExample.setScaleY(0.545);
		door.setScaleX(0.545); door.setScaleY(0.545);
		xdGroup.getChildren().addAll(itemHolder, doorHolder);
		
		launch(args);
	}
}
