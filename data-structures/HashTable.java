import java.util.HashMap;


class Main {
	public static void main (String[] args) {
		/*
		* Hash Table = Python Dictionary
		* Organizes data for a given key

		* Fast lookups, flexible keys

		* Slow worst-case lookup O(n)
		* Unordered
		* Single-Direction lookups
		* Not cache-friendly
		*/

		HashMap<String, String> capitalStates = new HashMap<String, String>();

		capitalStates.put("NJ", "Trenton");
		capitalStates.put("NY", "Albany");
		capitalStates.put("Idaho", "Boise");
		capitalStates.put("Ohio", "Columbus");
		System.out.println(capitalStates);

		// GET index
		System.out.println(capitalStates.get("Idaho")); // Boise
		
		// Remove item
		capitalStates.remove("Ohio");

		// Size
		System.out.println(capitalStates.size());
	}
}