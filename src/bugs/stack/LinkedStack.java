package bugs.stack;

//LIFO
public class LinkedStack<T> implements BugStack{
	private LLNode top;
	
	protected class LLNode{
		T info;
		LLNode link;
		public LLNode(T info){
			this.info = info;
		}
		public void setLink(LLNode link){
			this.link = link;
		}
		public LLNode getLink(){
			return link;
		}
		public void setInfo(T info){
			this.info = info;
		}
		public T getInfo(){
			return info;
		}
	}

	public void push(LLNode newNode){
		LLNode temp = top;
		top = newNode;
		top.setLink(temp);
	}
	public void pop(){
		top = top.getLink();
	}
	public LLNode top(){
		return top;
	}
}
