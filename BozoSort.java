import java.util.Random;

class Main {
        
    static void BozoSort (int[] arr) {
        int len = arr.length;
        int largest = arr[0];
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                index = i;
            }
        }

        int temp = arr[index];
        arr[index] = arr[len - 1];
        arr[len - 1] = temp;
        
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---------------------");
        
        Random rand = new Random();
        int rnd = rand.nextInt(len);

        int diff = 0;
        int newDiff = 0;
        int diffIndex = 0;
        
        for (int i = 0; i < len-1; i++) {
            System.out.println(arr[len-1]);
            // newDiff = arr[len-1] - arr[i];
        }

    }



    public static void main (String[] args) {
        int[] arr = {9, 7, 8, 6, 5, 4, 3};
        BozoSort(arr);
    }
}

