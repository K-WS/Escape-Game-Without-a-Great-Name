package stateMachine;

import java.util.ArrayList;

import roomStructure.StaticProp;

public class StateFactory 
{

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
}
