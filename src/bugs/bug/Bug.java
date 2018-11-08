package bugs.bug;
import java.util.Random;

import bugs.exceptions.BugAIStateException;
import bugs.map.Map;
import bugs.map.MapTile;
import bugs.map.MoveRequest;


//Container/Handler for the entirety of the bug components
/*
 * Every bug must start out with one mouth (center of layout)
 * Every bug must starts with 1 eye, 1 stomach, and 1 foot
 * If a bug that has filled its stomach does not reproduce within 60 seconds, adding a new random component
 * A bug can see 2 squares per eye, if there are no visible MapGrass objects within view
 * then the bug will wander around until one becomes visible
 * A bug can move 1 space per 3 (2?) seconds per foot
 */

public class Bug implements BugCreature{
	//Unique ID for bug for message reporting
	private int bugID;
	//Copy of map
	private Map map;
	//Anything over array length 2 will cause problems with positioning.
	private int[] mapPos = new int[2];
	//Wander, Hungry, Seek
	private String state;
	
	private BugBody bug;
	
	public Bug(){
		Random idGen = new Random();
		bugID = idGen.nextInt(9999);
		bug = new BugBody();
		state = "HUNGRY";
	}
	public void changeState(String newState) throws BugAIStateException{
		if(newState == "HUNGRY" || newState == "SEEK" || newState == "WANDER")
			state = newState;
		else
			throw new BugAIStateException("Invalid AI State Exception when state change attempt made.");
	}
	//Called by MapHandler to determine move request, if any
	public MoveRequest moveQuery(MapTile[][] mapLayout){
		return null;
	}
	private int calculatePath(){
		return 0;
	}
	public String getState(){
		return state;
	}
	public String report(){
		return null;
	}
	
}
