package assignment5;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Problem3 
{	
	private Scanner inputFileManager(File file)
	{
		Scanner fileIn = null;
		try
		{
			fileIn = new Scanner(new FileInputStream(file));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Problem opening file");
			System.exit(0);
		}
		System.out.println("Filename: " + file);
		return fileIn;
	}
	private PrintWriter outputFileManager(File file)
	{
		PrintWriter fileOut = null;
		try
		{
			fileOut = new PrintWriter(new FileOutputStream(file));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Problem opening file");
			System.exit(0);
		}
		return fileOut;
	}
	public void wordStatistics(File file)
	{
		int numberOfWords = 0, sum = 0, punctChar = 0, 
				shrtLength = Integer.MAX_VALUE, 
				lngLength = Integer.MIN_VALUE;
		double aveLength;
		Scanner fileInput = inputFileManager(file);
		String s = null;
		while(fileInput.hasNextLine())
		{
			s = fileInput.nextLine();
			StringTokenizer strToken = new StringTokenizer(s);
			numberOfWords += strToken.countTokens();
			while(strToken.hasMoreTokens())
			{
				String s2 = strToken.nextToken();
				int firstIndex = 0, lastIndex = 0;
				for(int i = 0; i < s2.length(); i++)
					if(Character.isLetter(s2.charAt(i)))
						lastIndex = i + 1;
				for(int i = s2.length()-1; i >= 0 ; i--)
					if(Character.isLetter(s2.charAt(i)))
						firstIndex = i;
				String s3 = s2.substring(firstIndex, lastIndex);
				punctChar += s2.length() - s3.length();
				sum += s3.length();
				if(s3.length() > lngLength)
					lngLength = s3.length();
				if(s3.length() < shrtLength)
					shrtLength = s3.length();
			}
		}
		aveLength = (double)sum / numberOfWords;
		System.out.printf("Total number of words = %d\r\n" + 
				"Average word length = %f characters.\r\n" + 
				"Total number of word characters = %d\r\n" + 
				"Total number of punctuation characters = %d\r\n" + 
				"Shortest word length = %d\r\n" + 
				"Longest word length = %d\r\n"
				, numberOfWords, aveLength, sum, punctChar, 
				shrtLength, lngLength);
		fileInput.close();
	}
	public void shortestWords(File file)
	{
		int shrtLength = Integer.MAX_VALUE;
		Scanner fileInput = inputFileManager(file);
		String s = null, list = "";
		while(fileInput.hasNextLine())
		{
			s = fileInput.nextLine();
			StringTokenizer strToken = new StringTokenizer(s);
			while(strToken.hasMoreTokens())
			{
				String s2 = strToken.nextToken();
				int firstIndex = 0, lastIndex = 0;
				for(int i = 0; i < s2.length(); i++)
					if(Character.isLetter(s2.charAt(i)))
						lastIndex = i + 1;
				for(int i = s2.length()-1; i >= 0 ; i--)
					if(Character.isLetter(s2.charAt(i)))
						firstIndex = i;
				String s3 = s2.substring(firstIndex, lastIndex);
				if(s3.length() < shrtLength)
					shrtLength = s3.length();
				list += " " + s3;
			}
		}
		StringTokenizer wordList = new StringTokenizer(list);
		System.out.println("Shortest words in file: ");
		while(wordList.hasMoreTokens())
		{
			String temp = wordList.nextToken();
			if(temp.length() == shrtLength)
				System.out.println(temp);
		}
		fileInput.close();	
	}
	public void longestWords(File file)
	{
		int lngLength = Integer.MIN_VALUE;
		Scanner fileInput = inputFileManager(file);
		String s = null, list = "";
		while(fileInput.hasNextLine())
		{
			s = fileInput.nextLine();
			StringTokenizer strToken = new StringTokenizer(s);
			while(strToken.hasMoreTokens())
			{
				String s2 = strToken.nextToken();
				int firstIndex = 0, lastIndex = 0;
				for(int i = 0; i < s2.length(); i++)
					if(Character.isLetter(s2.charAt(i)))
						lastIndex = i + 1;
				for(int i = s2.length()-1; i >= 0 ; i--)
					if(Character.isLetter(s2.charAt(i)))
						firstIndex = i;
				String s3 = s2.substring(firstIndex, lastIndex);
				if(s3.length() > lngLength)
					lngLength = s3.length();
				list += " " + s3;
			}
		}
		StringTokenizer wordList = new StringTokenizer(list);
		System.out.println("Longest words in file: ");
		while(wordList.hasMoreTokens())
		{
			String temp = wordList.nextToken();
			if(temp.length() == lngLength)
				System.out.println(temp);
		}
		fileInput.close();
	}
	public void search(File file)
	{
		Scanner keyboard = new Scanner(System.in);
		Scanner fileInput = inputFileManager(file);
		String s = null, list = "";
		while(fileInput.hasNextLine())
		{
			s = fileInput.nextLine();
			StringTokenizer strToken = new StringTokenizer(s);
			while(strToken.hasMoreTokens())
			{
				String s2 = strToken.nextToken();
				int firstIndex = 0, lastIndex = 0;
				for(int i = 0; i < s2.length(); i++)
					if(Character.isLetter(s2.charAt(i)))
						lastIndex = i + 1;
				for(int i = s2.length()-1; i >= 0 ; i--)
					if(Character.isLetter(s2.charAt(i)))
						firstIndex = i;
				String s3 = s2.substring(firstIndex, lastIndex);
				list += " " + s3;
			}
		}
		StringTokenizer wordList = new StringTokenizer(list);
		System.out.println("Enter word to find in file: ");
		String keyword = keyboard.next();
		System.out.println("Search word: " + keyword);
		int count = 0;
		while(wordList.hasMoreTokens())
			if(wordList.nextToken().equalsIgnoreCase(keyword))
				count++;
		System.out.println("This word appears "
				+ count + " time(s) in the file");
		fileInput.close();
	}
	public static void main(String[] args)
	{
		Problem3 p3 = new Problem3();
		Scanner keyboard = new Scanner(System.in);
		File fileOut = null;
		File fileIn = null;
		int control = 0;
		
		//System.out.println("Enter output file name: ");
		//fileOut = new File(keyboard.next());
		System.out.println("Enter input file name: ");
		fileIn = new File(keyboard.next());
		do
		{
			System.out.println("Select an option: \r\n" + 
					"\r\n" + 
					"    1 - Determine word statistics\r\n" + 
					"\r\n" + 
					"    2 - List shortest words\r\n" + 
					"\r\n" + 
					"    3 - List longest words\r\n" + 
					"\r\n" + 
					"    4 - Search for a word\r\n" + 
					"\r\n" + 
					"    5 - Exit\r\n");
			keyboard.nextLine();
			try
			{
				control = keyboard.nextInt();
				switch(control)
				{
					case 1:
						p3.wordStatistics(fileIn);
						break;
					case 2:
						p3.shortestWords(fileIn);
						break;
					case 3:
						p3.longestWords(fileIn);
						break;
					case 4:
						p3.search(fileIn);
						break;
					case 5:
						System.out.println("Process completed");
						break;
					default:
						//for invalid integer entry
						System.out.println("Invalid entry");
						break;
				}
			}
			catch(InputMismatchException e)
			{
				//for generally invalid entry
				System.out.println("Invalid entry");
			}
		}while(control != 5);
		keyboard.close();
	}
}
