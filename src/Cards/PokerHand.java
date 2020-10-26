package Cards;

public class PokerHand extends Hand {

	public enum HandTypes {
		Nothing, Pair, 
		JacksOrBetter, 
		ThreeOfAKind, 
		Straight, 
		Flush, 				//
		FullHouse, 
		FourOfAKind, 
		SraightFlush,
		RoyalStraightFlush
	}

	private boolean hasFlush() {
		for(int i = 0; i < this.size()-1; i++) {
			if(this.get(i).getSuit() != this.get(i+1).getSuit()) return false;
		}
		return true;
	}
	
	private boolean hasFourOfAKind() {
		if(get(0).getValue() == get(3).getValue() ||
			get(1).getValue() == get(4).getValue()) return true;
		return false;
	}
	
	private boolean hasThreeOfAKind() {
		if(get(0).getValue() == get(2).getValue() ||
			get(1).getValue() == get(3).getValue() ||
			get(2).getValue() == get(4).getValue()) return true;
		return false;
	}
	
	private boolean hasPair() {
		if(get(0).getValue() == get(1).getValue() ||
			get(1).getValue() == get(2).getValue() ||
			get(2).getValue() == get(3).getValue()||
			get(3).getValue() == get(4).getValue()) return true;
		return false;
	}

	public HandTypes getHandType() {
		if (size() != 5)
			return HandTypes.Nothing;
		sort();
		
		if(hasFourOfAKind()) {
			return HandTypes.FourOfAKind;
		}	
		
		else if(hasFlush()) {
			return HandTypes.Flush;
		}
		
		else if(hasThreeOfAKind()) {
			return HandTypes.ThreeOfAKind;
		}
		
		else if(hasPair()) {
			return HandTypes.Pair;
		}
	
		return HandTypes.Nothing;
	}

	public void sort() {
		for (int i = 0; i < this.size() - 1; i++) {
			for (int j = i + 1; j < this.size(); j++) {
				Card a = this.get(i);
				Card b = this.get(j);
				if (a.getValue() > b.getValue()) {
					this.set(i, b);
					this.set(j, a);
				}
			}
		}
	}
	@Override
	public String toString() {
		return super.toString() + ": " + getHandType();
	}
}
