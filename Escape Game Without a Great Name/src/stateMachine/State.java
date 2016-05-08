package stateMachine;

import javafx.scene.image.*;
import roomStructure.Prop;

@SuppressWarnings("unused")
public abstract class State 
{
	protected Prop owner;
	
	protected String imageRepresentation;
	public String getImageRepresentation() {
		return imageRepresentation;
	}
	
	protected Image imageRepresentation2;
	public Image getImageRepresentation2() {
		return imageRepresentation2;
	}
}
