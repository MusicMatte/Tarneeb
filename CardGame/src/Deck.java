/*
 * 
 * 
 * */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Deck {
	private Card[] cards = new Card[52];
	private Carreux Carreux;
	private Spade Spade;
	private Heart Heart;
	private Trifle Trifle;
	private int numOfCards;
	private double cc, sc, hc, tc;			//carreux chance, spade chance, etc etc
	private Random rand = new Random();		//random object
	private double choice;					//just a container for the random object, used to determine which suite will be chosen
	private int randint;					//random int, used to determine which card value in a specific suite will be chosen
	
	
	Deck(){
		Carreux = new Carreux();
		Spade = new Spade();
		Heart = new Heart();
		Trifle = new Trifle();
		
		for	(int i = 0; i < 52; i++) {
			cards[i] = new Card(-1, null);
		}
		numOfCards = 52;
		RandomizeDeck();
	}
	
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
	public double getSc() {
		return sc;
	}
	public void setSc(double sc) {
		this.sc = sc;
	}
	public double getHc() {
		return hc;
	}
	public void setHc(double hc) {
		this.hc = hc;
	}
	public double getTc() {
		return tc;
	}
	public void setTc(double tc) {
		this.tc = tc;
	}
	
	
	public void RandomizeDeck() {
		for	(int i = 0; i < 52; i++) {
			setCc((double)Carreux.getNum()/numOfCards);				//calculate the chance for getting either carroux, spade, etc etc
			setSc(getCc() + (double)Spade.getNum()/numOfCards);
			setHc(getSc() + (double)Heart.getNum()/numOfCards);
			setTc(getHc() + (double)Trifle.getNum()/numOfCards);
			choice = rand.nextDouble();								//generates the random number used to choose the suite
			
			if(choice < cc) {
				Carreux.setNum(Carreux.getNum() - 1);;				//each suite has 13 cards, i decrement the amount of cards in that suite if the it's chosen
				cards[i].setSuite("Carreux");						//sets the suite in the deck
				randint=rand.nextInt(13);							//generates a random integer from 0 to 13
				if(Carreux.cards[randint].getValue() == 1) {		//i flag the card as "chosen" in the suite class if its value is "1", so this if checks
					while(Carreux.cards[randint].getValue() == 1) {	//if the random number has been flagged or not in the suite class, if it has, then it keeps
						randint=rand.nextInt(13);					//generating random numbers till it finds a card which is not flagged ie not been chosen yet
					}
				}
				Carreux.cards[randint].setValue(1);					//flags the card as chosen in the suite class
				cards[i].setValue(randint);							//sets the value of the card in the deck as the random int thats chosen after its been found
			}														//to be unique or hasnt been chosen yet
			else if(choice < sc) {
				Spade.setNum(Spade.getNum() - 1);;
				cards[i].setSuite("Spade");
				randint=rand.nextInt(13);
				if(Spade.cards[randint].getValue() == 1) {
					while(Spade.cards[randint].getValue() == 1) {
						randint=rand.nextInt(13);
					}
				}
				Spade.cards[randint].setValue(1);
				cards[i].setValue(randint);
			}
			else if(choice < hc) {
				Heart.setNum(Heart.getNum() - 1);;
				cards[i].setSuite("Heart");
				randint=rand.nextInt(13);
				if(Heart.cards[randint].getValue() == 1) {
					while(Heart.cards[randint].getValue() == 1) {
						randint=rand.nextInt(13);
					}
				}
				Heart.cards[randint].setValue(1);
				cards[i].setValue(randint);
			}
			else if(choice < tc) {
				Trifle.setNum(Trifle.getNum() - 1);;
				cards[i].setSuite("Trifle");
				randint=rand.nextInt(13);
				if(Trifle.cards[randint].getValue() == 1) {
					while(Trifle.cards[randint].getValue() == 1) {
						randint=rand.nextInt(13);
					}
				}
				Trifle.cards[randint].setValue(1);
				cards[i].setValue(randint);
			}
			numOfCards--;
		}
	}
	public String toString() {
		String all ="";
		for	(int i = 0; i < 52; i++) {
			all += cards[i].toString() + "\n";
		}
		return all;
	}
	public void reset() {
		Carreux.setNum(13);
		Spade.setNum(13);
		Heart.setNum(13);
		Trifle.setNum(13);
		
	}
	public int random(Card[] cards) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for	(int i = 0; i < 13; i++) {
			if(cards[i].getValue() == 0) {
				al.add(cards[i].getValue());
			}
		}
		randint = rand.nextInt(al.size());
		return (int)al.get(randint);
	}
	
	/*Returns the hand of the specified player.
	 * */
	public Card[] getPlayer(int playerNum) {
		Card[] hand = new Card[13];
		Scanner input = new Scanner(System.in);
		playerNum--;
		while ((playerNum != 0) && (playerNum != 1) && (playerNum != 2) && (playerNum != 3)) {
			System.out.println("Enter the player number (1, 2, 3, 4)");
			playerNum = input.nextInt();
		}
		playerNum *= 13;
		int counter = 0;
		for (int i = playerNum; i < (playerNum + 13); i++) {
			hand[counter] = cards[i];
			counter++;
		}
		input.close();
		return hand;
	}
	
}
