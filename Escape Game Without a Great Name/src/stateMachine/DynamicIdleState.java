package stateMachine;

public class DynamicIdleState extends DynamicState {

	private double[] location;
	
	@Override
	public void pickUp() 
	{ /* owner.enterState(dragState); */ }

	@Override
	public void putDown() { /* do nothing */ }

}
