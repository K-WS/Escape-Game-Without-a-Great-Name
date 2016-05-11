package roomStructure;

import gameEngine.Clickable;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.image.ImageView;


public abstract class Prop extends Group implements Clickable
{
	protected String ID;
	protected ImageView imageHolder;
	
	// Meetod, mille abil laetakse pilt 
	public abstract void Load();
	
	public Prop(String ID) 
	{
		this.ID = ID;
		this.setOnMouseClicked(event -> React());
	}
	
	public String getID()
	{
		return ID;
	}
	

}
