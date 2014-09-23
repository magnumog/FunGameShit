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
		ArrayList<Integer> deck = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52));
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
