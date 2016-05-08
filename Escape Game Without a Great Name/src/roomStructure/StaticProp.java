package roomStructure;

import stateMachine.State;
import stateMachine.StateFactory;
import stateMachine.StaticState;

@SuppressWarnings("unused")
public class StaticProp extends Prop implements Switchable{
	
	private boolean invisile;
	private boolean stateLocked;
	private StaticState currentState;
	private ContainerProp container;

	public StaticProp(int ID, Puzzle puzzle, Puzzle condition, String[] filenamesReversed, ContainerProp container, boolean locked, boolean invisible) 
	{
		super(ID, puzzle, condition);
		this.container = container;
		currentState = StateFactory.buildStatics(filenamesReversed, this);
	}

	@Override
	public void Load() 
	{
//		this.setStyle(
//				  "-fx-background-image: url('"+currentState.getImageRepresentation()+"'); -fx-background-size: 95, 75"
//		);
		this.setImage(currentState.getImageRepresentation2());
		
	}

	@Override
	public void enterState(State newState) {
		if (newState instanceof StaticState)
		{
			currentState = (StaticState)newState;
		}
		
	}

	@Override
	public void lockState() {
		stateLocked = true;
		
	}

	@Override
	public void unlockState() {
		stateLocked = false;
		
	}

	@Override
	public void React() 
	{
		
	}

}
