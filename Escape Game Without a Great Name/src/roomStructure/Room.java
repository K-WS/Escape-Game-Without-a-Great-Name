package roomStructure;

import java.util.ArrayList;

//comment: 
//direction == 1
//-> right
//direction == -1
//-> left

@SuppressWarnings("unused")
public class Room {
	private int ID;
	//ViewPoint[4]
	private ArrayList<ViewPoint> viewPoints;
	private ViewPoint currentViewPoint;
	public ViewPoint getCurrentViewPoint() {return currentViewPoint;}
	
	
	public void Load(){}
	public void unLoad(){}
	public void nextViewPoint(int direction){}
	
	

}
