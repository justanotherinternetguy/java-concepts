class RecursiveBinarySearch {
	static int RecursiveBinarySearch (int[] arr, int first, int last, int key) {
		if (last >= first) {
			int mid = first + (last - first) / 2;

			if (arr[mid] == key) {
				return mid;
			}

			if (arr[mid] > key) {
				return RecursiveBinarySearch(arr, first, mid-1, key); // Search in left subarr
			}

			else {
				return RecursiveBinarySearch(arr, mid+1, last, key); // Search in right subarr
			}
		}

		return -1;
	}

	public static void main (String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70};
		int key = 30;
		int last = arr.length - 1;
		int result = RecursiveBinarySearch (arr, 0, arr.length - 1, key);

		if (result == -1) {
			System.out.println("not found");
		}

		else {
			System.out.println("key found at index: " + result);
		}
	}
}

