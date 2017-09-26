package assignment2;

import java.util.Scanner;

public class Problem2
{
	public static void main(String[] args)
	{
		int n = 0;
		String prompt = "n"; 
		Scanner keyboard = new Scanner(System.in);
		do
		{
			int fi = 0, fi2 = 1, fi3 = 0;
			do 
			{
				System.out.println("Enter a positive integer n:");
				n = keyboard.nextInt();
			}while(n <= 0);
			if(n == 1)
			{
				System.out.printf("The %dth fibonacci number is %d.%n"
						  , n, fi);
			}
			else if(n == 2)
			{
				System.out.printf("The %dth fibonacci number is %d.%n"
								  , n, fi2);
			}
			else
			{
				for(int i = 3; i <= n; i++)
				{
					fi3 = fi + fi2;
					fi = fi2;
					fi2 = fi3;
				}
				System.out.printf("The %dth fibonacci number is %d.%n"
								  , n, fi3);
			}
			do
			{
				//Continually prompts for a valid input 
				//if none is given
				System.out.println("Continue (y or n)");
				prompt = keyboard.next();
			}while(!(prompt.equals("y") || prompt.equals("Y")
					|| prompt.equals("n") || prompt.equals("N")));
		
		}while(prompt.equals("y")||prompt.equals("Y"));
		System.out.println("Process completed.");
		keyboard.close();
	}

}
