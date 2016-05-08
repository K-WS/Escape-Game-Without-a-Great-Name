package roomStructure;

import java.util.ArrayList;

public class ContainerProp extends Prop {
	
	public ContainerProp(String ID, Puzzle puzzle, Puzzle condition) {
		super(ID, puzzle, condition);
		// TODO Auto-generated constructor stub
	}

	private boolean accessible;
	private ArrayList<Prop> subProps;

	@Override
	public void Load() {
		// TODO Auto-generated method stub
	}
	
	public void Add(Prop newProp)
	{
		if (!subProps.contains(newProp))
			subProps.add(newProp);
	}
	
	public void Remove(Prop oldProp)
	{
		if (subProps.contains(oldProp))
			subProps.remove(oldProp);
	}
	
	public void toggleAccess()
	{
		if (accessible) accessible = false;
		else accessible = true;
	}

	@Override
	public void React() {
		// TODO Auto-generated method stub
		
	}

}
