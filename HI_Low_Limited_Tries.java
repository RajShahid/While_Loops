package While_Loop;
import java.util.Random;
import java.util.Scanner;

public class HI_Low_Limited_Tries {

	public static void main(String[] args) {
		
		int no,guess;
		int limit = 1;
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
		guess = in.nextInt();
		no = 1 + r.nextInt(100);
		
		while(guess != no && limit != 7)
		{
			limit++;
			if(guess > no)
			{
				System.out.println("Sorry, that guess is too high.Guess Again ");
				System.out.println("Guess # " + limit );
				guess = in.nextInt();
			}
			else if(guess < no)
			{
				System.out.println("Sorry, that guess is too low.Guess Again ");
				System.out.println("Guess # " + limit );
				guess = in.nextInt();
			}
			
		}
		if(guess == no)
		{
			 System.out.println("You guessed it!  What are the odds?!?");
		}
		else if(limit == 7)
		{
			System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
		}
		
	}

}
