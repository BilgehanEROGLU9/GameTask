package gameTask.Entities;

public class Game {
	int id;
	private String gameName;

	private String category;
	 public Game() {

	}
	public Game(int id, String gameName, String category) {
		
		this.id = id;
		this.gameName = gameName;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

}
