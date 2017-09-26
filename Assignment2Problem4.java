package assignment2;

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Problem4 
{
	public static void main(String[] args)
	{
		int years = 0;
		double cost = 0, inflationRate = 0;
		Scanner keyboard = new Scanner(System.in);
		do
		{
			System.out.println("Enter cost of item: ");
			cost = keyboard.nextDouble();	
		}while(cost < 0);
		do
		{
			System.out.println("Enter number of (whole) years until the item is purchased: ");
			years = keyboard.nextInt();
		}while(years < 0);
		System.out.println("Enter the inflation rate as a percentage (e.g., 5.6):");
		inflationRate = keyboard.nextDouble() / 100;
		displayCost(findCost(years,cost, inflationRate));
		keyboard.close();
	}
	public static double findCost(int years, double cost, double inflationRate)
	{
		Scanner keyboard = new Scanner(System.in);
		if(years > 0)
			for(int i = 0; i < years; i++)
			{
				cost += cost*inflationRate;
			}
		keyboard.close();
		return cost;
	}
	public static void displayCost(double cost)
	{
		NumberFormat formaterObject = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("The estimated final cost of the item will be "
				+formaterObject.format(cost));
	}

}
