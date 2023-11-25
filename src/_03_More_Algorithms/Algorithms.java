package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return "" + num1 + " x " + num2 + " = " + num1*num2;
    }
    public static boolean isPrime(int num) {
    	for (int i = 2; i < num; i++) {
			if(num%i == 0) {
				return false;
			}
			
		}
    	return true;
    }
    public static boolean isSquare(int num) {
    	for (int i = 1; i <= num; i++) {
			if(num/i == i) {
				return true;
			}
		}
    	return false;
    }
    public static boolean isCube(int num) {
    	double int2 = num;
    	for (int i = 1; i <= num; i++) {
			if((int2/i)/i == i) {
				System.out.println(num + "/" + i + "/" + i + " = " + ((num/i)/i));
				return true;
			}
		}
    	return false;
    }
    public static int findBrokenEgg(List<String> eggs) {
    	for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
        return 0;
    }
    public static int countPearls(List<Boolean>oysters) {
    	for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)== true) {
				return i;
			}
		}
    	
    	
    	return 0;
    }
    public static double findTallest(List<Double>peeps) {
    	double tallest = 0;
    	for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) >= tallest) {
				tallest = peeps.get(i);;
			}
		}
    	return tallest;
    }
    public static String findLongestWord(List<String>words) {
    	String worder = "";
    	for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > worder.length()) {
				worder = words.get(i);
			}
		}
    	return worder;
    }
    public static boolean containsSOS(List<String>message) {
    	
    	for (int i = 0; i < message.size(); i++) {
			if(message.get(i).contains("... --- ...")) {
				return true;
			}
		}
    	return false;
    }
    
    
}
