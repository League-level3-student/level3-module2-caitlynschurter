package Cards;

import java.util.ArrayList;
import Cards.Card.Suits;
import Cards.PokerHand.HandTypes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CardsTester {
	
/*
	public static void main(String[] args) {
		Deck d = new Deck();
		for (Card c : d) {
			System.out.println(c);
		}

		System.out.println("========================");
		d.shuffle();
		for (Card c : d) {
			System.out.println(c);
		}

		System.out.println("Deck size: " + d.size());
		Hand hand = d.dealPokerHand();
		System.out.println("=======================");
		// for (Card c : hand) {
		// System.out.println(c);
		// }
		
		System.out.println(hand);
		
		System.out.println("Deck size: " + d.size());
		
		System.out.println("====================");
		PokerHand p = (PokerHand)hand;
		p.sort();
		System.out.println(p);

	}
	*/
	@Test
	void testFlush() {
		PokerHand hand = new PokerHand();
		hand.add(new Card(10, Suits.CLUBS));
		hand.add(new Card(5, Suits.CLUBS));
		hand.add(new Card(7, Suits.CLUBS));
		hand.add(new Card(2, Suits.CLUBS));
		hand.add(new Card(12, Suits.CLUBS));
		assertEquals(hand.getHandType(), HandTypes.Flush);
		
		hand = new PokerHand();
		hand.add(new Card(10, Suits.DIAMONDS));
		hand.add(new Card(5, Suits.CLUBS));
		hand.add(new Card(7, Suits.CLUBS));
		hand.add(new Card(2, Suits.CLUBS));
		hand.add(new Card(12, Suits.CLUBS));
		assertNotEquals(hand.getHandType(), HandTypes.Flush);
	}
	
	@Test
	void testRoyalStraightFlush() {
		PokerHand hand = new PokerHand();
		hand.add(new Card(9, Suits.CLUBS));
		hand.add(new Card(10, Suits.CLUBS));
		hand.add(new Card(11, Suits.CLUBS));
		hand.add(new Card(12, Suits.CLUBS));
		hand.add(new Card(13, Suits.CLUBS));
		assertEquals(hand.getHandType(), HandTypes.RoyalStraightFlush);
		
		hand = new PokerHand();
		hand.add(new Card(10, Suits.DIAMONDS));
		hand.add(new Card(5, Suits.CLUBS));
		hand.add(new Card(7, Suits.CLUBS));
		hand.add(new Card(2, Suits.CLUBS));
		hand.add(new Card(12, Suits.CLUBS));
		assertNotEquals(hand.getHandType(), HandTypes.RoyalStraightFlush);
	}
	
	@Test
	void testFourOfAKind() {
		PokerHand hand = new PokerHand();
		hand.add(new Card(10, Suits.CLUBS));
		hand.add(new Card(10, Suits.DIAMONDS));
		hand.add(new Card(10, Suits.SPADES));
		hand.add(new Card(10, Suits.HEARTS));
		hand.add(new Card(12, Suits.CLUBS));
		assertEquals(hand.getHandType(), HandTypes.FourOfAKind);
		
		hand = new PokerHand();
		hand.add(new Card(10, Suits.DIAMONDS));
		hand.add(new Card(5, Suits.CLUBS));
		hand.add(new Card(7, Suits.CLUBS));
		hand.add(new Card(2, Suits.CLUBS));
		hand.add(new Card(12, Suits.CLUBS));
		assertNotEquals(hand.getHandType(), HandTypes.FourOfAKind);
	}
	
	@Test
	void testStraight() {
		PokerHand hand = new PokerHand();
		hand.add(new Card(1, Suits.DIAMONDS));
		hand.add(new Card(2, Suits.CLUBS));
		hand.add(new Card(3, Suits.CLUBS));
		hand.add(new Card(4, Suits.CLUBS));
		hand.add(new Card(5, Suits.CLUBS));
		assertEquals(hand.getHandType(), HandTypes.Straight);
		
		hand = new PokerHand();
		hand.add(new Card(10, Suits.DIAMONDS));
		hand.add(new Card(11, Suits.CLUBS));
		hand.add(new Card(12, Suits.CLUBS));
		hand.add(new Card(13, Suits.CLUBS));
		hand.add(new Card(1, Suits.CLUBS));
		assertEquals(hand.getHandType(), HandTypes.Straight);
		
		hand = new PokerHand();
		hand.add(new Card(6, Suits.DIAMONDS));
		hand.add(new Card(7, Suits.CLUBS));
		hand.add(new Card(8, Suits.CLUBS));
		hand.add(new Card(9, Suits.CLUBS));
		hand.add(new Card(10, Suits.CLUBS));
		assertEquals(hand.getHandType(), HandTypes.Straight);
		
		hand = new PokerHand();
		hand.add(new Card(10, Suits.HEARTS));
		hand.add(new Card(5, Suits.CLUBS));
		hand.add(new Card(7, Suits.SPADES));
		hand.add(new Card(2, Suits.CLUBS));
		hand.add(new Card(12, Suits.CLUBS));
		assertNotEquals(hand.getHandType(), HandTypes.Straight);
	}
}