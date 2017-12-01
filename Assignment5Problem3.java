package assignment5;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Problem3 
{	
	private static Scanner inputFileManager(File file)
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
		return fileIn;
	}
	private static PrintWriter outputFileManager(File file)
	{
		PrintWriter fileOut = null;
		try
		{
			fileOut = new PrintWriter(new FileOutputStream(file,true));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Problem opening file");
			System.exit(0);
		}
		return fileOut;
	}
	public static void wordStatistics(File fileIn, File fileOut)
	{
		Scanner fileInput = inputFileManager(fileIn);
		PrintWriter fileOutput =outputFileManager(fileOut);
		int numberOfWords = 0, sum = 0, punctChar = 0, 
				shrtLength = Integer.MAX_VALUE, 
				lngLength = Integer.MIN_VALUE;
		double aveLength;
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
		System.out.printf("Filename: %s%n"
				+ "Total number of words = %d\r\n" + 
				"Average word length = %f characters.\r\n" + 
				"Total number of word characters = %d\r\n" + 
				"Total number of punctuation characters = %d\r\n" + 
				"Shortest word length = %d\r\n" + 
				"Longest word length = %d\r\n"
				, fileIn, numberOfWords, aveLength, sum, punctChar, 
				shrtLength, lngLength);
		fileOutput.printf("Filename: %s%n"
				+ "Total number of words = %d\r\n" + 
				"Average word length = %f characters.\r\n" + 
				"Total number of word characters = %d\r\n" + 
				"Total number of punctuation characters = %d\r\n" + 
				"Shortest word length = %d\r\n" + 
				"Longest word length = %d\r\n"
				, fileIn, numberOfWords, aveLength, sum, punctChar, 
				shrtLength, lngLength);
		fileOutput.close();
		fileInput.close();
	}
	public static void shortestWords(File fileIn, File fileOut)
	{
		Scanner fileInput = inputFileManager(fileIn);
		PrintWriter fileOutput =outputFileManager(fileOut);
		int shrtLength = Integer.MAX_VALUE;
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
		System.out.println("Filename: " + fileIn);
		fileOutput.println("Filename: " + fileIn);
		System.out.println("Shortest words in file: ");
		fileOutput.println("Shortest words in file: ");
		while(wordList.hasMoreTokens())
		{
			String temp = wordList.nextToken();
			if(temp.length() == shrtLength)
			{
				System.out.println(temp);
				fileOutput.println(temp);
			}
		}
		fileOutput.close();
		fileInput.close();
	}
	public static void longestWords(File fileIn, File fileOut)
	{
		Scanner fileInput = inputFileManager(fileIn);
		PrintWriter fileOutput =outputFileManager(fileOut);
		int lngLength = Integer.MIN_VALUE;
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
		System.out.println("Filename: " + fileIn);
		fileOutput.println("Filename: " + fileIn);
		System.out.println("Longest words in file: ");
		fileOutput.println("Longest words in file: ");
		while(wordList.hasMoreTokens())
		{
			String temp = wordList.nextToken();
			if(temp.length() == lngLength)
			{
				System.out.println(temp);
				fileOutput.println(temp);
			}
		}
		fileOutput.close();
		fileInput.close();
	}
	public static void search(File fileIn, File fileOut, Scanner keyboard)
	{
		Scanner fileInput = inputFileManager(fileIn);
		PrintWriter fileOutput =outputFileManager(fileOut);
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
		System.out.println("Filename: " + fileIn);
		fileOutput.println("Filename: " + fileIn);
		System.out.println("Enter word to find in file: ");
		fileOutput.println("Enter word to find in file: ");
		String keyword = keyboard.next();
		fileOutput.println(keyword);
		System.out.println("Search word: " + keyword);
		fileOutput.println("Search word: " + keyword);
		int count = 0;
		while(wordList.hasMoreTokens())
			if(wordList.nextToken().equalsIgnoreCase(keyword))
				count++;
		System.out.println("This word appears "
				+ count + " time(s) in the file");
		fileOutput.println("This word appears "
				+ count + " time(s) in the file");
		fileOutput.close();
		fileInput.close();
	}
	private static void menu(File fileIn, File fileOut, Scanner keyboard)
	{
		PrintWriter fileOutput = outputFileManager(fileOut);
		int control = 0;
		do
		{
			System.out.println("Select an option: \n" +
					"\n    1 - Determine word statistics\n" + 
					"\n    2 - List shortest words\n" + 
					"\n    3 - List longest words\n" + 
					"\n    4 - Search for a word\n" + 
					"\n    5 - Exit\r\n");
			fileOutput.println("Select an option: ");
			fileOutput.println("    1 - Determine word statistics");
			fileOutput.println("    2 - List shortest words");
			fileOutput.println("    3 - List longest words");
			fileOutput.println("    4 - Search for a word");
			fileOutput.println("    5 - Exit"); 
			try
			{
				control = keyboard.nextInt();
				fileOutput.println(control);
				fileOutput.flush();
				switch(control)
				{
					case 1:
						wordStatistics(fileIn,fileOut);
						break;
					case 2:
						shortestWords(fileIn,fileOut);
						break;
					case 3:
						longestWords(fileIn,fileOut);
						break;
					case 4:
						search(fileIn,fileOut,keyboard);
						break;
					case 5:
						System.out.println("Process completed");
						fileOutput.println("Process completed");
						break;
					default:
						//for invalid integer entry
						System.out.println("Invalid entry");
						fileOutput.println("Invalid entry");
						break;
				}
			}
			catch(InputMismatchException e)
			{
				//for generally invalid entry
				System.out.println("Invalid entry");
				fileOutput.println("Invalid entry");
			}
		}while(control != 5);
		fileOutput.close();
	}
	public static File outputfileSet(Scanner keyboard)
	{
		System.out.println("Enter output file name: ");
		String outputFileName = keyboard.next();
		File fileOut = new File(outputFileName);
		PrintWriter fileOutput = outputFileManager(fileOut);
		fileOutput.println("Enter output file name:");
		fileOutput.println(outputFileName);
		fileOutput.close();
		return fileOut;
	}
	public static File inputFileSet(Scanner keyboard, File fileOut)
	{
		PrintWriter fileOutput = outputFileManager(fileOut);
		System.out.println("Enter input file name: ");
		fileOutput.println("Enter input file name: ");
		String inputFileName = keyboard.next();
		File fileIn = new File(inputFileName);
		fileOutput.println(inputFileName);
		System.out.println("Filename entered: " + inputFileName);
		fileOutput.println("Filename entered: " + inputFileName);
		fileOutput.close();
		return fileIn;
	}
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		File fileOut = outputfileSet(keyboard);
		File fileIn = inputFileSet(keyboard, fileOut);
		menu(fileIn, fileOut, keyboard);
		keyboard.close();
	}
}
