package stateMachine;

import java.util.HashMap;

public class DynamicDragState extends DynamicState {
	
	private int[] dragCoordinates;
	private HashMap<Integer, Integer[]> possibleLocations;
 
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
	
	public boolean isLocationValid(int room, int view, int zoom, int x, int y)
	{
		if (!possibleLocations.containsKey(room))
			return false;
		int[] params = {view, zoom, x, y};
		return possibleLocations.get(room).equals(params);
	};
	

}
