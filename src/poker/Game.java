package poker;

import java.util.Random;

public class Game {
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		Table table = new Table();
		Player playerOne = new Player();
		Player playerTwo = new Player();
		Random rand = new Random();
		
		playerOne.addCard(deck.getCardFromDeck(rand.nextInt(deck.getDeckSize())));
		playerOne.addCard(deck.getCardFromDeck(rand.nextInt(deck.getDeckSize())));
		playerTwo.addCard(deck.getCardFromDeck(rand.nextInt(deck.getDeckSize())));
		playerTwo.addCard(deck.getCardFromDeck(rand.nextInt(deck.getDeckSize())));
		table.addCardToBurned(deck.getCardFromDeck(rand.nextInt(deck.getDeckSize())));
		table.addCardToFlop(deck.getCardFromDeck(rand.nextInt(deck.getDeckSize())));
		table.addCardToFlop(deck.getCardFromDeck(rand.nextInt(deck.getDeckSize())));
		table.addCardToFlop(deck.getCardFromDeck(rand.nextInt(deck.getDeckSize())));
		table.addCardToBurned(deck.getCardFromDeck(rand.nextInt(deck.getDeckSize())));
		table.addCardToTurn(deck.getCardFromDeck(rand.nextInt(deck.getDeckSize())));
		table.addCardToBurned(deck.getCardFromDeck(rand.nextInt(deck.getDeckSize())));
		table.addCardToRiver(deck.getCardFromDeck(rand.nextInt(deck.getDeckSize())));
		System.out.println("1: " + playerOne.getPlayerCards());
		System.out.println("2: " + playerTwo.getPlayerCards());
		System.out.println("Flop: " + table.getFlop());
		System.out.println("Turn: " + table.getTurn());
		System.out.println("River: " + table.getRiver());
		System.out.println("Burned: " + table.getBurned());
		
		
	}

}
