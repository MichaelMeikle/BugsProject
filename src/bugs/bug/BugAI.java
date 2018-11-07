package bugs.bug;

import bugs.exceptions.BugAIStateException;
import bugs.map.Map;

/*
 * Each bug has its own bugAI object that will determine its movements
 * Each cycle the bugAI will make its request, if any to the MapHandler
 */
public class BugAI {
	private Map map;
	//Wander, Hungry, Seek
	private String state;
	private Bug bug;
	
	public BugAI(Bug bug){
		state = "HUNGRY";
		this.bug = bug;
	}
	public void changeState(String newState) throws BugAIStateException{
		if(newState == "HUNGRY" || newState == "SEEK" || newState == "WANDER")
			state = newState;
		else
			throw new BugAIStateException("Invalid AI State Exception when state change attempt made.");
	}
	public String getState(){
		return state;
	}
}
