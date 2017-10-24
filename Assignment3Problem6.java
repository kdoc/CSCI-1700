package assignment3;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Assignment 3 Problem 6
 * @authors Keith Docka, Isse Nur, Xavier Jackson
 * CSCI 1700-01
 * 10/24/17
 */
public class Problem6 
{
	public static void rollDice(int[] a, int tosses)
	{
		for(int i =0; i < tosses; i++)
			a[i] = (int)(6 * Math.random() + 1);
	}
	public static void findSum(int[] a, int[] a2, int[] tossSum, 
			int tosses)
	{
		for(int i = 0; i < tosses ; i++)
			tossSum[i] = a[i] + a2[i];
	}
	/**
	 * 
	 * @param tossSum
	 * @param counter an array with 12 indexes for possible sums
	 * @param tosses
	 */
	public static void tossCount(int[] tossSum, int[] counter, 
			int tosses)
	{
		if(counter.length != 13)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		for(int i = 0; i < tosses; i++ )
		{
			switch(tossSum[i])
			{
				case 2:
					counter[2]++;
					break;
				case 3:
					counter[3]++;
					break;
				case 4:
					counter[4]++;
					break;
				case 5:
					counter[5]++;
					break;
				case 6:
					counter[6]++;
					break;
				case 7:
					counter[7]++;
					break;
				case 8:
					counter[8]++;
					break;
				case 9:
					counter[9]++;
					break;
				case 10:
					counter[10]++;
					break;
				case 11:
					counter[11]++;
					break;
				case 12:
					counter[12]++;
			}
		}
		
	}
	public static void display(int[] counter, int tosses)
	{
		DecimalFormat formatter = new DecimalFormat("#0.0##");
		System.out.println("Total number of tosses = " + tosses + 
				"\nToss\tCount\tProbability");
		for(int i = 0; i < counter.length-2; i++)
		{
			double probability = 
					100 * (counter[i+2])/((double)tosses);
			System.out.println((i+2) + "\t" + counter[i+2] +
					"\t" + formatter.format(probability));
		}
		
	}
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String prompt = "no";
		do {
			int tosses;
			int[] a, a2, tossSum, counter;
			counter = new int[13];
			for(int element: counter)
				element = 0;
			System.out.println("Enter number of tosses: ");
			tosses = keyboard.nextInt();
			a = new int[tosses];
			a2 = new int[tosses];
			tossSum = new int[tosses];
			rollDice(a, tosses);
			rollDice(a2, tosses);
			findSum(a, a2, tossSum, tosses);
			tossCount(tossSum, counter, tosses);
			display(counter, tosses);
			System.out.println("Do another simulation? "
					+ "(yes or no): ");
			prompt = keyboard.next();
		}while(prompt.equalsIgnoreCase("yes"));
		keyboard.close();
	}
}
