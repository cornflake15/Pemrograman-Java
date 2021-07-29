public class Main {
	public static void main(String[] args) {
		// membuat object player
		Player pl = new Player();
		Player player1 = new Player("Ucup");
		Player player2 = new Player();

		// membuat object weapon
		Weapon pedang = new Weapon("Pedang", 15);
		Weapon ketapel = new Weapon("Ketapel", 1);

		// membuat object armor
		Armor bajuBesi = new Armor("Baju besi", 10);
		Armor kaos = new Armor("Kaos", 0);
		
		// player 1
		player1.setPlayerHealth(100.0);
		player1.setPlayerLevel(5);

		// player 2
		player2.setPlayerName("Locong");
		player2.setPlayerHealth(150.0);
		player2.setPlayerLevel(7);



    }
}
