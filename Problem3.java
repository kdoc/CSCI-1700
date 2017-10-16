package assignment3;

import java.util.*;
import java.text.*;

public class Problem3 
{
	public static void main(String[] args) 
	{
		DecimalFormat formatterObject = new DecimalFormat("#0.0#");
		double min = Integer.MAX_VALUE, n;
		String s = null, prompt = null;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("This program finds the smallest number in a series of numbers.");
			System.out.println("Please enter a list of numbers seperated by comma and space: ");
			s = keyboard.nextLine();
			StringTokenizer wordMachine = new StringTokenizer(s, ", ");
			while(wordMachine.hasMoreTokens())
			{
				n = Double.parseDouble(wordMachine.nextToken());
				if(n < min)
					min = n;
			}
			System.out.println("The smallest number is "
					+ formatterObject.format(min) + ".");
			System.out.println("Do it again? Type y for yes, n for no");
			prompt = keyboard.nextLine();
		}while(prompt.equals("y"));
		System.out.println("Process completed");
		keyboard.close();
	}
}



