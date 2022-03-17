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
