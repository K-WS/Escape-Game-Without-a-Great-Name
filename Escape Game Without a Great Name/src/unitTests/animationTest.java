package unitTests;

import javafx.application.Application;
import javafx.scene.image.*;
import javafx.stage.Stage;

public class animationTest extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {

		ImageView fireFrame = new ImageView();
		Image flame = new Image("falmetest.png");
		fireFrame.setImage(flame);
		
	}

}
