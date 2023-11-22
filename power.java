package practices;

import java.util.Scanner;

public class power {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        
	        long res = 1;
	        
	        for (int i = n; i > 0; --i) {
	            res *= i;
	        }
	        
	        System.out.println("Factorial of " + n + " is: " + res);
	        
	        scanner.close(); // Close the scanner to release resources
	    }
	}

		 
		 
