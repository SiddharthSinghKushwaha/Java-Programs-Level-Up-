import java.util.*;
import java.util.Random;
public class GuessingGame
{
	public static void main(String args[])
	{
		Random rand=new Random();
		Scanner ob=new Scanner(System.in);
		int comp=rand.nextInt(1000);
		int i=3,count=0;
		System.out.print("\nLet's play Guessing Game\n");
		System.out.println("You have to guess What number computer had had:\n");	
		while(i>0)
		{
			System.out.print("\nGuess the number: ");
			int guess=ob.nextInt();
			count +=1;
			if(guess>comp)
				System.out.println("\nToo High");
			else if(guess<comp)
				System.out.println("\nToo Less");
			else 
				break;
		}
		System.out.println("\nGreat!!!  You got it in "+ count + " guesses");
		ob.close();
	}
}