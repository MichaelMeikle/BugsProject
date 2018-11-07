package bugs.map;

import bugs.main.BugsMain;

public class MapTile<T>{
	private T content;
	private int[][] pos;
	private String type;
	
	public MapTile(int x, int y){
		
	}
	public void setContent(T content){
		this.content = content;
	}
	public T getContent(){
		return content;
	}
	public String getType(){
		return type;
	}
	
	
}
