package roomStructure;

public abstract class Prop 
{
	private int ID;
	private Puzzle puzzle;
	private Puzzle condition;
	
	public abstract void Load();
	public Prop(int ID, Puzzle puzzle, Puzzle condition) 
	{
		// TODO Auto-generated constructor stub
	}
	
	public int getID()
	{
		return ID;
	}
	

}
