package Cards;

public class PokerHand extends Hand {
	
	
	
	public void sort() {
		for(int i = 0; i < this.size() -1; i++) {
			for(int j = i+1; j < this.size(); j++) {
				Card a = this.get(i);
				Card b = this.get(j);
				if(a.getValue() > b.getValue()) {
					this.set(i, b);
					this.set(j, a);
				}
			}
		}
	}
	
}
