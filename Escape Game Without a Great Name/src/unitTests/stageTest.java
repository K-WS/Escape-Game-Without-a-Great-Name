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
				  "-fx-background-image: url('file:data/Testing/roomTestC3.png'); "
				+ "-fx-background-repeat: stretch;"   
				+ "-fx-background-position: center center; "
				+ "-fx-background-size: 1024, 512"
				);
		
		ViewPoint firstvp = new ViewPoint(xdGroup, 1014, 512);
		currentViewPoints = new HashMap<Integer,Scene>();
		currentViewPoints.put(1, firstvp);
		
		String[] itemAddress = {"file:data/Testing/lampPun.png"};
		String[] extraAddress = {"file:data/Testing/lampRoh.png"};
		StaticProp itemExample = new StaticProp("1", null, null, itemAddress, null, false, false);
		StaticProp extra = new StaticProp("2", null, null, extraAddress, null, false, false);
		
		itemExample.Load(); 
		extra.Load();
		
		itemExample.setLayoutX(325);
		itemExample.setLayoutY(205);
		
		extra.setLayoutX(405);
		extra.setLayoutY(205);
		
		itemExample.setScaleX(0.545); itemExample.setScaleY(0.545);
		extra.setScaleX(0.545); extra.setScaleY(0.545);
		xdGroup.getChildren().addAll(itemExample, extra /*itemHolder, doorHolder*/);
		
		launch(args);
	}
}
