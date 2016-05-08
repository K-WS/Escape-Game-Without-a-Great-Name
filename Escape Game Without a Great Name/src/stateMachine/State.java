package stateMachine;

import javafx.scene.image.*;
import roomStructure.Prop;

@SuppressWarnings("unused")
public abstract class State 
{
	protected Prop owner;
	
	protected Image imageRepresentation;
	public Image getImageRepresentation() {
		return imageRepresentation;
	}
}
