public class BubbleSort {
	
	static void BubbleSort (int[] arr) {
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n-1); j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		BubbleSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
