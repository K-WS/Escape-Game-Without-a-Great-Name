package stateMachine;

import javafx.scene.Node;
import javafx.scene.image.*;
import roomStructure.Prop;

@SuppressWarnings("unused")
public abstract class State extends Node
{
	protected Prop owner;
	
	protected Image imageRepresentation;
	public Image getImageRepresentation() {
		return imageRepresentation;
	}
}
