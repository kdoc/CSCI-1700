package assignment5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem4 
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
			fileOut = new PrintWriter(new FileOutputStream(file));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Problem opening file");
			System.exit(0);
		}
		return fileOut;
	}
	//aid in generation of temporary file name
	private static String xGenerator(int n)
	{
		if(n > 1)
		{
			return xGenerator(n-1) +"X";
		}
		return "X";
	}
	/**
	 * 
	 * @return File object with novel filename
	 */
	private static File tempGenerator()
	{
		String s = "tempX.txt";
		File temp = new File(s);
		int control = 0;
		while(temp.exists())
		{
			s = s.substring(0,4) + xGenerator(control) 
			+ "" + s.substring(5,s.length());
			temp = new File(s);
			control++;
		}
		return temp;
	}
	private static void blankRemover(File fileIn, File temp)
	{
		Scanner fileReader = 
				inputFileManager(fileIn);
		PrintWriter tempWriter = 
				outputFileManager(temp);
		String line = null;
		while(fileReader.hasNextLine())
		{
			line = fileReader.nextLine();
			StringTokenizer wordMachine =
					new StringTokenizer(line);
			line = "";
			while(wordMachine.hasMoreTokens())
				line += wordMachine.nextToken() + " ";
			tempWriter.println(line);
		}
		fileReader.close();
		tempWriter.close();
		
	}
	private static void finalSwap(File temp, File fileOut)
	{
		Scanner tempReader = inputFileManager(temp);
		PrintWriter fileWriter = 
				outputFileManager(fileOut);
		while(tempReader.hasNextLine())
			fileWriter.println(tempReader.nextLine());
		tempReader.close();
		fileWriter.close();
	}
	public static void fileToScreen(File fileIn)
	{
		Scanner fileReader = inputFileManager(fileIn);
		while(fileReader.hasNextLine())
			System.out.println(fileReader.nextLine());
		fileReader.close();
	}
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter filename of file to "
				+ "remove blanks: ");
		String fileName = null;
		File fileIn = null;
		do
		{
			fileName = keyboard.next();
			fileIn = new File(fileName);
			if(!(fileIn.exists()))
				System.out.println(fileIn + " does not exist."
						+ "\nPlease enter existing file name.");
			else if(!fileIn.isFile())
				System.out.println(fileIn + " is not a file."
						+ "\nPlease enter a file name.");
		}while(!(fileIn.exists() && fileIn.isFile()));
		File temp = tempGenerator();
		File fileOut = 
				new File(fileName);
		System.out.println("Text file " + fileIn 
				+ "'s content before removing extra blanks: ");
		fileToScreen(fileIn);
		blankRemover(fileIn, temp);
		finalSwap(temp, fileOut);
		System.out.println("Text file " + fileIn + "'s content "
				+ "after removing extra blanks: ");
		fileToScreen(fileIn);
		temp.delete();
		keyboard.close();
		System.out.println("Process complete");
	}
}
