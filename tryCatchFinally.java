package tryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Give me a number to divide 10: ");
			Scanner sc= new Scanner(System.in);
			int N=sc.nextInt();
			System.out.println(10/N);
		}
		catch(ArithmeticException e) {
			System.out.println("You can't divide by zero");
			
		}
		catch(InputMismatchException e) {
			System.out.println("Please give me numbers");
		}
		finally {
			System.out.println("this is the rest of the work \neven if there is an error");
		}
	}

}
