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
				  "-fx-background-image: url('file:data/Testing/roomTest.png'); "
				+ "-fx-background-repeat: stretch;"   
				+ "-fx-background-position: center center; "
				+ "-fx-background-size: 1024, 512"
				);
		
		ViewPoint firstvp = new ViewPoint(xdGroup, 1014, 512);
		currentViewPoints = new HashMap<Integer,Scene>();
		currentViewPoints.put(1, firstvp);
		
		String[] crateAddress = {"file:data/Testing/crateXD.png"};
		StaticProp crate = new StaticProp("1", null, null, crateAddress, null, false, false);
		Group crateHolder = firstvp.getFrame();
		crateHolder.getChildren().add(crate);
		crate.Load();
		crateHolder.setLayoutY(275);
		
		crate.setScaleX(0.5); crate.setScaleY(0.5);
		xdGroup.getChildren().add(crateHolder);
		
		launch(args);
	}
}
