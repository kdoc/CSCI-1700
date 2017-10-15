package assignment3;

import java.util.*;
import java.text.*;


public class ComplexDemo 
{

	public static void main(String[] args)
	{
		Complex[] c = new Complex[3];
		getInput(c);
		output(c, 0);
		//part 2
		Complex[] c2 = new Complex[3];
		getInput(c2);
		output(c2, 1);
		//part 3
		Complex2[] c3 = new Complex2[3];
		getInput(c3);
		output(c3);	
	}
	/**
	 * Handles input for Part 1-2
	   Takes array of base type complex
	   Fills array with user input
	*/
	public static void getInput(Complex[] a)
	{
		double n, n2;
		int count = 0;
		String s = null;
		StringTokenizer wordFactory = null;
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < 3; i++)
		{
			do {
				System.out.println("Enter Complex number a+bi: ");
				s = keyboard.nextLine();
				System.out.println("You input " + s);
				wordFactory = new StringTokenizer( s, "+i ");
				count = wordFactory.countTokens();
				if(count == 1)
				{
					n = Double.parseDouble(wordFactory.nextToken());
					a[i] = new Complex(n);
				}
				else if(count == 2)
				{
					n = Double.parseDouble(wordFactory.nextToken());
					n2 = Double.parseDouble(wordFactory.nextToken());
					a[i] = new Complex( n, n2);
				}else
					System.out.println("Error");
			}while(count != 1 && count != 2);
			System.out.printf("complex" + (i+1) + " is : %s%n", a[i] );
		}
	}
	/**
	 * Handles input for Part 3
	   Takes array of base type Complex2
	   Fills array with user input
	 * @param a
	 */
	public static void getInput(Complex2[] a)
	{
		double n, n2;
		int count = 0;
		String s = null;
		StringTokenizer wordFactory = null;
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < 3; i++)
		{
			do {
				System.out.println("Enter Complex number a+bi: ");
				s = keyboard.nextLine();
				System.out.println("You input " + s);
				wordFactory = new StringTokenizer( s, "+i ");
				count = wordFactory.countTokens();
				if(count == 1)
				{
					n = Double.parseDouble(wordFactory.nextToken());
					a[i] = new Complex2(n);
				}
				else if(count == 2)
				{
					n = Double.parseDouble(wordFactory.nextToken());
					n2 = Double.parseDouble(wordFactory.nextToken());
					a[i] = new Complex2( n, n2);
				}else
					System.out.println("Error");
			}while(count != 1 && count != 2);
			System.out.printf("complex" + (i+1) + " is : %s%n", a[i] );
		}
	}
	/**
	 * Handles output for part 1-2
	 * @param c
	 * @param control
	 */
	public static void output(Complex[] c, int control)
	{
		DecimalFormat formatterObject = new DecimalFormat("0.0");
		System.out.println("Complex1's real part is: "
				+ formatterObject.format(c[0].getReal()));
		System.out.println("Complex1's imaginary part is: "
				+ formatterObject.format(c[0].getImaginary()));
		System.out.println("Changing complex1's real part.");
		c[0].setReal(3);
		System.out.printf("Complex1 is : %s%n", c[0].toString());
		System.out.println("Changing complex1's imaginary part.");
		c[0].setImaginary(4);
		System.out.printf("Complex1 is: %s%n", c[0].toString());
		System.out.println("complex1 is equal to complex2? " + c[0].equals(c[1])); 
		System.out.print("Test copy constructor: ");
		Complex copy = new Complex(c[1]);
		System.out.println("a copy of complex2 is equal to complex2? " 
				+ copy.equals(c[1]));
		System.out.printf("Adding 1+4i and 3+4i: %s%n" 
				+ "Subtracting 3+4i - 1+4i: %s%n", Complex.add(c[2],c[0]), 
				Complex.subtract(c[0],c[2]));
		System.out.println("Multiplying 1+4i * 3+4i: " + Complex.multiply(c[0], c[2]));
		if(control == 1)
		{
			System.out.printf("Adding 1+4i and 3+4i (test overloaded add): %s%n"
					+ "Subtracting 3+4i - 1+4i (test overloaded subtract): %s%n"
					+ "Multiplying 1+4i * 3+4i (test overloaded multiply): %s%n", 
					c[2].add(c[0]), c[0].subtract(c[2]), c[0].multiply(c[2]));

		}
	}
	/**
	 * Handles output for part 3
	 * @param c
	 */
	public static void output(Complex2[] c)
	{
		DecimalFormat formatterObject = new DecimalFormat("0.0");
		System.out.println("Complex1's real part is: "
				+ formatterObject.format(c[0].getReal()));
		System.out.println("Complex1's imaginary part is: "
				+ formatterObject.format(c[0].getImaginary()));
		System.out.println("Changing complex1's real part.");
		c[0].setReal(3);
		System.out.printf("Complex1 is : %s%n", c[0].toString());
		System.out.println("Changing complex1's imaginary part.");
		c[0].setImaginary(4);
		System.out.printf("Complex1 is: %s%n", c[0].toString());
		System.out.println("complex1 is equal to complex2? " + c[0].equals(c[1])); 
		System.out.print("Test copy constructor: ");
		Complex2 copy = new Complex2(c[1]);
		System.out.println("a copy of complex2 is equal to complex2? " 
				+ copy.equals(c[1]));
		System.out.printf("Adding 1+4i and 3+4i: %s%n" 
				+ "Subtracting 3+4i - 1+4i: %s%n", Complex2.add(c[2],c[0]), 
				Complex2.subtract(c[0],c[2]));
		System.out.println("Multiplying 1+4i * 3+4i: " + Complex2.multiply(c[0], c[2]));
		Complex2[] c2 = new Complex2[3];
		for(int i = 0; i < 3; i++)
			c2[i] = new Complex2(c[i]);
		//Void methods add, subtract, and multiply change calling object
		//duplicate array needed to generate sample output
		c[2].add(c[0]);
		c[0].subtract(c2[2]);
		c2[2].multiply(c2[0]);
		System.out.printf("Adding 1+4i and 3+4i (test overloaded void add): %s%n"
				+ "Subtracting 3+4i - 1+4i (test overloaded void subtract): %s%n"
				+ "Multiplying 1+4i * 3+4i (test overloaded void multiply): %s%n", 
				c[2], c[0], c2[2]);

	}
}
