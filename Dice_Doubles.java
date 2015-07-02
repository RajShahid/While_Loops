package While_Loop;

import java.util.Random;

public class Dice_Doubles {

	public static void main(String[] args) {

		Random r = new Random();
        int repeat = 1;
        
		while (repeat==1) {
		    int x = 1 + r.nextInt(6);
			int y = 1 + r.nextInt(6);
			int add = x + y;
		    System.out.println("HERE COMES THE DICE!");
		    System.out.print("Roll #1 : ");
		    System.out.println(x);
            System.out.print("Roll #2 : ");
		    System.out.print(y);
		    System.out.println("\nThe total is "+add+"!");
			
	    }
	}

}
