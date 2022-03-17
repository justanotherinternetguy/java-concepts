public class BooleanAlgebra {

	public static void main(String[] args) {
		// Boolean Algebra used to simulate and analyze logic circuits
		// AND, OR, XOR, NAND, etc...
		// Only True / False, 1 / 0
		
		/*
		 * LOGIC OPERATORS: (simple operations such as == and <= are left out)
		 * & and
		 * | or
		 * ! not
		 * ^ xor
		 * 
		 * || short-circuit OR
		 * && short-circuit AND
		 */
		
		/*
		 * Regular vs short-circuit:
		 * A short-circuit evaluation will exit an evaluation BEFORE the
		 * statement is completely evaluated if
		 * Java knows that the state will be true/false
		 */
		
		if (0 == 1 && 4 + 4 == 8) { // Javac sees the 0 == 1 and &&, already knows that the statement is false.
			// Javac knows that there is NO WAY for the statement to be true (AND operation)
			System.out.println("above statement is false, this won't be printed");
		}
		
	}
}
