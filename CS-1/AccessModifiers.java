
public class AccessModifiers {
	
	static void defaultMethod() {
		System.out.println("only accessible within this package");
	}

	public static void main(String[] args) {
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

	}

}
