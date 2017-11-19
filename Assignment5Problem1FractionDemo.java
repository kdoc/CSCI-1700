package assignment5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class FractionDemo 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String prompt = "Y";
		int numerator, denominator;
		Fraction f = new Fraction();
		do
		{
			try
			{
				System.out.println("Enter a numerator: ");
				numerator = keyboard.nextInt();
				System.out.println("Enter a denominator: ");
				denominator = keyboard.nextInt();
				f.setNumerator(numerator);
				f.setDenominator(denominator);//might throw exception
				System.out.println("The fraction reduced is "
						+ f.toStringReduced());
			}
			catch(InputMismatchException e)
			{
				keyboard.nextLine();
				System.out.println("You must enter an integer."
						+ " Try again.");
			}
			catch(DenominatorIsZeroException e)
			{
				keyboard.nextLine();
				System.out.println(e.getMessage());
			}
			System.out.println("Enter 'Y' to go again, anything else to exit. ");
			prompt = keyboard.next();
			keyboard.nextLine();
		}while(prompt.equals("Y"));
		System.out.println("Process completed");
		keyboard.close();
	}
}
