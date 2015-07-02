package While_Loop;
import java.util.Scanner;

public class Adding_Values_in_loop {

	public static void main(String[] args) {
		
		int no,total = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("I will add up the numbers you give me.");
		no = in.nextInt();
		
		while(no != 0)
		{
			total = total + no;
			System.out.println("The total so far is " + total);
			no = in.nextInt();
		}
		System.out.println("The total so far is " + total);
	}
}
