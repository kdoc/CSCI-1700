package assignment1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BabylonianAlgorithm
{
	public static void main(String[] args)
	{
		int n = 0;
		double guess = 0, r = 0;
		Scanner keyBoard = new Scanner(System.in);
		DecimalFormat formatterObject = new DecimalFormat("0.00");
		System.out.println("This program makes a rough estimate for square roots." );
		System.out.println("Enter a positive integer to estimate the square root of:");
		n = keyBoard.nextInt();
		guess = (n / 2.0);
		r = (n / guess);
		guess = (guess + r) / 2;
		r = (n / guess);
		guess = (guess + r) / 2;
		r = (n / guess);
		guess = (guess + r) / 2;
		r = (n / guess);
		guess = (guess + r) / 2;
		r = (n / guess);
		guess = (guess + r) / 2;
		System.out.println("The estimated square root of " + n + " is " + 
		                   formatterObject.format(guess) );
	}
}
