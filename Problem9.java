package assignment1;
/**
Problem 9
@authors Keith Docka, Isse Nur, Xavier Jackson
CSCI 1700-01
*/

import java.util.Scanner;

public class TaxMachine 
{
	public static final double TAX_RATE = 0.0625;
	
	public static void main(String[] args)
	{
		String name1 = " ", name2 = " ", name3 = " ";
		int quantity1 = 0, quantity2 = 0, quantity3 = 0;
		double price1 = 0, price2 = 0, price3 = 0, total1 = 0, total2 = 0, total3 = 0, 
			   subTotal = 0;
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Input name of item 1:");
		name1 = keyBoard.nextLine();
		System.out.println("Input quantity of item 1:");
		quantity1 = keyBoard.nextInt();
		System.out.println("Input price of item 1:");
		price1 = keyBoard.nextDouble();
		System.out.println("Input name of item 2:");
		keyBoard.nextLine();
		name2 = keyBoard.nextLine();
		System.out.println("Input quantity of item 2:");
		quantity2 = keyBoard.nextInt();
		System.out.println("Input price of item 2:");
		price2 = keyBoard.nextDouble();
		System.out.println("Input name of item 3:");
		keyBoard.nextLine();
		name3 = keyBoard.nextLine();
		System.out.println("Input quantity of item 3:");
		quantity3 = keyBoard.nextInt();
		System.out.println("Input price of item 3:");
		price3 = keyBoard.nextDouble();
		total1 = (price1*quantity1);
		total2 = (price2*quantity2);
		total3 = (price3*quantity3);
		subTotal = (total1 + total2 + total3);
		System.out.printf("%-30s%-10s%-10s%-10s%n", "Item", "Quantity", "Price", "Total");
		System.out.printf("%-30s%-10d%-10.2f%-10.2f%n", name1 , quantity1 , price1, total1);
		System.out.printf("%-30s%-10d%-10.2f%-10.2f%n", name2 , quantity2 , price2, total2);
		System.out.printf("%-30s%-10d%-10.2f%-10.2f%n%n", name3 , quantity3 , price3, total3);
		System.out.printf("%-30s%25.2f%n", "SubTotal", subTotal);
		System.out.printf("%-50s%.2f%n", "6.25 Sales Tax", subTotal * TAX_RATE);
		System.out.printf("%-50s%.2f%n", "Total", subTotal + (subTotal * TAX_RATE));
		keyBoard.close();
	}

}
