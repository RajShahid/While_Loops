package While_Loop;

import java.util.Scanner;

public class Counting_with_while_Loop {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it Several Times " );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		
		System.out.print("How many Times " );
		int x = keyboard.nextInt();
		
		int no = 0;
		while ( no < x )
		{
			System.out.println( (no + 1) + ". " + message );
			no++;
		}
	}

}
