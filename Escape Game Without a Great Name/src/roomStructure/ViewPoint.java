package roomStructure;

import java.util.ArrayList;
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
public class ViewPoint extends Scene{
	private int IDindex;
	private Pane pane;
	public Pane getPane() {
		return pane;
	}
	private HashMap<String,Prop> props;
	
	public ViewPoint(double width, double height, int index, ArrayList<Prop> props) 
	{
		super(new Pane(),width, height);
		pane = (Pane)getRoot();
		this.props = new HashMap<String,Prop>();
		this.IDindex = index;
		if(props.size()>0){
			for(Prop p : props)
			{
				this.props.put(p.getID(), p);
			}
		}
	}
	

	private HashMap<Double[], Clickable> locationsToMembers;
	private int subID;
	
	public void Load(){}		
}
