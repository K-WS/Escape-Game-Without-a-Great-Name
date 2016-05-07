package stateMachine;

import java.util.HashMap;
import java.util.Map.Entry;

public class DynamicActiveState extends DynamicState {
	
	private HashMap<Entry<Integer, Integer>, Object> possibleLocations;
 
	@Override
	public void pickUp() {
		// owner.enterState(owner.inventoryState);
	}

	@Override
	public void putDown() {
		//owner.enterState(owner.idleState);
	}
	
	public void changeLocation(int[] newCoordinates)
	{
		
	}
	
	public boolean isLocationValid(Entry<Integer, Integer> roomNview, Object destination)
	{
		if (!possibleLocations.containsKey(roomNview))
			return false;
		return possibleLocations.get(roomNview).equals(destination);
	};
	

}
