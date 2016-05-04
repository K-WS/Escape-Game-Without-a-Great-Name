package roomStructure;

import stateMachine.State;

interface Switchable 
{
	void enterState(State newState);
	
	void lockState();
	
	void unlockState();
}
