package bugs.map;
//Singleton Implementation to ensure only one instance of this class is created
public class Map {
	private static Map map;
	private MapTile[][] mapTile;
	private ArrayList<MapTile>
	
	private Map(){
		Map map = new Map();
		mapTile = new MapTile[40][40];
		initialize();
	}
	private void initialize(){
		MapGenerator creator = new MapGenerator();
	}
	private MapTile[][] getMapLayout(){
		return mapTile;
	}
	public static Map getMap(){
		if(map == null)
			map = new Map();
		return map;
	}
}
