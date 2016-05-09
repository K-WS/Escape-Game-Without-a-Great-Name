package objectCreation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javafx.scene.Group;
import roomStructure.ContainerProp;
import roomStructure.Prop;
import roomStructure.Puzzle;
import roomStructure.Room;
import roomStructure.StaticProp;
import roomStructure.ViewPoint;

public class PropFactory {
	private String[] existingIds;
	
	public Prop[] buildProps(String[] propsInfo){return null;}
	public Prop buildProp(String propInfo){return null;}
	
	
	public HashMap<String, Prop> parseAllProps() throws Exception{
		//string - objekti id
		//prop - objekt selles ruumis
		
		Scanner sc = new Scanner(new File("props.txt"));
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		return null;
	}
	
	//factory'te töö juurdelisamine:
	HashMap<String[], Prop> HashProp() throws Exception{
		HashMap<String[], Prop> Hasher = new HashMap<>();
		File staticStates = new File("data/Resources/StaticStates.txt", "UTF-8");
		BufferedReader bfr = new BufferedReader(new FileReader(staticStates));
		String line;
		
		while ((line = bfr.readLine()) != null) {
			String s = new String(line);
			if(s.equals("")){continue;}
			
			String[]s_alt = s.split(";");
			String[] key = {s_alt[0],s_alt[2], s_alt[3]};
			Prop prop = new StaticProp(s_alt[0], null, null, null, null, null, null);
//			String ID, Puzzle puzzle, Puzzle condition, String[] filenamesReversed, 
//			ContainerProp container, boolean locked, boolean invisible) 
			
			Hasher.put(key, prop);
		}
		bfr.close();
	
		return Hasher;
		}
	
	
	//viewpoint:
	Room A = new Room("A",new ArrayList<ViewPoint>(4),new ViewPoint(new Group(), 1024, 512));
	Room B = new Room("B",new ArrayList<ViewPoint>(4),new ViewPoint(new Group(), 1024, 512));
	Room C = new Room("C",new ArrayList<ViewPoint>(4),new ViewPoint(new Group(), 1024, 512));
	Room D = new Room("D",new ArrayList<ViewPoint>(4),new ViewPoint(new Group(), 1024, 512));
	Room E = new Room("E",new ArrayList<ViewPoint>(2),new ViewPoint(new Group(), 1024, 512));
	
	
	
	
}

