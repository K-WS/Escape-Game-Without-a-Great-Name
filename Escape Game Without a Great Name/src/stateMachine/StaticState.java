package stateMachine;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;

import gameEngine.Inventory;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import roomStructure.PlaceHolder;
import roomStructure.StaticProp;

public class StaticState extends State 
{
	
	private StaticState firstInList;
	private StaticState nextInList;
	public StaticState getNextInList() { return nextInList;	}
	
	private boolean isDoor;
	
	private String pokeID;
		public String getPokeID() { return pokeID; }
	private String remoteID;
		public String getRemoteID() { return remoteID; }
	
	
	private EventHandler<SomethingHappened> handler;
		public EventHandler<SomethingHappened> getHandler() { return handler; }
	private EventHandler<MouseEvent> clickHandler;
		public EventHandler<MouseEvent> getClickHandler() { return clickHandler; }
	
	public void setFirstInList(StaticState firstInList) {
		this.firstInList = firstInList;
	}
	
	public StaticState(String image, StaticState next, StaticProp owner) {

		this.owner = owner;
		nextInList = next;
		imageRepresentation = new Image(image);
	}
	
	public StaticState(String image, StaticState next, StaticProp owner, String pokeID,boolean[] pokeResults,  String remoteID, boolean[] remoteResults, boolean isDoor, String leadsTo) {

		this.isDoor = isDoor;
		this.owner = owner;
		nextInList = next;
		imageRepresentation = new Image(image);
		if(pokeID!=null){
			handler = new EventHandler<SomethingHappened>() {
				
				private boolean[] pokeResultsH = pokeResults;
				@Override
				public void handle(SomethingHappened event) {
					if (event.getSourceID().equals(pokeID))
					{
						if(pokeResultsH[4])
							next();
						if(pokeResultsH[0])
							owner.hide();
						if(pokeResultsH[1])
							owner.unHide();
						if(pokeResultsH[2])
							owner.lockState();
						if(pokeResultsH[3])
							owner.unlockState();
					}
					
				}
			};
			this.pokeID = pokeID;
			
			addEventHandler(SomethingHappened.GAME_EVENTS, handler);
		}
		
		if(remoteID!= null)
		{
			this.remoteID = remoteID;
			clickHandler = new EventHandler<MouseEvent>()
			{
				private boolean[] remoteResultsH = remoteResults;
				@Override
				public void handle(MouseEvent event) 
				{
					if(Inventory.activeItem.getID() == remoteID)
					{
						if(remoteResultsH[4])
							next();
						if(remoteResultsH[0])
							owner.hide();
						if(remoteResultsH[1])
							owner.unHide();
						if(remoteResultsH[2])
							owner.lockState();
						if(remoteResultsH[3])
							owner.unlockState();
					}
				}
				
			};
			addEventHandler(MouseEvent.MOUSE_CLICKED, clickHandler);
		}
		
		
		
	}
	
	public void next()
	{
		if (owner instanceof StaticProp)
		{
			if(nextInList != null)
				((StaticProp) owner).enterState(nextInList);
			else ((StaticProp)owner).enterState(firstInList);
		}
	}

	@Override
	protected boolean impl_computeContains(double arg0, double arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BaseBounds impl_computeGeomBounds(BaseBounds arg0, BaseTransform arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected NGNode impl_createPeer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object impl_processMXNode(MXNodeAlgorithm arg0, MXNodeAlgorithmContext arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
