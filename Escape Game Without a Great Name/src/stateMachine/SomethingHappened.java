package stateMachine;

import javafx.event.Event;
import javafx.event.EventType;

public class SomethingHappened extends Event {
	
	private String source; 
	@Override
	public Object getSource() {
		// TODO Auto-generated method stub
		return super.getSource();
	}

	public SomethingHappened(EventType<? extends Event> arg0, String sourceID) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
