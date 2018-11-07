package bugs.exceptions;

public class BugStomachException extends BugException{
	String msg;
	public BugStomachException(){
		this("Unknown Bug Stomach Exception");
	}
	public BugStomachException(String msg){
		this.msg = msg;
	}
}
