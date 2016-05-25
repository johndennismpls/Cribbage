package deckOfCards;

//represents a card in a deck.
public class card {
	//private members
	private rank mRank;
	private suit mSuit;
	private int mValue;

	//ctor
	public card(rank inRank, suit inSuit, int inValue)
	{
		mRank = inRank;
		mSuit = inSuit;
		mValue = inValue;
	}
	
	//accessors
	public rank getRank()
	{
		return mRank;
	}
	
	public suit getSuit()
	{
		return mSuit;
	}
	
	public int getValue()
	{
		return mValue;
	}
	
	
	
}
