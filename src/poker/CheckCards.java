package poker;

import java.util.ArrayList;

public class CheckCards {
	private ArrayList<Integer> cards;
	
	public CheckCards() {
		cards = new ArrayList<Integer>();
	}
	
	public boolean checkForPairs(ArrayList<Integer> playerCards, ArrayList<Integer> flop, ArrayList<Integer> turn, ArrayList<Integer> river) {
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

}
