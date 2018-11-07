package bugs.exceptions;

public class BugAIStateException extends BugException{
	private static final long serialVersionUID = 3483692743831264646L;
	String msg;
	
	public BugAIStateException(){
		this("Unknown AI Error");
	}
	public BugAIStateException(String msg){
		super();
		this.msg = msg;
	}
	public String toString(){
		return msg;
	}
}
