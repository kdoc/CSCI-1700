package assignment2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem1 
{
	public static void main(String[] args)
	{
		int n = 0;
		double guess = 0, previousGuess = 0, r = 0;
		Scanner keyBoard = new Scanner(System.in);
		DecimalFormat formatterObject = new DecimalFormat("0.00000");
		System.out.println("This program estimates square roots." );
		do
		{
			System.out.println("Enter an integer to estimate the square root of:");
			n = keyBoard.nextInt();
			if(n < 0)
			{
				System.out.println("Invalid input");
				System.out.println("Enter a non-negative integer value");
			}
		}while(n < 0);
		
		guess = (n / 2.0);
		
		if(n==0)
		{
			System.out.println("The estimated square root of " + n + " is " + 
	                   formatterObject.format(guess) );
			System.out.println("Process completed.");
		}
		else
		{
			do
			{
				previousGuess = guess;
				r = (n / guess);
				guess = (guess + r) / 2;
				System.out.println("Current guess: " + guess);
			}while(Math.abs(guess - previousGuess) > 0.00001);
			System.out.println("The estimated square root of " + n + " is " + 
		                   formatterObject.format(guess) );
			System.out.println("Process completed.");
		}
		keyBoard.close();
	}

}
