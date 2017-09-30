package assignment2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem3 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String prompt = "y";
		do
		{
			int a = 0, b = 1, c = 0, d = 1;
			String s;
			String operand = "";
			do
			{
				System.out.println("Enter first fraction in a / b form: ");
				s = keyboard.nextLine();
				StringTokenizer tknObject = new StringTokenizer(s,"/ ");
				a = Integer.parseInt(tknObject.nextToken());
				b = Integer.parseInt(tknObject.nextToken());
				if(b == 0)
				{
					System.out.println("Invalid input.");
				}
			}while(b == 0);
			do 
			{
				System.out.println("Enter operation: ");
				operand = keyboard.next();
				keyboard.nextLine();
				if (!(operand.equals("+")||operand.equals("-")||
					operand.equals("/")||operand.equals("*")))
					System.out.println("Invalid input");
			}while(!(operand.equals("+")||operand.equals("-")||
						operand.equals("/")||operand.equals("*")));
			do
			{
				System.out.println("Enter second fraction in c / d form: ");
				s = keyboard.nextLine();
				StringTokenizer tknObject = new StringTokenizer(s,"/ ");
				c = Integer.parseInt(tknObject.nextToken());
				d = Integer.parseInt(tknObject.nextToken());
				if(d == 0)
					System.out.println("Invalid input");
			}while(d == 0);
			switch(operand)
			{
				case "+":
					a = a*d+c*b;
					b = b*d;
					System.out.printf("Sum = %d/%d%n", a, b);
					break;
				case "-":
					a = a*d-c*b;
					b = b*d;
					System.out.printf("Difference = %d/%d%n", a, b);
					break;
				case "/":
					a = a*d;
					b = b*c;
					System.out.printf("Quotient = %d/%d%n", a, b);
					break;
				case "*":
					a = a*b;
					b = b*d;
					System.out.printf("Product = %d/%d%n", a, b);
					break;
			}
			do
			{
				//Continually prompts for a valid input 
				//if none is given
				System.out.println("Continue (y or n)");
				prompt = keyboard.nextLine();
			}while(!(prompt.equals("y") || prompt.equals("Y")
					|| prompt.equals("n") || prompt.equals("N")));
				
		}while(prompt.equals("y") || prompt.equals("Y"));
		System.out.println("Process completed.");
		keyboard.close();
	}
}
