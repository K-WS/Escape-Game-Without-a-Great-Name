package stateMachine;

import roomStructure.StaticProp;

public class StaticState extends State 
{
	private StaticState firstInList;
	private StaticState nextInList;
	
	public void next()
	{
		if (owner instanceof StaticProp)
		{
			if(nextInList != null)
				((StaticProp) owner).enterState(nextInList);
			else ((StaticProp)owner).enterState(firstInList);
		}
	}
}
