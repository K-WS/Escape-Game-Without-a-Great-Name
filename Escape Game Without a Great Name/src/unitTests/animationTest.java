package unitTests;

import java.util.HashMap;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import roomStructure.StaticProp;
import roomStructure.ViewPoint;

public class animationTest extends Application {

	private static HashMap<Integer,Scene> currentViewPoints;

	public static void main(String[] args) 
	{
		Pane xdGroup = new Pane();
		xdGroup.setStyle(
				  "-fx-background-image: url('file:data/Testing/roomTestA2.png'); "
				+ "-fx-background-repeat: no-repeat;"   
				+ "-fx-background-position: top center; "
				+ "-fx-background-size: 1024, 512"
				);
		
		ViewPoint firstvp = new ViewPoint(xdGroup, 1014, 782);
		currentViewPoints = new HashMap<Integer,Scene>();
		currentViewPoints.put(1, firstvp);
		
		String[] crateAddress = {"file:data/Testing/flame.png"};
		String[] crateAddress2 = {"file:data/Testing/flame2.png"};

		StaticProp itemExample = new StaticProp("1", null, null, crateAddress, null, false, false);
		Group itemHolder = new Group();
		itemHolder.getChildren().add(itemExample);
		itemExample.Load(); 
		itemHolder.setLayoutX(420);
		itemHolder.setLayoutY(347);
		itemHolder.setOpacity(0.5);
		itemHolder.setRotate(-10);
		itemExample.setScaleX(0.545); itemExample.setScaleY(0.545);
		
		StaticProp itemExample2 = new StaticProp("2", null, null, crateAddress2, null, false, false);
		Group itemHolder2 = new Group();
		itemHolder2.getChildren().add(itemExample2);
		itemExample2.Load(); 
		itemHolder2.setLayoutX(440);
		itemHolder2.setLayoutY(345);
		itemHolder2.setOpacity(0.5);
		itemHolder2.setRotate(7);
		itemExample2.setScaleX(0.545); itemExample2.setScaleY(0.545);
		
		xdGroup.getChildren().addAll(itemHolder, itemHolder2);
		
		itemHolder2.setOnMouseClicked(event -> {itemExample2.hide(); itemExample.hide();});
		itemHolder.setOnMouseClicked(event -> {itemExample2.hide(); itemExample.hide();});
		
		ParallelTransition parallelTransition = coolTransition(itemHolder, 20, 1500, 3000);
		parallelTransition.setCycleCount(Timeline.INDEFINITE);
		parallelTransition.play();
		
		ParallelTransition parallelTransition2 = coolTransition(itemHolder2, -14, 2500, 1500);
		parallelTransition2.setCycleCount(Timeline.INDEFINITE);
		parallelTransition2.play();
		launch(args);
		

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setResizable(false);
		primaryStage.setScene(currentViewPoints.get(1));
		primaryStage.show();
			
	}
	
	private static ParallelTransition coolTransition(Group holder, double rotate, double rotateDuration, double fadeDuration)
	{
		FadeTransition fadeTransition = 
				new FadeTransition(Duration.millis(fadeDuration), holder);
		
		RotateTransition rotateTransition = 
				new RotateTransition(Duration.millis(rotateDuration), holder);
		rotateTransition.setByAngle(rotate);
		rotateTransition.setCycleCount(Timeline.INDEFINITE);
		rotateTransition.setAutoReverse(true);
		
		ScaleTransition scaleTransition = 
				new ScaleTransition(Duration.millis(900), holder);
		scaleTransition.setToX(0.9f);
		scaleTransition.setToY(1.05f);
		scaleTransition.setCycleCount(Timeline.INDEFINITE);
		scaleTransition.setAutoReverse(true);
		
		fadeTransition.setFromValue(0.8f);
		fadeTransition.setToValue(0.5f);
		fadeTransition.setCycleCount(Timeline.INDEFINITE);
		fadeTransition.setAutoReverse(true);
		ParallelTransition parallelTransition = new ParallelTransition();
		parallelTransition.getChildren().addAll(
				fadeTransition,
				rotateTransition, 
				scaleTransition);
		return parallelTransition;
	}

}
