package gameEngine;

import javafx.application.Application;
import javafx.stage.Stage;
import objectCreation.FileParser;
import objectCreation.RoomFactory;
import roomStructure.Room;

public class GameEngine extends Application {
	private static Saver saver;
	private static RoomFactory factory;
	private static SavesLoader loader;
	private static Player player;
	private static Inventory inventory;
	private static Room[] rooms;

	public static void main(String[] args) throws Exception
	{
		FileParser parser = new FileParser();
		parser.openFile("testfile.txt");
		
		// JavaFX lol
		Application.launch(args);
	}
	
	public static void StartGame(){}
	public static void LoadGame(){}
	public static void SaveGame(){}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	//save/load võiks toimuda tektsifailina.
}
