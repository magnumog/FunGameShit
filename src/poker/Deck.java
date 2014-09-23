package poker;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {
	private ArrayList<Integer> cardValue;
	private ArrayList<String> cardType;
	
	public Deck() {
		cardValue = fillDeck();
		cardType = fillType();
//		System.out.println(getCardType(0));
	}
	
	private ArrayList<Integer> fillDeck() {
		ArrayList<Integer> deck = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13));
		return deck;
	}
	
	private ArrayList<String> fillType() {
		ArrayList<String> type = new ArrayList<String>(Arrays.asList("Heart","Spade","klowes","Dime"));
		return type;
	}
	
	public String getCardType(int number) {
		return this.cardType.get(number/14);
	}
	
	public int getDeckSize() {
		return this.cardValue.size()-1;
	}
	
	public int getCardFromDeck(int number) {
		int numb = cardValue.get(number);
		removeCardFromDeck(number);
		return numb;
	}
	
	private void removeCardFromDeck(int number) {
		this.cardValue.remove(number);
	}
	

}
