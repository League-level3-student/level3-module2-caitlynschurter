package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> list) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
}
