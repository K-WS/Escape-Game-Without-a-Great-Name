package roomStructure;

import gameEngine.Clickable;
import javafx.scene.image.ImageView;


public abstract class Prop extends javafx.scene.image.ImageView implements Clickable
{
	protected int ID;
	
	// Pusle, mille koosseisu ese kuulub 
	protected Puzzle puzzle;
	
	// Pusle, mis peab tehtud olema enne kui antud esemega tegeleda saab
	protected Puzzle condition;
	
	// Meetod, mille abil laetakse pilt 
	public abstract void Load();
	
	public Prop(int ID, Puzzle puzzle, Puzzle condition) 
	{
		this.ID = ID;
		this.puzzle = puzzle;
		this.condition = condition;
		this.setOnMouseClicked(event -> React());
	}
	
	public int getID()
	{
		return ID;
	}
	

}
