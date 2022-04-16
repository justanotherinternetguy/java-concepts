public class BubbleSort {

    static void bubbleSort (int[] arr) {
        int size = arr.length;

        // loop to access each array element
        for (int i = 0; i < size - 1; i++)

            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++)

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (arr[j] > arr[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;

        bubbleSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
