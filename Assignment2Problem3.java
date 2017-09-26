package assignment2;

import java.util.Scanner;

public class Problem3 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String prompt = "y";
		do
		{
			int a = 0, b = 1, c = 0, d = 1;
			String operand = "";
			do
			{
				System.out.println("Enter first fraction in a / b form: ");
				a = keyboard.nextInt();
				keyboard.next();
				b = keyboard.nextInt();
				//System.out.printf("%d %d%n", a,b);
				if(b == 0)
				{
					System.out.println("Invalid input.");
				}
			}while(b == 0);
			do 
			{
				System.out.println("Enter operation: ");
				operand = keyboard.next();
				if (!(operand.equals("+")||operand.equals("-")||
					operand.equals("/")||operand.equals("*")))
					System.out.println("Invalid input");
			}while(!(operand.equals("+")||operand.equals("-")||
						operand.equals("/")||operand.equals("*")));
			do
			{
				System.out.println("Enter second fraction in c / d form: ");
				c = keyboard.nextInt();
				keyboard.next();
				d = keyboard.nextInt();
				if(d == 0)
					System.out.println("Invalid input");
			}while(d == 0);
			switch(operand)
			{
				case "+":
					a = a*d+c*b;
					b = c*d;
					System.out.printf("Sum = %d/%d%n", a, b);
					break;
				case "-":
					a = a*d-c*b;
					b = c*d;
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
				prompt = keyboard.next();
			}while(!(prompt.equals("y") || prompt.equals("Y")
					|| prompt.equals("n") || prompt.equals("N")));
				
		}while(prompt.equals("y") || prompt.equals("Y"));
		System.out.println("Process completed.");
		keyboard.close();
	}
}
