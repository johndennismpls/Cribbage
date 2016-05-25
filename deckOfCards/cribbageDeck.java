package deckOfCards;

import java.util.List;
import java.util.Stack;

public class cribbageDeck implements deck{
	//cards remaining in the live deck
	List<card> mDeck;
	List<card> mDiscard;

	//ctor
	public cribbageDeck() {
		restoreDeck();
	}

	@Override
	public void deal() {
		// TODO Auto-generated method stub
		return;
	}
	

	@Override
	public void shuffle() {
		return;
	}

	
	private void restoreDeck() {	
		//mDeck = new List<card>;
		//Clubs
		mDeck.add(new card(rank.ACE, suit.Clubs, 1));
		mDeck.add(new card(rank.TWO, suit.Clubs, 2));
		mDeck.add(new card(rank.THREE, suit.Clubs, 3));
		mDeck.add(new card(rank.FOUR, suit.Clubs, 4));
		mDeck.add(new card(rank.FIVE, suit.Clubs, 5));
		mDeck.add(new card(rank.SIX, suit.Clubs, 6));
		mDeck.add(new card(rank.SEVEN, suit.Clubs, 7));
		mDeck.add(new card(rank.EIGHT, suit.Clubs, 8));
		mDeck.add(new card(rank.NINE, suit.Clubs, 9));
		mDeck.add(new card(rank.TEN, suit.Clubs, 10));
		mDeck.add(new card(rank.JACK, suit.Clubs, 10));
		mDeck.add(new card(rank.QUEEN, suit.Clubs, 10));
		mDeck.add(new card(rank.KING, suit.Clubs, 10));
		//Spades
		mDeck.add(new card(rank.ACE, suit.Spades, 1));
		mDeck.add(new card(rank.TWO, suit.Spades, 2));
		mDeck.add(new card(rank.THREE, suit.Spades, 3));
		mDeck.add(new card(rank.FOUR, suit.Spades, 4));
		mDeck.add(new card(rank.FIVE, suit.Spades, 5));
		mDeck.add(new card(rank.SIX, suit.Spades, 6));
		mDeck.add(new card(rank.SEVEN, suit.Spades, 7));
		mDeck.add(new card(rank.EIGHT, suit.Spades, 8));
		mDeck.add(new card(rank.NINE, suit.Spades, 9));
		mDeck.add(new card(rank.TEN, suit.Spades, 10));
		mDeck.add(new card(rank.JACK, suit.Spades, 10));
		mDeck.add(new card(rank.QUEEN, suit.Spades, 10));
		mDeck.add(new card(rank.KING, suit.Spades, 10));
		//Diamonds
		mDeck.add(new card(rank.ACE, suit.Diamonds, 1));
		mDeck.add(new card(rank.TWO, suit.Diamonds, 2));
		mDeck.add(new card(rank.THREE, suit.Diamonds, 3));
		mDeck.add(new card(rank.FOUR, suit.Diamonds, 4));
		mDeck.add(new card(rank.FIVE, suit.Diamonds, 5));
		mDeck.add(new card(rank.SIX, suit.Diamonds, 6));
		mDeck.add(new card(rank.SEVEN, suit.Diamonds, 7));
		mDeck.add(new card(rank.EIGHT, suit.Diamonds, 8));
		mDeck.add(new card(rank.NINE, suit.Diamonds, 9));
		mDeck.add(new card(rank.TEN, suit.Diamonds, 10));
		mDeck.add(new card(rank.JACK, suit.Diamonds, 10));
		mDeck.add(new card(rank.QUEEN, suit.Diamonds, 10));
		mDeck.add(new card(rank.KING, suit.Diamonds, 10));
		//Hearts
		mDeck.add(new card(rank.ACE, suit.Hearts, 1));
		mDeck.add(new card(rank.TWO, suit.Hearts, 2));
		mDeck.add(new card(rank.THREE, suit.Hearts, 3));
		mDeck.add(new card(rank.FOUR, suit.Hearts, 4));
		mDeck.add(new card(rank.FIVE, suit.Hearts, 5));
		mDeck.add(new card(rank.SIX, suit.Hearts, 6));
		mDeck.add(new card(rank.SEVEN, suit.Hearts, 7));
		mDeck.add(new card(rank.EIGHT, suit.Hearts, 8));
		mDeck.add(new card(rank.NINE, suit.Hearts, 9));
		mDeck.add(new card(rank.TEN, suit.Hearts, 10));
		mDeck.add(new card(rank.JACK, suit.Hearts, 10));
		mDeck.add(new card(rank.QUEEN, suit.Hearts, 10));
		mDeck.add(new card(rank.KING, suit.Hearts, 10));
	}

}
