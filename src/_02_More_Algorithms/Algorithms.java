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
	
	public static int countPearls(List<Boolean> list) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == (true)) {
				return i;
			}
		}
		return -1;
	}
	
	public static Double findTallest(List<Double> list) {
		Double tallest = 0.0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > tallest) {
				tallest = list.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> list) {
		int longest = 0;
		String word = "";
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).length() > longest) {
				longest = list.get(i).length();
				word = list.get(i);
			}
		}
		return word;
	}

	public static Object containsSOS(List<String> message1) {
		
		return null;
	}
}
