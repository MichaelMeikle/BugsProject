package bugs.bug;

import bugs.exceptions.BugStomachException;

/*
 * Stores grass swallowed by mouth
 * Can expel its grass hold and report on whether or not it is full
 */

public class BugStomach extends BugCell{
	private Grass stomachContent;
	public BugStomach(){
		
	}
	//Called by the BugAI when the bug is within 1 space of grass
	public void swallow(Grass mouthContent) throws BugStomachException{
		if(isFull()){
			throw new BugStomachException("Stomach is full");
		}
		stomachContent = mouthContent;
	}
	
	public Grass expelContent() throws BugStomachException{
		if(stomachContent != null){
			Grass temp = stomachContent;
			stomachContent = null;
			return temp;
		}
		else{
			throw new BugStomachException("Stomach is empty");
		}
	}
	public boolean isFull(){
		if(stomachContent != null)
			return true;
		else
			return false;
	}
}
