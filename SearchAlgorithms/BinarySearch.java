class BinarySearch {

    static void BinarySearch(int[] arr, int key, int low, int high) { // Iterative
        while (low <= high) {
            int mid = (low + high) / 2; // index of mid

            if (key == arr[mid]) {
                System.out.println("found at index: " + mid);
                break;
            }

            if (key > arr[mid]) {
                low = mid + 1;
            }

            if (key < arr[mid]) {
                high = mid - 1;
            }

        }

    }

    static int RecursiveBinSearch(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2; // index of mid

            if (key == arr[mid]) {
                return mid;
            }

            if (key > arr[mid]) {
                return RecursiveBinSearch(arr, key, mid + 1, high);
            }

            if (key < arr[mid]) {
                return RecursiveBinSearch(arr, key, low, mid - 1);
            }

        }

        return -1;
    }


    public static void main (String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;

        int key = 9;

        System.out.print("iterative: ");
        BinarySearch(arr, key, 0, n-1);

        int result = RecursiveBinSearch(arr, key, 0, n-1);

        System.out.print("recursive: ");
        System.out.println(result);

    }
}
