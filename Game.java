import java.util.*;
import java.util.Random;
public class Game
{
	public static void main(String args[])
	{
		Random rand=new Random();
		Scanner ob=new Scanner(System.in);
		int comp,u,c;
		System.out.println("*******------ROCK\\tPAPER\\tSCISSOR-------********");
		System.out.print("Enter the player name: ");
		String name=ob.nextLine();
		System.out.print("How many chances you need to beat Computer- ");
		int not=ob.nextInt();
		System.out.println("\nLet Begins\n ");
		System.out.println("REMEBER Enter\n 0 for ROCK\n 1 for PAPER\n 2 for SCISSOR\n");
		System.out.println("\t    "+ name +" Vs  Computer");
		u=0;c=0;
		for(int i=0;i<not;i++)   //not for number of time
		{
			System.out.print("\nYour choice: ");
			int uc=ob.nextInt();
			comp=rand.nextInt(3);	// 
			
			
			if(uc==comp)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("---------NO RESULT---------");
			}
			else if(uc==0 && comp==2)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("---------YOU WIN------------");
				u++;
			}
			else if(uc==1 && comp==0)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("---------YOU WIN------------");
				u++;
			}
			else if(uc==2 && comp==1)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("---------YOU WIN------------");
				u++;
			}
			else if(uc==0 && comp==1)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("---------COMPUTER WINS------------");
				c++;
			}
			else if(uc==1 && comp==2)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("---------COMPUTER WINS------------");
				c++;
			}
			else if(uc==2 && comp==0)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("---------COMPUTER WINS------------");
				c++;
			}
			else
				System.out.println("Invalid choice by computer, Try Again");
		}
		System.out.println("\n Final score\t"+name+"("+u+")\tComputer("+c+")");
		if(u>c)
			System.out.println("*------------Congo, YOU win------------------*");
		else if(u==c)
			System.out.println("-------------Match Drawn----------------");
		else
			System.out.println("*-----------Computer Wins--------------*");
		ob.close();
	}
}
