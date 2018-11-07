package bugs.map;
public class MoveRequest {
	private int[] currentPos;
	private int[] requestPos;
	// Ex format for pos (1,2) (3,4)
	public MoveRequest(int[] currentPos, int[] requestPos){
		this.currentPos = currentPos;
		this.requestPos = requestPos;
	}
}
