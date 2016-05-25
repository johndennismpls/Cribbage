package cribbage;

import deckOfCards.*;
import java.util.*;

public class evaluator {
	
	public int CountHand(List<card> hand){
		int score = 0;
		score += Count15s(hand);
		return score;
	}
	
	
	//@param hand is assumed to be a sorted list of cards from high to low.
	public int Count15s(List<card> hand){
		return Count15sHelper(0, hand);
	}
	
	
	private int Count15sHelper(int currentCount, List<card> subHand)
	{
		if(currentCount > 15 || subHand.isEmpty()){
			return 0;
		}
		else
		{
			currentCount += subHand.get(0).getValue();
			int num15s = 0;	
			subHand = subHand.subList(1, subHand.size());
			if(currentCount == 15)
			{
				return 1;
			}
			else
			{
				for(int i = 0; i < subHand.size(); ++i)
				{
					num15s += Count15sHelper(currentCount, subHand.subList(i, subHand.size()));
				}
				return num15s;
			}
		}
	}

	
	
	
	private void printList(List<card> inList)
	{
		System.out.print("Hand ");
		for(card c : inList){
			System.out.print(c.getValue() + " ");
		}
		System.out.println("");
	}
	

	
	
}

