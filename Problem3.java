package assignment3;

import java.util.*;

public class Problem3 
{
	public static void main(String[] args)
	{
		String s = null;
		Scanner keyboard = new Scanner(System.in);
		String prompt;//do-while loop control
		do {
			System.out.println("This program finds the smallest number in a series of numbers.\n" + 
					"Please enter a list of numbers separated by comma and space: ");
			s = keyboard.nextLine();
			int i, control;//for loop control
			double min = Integer.MAX_VALUE;
			StringTokenizer wordMachine = new StringTokenizer( s, " ,");
			control = wordMachine.countTokens();
			double[] n = new double[control];
			System.out.println(control);
			while(wordMachine.hasMoreTokens());
			{
				System.out.println(wordMachine.nextToken());
				/*n[i] = Double.parseDouble(wordMachine.nextToken());
				System.out.println(n[i]);
				if (i == 2)
					System.out.println("Hello from 2");
				if(n[i] < min)
					min = n[i];*/
			}
			System.out.println(min);
			System.out.printf("The smallest number is %f%n", min);
			prompt = readPrompt();
		}while(prompt == "y");
		keyboard.close();	
	}
	public static String readPrompt()
	{
		String prompt;
		do{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Do it again? Type y for yes, n for no.");
			prompt = keyboard.next();
			prompt.toLowerCase();
			if(prompt != "y" || prompt != "n")
				System.out.println("Invalid input. Please reenter.");
		}while(prompt != "y" || prompt != "n");
		return prompt;
	}

}
