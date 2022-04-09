import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
		
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// input from STDIN
        String name = br.readLine();

		// Writing output to STDOUT
        System.out.println("Hi, " + name + "."); 
    }
}
