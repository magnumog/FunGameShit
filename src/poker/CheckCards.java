package poker;

import java.util.ArrayList;

public class CheckCards {
	private ArrayList<Integer> cards;
	
	public CheckCards() {
		cards = new ArrayList<Integer>();
	}
	
	public boolean pair(ArrayList<Integer> playerCards, ArrayList<Integer> flop, ArrayList<Integer> turn, ArrayList<Integer> river) {
		cards.addAll(playerCards);
		cards.addAll(flop);
		cards.addAll(turn);
		cards.addAll(river);
		System.out.println(cards);
		for(int i=0;i<cards.size()-1;i++) {
			for(int j=i+1; j<cards.size();j++) {
				if(cards.get(i)==cards.get(j)) {
					cards.clear();
					return true;
				}
			}
		}
		cards.clear();
		return false;
	}
	
	public boolean threeOfAKind(ArrayList<Integer> playerCards, ArrayList<Integer> flop, ArrayList<Integer> turn, ArrayList<Integer> river) {
		cards.addAll(playerCards);
		cards.addAll(flop);
		cards.addAll(turn);
		cards.addAll(river);
		int count=0;
		int numb = 0;
		for(int i=0;i<cards.size()-2;i++) {
			numb=cards.get(i);
			for(int j=i+1;j<cards.size();j++) {
				if(numb==cards.get(j)) {
					count++;
				}
				if(count>=3) {
					cards.clear();
					return true;
				}
			}
		}
		cards.clear();
		return false;
	}
	
	public boolean fourOfAKind(ArrayList<Integer> playerCards, ArrayList<Integer> flop, ArrayList<Integer> turn, ArrayList<Integer> river) {
		cards.addAll(playerCards);
		cards.addAll(flop);
		cards.addAll(turn);
		cards.addAll(river);
		int count=0;
		int numb = 0;
		for(int i=0;i<cards.size()-3;i++) {
			numb=cards.get(i);
			for(int j=i+1;j<cards.size();j++) {
				if(numb==cards.get(j)) {
					count++;
				}
				if(count>=4) {
					cards.clear();
					return true;
				}
			}
		}
		cards.clear();
		return false;
	}
	
	public boolean flush(ArrayList<Integer> playerCards, ArrayList<Integer> flop, ArrayList<Integer> turn, ArrayList<Integer> river) {
		return false;
	}
	
	public boolean straightFlush(ArrayList<Integer> playerCards, ArrayList<Integer> flop, ArrayList<Integer> turn, ArrayList<Integer> river) {
		return false;
	}
	
	public boolean fullHoues(ArrayList<Integer> playerCards, ArrayList<Integer> flop, ArrayList<Integer> turn, ArrayList<Integer> river) {
		return false;
	}
	
	public boolean straight(ArrayList<Integer> playerCards, ArrayList<Integer> flop, ArrayList<Integer> turn, ArrayList<Integer> river) {
		return false;
	}
	
	public boolean twoPairs(ArrayList<Integer> playerCards, ArrayList<Integer> flop, ArrayList<Integer> turn, ArrayList<Integer> river) {
		return false;
	}
}
