package javahomework4h2;

public class Game {


	private int id;
	private String Name;
	
	public Game() {
		
	}
	public Game(int id, String name) {

		this.id = id;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}
