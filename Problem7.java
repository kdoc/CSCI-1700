package assignment1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ValueDepreciation 
{
	public static void main(String[] args)
	
	{
		double p = 0, y = 0, s = 0, d = 0; 
		Scanner keyBoard = new Scanner(System.in);
	    NumberFormat formatterObject = NumberFormat.getCurrencyInstance(Locale.US);
	    System.out.println("Enter the purchase price(without $ sign):");
	    p = keyBoard.nextDouble();
	    System.out.println("Enter the expected number of years of service:");
	    y = keyBoard.nextDouble();
	    System.out.println("Enter the expected salvage value:");
	    s = keyBoard.nextDouble();
	    d =((p-s)/y);
	    System.out.print("The yearly depreciation is ");
	    System.out.println(formatterObject.format(d));
	}
	
}
