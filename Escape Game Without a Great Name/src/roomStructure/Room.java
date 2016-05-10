package roomStructure;

import java.util.ArrayList;

//comment: 
//direction == 1
//-> right
//direction == -1
//-> left

@SuppressWarnings("unused")
public class Room {
	private String ID;
	//ViewPoint[4]
	private ArrayList<ViewPoint> viewPoints;
	private ViewPoint currentViewPoint;
	public ViewPoint getCurrentViewPoint() {return currentViewPoint;}
	
	public void setCurrentViewPoint(ViewPoint currentViewPoint) {
		this.currentViewPoint = currentViewPoint;
	}




	public Room(String iD, ArrayList<ViewPoint> viewPoints, ViewPoint currentViewPoint) {
		super();
		ID = iD;
		this.viewPoints = viewPoints;
		this.currentViewPoint = currentViewPoint;
	}




	public void Load(){}
	public void unLoad(){}
	public void nextViewPoint(int direction){
		if(direction == 1 && viewPoints.indexOf(currentViewPoint)==3){
			currentViewPoint = viewPoints.get(0);
		}
		else if(direction == -1 && viewPoints.indexOf(currentViewPoint)==0){
			currentViewPoint = viewPoints.get(3);
		}
		else{
		currentViewPoint = viewPoints.get(viewPoints.indexOf(currentViewPoint)+direction);
		}
	}
	
	

}
