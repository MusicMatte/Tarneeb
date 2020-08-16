
public class main {

	public static void main(String[] args) {
		Deck deck = new Deck();							/* Test main that inits a deck object*/
		//System.out.println(deck.toString());
		Player p1 = new Player("ahmed", deck.getPlayer(3));		//init of a player object
		System.out.println(p1.toString());
		if(p1.check(4, "Carreux")) {						//checks if this player has the 4 of diamonds or not
			System.out.println("found");
		}
		else System.out.println("not found");
		
	}

}
