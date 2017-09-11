package assignment1;
/**
Problem 10
@authors Keith Docka, Isse Nur, Xavier Jackson
CSCI 1700-01
*/
import java.util.Scanner;

public class PigLatin 
{
	public static void main(String[] args)
	{
		String first = " ", last = " ";
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Enter your first name:");
		first = keyBoard.next();
		System.out.println("Enter your last name:");
		last = keyBoard.next();
		System.out.println(first + " " + last + " turned to Pig Latin is:");
		first = first.toLowerCase();
		first = first.substring(1,2).toUpperCase() + first.substring(2) + 
				first.substring(0,1) + "ay";
		last = last.toLowerCase();
		last = last.substring(1,2).toUpperCase() + last.substring(2) + last.substring(0,1) + "ay";
		System.out.println(first + " " + last + "\nProcess completed.");
		keyBoard.close();
	}

}
