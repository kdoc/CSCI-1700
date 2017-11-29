package assignment5;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Problem5 
{
	public static int fibonacci(int n)
	{
		if(n > 2)
			return  fibonacci(n-2) + fibonacci(n-1);
		else if(n==2)
			return 1;
		else
			return 0;
	}
	private static String output(int n)
	{
		if(n % 10== 1 && ((n % 100)/ 10) != 1)
			return "st";
		else if (n % 10 == 2 && ((n % 100)/ 10) != 1)
			return "nd";
		else if (n % 10 == 3 && ((n % 100)/ 10) != 1)
			return "rd";
		else
			return "th";
	}
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Fibonacci number generator");
		int n = 0;
		do
		{
			try
			{
				System.out.print("Which one do you want "
						+ "(negative to exit)? ");
				n = keyboard.nextInt();
				if(n >= 0)
					System.out.printf("The %d%s "
							+ "Fibonacci number is %d%n",
							n, output(n), fibonacci(n));
			}
			catch(InputMismatchException e)
			{
				keyboard.nextLine();
				System.out.println("Invalid Entry.");
			}
		}while(n >= 0);
	}
}
