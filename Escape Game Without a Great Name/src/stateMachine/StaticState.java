package stateMachine;

import javafx.scene.image.Image;
import roomStructure.StaticProp;

public class StaticState extends State 
{
	private StaticState firstInList;
	private StaticState nextInList;
	public StaticState getNextInList() {
		return nextInList;
	}
	
	public void setFirstInList(StaticState firstInList) {
		this.firstInList = firstInList;
	}
	
	public StaticState(String image, StaticState next, StaticProp owner) {

		this.owner = owner;
		nextInList = next;
		imageRepresentation = new Image(image);
	}
	
	public void next()
	{
		if (owner instanceof StaticProp)
		{
			if(nextInList != null)
				((StaticProp) owner).enterState(nextInList);
			else ((StaticProp)owner).enterState(firstInList);
		}
	}
}
