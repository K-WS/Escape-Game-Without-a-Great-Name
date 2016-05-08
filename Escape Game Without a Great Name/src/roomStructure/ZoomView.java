package roomStructure;

import java.util.HashMap;

import gameEngine.Clickable;
import javafx.scene.Parent;

@SuppressWarnings("unused")
public class ZoomView extends ViewPoint{
	
	public ZoomView(Parent arg0, double arg1, double arg2) {
		super(arg0, arg1, arg2);
	}
	//HashMap<int, Clickable>
	private HashMap<Integer, Clickable> members;
	//HashMap<int, int[]>
	private HashMap<Integer, Integer[]> locations;
	private int subID;
	private ViewPoint parent;
	
	public void Load(){}
	public void React(){}
	
	
	
}
