package roomStructure;

import java.util.Arrays;

public abstract class Puzzle 
{
	protected boolean[] checkpoints;
	public abstract void completeCheckpoint(int index);
	
	public boolean isSolved() // return true if checkPoints only contains true
	{
		return !(Arrays.asList(checkpoints)).contains(false);
	}
}
