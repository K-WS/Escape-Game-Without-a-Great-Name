package roomStructure;

import java.util.HashMap;

import gameEngine.Clickable;
//comment:  
//subID == Room
//.viewPoints
//.indexOf(this)
public class ViewPoint implements Clickable{
	
	//HashMap<int, Clickable>
	private HashMap<Integer, Clickable> members;
	//HashMap<int, int[]>
	private HashMap<Integer, Integer[]> locations;
	private int subID;
	
	public void Load(){}
	
	@Override
	public void React(){}
	
	
}
