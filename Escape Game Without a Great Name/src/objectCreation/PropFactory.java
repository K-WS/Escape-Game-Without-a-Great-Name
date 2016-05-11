package objectCreation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javafx.scene.Group;
import roomStructure.ContainerProp;
import roomStructure.DynamicProp;
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
	
	//meetod proppide sisselugemiseks
	static HashMap<List<String>, Prop> HashProp() throws Exception{
		HashMap<List<String>, Prop> Hasher = new HashMap<>();
		File props = new File("data/Resources/props.txt", "UTF-8");
		BufferedReader bfr = new BufferedReader(new FileReader(props));
		String line;
		
		while ((line = bfr.readLine()) != null) {
			String s = new String(line);
			if(s.equals("")){continue;}
			
			String[]s_alt = s.split(";");
			List<String> key = new ArrayList<>(Arrays.asList(s_alt[0],s_alt[2], s_alt[3]));
			Boolean bool1 = Boolean.valueOf(s_alt[2]);
			Boolean bool2 = Boolean.valueOf(s_alt[3]);
			
			if(s_alt[1].equals("static")){
				
				Prop prop = new StaticProp(s_alt[0], bool1, bool2);
				Hasher.put(key, prop);
			}
			else if(s_alt[1].equals("dynamic")){
				//TODO Juta needed to do this part, apparently

			}
			else if(s_alt[1].equals("container")){
				Prop prop = new ContainerProp(s_alt[0], bool1, bool2);
				Hasher.put(key, prop);
			}		
		}
		bfr.close();
	
		return Hasher;
		}
}

