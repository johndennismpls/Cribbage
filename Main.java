import deckOfCards.*;
import cribbage.*;

import java.util.ArrayList;
import java.util.List;

public final class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//cribbageDeck myDeck = new cribbageDeck();
		
		evaluator myEval = new evaluator();
		
		
		
		
		List<card> myHand = new ArrayList<card>();
		
		myHand.add(new card(rank.TEN, suit.Clubs, 2));
		myHand.add(new card(rank.TEN, suit.Clubs, 10));
		myHand.add(new card(rank.TEN, suit.Clubs, 10));
		myHand.add(new card(rank.TEN, suit.Clubs, 2));
		myHand.add(new card(rank.TEN, suit.Clubs, 1));	
		
		
		System.out.println("TOTAL: " + myEval.Count15s(myHand));
		
	}

}
