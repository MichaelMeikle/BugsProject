package bugs.map;

import bugs.stack.BugStack;
import bugs.stack.LinkedStack;

/*
 * Contains stack of map change requests (Positions, new grass growth, etc)
 * Implements change request provided they are valid at the time of implementation
 * Validates all change requests on the stack as it iterates through the stack each cycle
 * Each cycle is likely going to be 1 second, may be alterated
 */

public class MapHandler {
	//The length of time each cycle should take in seconds before revisiting change request stack
	private int cycleTime = 1;
	
	BugStack<MoveRequest> moveList = new LinkedStack<>();
	
	
}
