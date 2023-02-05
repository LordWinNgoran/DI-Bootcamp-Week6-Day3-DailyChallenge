
//Daily Challenge : Multiplication table
/*
*  	@author: N'goran Kouadio Jean Cyrille
* 	@description: Create a program that prompts the user to enter a number
 *  Then uses a nested for loop to print a multiplication table for the entered number
 *  While loop to find the factorial of the entered number
 *  And a do-while loop to print the Fibonacci sequence up to the entered number.
* 	Date : 02/02/2023
*/
package atos;
import java.util.Scanner;

public class DailyChallenge {

	public static void main(String[] args) {
		// 1 Create a program that prompts the user to enter a number
		int userInput;
		int x;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("######## MULTIPLICATION ##############\n");
			System.out.print("Please enter a integer : ");
			userInput = scanner.nextInt();
		}
		// 2 Then uses a nested for loop to print a multiplication table for the entered
		// number
		for (x = 0; x < 11; x++) {

			System.out.print(userInput + " x " + x + " = " + userInput * x + " \n");

		}
		System.out.print("###### END MULTIPLICATION ######\n");

		// 3 While loop to find the factorial of the entered number
		System.out.print("###### FIBONACCI ######\n");
		int factorial = userInput;
		int i = 1;
		while (i < userInput) {
			if (userInput == 0 || userInput == 1) {
				factorial = 1;
				break;
			}
			factorial = factorial * (userInput - i);
			i++;
		}

		System.out.println(userInput + "! = " + factorial);

		System.out.print("###### FIBONACCI DO WHILE ######\n");

		i = 1;
		int fib = 0;
		do {
			System.out.println(fib);
			fib += i;
			i++;
		} while (i < userInput);

	}

}
