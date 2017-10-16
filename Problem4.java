package assignment3;

import java.util.Scanner;

import static java.lang.Character.*;

public class Problem4 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int characters = 0, upperCase = 0, lowerCase = 0, digits = 0, 
				whitespace = 0, other = 0; 
		System.out.println("Enter multiple lines of text. "
				+ "Do not press enter until you are through inputing:");
		String s = keyboard.nextLine();
		characters = s.length();
		for(int i = 0; i < characters; i++)
		{
			if(isLetter(s.charAt(i)))
			{
				if(isUpperCase(s.charAt(i)))
					upperCase++;
				else
					lowerCase++;
			}
			else if(isDigit(s.charAt(i)))
				digits++;
			else if(isWhitespace(s.charAt(i)))
				whitespace++;
			else
				other++;
		}
		System.out.printf("There were %d total characters.%n" + 
				"There were %d upper case letters.%n" + 
				"There were %d lower case letters.%n" + 
				"There were %d digits.%n" + 
				"There were %d white space characters.%n" + 
				"There were %d other characters.%nProcess completed%n"
				,characters, upperCase, lowerCase, digits, whitespace, other);
		keyboard.close();
	}

}
