package assignment4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Complex extends Pairs
{
	
	public Complex()
	{
		super( 0, 0);
	}
	public Complex(double realPart, double imaginaryPart)
	{
		super(realPart, imaginaryPart);
	}
	public Complex(Complex original)
	{
		super(original);
			
	}
	public String toString()
	{
		DecimalFormat formatterObject = new DecimalFormat("#0.0#");
		return formatterObject.format(getA()) + " + " 
				+ formatterObject.format(getB()) + "i";
	}
	public static Complex add(Complex c1, Complex c2)
	{
		return (Complex)Pairs.add(c1, c2);
	}
	public static Complex subtract(Complex c1, Complex c2)
	{
		return (Complex)Pairs.subtract(c1, c2);
	}
	public static Complex multiply(Complex c1, Complex c2)
	{
		if(c1 == null || c2 == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		Complex temp = new Complex(c1.getA() * c2.getA() -
				c1.getB() * c2.getB(), 
				c1.getA() * c2.getB() +
				c1.getB() * c2.getA());
		return temp;
	}
	public static Complex divide(Complex c1, Complex c2)
	{
		if(c1 == null || c2 == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		Complex temp = new Complex((c1.getA() * c2.getA() + 
				c1.getB() * c2.getB())/(c2.getA() * c2.getA() 
				+ c2.getB() * c2.getB()),((c1.getB() * 
				c2.getA() - c1.getA() * c2.getB())/(c2.getA() 
				* c2.getA() + c2.getB() * c2.getB())));
		return temp;
	}
	public static void cactions()
	{
		Scanner keyboard = new Scanner(System.in);
		Complex[] array = new Complex[26];
		int control, index, index2, index3;
		String operator;
		double a, b, scalar = 0;
		do {
			System.out.println("Select an option:\r\n" + 
					"    (1) Enter a complex number\r\n" + 
					"    (2) Display a complex number\r\n" + 
					"    (3) Perform arithmetic or equality "
					+ "check\r\n    (4) Exit\r\n");
			control = keyboard.nextInt();
			switch(control)
			{
			case 1:
				System.out.println("Enter real:");
				a = keyboard.nextInt();
				System.out.println("Enter imaginary:");
				b = keyboard.nextInt();
				System.out.println("Where do you want to "
						+ "store this (enter 1-26): ");
				index = keyboard.nextInt();
				array[index - 1] = new Complex(a, b);
				break;
			case 2:
				System.out.println("Which one do you want "
						+ "to display (enter 1-26):");
				index = keyboard.nextInt();
				System.out.println(array[index - 1]);
				break;
			case 3:
				System.out.println("Enter an operation:  "
						+ " +   -   *   /   = ");
				operator = keyboard.next();
				keyboard.nextLine();
				System.out.println("Enter first number "
						+ "(enter 1-26):");
				index = keyboard.nextInt();
				switch(operator)
				{
				case "+":
					System.out.println("Enter second number "
							+ "(enter 1-26):");
					index2 = keyboard.nextInt();
					System.out.println("Enter result location"
							+ " (enter 1-26):");
					index3 = keyboard.nextInt();
					Pairs p = Pairs.add(array[index - 1], 
							array[index2 - 1]);
					array[index3 - 1] = 
							new Complex(p.getA(),p.getB());
					break;
				case "-":
					System.out.println("Enter second number "
							+ "(enter 1-26):");
					index2 = keyboard.nextInt();
					System.out.println("Enter result location"
							+ " (enter 1-26):");
					index3 = keyboard.nextInt();
					Pairs p2 = Pairs.subtract(array[index - 1], 
							array[index2 - 1]);
					array[index3 - 1] = 
							new Complex(p2.getA(),p2.getB());
					break;
				case "*":
					System.out.println("Enter second number "
							+ "(enter 1-26):");
					index2 = keyboard.nextInt();
					System.out.println("Enter result location"
							+ " (enter 1-26):");
					index3 = keyboard.nextInt();
					array[index3 - 1] = 
							Complex.multiply(array[index - 1],
									array[index2 - 1]);
					break;
				case "/":
					System.out.println("Enter second number "
							+ "(enter 1-26):");
					index2 = keyboard.nextInt();
					System.out.println("Enter result location"
							+ " (enter 1-26):");
					index3 = keyboard.nextInt();
					array[index3 - 1] = 
							Complex.divide(array[index - 1],
									array[index2 - 1]);
					break;
				case "=":
					System.out.println("Enter second number "
							+ "(enter 1-26):");
					index2 = keyboard.nextInt();
					if(array[index - 1].equals(array[index2 - 1]))
						System.out.println(array[index - 1] +
								" is equal to " + array[index2 - 1]);
					else
						System.out.println(array[index - 1] +
								" does not equal " + 
								array[index2 - 1]);
					break;
				default:
					System.out.println("Fatal Error");
					System.exit(0);
					break;
				}
				break;
			case 4:
				System.out.println("Bye...");
				break;
			default:
				System.out.println("Fatal Error");
				System.exit(0);
				break;
			}
		}while(control != 4);
	}
}
