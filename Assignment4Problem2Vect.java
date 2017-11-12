package assignment4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Vect extends Pairs
{
	public Vect()
	{
		super();
	}
	public Vect(double a, double b)
	{
		super(a, b);
	}
	public Vect(Vect otherVector)
	{
		super(otherVector);
	}
	public static Vect add(Vect v1, Vect v2)
	{
		return Vect.add(v1, v2);
	}
	public static Vect subtract(Vect v1, Vect v2)
	{
		return Vect.subtract(v1, v2);
	}
	public static double multiply(Vect v1, Vect v2)
	{
		return v1.getA() * v2.getA() 
				+ v1.getB() * v2.getB();
	}
	public static Vect multiply(Vect v, double scalar)
	{
		Vect temp = new Vect(v.getA()*scalar,v.getB()*scalar);
		return temp;
	}
	public static void vactions()
	{
		Scanner keyboard = new Scanner(System.in);
		Vect[] array = new Vect[26];
		int control, index, index2, index3;
		String operator;
		double a, b, scalar = 0;
		do {
			System.out.println("Select an option:\r\n" + 
					"    (1) Enter a vector \r\n" + 
					"    (2) Display a vector\r\n" + 
					"    (3) Display scalar \r\n" + 
					"    (4) Perform arithmetic or equality "
					+ "check \r\n    (5) Exit \r\n");
			control = keyboard.nextInt();
			switch(control)
			{
			case 1:
				System.out.println("Enter first number:");
				a = keyboard.nextInt();
				System.out.println("Enter second number:");
				b = keyboard.nextInt();
				System.out.println("Where do you want to "
						+ "store this (enter 1-26): ");
				index = keyboard.nextInt();
				array[index - 1] = new Vect(a, b);
				break;
			case 2:
				System.out.println("Which one do you want "
						+ "to display (enter 1-26):");
				index = keyboard.nextInt();
				System.out.println(array[index - 1]);
				break;
			case 3:
				System.out.println("Scalar = " + scalar);
				break;
			case 4:
				System.out.println("Enter an operation:   "
						+ "+   -   . (dot prod)   * "
						+ "(scalar prod)   =");
				operator = keyboard.next();
				keyboard.nextLine();
				System.out.println("Enter first vector "
						+ "(enter 1-26):");
				index = keyboard.nextInt();
				switch(operator)
				{
				case "+":
					System.out.println("Enter second vector "
							+ "(enter 1-26):");
					index2 = keyboard.nextInt();
					System.out.println("Enter result location"
							+ " (enter 1-26):");
					index3 = keyboard.nextInt();
					Pairs p = Pairs.add(array[index - 1], 
							array[index2 - 1]);
					array[index3 - 1] = 
							new Vect(p.getA(),p.getB());
					break;
				case "-":
					System.out.println("Enter second vector "
							+ "(enter 1-26):");
					index2 = keyboard.nextInt();
					System.out.println("Enter result location"
							+ " (enter 1-26):");
					index3 = keyboard.nextInt();
					Pairs p2 = Pairs.subtract(array[index - 1], 
							array[index2 - 1]);
					array[index3 - 1] = 
							new Vect(p2.getA(),p2.getB());
					break;
				case ".":
					System.out.println("Enter second vector "
							+ "(enter 1-26):");
					index2 = keyboard.nextInt();
					scalar = 
					Vect.multiply(array[index - 1], 
							array[index2 - 1]);
					break;
				case "*":
					System.out.println("Enter scalar "
							+ "to multiply: ");
					scalar = keyboard.nextInt();
					System.out.println("Enter result location"
							+ " (enter 1-26):");
					index3 = keyboard.nextInt();
					array[index3 - 1] = 
							Vect.multiply(array[index - 1], scalar);
					break;
				case "=":
					System.out.println("Enter second vector "
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
			case 5:
				System.out.println("Bye...");
				break;
			default:
				System.out.println("Fatal Error");
				System.exit(0);
				break;
			}
		}while(control != 5);
	}
	public String toString()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0#");
		return ("<" + formatterObject.format(getA()) + " , "
				+ formatterObject.format(getB()) + ">");
	}
}

