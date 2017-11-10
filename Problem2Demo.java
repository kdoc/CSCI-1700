package assignment4;

import java.util.Scanner;

public class Problem2Demo 
{
	public static void main(String[] args)
	{
	  int sel;
	  Scanner keyboard = new Scanner(System.in);
	  do {
	   System.out.println("Select an option - (1) perform complex number actions ");
	   System.out.println("                   (2) perform vector actions ");
	   System.out.println("                   (3) exit ");
	   sel = keyboard.nextInt();
	   if(sel == 1)
	      Complex.cactions();
	   else if(sel == 2)
	      Vect.vactions();
	   else if (sel == 3)
	      System.out.println("Bye...");
	   else
	      System.out.println("Invalid input - try again");
	  } while (sel != 3);
	}

}
