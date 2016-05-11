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
	
	// Pusle, mille koosseisu ese kuulub 
	protected Puzzle puzzle;
	
	// Pusle, mis peab tehtud olema enne kui antud esemega tegeleda saab
	protected Puzzle condition;
	
	// Meetod, mille abil laetakse pilt 
	public abstract void Load();
	
	public Prop(String ID, Puzzle puzzle, Puzzle condition) 
	{
		this.ID = ID;
		this.puzzle = puzzle;
		this.condition = condition;
		this.setOnMouseClicked(event -> React());
		//this.addEventHandler(EventType.ROOT, eventHandler);
	}
	
	public String getID()
	{
		return ID;
	}
	

}
