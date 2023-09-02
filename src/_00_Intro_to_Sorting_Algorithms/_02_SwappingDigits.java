package _00_Intro_to_Sorting_Algorithms;

class _02_SwappingDigits {

	// 1. Complete the method so that the first two elements of the array are
	// swapped.
	public static void swapArrayOfTwo(int[] arr) {
		int zero = arr[0];
		arr[0] = arr[1];
		arr[1] = zero;
	}

	// 2. Complete the method so that it sorts the array using a bubble sort.
	// Iterate through the array and when you find two elements that are out
	// of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		boolean isSorted = false;
		while (isSorted == false) {
			isSorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					isSorted = false;
					int eye = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = eye;
				}
			}
		}
	}

	// 3. Complete the method so that it finds the middle number in the array.
	// *Hint* it helps to sort it first.
	// *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int eye = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = eye;
			}
		}
		int middle = arr.length / 2;

		return arr[middle];
	}
}
