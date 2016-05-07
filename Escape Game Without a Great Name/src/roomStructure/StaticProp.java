package roomStructure;

import stateMachine.State;
import stateMachine.StaticState;

public class StaticProp extends Prop implements Switchable{
	
	private boolean stateLocked;
	private StaticState currentState;
	private ContainerProp container;

	public StaticProp(int ID, Puzzle puzzle, Puzzle condition) 
	{
		super(ID, puzzle, condition);
	}

	@Override
	public void Load() {}

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
	public void React() {}

}
