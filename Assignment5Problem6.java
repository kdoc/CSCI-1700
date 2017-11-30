package assignment5;

import java.io.File;
import java.util.Scanner;


public class Problem6 
{
	public static void searchForFile(File dir, String target)
	{
		String result = "";
		if(!dir.isDirectory())
			System.out.println("Path is not a directory.");
		for(File folderItem : dir.listFiles())
		{
			if(folderItem.isDirectory())
			{
				searchForFile(folderItem, target);
			}
			else
			{
				if(folderItem.getName().equals(target))
					System.out.println("The file: "
							+ target + " has been found "
							+ "in the following folder:\n"
							+ folderItem.getAbsolutePath());
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String prompt = "";
		do
		{
			System.out.println("Enter the directory / folder to search: ");
			File rootFolder = new File(keyboard.nextLine());
			System.out.println("Enter the file to search: ");
			String fileToFind = keyboard.nextLine();
			searchForFile(rootFolder, fileToFind);
			System.out.println("End of search.\r\n" + 
					"\r\n" + 
					"Another search? Type y to continue, n to exit:\r\n");
			prompt = keyboard.nextLine();
		}while(prompt.equalsIgnoreCase("y"));
		System.out.println("Process completed.");
		keyboard.close();
	}
}
