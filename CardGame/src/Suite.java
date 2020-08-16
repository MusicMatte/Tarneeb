
public class Suite {
	private Card[] cards = new Card[13];
	private int num;
	Suite(String suite){
		for	(int i = 0; i < 13; i++) {
			cards[i] = new Card(i, suite);
		}
		num = 13;
	}
	public String toString() {
		String all ="";
		for	(int i = 0; i < 13; i++) {
			all += cards[i].toString() + "\n" + "There are " + (getNum()-1) + "cards left \n";
			setNum(getNum()-1);
		}
		return all;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
