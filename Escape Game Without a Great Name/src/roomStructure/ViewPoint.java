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
	private HashMap<String,StaticProp> staticProps;
	public void addProp(StaticProp p)
	{
		staticProps.put(p.getID(),p);
	}
	public StaticProp getStaticProp(String id)
	{
		return staticProps.get(id);
	}
	
	public ViewPoint(double width, double height, int index, ArrayList<StaticProp> staticProps) 
	{
		super(new Pane(),width, height);
		pane = (Pane)getRoot();
		this.staticProps = new HashMap<String,StaticProp>();
		this.IDindex = index;
		if(staticProps.size()>0){
			for(StaticProp p : staticProps)
			{
				this.staticProps.put(p.getID(), p);
			}
		}
	}
	

	private HashMap<Double[], Clickable> locationsToMembers;
	private int subID;
	
	public void Load(){}		
}
