package roomStructure;

import stateMachine.DynamicActiveState;
import stateMachine.DynamicIdleState;
import stateMachine.DynamicInventoryState;
import stateMachine.DynamicState;
import stateMachine.State;

public class DynamicProp extends Prop implements Switchable{

	private boolean stateLocked;
	private DynamicState currentState;
	
	@SuppressWarnings("unused")
	private ContainerProp container;
	
	public DynamicInventoryState inventoryState;
	public DynamicActiveState activeState;
	public DynamicIdleState idleState;
	
	public DynamicProp(int ID, Puzzle puzzle, Puzzle condition, ContainerProp container) 
	{
		super(ID, puzzle, condition);
		this.container = container;
		inventoryState = new DynamicInventoryState();
		activeState = new DynamicActiveState();
		idleState = new DynamicIdleState();
	}

	@Override
	public void Load() 
	{
		// Making prop visible / interactable
	}

	public void enterState(State newState) 
	{
		if(!stateLocked && newState instanceof DynamicState)
			currentState = (DynamicState)newState;
	}

	public void lockState() { stateLocked = true; }

	public void unlockState() { stateLocked = false; }
	
	@Override
	public void React() { }

}
