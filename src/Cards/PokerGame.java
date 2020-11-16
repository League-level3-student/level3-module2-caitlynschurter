package Cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PokerGame {
	public static void main(String[] args) throws IOException {
		BufferedReader obj = new BufferedReader(
				new InputStreamReader(System.in));
		if (obj == null) {
			System.out.println("Couldn't get BufferedReader!");
		}
		
		boolean quit = false;
		
		while (!quit) {
			Deck d = new Deck();
			d.shuffle();
			System.out.println("===========================");
			PokerHand p = d.dealPokerHand();
			System.out.println(p);
			System.out.print("Enter cards to keep (ex:0,3): ");
			String input = obj.readLine();
			String[] nums = input.split(",");
			for (int i = 0; i < p.size(); i++) {
				boolean found = false;
				for(String num: nums) {
					int index = Integer.parseInt(num);
					if (index == i) {
						found = true;
						break;
					}
				}
				if (!found) {
					Card newCard = d.dealCard();
					p.set(i, newCard);
				}
			}
			
			System.out.println("After draw:");
			System.out.println(p);
			
			System.out.print("Quit? (y/n): ");
			String quitGame = obj.readLine();
			if (quitGame.toUpperCase().equals("Y")) {
				quit = true;
			}
		}
	}
}
