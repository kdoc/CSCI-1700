package assignment2;

import java.util.Random;

public class Problem5 
{
	public static void main(String[] args)
	{
		System.out.println("This program picks three numbers at random from the 30 finalists.");
		System.out.println("Keep picking if any two numbers are the same.");
		System.out.println(winnerString());
		System.out.println("Process completed");
	}
	public static int numberGenerator()
	{
		Random generatorObject = new Random();
		return generatorObject.nextInt(30)+1; 
	}
	public static boolean randomCheck(int n1, int n2, int n3)
	{
		return n1==n2||n1==n3||n2==n3;
	}
	public static String winnerString()
	{
		int n1, n2, n3;
		do
		{
			n1 = numberGenerator();
			n2 = numberGenerator();
			n3 = numberGenerator();
		}while(randomCheck(n1, n2, n3));
		return n1 + ", " + n2 + ", " + n3;
	}
}
