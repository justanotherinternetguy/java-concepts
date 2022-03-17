import java.util.*;
public class Function {
	// Functions can also be referred to as METHODS (using "methods" is a more OOP-based approach)
	
	static void myMethod() { // void = no return value
		Scanner sc = new Scanner(System.in);
		System.out.print("what is your name: ");
		String name = sc.nextLine();
		
		System.out.println("your name is: " + name);
		sc.close(); // avoid resource leak
		
	}
	// function myMethod WILL ONLY RUN if it is called in main(String[] args)
	
	
	static void paraMethod(String parameterName) { // method w/ parameters. 
		System.out.println(parameterName + " is the name you entered as a parameter");
	}
	
	static int returnInteger(int a) { // static INT - the int keyword means the function must an integer
		return a + 40;
	}
	
	public static void main(String[] args) { // this is the main method. code execution starts here
		myMethod(); // call function
		System.out.println("--------------------");
		paraMethod("nameTest"); // parameter entered
		System.out.println("--------------------");
		returnInteger(64); // this returns NOTHING
		new Function();
		System.out.println(Function.returnInteger(64)); // This returns 104
		/*
		 * Why does that happen?
		 * return IS NOT THE SAME as println().
		 * to actually print the value of return to console you must:
		 * use the new keyword to instantiate (i think that's the right word) the method within your class.
		 * In this case, my class name is Function() and my method was returnInteger
		 */
	}

}
