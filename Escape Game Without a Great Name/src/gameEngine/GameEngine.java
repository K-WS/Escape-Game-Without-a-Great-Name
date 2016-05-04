package gameEngine;

import objectCreation.FileParser;
import objectCreation.RoomFactory;
import roomStructure.Room;

public class GameEngine {
	private static Saver saver;
	private static RoomFactory factory;
	private static SavesLoader loader;
	private static Player player;
	private static Inventory inventory;
	private static Room[] rooms;

	public static void main(String[] args) throws Exception{
		FileParser parser = new FileParser();
		parser.openFile("testfile.txt");

	}
	
	public static void StartGame(){}
	public static void LoadGame(){}
	public static void SaveGame(){}

	
	//save/load võiks toimuda tektsifailina.
}
