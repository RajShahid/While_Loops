package While_Loop;

import java.util.Scanner;

public class Number_Guessing {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int secret_no = 5;
		int number;
		int count = 1;

		System.out.println("I have chosen a number between 1 and 10. Try to guess it. ");
		System.out.print("Your Guess: " );
		number = input.nextInt();

		while(number != secret_no)
		{
			 System.out.println("That is incorrect. Guess again. ");
			 System.out.print("Your Guess: ");
			 number=input.nextInt();
			 count++;
		}
		  System.out.println("That's right! You're a good guesser.");
		  System.out.println("It only took you " + count + " tries.");
	}

}
