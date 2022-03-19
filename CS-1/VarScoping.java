public class VarScoping {
	// Class scope:
	int packageScope = 1; // accessible EVERYWHERE in this class, but also in the ENTIRE PACKAGE
	private int classScope = 2; // accessible ONLY inside this class
	
	static void method() {
		int methodScope = 3; // accessible ONLY inside this method
	}
	
	public static void main(String[] args) {
		// the SCOPE of a variable is when / where it can be used
		// System.out.println(methodScope); UNCOMMENT this line to get a scope error
		
		// block scoping
		{
			int blockScope = 4;
		}
		
		// System.out.println(blockScope); UNCOMMENT this line to get a scope error
	}

}

/*
 * Access modifiers are keywords in java that change how
 * a method / class / object / variable is accessed.
 */

/*
 * default (no keyword) - all entities are usable within SAME PACKAGE
 * public - ENTIRE WORLD can use it, even other packages and classes
 * private - usable within SAME CLASS (encapsulation)!
 * protected - usable within same package AND all subclasses
 */

/*
 * public - CLASS, PACKAGE, SUBCLASS, WORLD
 * protected - CLASS, PACKAGE, SUBCLASS
 * default - CLASS, PACKAGE
 * private - CLASS
 */
