package bugs.bug;
//Parent of BugComponents, child of Bug

import java.util.ArrayList;
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


//TODO: Eliminate multi-dimensional array for something more useful
public class BugBody extends Bug {
	//Container for the components
		private ArrayList<BugBody> bugBody;
		//Bugs may only live to a certain age, age is incremented per MapHandle cycle there age is in seconds. (Not yet implemented)
		private int age;
		//stomachCount determines how many grass modules a Bug can hold
		private int stomachCount;
		//eyeCount * 2 = visual sight distance
		private int eyeCount;
		//Movement count, each foot = 1 space per cycle max movement
		private int footCount;
		//Position must be passed an array of length 2, or there will be lost/unneccsary data
		private int[] position = new int[2];
		
		public BugBody(){
			bugLayout = new BugBody[3][3];
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
}
