public class Iteration {

	public static void main(String[] args) {
		/*
		 * Iterations: Sequence of instructions that are repeated for a set
		 * amount of time / loops;
		 */
		
		// For loop:
		// FOR the amount of time a condition is true: run the loop
		System.out.println("for loop");
		for (int i = 0; i < 5; i++) { // For the amount of time that i < 5, loop
			System.out.println(i);
			// output: 0/1/2/3/4
		}
		System.out.println("------------------");
		
		
		
		
		
		
		// While loop:
		// WHILE a condition is met: run the loop
		System.out.println("while loop");
		int cntr = 0;
		boolean end = false;
		while (end != true) { // loop runs as long as end is not true
			System.out.println("end is not false yet");
			cntr++;
			if (cntr == 4) {
				end = true; // cntr++ and cntr had to be added to avoid an infinite loop
			}
		}
		System.out.println("------------------");
		
		
		
		
		
		System.out.println("iteration through 1D array");
		// Iterate through an array
		int[] nums = {1, 2, 3, 4, 5};
		for (int j = 0; j < nums.length; j++) {
			System.out.println(nums[j]);
		}
		/*
		 * Iteration through an array of dimension N needs
		 * N nested for loops in order to read every index
		 */
	}
}
