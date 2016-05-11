package stateMachine;

import javafx.event.Event;
import javafx.event.EventType;

public class SomethingHappened extends Event {
	public static EventType<SomethingHappened> GAME_EVENTS = new EventType<SomethingHappened>("GAME_EVENTS");
	private String sourceID; 
	public String getSourceID() {
		return sourceID;
	}

	public SomethingHappened(EventType<? extends Event> arg0, String sourceID) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
