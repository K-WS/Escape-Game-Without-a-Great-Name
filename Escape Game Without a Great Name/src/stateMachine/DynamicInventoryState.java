package stateMachine;

public class DynamicInventoryState extends DynamicState {

	private int slorNumber;
	private boolean stackable;
	
	
	@Override
	public void pickUp() { /*owner.enterState(owner.activeState);*/ }

	@Override
	public void putDown() { /* do nothing */ }
	
	public boolean isStackable() { return stackable; }

}
