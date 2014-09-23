package poker;

import java.util.ArrayList;

public class Player {
	private ArrayList<Integer> cardNumber;

	public Player() {
		cardNumber = new ArrayList<Integer>();
	}
	
	public void addCard(int number) {
		this.cardNumber.add(number);
	}
	
	public int getFirstCardValue() {
		return this.cardNumber.get(0);
	}
	
	public int getSecondCardValue() {
		return this.cardNumber.get(1);
	}
	
	public ArrayList<Integer> getPlayerCards() {
		return this.cardNumber;
	}

}
