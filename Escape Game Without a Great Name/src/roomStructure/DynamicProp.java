package roomStructure;

import javafx.scene.image.ImageView;
import stateMachine.DynamicActiveState;
import stateMachine.DynamicIdleState;
import stateMachine.DynamicInventoryState;
import stateMachine.DynamicState;
import stateMachine.State;

public class DynamicProp extends Prop implements Switchable{

	private boolean stateLocked;
	private DynamicState currentState;
	
	public DynamicInventoryState inventoryState;
	public DynamicActiveState activeState;
	public DynamicIdleState idleState;
	
	public DynamicProp(String ID) 
	{
		super(ID);
	}
	
	public void hide()
	{
		setOpacity(0);
		lockState();
	}
	public void unHide()
	{
		setOpacity(1);
		unlockState();
	}

	@Override
	public void Load() 
	{
		imageHolder = new ImageView();
		getChildren().add(imageHolder);
		imageHolder.setImage(currentState.getImageRepresentation());
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

	@Override
	public void React(Prop source) {
		// TODO Auto-generated method stub
		
	}

}
