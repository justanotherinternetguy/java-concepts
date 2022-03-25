// Given a sorted array arr[] of n elements, write a function to search a given element x in arr[]

// Iterate through arr in order, find x

/*
	* Best case: x is on arr[0]
	* Worst case: x is on arr[last]
	* Worst case = arr.length
	* O(n) complexity

*/

class Main {
	static void LinearSearch (int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (x == arr[i]) {
				System.out.println(i);
			}
		}
	}

	public static void main (String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60};
		int x = 20;
		LinearSearch(arr, x);
	}
}
