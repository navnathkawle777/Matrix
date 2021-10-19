/* IMPORTANT: Multiple classes and nested static classes are supported */


// uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class Demo {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 */ 
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();   
        String numbers=s.nextLine();// Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
     
     int testcases= Integer.parseInt(name);
     
     String[] numbersArr = new String[testcases];
     numbersArr=numbers.split("\\s");
     System.out.println(numbersArr[1]);
     
     for(int i =0 ; i<testcases ; i++){
    	 
     }

        // Write your code here

    }
}
