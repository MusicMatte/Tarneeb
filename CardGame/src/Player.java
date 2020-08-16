/*
 * This is the player class. It contains normal getters/setters for different values.
 * The most notable function is the check function which checks is this player has 
 * this specific card or not. 
 * During initialisation the player has 13 cards distributed to them, which are his "hand".
 * 
 * 
 * */import java.util.HashMap;
import java.util.Random;

public class Player {
	private String name;
	private Card[] hand = new Card[13];
	Player(String name, Card[] cards){
		this.name = name;
		hand = cards;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHand() {
			
	}
	public Card[] getHand() {
		return hand;
	}
	public String toString() {
		String all ="Player name is " + name + "\n";
		for	(int i = 0; i < 13; i++) {
			all += hand[i].toString() + "\n";
		}
		return all;
	}
	public boolean check(int value, String suite) {
		for (int i = 0; i < hand.length; i++) {
			if(hand[i].getValue() == value) {
				if(hand[i].getSuite() == suite) {
					return true;
				}
			}
		}
		return false;
	}
}