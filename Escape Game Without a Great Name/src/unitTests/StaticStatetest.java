package unitTests;

import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.stage.Stage;
import roomStructure.StaticProp;
import stateMachine.StateFactory;
import stateMachine.StaticState;

public class StaticStatetest extends Application {

	public static void main(String[] args) throws FileNotFoundException 
	{
		StateFactory.readFiles();
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		StaticProp xd = new StaticProp("001", false, false);
		StaticState ss = StateFactory.buildStaticStates(xd);
		
	}
}
