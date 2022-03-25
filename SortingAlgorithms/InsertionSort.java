class InsertionSort {
	
	static void InsertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void main (String[] args) {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		InsertionSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
