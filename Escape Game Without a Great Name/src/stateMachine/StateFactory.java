package stateMachine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import roomStructure.Prop;
import roomStructure.StaticProp;

public class StateFactory 
{
	private static HashMap<String, ArrayList<String>> dataByID;
	
	public static void readFiles() throws FileNotFoundException
	{
		dataByID = new HashMap<String, ArrayList<String>>();
		Scanner scan = new Scanner (new File("StaticStates.txt"));
		while (scan.hasNextLine())
		{
			String rida = scan.nextLine();
			int i = rida.indexOf(";");
			if (!dataByID.containsKey(rida.substring(0, i)))
			{
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(rida.substring(i));
				dataByID.put(rida.substring(0, i), temp);
			}
			else
			{
				dataByID.get(rida.substring(0, i)).add(rida.substring(i));
			}
		}
		
		scan = new Scanner (new File("DynamicStates.txt"));
		while (scan.hasNextLine())
		{
			String rida = scan.nextLine();
			int i = rida.indexOf(";");
			if (!dataByID.containsKey(rida.substring(0, i)))
			{
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(rida.substring(i));
				dataByID.put(rida.substring(0, i), temp);
			}
			else
			{
				dataByID.get(rida.substring(0, i)).add(rida.substring(i));
			}
		}
		scan.close();
	}

	public static StaticState buildStatics(String[] filenamesReversed, StaticProp owner)
	{
		ArrayList<StaticState> states = new ArrayList<StaticState>();
		
		StaticState ss = null;
		for (String filename : filenamesReversed)
		{
			ss = new StaticState(filename, ss, owner);
			states.add(ss);
			ss.setFirstInList(states.get(0));
		}
		
		return states.get(0);
	}
	
	public static StaticState buildStaticStates(StaticProp owner)
	{
		ArrayList<StaticState> states = new ArrayList<StaticState>();
		String id = owner.getID();
		ArrayList<String> stateInfo = dataByID.get(id);
		Collections.reverse(stateInfo);
		StaticState ss = null;
		for (String dataLine : stateInfo)
		{
			String[] dataArray = dataLine.split(";");
			ss = new StaticState(
					dataArray[0],
					ss, 
					owner);
			states.add(ss);
			ss.setFirstInList(states.get(0));
		}
		
		return null;
	}
}
