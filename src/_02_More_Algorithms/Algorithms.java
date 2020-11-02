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

	public static boolean containsSOS(List<String> message) {
			if(message.contains("... --- ...")) {
				return true;
			}
		
		return false;
	}
	
	public static List<Double> sortScores(List<Double> results) {
		for(int i = 0; i < results.size()-1; i++) {
			for(int j = i+1; j <results.size(); j++) {
				double ix = results.get(i);
				double jx = results.get(j);
				if(ix > jx) {
					results.set(i, jx);
					results.set(j, ix);
				}
			}
		}
		
		return results;
	}
	
	public static List<String> sortDNA(List<String> unsortedSequences) {
		for(int i = 0; i<unsortedSequences.size() -1; i++) {
			for(int j = i+1; j <unsortedSequences.size(); j++) {
				if(unsortedSequences.get(i).length() > unsortedSequences.get(j).length()) {
					String temp = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(i));
					unsortedSequences.set(i, temp);
				}
			}
		}
		
		return unsortedSequences;
	}
	
	public static List<String> sortWords(List<String> words){
		for(int i = 0; i < words.size() -1; i++) {
			for(int j = i+1; j < words.size(); j++) {
				if(words.get(i).compareTo(words.get(j)) > 0) {
					String temp = words.get(j);
					words.set(j, words.get(i));
					words.set(i, temp);
				}
			}
		}
		
		return words;
	}
}
