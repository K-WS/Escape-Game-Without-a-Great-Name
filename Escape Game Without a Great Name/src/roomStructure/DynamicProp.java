package roomStructure;

import stateMachine.DynamicDragState;
import stateMachine.DynamicIdleState;
import stateMachine.DynamicInventoryState;
import stateMachine.DynamicState;
import stateMachine.State;

public class DynamicProp extends Prop implements Switchable{

	private boolean stateLocked;
	private DynamicState currentState;
	
	private ContainerProp container;
	
	public DynamicInventoryState inventoryState;
	public DynamicDragState dragstate;
	public DynamicIdleState idleState;
	
	public DynamicProp(int ID, Puzzle puzzle, Puzzle condition) {
		super(ID, puzzle, condition);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Load() 
	{
		// TODO Auto-generated method stub
	}

	public void enterState(State newState) 
	{
		if(!stateLocked && newState instanceof DynamicState)
			currentState = (DynamicState)newState;
	}

	public void lockState() 
	{
		stateLocked = true;		
	}

	public void unlockState() 
	{
		stateLocked = false;
	}

}
