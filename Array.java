// Arrays in java

class Array {
	public static void main(String[] args) {
		// 1-D Array
		int[] intArr = {1, 2, 3, 4, 5};

	  	// Iterate through 1-D Array
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]);
		}
			System.out.print("\n");

		// 2-D Array
		int[][] twoDimensionalArr = { {9, 2, 4, 8, 1, 2, 8},{8, 3, 9, 3, 4} };

		// Getting index
		// System.out.println(twoDimensionalArr[0][0]);

		// Iterate through 2-D Array
		for (int j = 0; j < twoDimensionalArr.length; j++) {
			for (int k = 0; k < twoDimensionalArr[j].length; k++) {
				System.out.print(twoDimensionalArr[j][k]);
			}
		}
	}
}
