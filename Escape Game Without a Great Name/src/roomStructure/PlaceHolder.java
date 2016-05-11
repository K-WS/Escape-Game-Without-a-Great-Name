package roomStructure;

import javafx.scene.layout.Pane;

public class PlaceHolder extends Pane 
{
	private Prop owner;
	public String getOwnerID()
	{
		return owner.getID();
	}
	public PlaceHolder(Prop owner) 
	{
		this.owner = owner;
	}
}
