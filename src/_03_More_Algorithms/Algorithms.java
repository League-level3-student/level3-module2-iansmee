package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		return "" + num1 + " x " + num2 + " = " + num1 * num2;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static boolean isSquare(int num) {
		for (int i = 1; i <= num; i++) {
			if (num / i == i) {
				return true;
			}
		}
		return false;
	}

	public static boolean isCube(int num) {
		double int2 = num;
		for (int i = 1; i <= num; i++) {
			if ((int2 / i) / i == i) {
				System.out.println(num + "/" + i + "/" + i + " = " + ((num / i) / i));
				return true;
			}
		}
		return false;
	}

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				return i;
			}
		}

		return 0;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) >= tallest) {
				tallest = peeps.get(i);
				;
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String worder = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > worder.length()) {
				worder = words.get(i);
			}
		}
		return worder;
	}

	public static boolean containsSOS(List<String> message) {

		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		boolean isSorted = false;
		while (isSorted == false) {
			isSorted = true;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i) >= results.get(i + 1)) {
					isSorted = false;
					double placeHolder = results.get(i);
					results.set(i, results.get(i + 1));
					results.set(i + 1, placeHolder);
				}
			}
		}
		return results;

	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		boolean isSorted = false;
		while (isSorted == false) {
			isSorted = true;
			for (int i = 0; i < unsortedSequences.size() - 1; i++) {
				if (unsortedSequences.get(i).length() > unsortedSequences.get(i+1).length()) {
					isSorted = false;
					String placeHolder = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(i + 1));
					unsortedSequences.set(i + 1, placeHolder);
				}
			}
		}

		return unsortedSequences;
	}
	public static List<String> sortWords(List<String>words){
		boolean isSorted = false;
		while(isSorted == false) {
			isSorted = true;
			for (int i = 0; i < words.size()-1; i++) {
				if(words.get(i).compareTo(words.get(i+1))<0) {
					isSorted = false;
					String placeholder = words.get(i);
					words.set(i, words.get(i+1));
					words.set(i+1, placeholder);
				}
			}
		}
		
		return words;
	}

}