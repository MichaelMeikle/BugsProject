package bugs.exceptions;

public class BugException extends Exception{
	private static final long serialVersionUID = 3483692743831264646L;
	String msg;
	
	public BugException(){
		this("Unknown Bug Error");
	}
	public BugException(String msg){
		super();
		this.msg = msg;
	}
	public String toString(){
		return msg;
	}
}
