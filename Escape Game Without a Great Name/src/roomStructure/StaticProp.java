package roomStructure;

import java.util.ArrayList;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import stateMachine.State;
import stateMachine.StateFactory;
import stateMachine.StaticState;
import stateMachine.SomethingHappened;

@SuppressWarnings("unused")
public class StaticProp extends Prop implements Switchable{
	
	private boolean invisible;
	private boolean stateLocked;
	private StaticState currentState;
	public StaticState getCurrentState() {
		return currentState;
	}
	

	
	public StaticProp(String ID, boolean isLocked, boolean isInvisible) 
	{
		super(ID);
		invisible = isInvisible;
		if (isLocked)
			hide();
	}
	
	// Testkonstruktor, seda ei kasuta
	public StaticProp(String ID, String[] filenamesReversed, 
			boolean locked, boolean invisible) 
	{
		super(ID);
		currentState = StateFactory.buildStatics(filenamesReversed, this);
		
	}

	@Override
	public void Load() 
	{
		imageHolder = new ImageView();
		getChildren().add(imageHolder);
		System.out.println(currentState.getImageRepresentation().getHeight());
		imageHolder.setImage(currentState.getImageRepresentation());
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
	public void enterState(State newState) {
		if (newState instanceof StaticState)
		{
			currentState = (StaticState)newState;
		}
		
	}

	
	@Override
	public void lockState() {
		stateLocked = true;
		if(currentState.getHandler() != null)
			currentState.removeEventHandler(SomethingHappened.GAME_EVENTS, currentState.getHandler());
		if(currentState.getRemoteID() != null)
		{
			currentState.removeEventHandler(MouseEvent.MOUSE_CLICKED, currentState.getClickHandler());
		}
		
	}

	@Override
	public void unlockState() {
		stateLocked = false;
		if(currentState.getHandler() != null)
			currentState.addEventHandler(SomethingHappened.GAME_EVENTS, currentState.getHandler());
		if(currentState.getRemoteID() != null)
		{
			currentState.addEventHandler(MouseEvent.MOUSE_CLICKED, currentState.getClickHandler());
		}
		
	}

	@Override
	public void React() 
	{
		
	}
	
	

	@Override
	public void React(Prop source) {
		// TODO Auto-generated method stub
		
	}

}
