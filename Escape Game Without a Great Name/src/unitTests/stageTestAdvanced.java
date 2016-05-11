package unitTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import roomStructure.*;
import stateMachine.StateFactory;
import stateMachine.StaticState;

@SuppressWarnings("unused")
public class stageTestAdvanced extends Application {
	
	private static HashMap<Integer,ViewPoint> currentViewPoints;

	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setResizable(false);
		primaryStage.setScene(currentViewPoints.get(1));
		System.out.println("here now");
		StaticProp p = (StaticProp)currentViewPoints.get(1).getProp("001");
		Image im = p.getCurrentState().getImageRepresentation();
		ImageView iw = new ImageView(im);
		currentViewPoints.get(1).getPane().getChildren().add(iw);
		
//		currentViewPoints.get(1).getProp("001").Load();
		primaryStage.show();
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		
		ViewPoint firstvp = new ViewPoint(1014, 512, 0, new ArrayList<Prop>());
		firstvp.getPane().setStyle(
				  "-fx-background-image: url('file:data/Testing/roomTestC3.png'); "
				+ "-fx-background-repeat: stretch;"   
				+ "-fx-background-position: center center; "
				+ "-fx-background-size: 1024, 512"
				);
		currentViewPoints = new HashMap<Integer,ViewPoint>();
		currentViewPoints.put(1, firstvp);
		
		StateFactory.readFiles();
		StaticProp xd = new StaticProp("001", false, false);
		StaticState ss = StateFactory.buildStaticStates(xd);
		
		
		firstvp.getPane().getChildren().add(xd);
		firstvp.addProp(xd);
		
		launch(args);
	}
}
