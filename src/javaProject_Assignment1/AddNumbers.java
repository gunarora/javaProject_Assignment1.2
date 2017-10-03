//Sum of two numbers without using "+" operator
package javaProject_Assignment1;

//Import Scanner class for taking inputs from user
import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		//declaration of variables
				int a,b,c = 0;
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter first number");
				//read value
				a = sc.nextInt();
				System.out.println("Enter second number");
				b = sc.nextInt();
				//addition without "+" operator
				c = a - (-b);
				System.out.println("Sum is " + c);
				sc.close();
	}

}
