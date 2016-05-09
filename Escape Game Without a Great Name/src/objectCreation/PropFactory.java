package objectCreation;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

import roomStructure.Prop;

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
}
