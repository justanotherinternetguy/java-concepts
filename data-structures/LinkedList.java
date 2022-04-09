import java.util.LinkedList; // class linkedlist

public class Main {
	public static void main (String[] args) {

		/*
		* Organizes items sequentially
		* Unlike an array, a LL orders items by links instead of by physical placement in memory
		* Each element is called a NODE
		* First element of LL is HEAD
		* Last element of LL is TAIL
		*/

		/*
		* SINGLY LINKED: node --> next
		* DOUBLE LINKED: node <--> next
		* CIRCULAR LINKED: head --> next --> tail --> (head)
		*/


		// Use ArrayList to store / access data
		// Use LinkedList to manipulate data

		LinkedList<String> cars = new LinkedList<String>();
		cars.add("bmw");
		cars.add("honda");
		cars.add("ferrari");
		System.out.println(cars);

		cars.addFirst("mazda");
		System.out.println(cars);

		cars.addLast("toyota");
		System.out.println(cars);

		cars.removeFirst();
		System.out.println(cars);

		cars.removeLast();
		System.out.println(cars);

		System.out.println(cars.getFirst());

		System.out.println(cars.getLast());

		// Final note: LL is slower for data manipulation
	}
}