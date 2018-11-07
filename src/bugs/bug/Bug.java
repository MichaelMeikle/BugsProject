package bugs.bug;
import java.util.Random;


//Container/Handler for the entirety of the bug components
/*
 * Every bug must start out with one mouth (center of layout)
 * Every bug must starts with 1 eye, 1 stomach, and 1 foot
 * If a bug that has filled its stomach does not reproduce within 60 seconds, adding a new random component
 * A bug can see 2 squares per eye, if there are no visible MapGrass objects within view
 * then the bug will wander around until one becomes visible
 * A bug can move 1 space per 3 (2?) seconds per foot
 */
public class Bug{
	//Container for the components
	private BugCell[][] bugLayout;
	//Unique ID for bug for message reporting
	private int bugID;
	//Determines next move when the bug is polled for a move
	private BugAI brain;
	//Bugs may only live to a certain age, age is incremented per MapHandle cycle there age is in seconds. (Not yet implemented)
	private int age;
	//stomachCount determines how many grass modules a Bug can hold
	private int stomachCount;
	//eyeCount * 2 = visual sight distance
	private int eyeCount;
	//Movement count
	private int footCount;
	//
	private int[] position;
	
 	public Bug(){
 		//TBD
 	}
	public Bug(int[] position){
		Random idGen = new Random();
		bugID = idGen.nextInt(9999);
		bugLayout = new BugCell[3][3];
		brain = new BugAI(this);
	}
	public int getStomachCount(){
		return stomachCount;
	}
	public int getEyeCount(){
		return eyeCount;
	}
	public int getFoodCount(){
		return footCount;
	}
	public int getBugID(){
		return bugID;
	}
	
	
}
