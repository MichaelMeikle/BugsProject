package bugs.stack;

import bugs.stack.LinkedStack.LLNode;

public interface BugStack<T> {
	
	//Adds new item to stack
	public void push(LLNode newNode);
	//Removes top item from stack
	public void pop();
	//Returns top item
	public LLNode top();
}
