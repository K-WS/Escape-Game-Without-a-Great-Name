package roomStructure;

import java.util.ArrayList;

import stateMachine.State;
import stateMachine.StateFactory;
import stateMachine.StaticState;

@SuppressWarnings("unused")
public class StaticProp extends Prop implements Switchable{
	
	private boolean invisible;
	private boolean stateLocked;
	private StaticState currentState;
	private ContainerProp container;

	public StaticProp(String ID, Puzzle puzzle, Puzzle condition, String[] filenamesReversed, 
						ContainerProp container, boolean locked, boolean invisible) 
	{
		super(ID, puzzle, condition);
		this.container = container;
		currentState = StateFactory.buildStatics(filenamesReversed, this);
	}

	@Override
	public void Load() 
	{
		imageHolder.setImage(currentState.getImageRepresentation());
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
	
	public void hide()
	{
		setOpacity(0);
		lockState();
	}
	public void unHide()
	{
		setOpacity(1);
	}

	@Override
	public void React(Prop source) {
		// TODO Auto-generated method stub
		
	}

}
