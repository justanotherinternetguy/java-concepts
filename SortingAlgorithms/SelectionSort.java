public class SelectionSort {
	
	static void SelectionSort(int[] arr) {
		int n = arr.length;
		
		// move "boundary" of unsorted arr
		for(int i = 0; i < n; i++) {
			
			// find min element in UNSORTED arr
			int min_idx = i;
			
			for(int j = i; j < n; j++) {
				if (arr[min_idx] > arr[j]) {
					min_idx = j;
				}
			}
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		SelectionSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}