package roomStructure;

import java.util.HashMap;

import gameEngine.Clickable;
//comment:  
//subID == Room
//.viewPoints
//.indexOf(this)
public class ViewPoint implements Clickable{
	
	private HashMap<Double[], Clickable> locationsToMembers;
	private int subID;
	
	public void Load(){}
	
	@Override
	public void React(){}
		
}
