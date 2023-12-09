package _04_JavaClassSearchAndSort;

import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
        boolean isSorted = false;
        while(isSorted == false){
        	isSorted = true;
        	for (int i = 0; i < arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					isSorted = false;
					int placeholder = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = placeholder;
				}
			}
        }
        return arr;
    }
    
    public static List<Double> listSort(List<Double> list){
        boolean isSorted = false;
        		while(isSorted == false){
                	isSorted = true;
                	for (int i = 0; i < list.size()-1; i++) {
        				if(list.get(i) > list.get(i+1)) {
        					isSorted = false;
        					double placeholder = list.get(i);
        					list.set(i, list.get(i+1));
        					list.set(i+1, placeholder);
        				}
        			}
                }
        return list;
    }

    public static Boolean arraySearch(char[] arr, char key) {
    	boolean isSorted = false;
        while(isSorted == false){
        	isSorted = true;
        	for (int i = 0; i < arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					isSorted = false;
					char placeholder = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = placeholder;
				}
			}
        }
         for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return true;
			}
		}
        	
        return false;
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
    	boolean isSorted = false;
		while(isSorted == false){
        	isSorted = true;
        	for (int i = 0; i < list.size()-1; i++) {
				if(list.get(i) > list.get(i+1)) {
					isSorted = false;
					char placeholder = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, placeholder);
				}
			}
        }
         for (int i = 0; i < list.size()-1; i++) {
			if(list.get(i) == key) {
				return true;
			}
		}
        	
        return false;
    }
}
