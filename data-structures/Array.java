import java.util.ArrayList; // ArrayList is a RESIZABLE array
import java.util.Collections; // Collections for


public class Main {
	public static void main (String[] args) {

		// 1-D array
		// A ARRAYS BELOW DYNAMIC (no specific size upon dec.)
		int[] oneD = {8, 7, 6, 5, 4, 3, 2, 1};

		// 2-D array
		int[][] twoD = {{9, 8, 7}, {6, 5, 4, 3}};

		
		ArrayList<String> cars = new ArrayList<String>(); // create object

		cars.add("bmw");
		cars.add("ferrari");
		cars.add("honda");

		System.out.println(cars);
		System.out.println(cars.get(1)); // get a val from index / returns "ferrari"

		cars.set(0, "lancia"); // modify bmw --> lancia
		System.out.println(cars.get(0));

		cars.remove(0); // removes lancia
		System.out.println(cars);
		System.out.println(cars.size()); // return 2


		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(9);
		ints.add(8);
		ints.add(7);
		ints.add(6);
		ints.add(5);
		ints.add(4);
		System.out.println(ints);
		Collections.sort(ints); // sort ints
		System.out.println(ints);

		
	}
}