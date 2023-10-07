package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most inefficient
	 * sorting algorithm while still maintaining the possibility of eventually
	 * sorting data.
	 * 
	 * It works by following these steps: STEP 1. Is the array in order? if yes,
	 * finished; if no, go to step 2. STEP 2. Take two random elements in the array
	 * and swap them. STEP 3. Go back to step 1.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		int saved = 0;
		int saved2 = 0;
		int dataSaved = 0;
		boolean isSorted = false;
		Random rand = new Random();

		while (isSorted == false) {
			isSorted = true;
			for (int i = 0; i < array.length-1; i++) {
				if (array[i] > array[i + 1]) {
					isSorted = false;
				}
			}
			if(isSorted == true) {
				return;
			}
			saved = rand.nextInt(array.length);
			saved2 = rand.nextInt(array.length);
			dataSaved = array[saved];
			array[saved] = array[saved2];
			array[saved2] = dataSaved;
			display.updateDisplay();
		}

		

	}
}
