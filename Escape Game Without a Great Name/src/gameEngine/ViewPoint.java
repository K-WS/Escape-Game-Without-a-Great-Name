package gameEngine;

import java.util.HashMap;
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
