package roomStructure;

import java.util.HashMap;

import gameEngine.Clickable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
//comment:  
//subID == Room
//.viewPoints
//.indexOf(this)

@SuppressWarnings("unused")
public class ViewPoint extends Scene implements Clickable{
	private Room leadsTo;
	
	public ViewPoint(Parent arg0, double arg1, double arg2) {
		super(arg0, arg1, arg2);
	}
	

	private HashMap<Double[], Clickable> locationsToMembers;
	private int subID;
	
	public void Load(){}
	
	@Override
	public void React(){}

	@Override
	public void React(Prop source) {
		// TODO Auto-generated method stub
		
	}
		
}
