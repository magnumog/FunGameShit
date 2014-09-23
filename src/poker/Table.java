package poker;

import java.util.ArrayList;

public class Table {
	private ArrayList<Integer> flop;
	private ArrayList<Integer> turn;
	private ArrayList<Integer> river;
	private ArrayList<Integer> burnedCards;
	
	public Table() {
		flop = new ArrayList<Integer>();
		turn = new ArrayList<Integer>();
		river = new ArrayList<Integer>();
		burnedCards = new ArrayList<Integer>();
	}
	
	public void addCardToFlop(int numb) {
		flop.add(numb);
	}
	
	public ArrayList<Integer> getFlop() {
		return this.flop;
	}
	
	public ArrayList<Integer> getTurn() {
		return this.turn;
	}
	
	public ArrayList<Integer> getRiver() {
		return this.river;
	}
	
	public ArrayList<Integer> getBurned() {
		return this.burnedCards;
	}
	
	public void addCardToTurn(int numb) {
		turn.add(numb);
	}
	
	public void addCardToRiver(int numb) {
		river.add(numb);
	}
	
	public void addCardToBurned(int numb) {
		burnedCards.add(numb);
	}

}
