package assignment1;

import java.util.Scanner;

public class VendingMachine 
{
	public static void main(String[] args)
	{
		int item = 0, change = 0, quarter =0, dime = 0, nickel = 0;
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Enter price of item");
		System.out.println("(from 25 cents to a dollar, in 5-cent increments)");
		item = keyBoard.nextInt();
		change = (100 - item);
		quarter = (change / 25);
		dime = ((change % 25) / 10);
		nickel = (((change % 25) % 10) / 5);
		System.out.printf("You bought an item for %d cents and gave me a dollar,%n", item);
		System.out.printf("So your change is%n%-2dquarters,%n%-2ddimes, and%n%-2dnickels.", 
				          quarter, dime, nickel);
	}

}
