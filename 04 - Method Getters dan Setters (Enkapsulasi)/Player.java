public class Player{
    String name;
    double health;
    int level;

	public Player(){
		this.name = "Unknown";
		this.health = 0;
		this.level = 0;
	}

    public Player(String name){
        this.name = name;
    }

	// Deklarasikan method setters
    public void setPlayerName(String name){
		this.name = name;
	}

	public void setPlayerHealth(double health){
		this.health = health;
	}

	public void setPlayerLevel(int level){
		this.level = level;
	}

	// Deklarasikan method getters
	public String getPlayerName(){
		return this.name;
	}

	public double getPlayerHealth(){
		return this.health;
	}

	public int getPlayerLevel(){
		return this.level;
	}
}