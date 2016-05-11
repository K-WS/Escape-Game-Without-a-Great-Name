package stateMachine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import roomStructure.StaticProp;

public class StateFactory 
{
	private static HashMap<String, ArrayList<String>> dataByID;

	public static void readFiles() throws FileNotFoundException
	{
		dataByID = new HashMap<String, ArrayList<String>>();
		Scanner scan = new Scanner (new File("data/resources/StaticStates.txt"));
		while (scan.hasNextLine())
		{
			String rida = scan.nextLine();
			int i = rida.indexOf(";");
			if (!dataByID.containsKey(rida.substring(0, i)))
			{
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(rida.substring(i+1));
				System.out.println("lisan: "+rida.substring(0,i)+": "+rida.substring(i+1));
				dataByID.put(rida.substring(0, i), temp);
			}
			else
			{
				dataByID.get(rida.substring(0, i)).add(rida.substring(i+1));
				System.out.println("uus: "+rida.substring(0,i)+": "+rida.substring(i+1));
			}
		}

//		scan = new Scanner (new File("DynamicStates.txt"));
//		while (scan.hasNextLine())
//		{
//			String rida = scan.nextLine();
//			int i = rida.indexOf(";");
//			if (!dataByID.containsKey(rida.substring(0, i)))
//			{
//				ArrayList<String> temp = new ArrayList<String>();
//				temp.add(rida.substring(i));
//				dataByID.put(rida.substring(0, i), temp);
//			}
//			else
//			{
//				dataByID.get(rida.substring(0, i)).add(rida.substring(i));
//			}
//		}
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
			if (!dataArray[3].equals("x") && !dataArray[4].equals("y"))
			{
				String pokeID = dataArray[5];
				System.out.println("index 5: "+dataArray[5]);
				boolean[] pokeResults;
				String remoteID;
				int i;
				if(!pokeID.equals("null"))
				{
					System.out.println("not equal");
					boolean[] temp = {Boolean.parseBoolean(dataArray[6]), 
							Boolean.parseBoolean(dataArray[7]),
							Boolean.parseBoolean(dataArray[8]), 
							Boolean.parseBoolean(dataArray[9]), 
							Boolean.parseBoolean(dataArray[10])
					};
					pokeResults = temp;
					remoteID = dataArray[11]; i = 11;
					System.out.println("Remote index 11: "+dataArray[11]);
				}
				else 
				{ 
					pokeResults = null; 
					pokeID = null; remoteID = dataArray[6]; i = 6;
				System.out.println("Remote index 6: "+dataArray[6]);}
				String door;

				boolean[] remoteResults;
				if(!remoteID.equals("null"))
				{
					System.out.println("remote id not null");
					System.out.println(Arrays.asList(dataArray));
					boolean[] temp = {Boolean.parseBoolean(dataArray[i+1]), 
							Boolean.parseBoolean(dataArray[i+2]),
							Boolean.parseBoolean(dataArray[i+3]), 
							Boolean.parseBoolean(dataArray[i+4]), 
							Boolean.parseBoolean(dataArray[i+5])
					};
					remoteResults = temp;
					i = i+6;
				}
				else
				{
					remoteResults = null; remoteID = null; i++;
				}
				if(!dataArray[i].equals("false"))
					door = dataArray[i+1];
				else
					door = null;
				System.out.println("FAILINIMI: "+dataArray[0]+"<---");
				ss = new StaticState(
						"file:/data/Testing/"+dataArray[0].trim(),
						ss, 
						owner, 
						pokeID, 
						pokeResults, 
						remoteID, 
						remoteResults, 
						Boolean.parseBoolean(dataArray[i]), 
						door					
						);
				states.add(ss);
			}
		}
		states.forEach(x -> x.setFirstInList(states.get(states.size()-1)));
		return states.get(states.size()-1);
	}
}
