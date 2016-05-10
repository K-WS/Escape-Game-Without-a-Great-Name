package stateMachine;

import java.util.HashMap;
import java.util.Map.Entry;

import javafx.event.Event;
import javafx.scene.Group;
import roomStructure.DynamicProp;

public class DynamicActiveState extends DynamicState {
	
	private HashMap<Entry<Integer, Integer>, Entry<Group, Event>> possibleLocations;
	
	@Override
	public void pickUp() {
		((DynamicProp)owner).enterState(
				((DynamicProp)owner).inventoryState);
	}

	@Override
	public void putDown() {
		((DynamicProp)owner).enterState(
				((DynamicProp)owner).idleState);
	}
	
	public boolean validLocation(Entry<Integer, Integer> roomNview, Group destination)
	{
		if (!possibleLocations.containsKey(roomNview))
			return false;
		return possibleLocations.get(roomNview).getKey().equals(destination);
	};
	

}
