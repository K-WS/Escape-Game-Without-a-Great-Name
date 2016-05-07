package roomStructure;

import gameEngine.Clickable;
import javafx.scene.Group;

//comment: checkpoints.length() == 1
public class WindowedPuzzle extends Puzzle implements Clickable{
	
	private Group frame;
	
	public void makeaMove(int elementIndex){}
	public boolean PuzzleCompleted(){return false;}
	
	
	public void React(){}
	
	@Override
	public void completeCheckpoint(int index) {
		// TODO Auto-generated method stub
		
	}
	

	//ViewPointide fail
	//A, 1, 1, 567, 2, 001, 002
	// ruumi nimi, mitmes view, mitu alamvaadet, alamvaadete id-d (nii mitu tükki), mitu eset, esemete id-d
}
