package assignment3;

import java.util.Scanner;
import assignment3.Elevator;

public class ElevatorDemo 
{
	/**
	 * Driver program for elevator class
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int numberOfFloors = 10, numberOfElevators = 3, 
				elevator, floor;
		Elevator[] a = new Elevator[numberOfElevators];
		for(int i = 0; i < numberOfElevators; i++)
			a[i] = new Elevator();
		do {
			System.out.print("Elevator Status\n"
					+ "A\tB\tC\n" + a[0] + "\t" 
					+ a[1] + "\t" + a[2]
					+ "\nWhich elevator do you want "
					+ "(1=A, 2=B, 3=C, or other to exit)? ");
			elevator = keyboard.nextInt();
			switch(elevator) 
			{
			case 1:
				a[0].moveToFloor(1);
				System.out.print("Which floor do you want? ");
				floor = keyboard.nextInt();
				if(floor <= numberOfFloors && floor > 0)
					a[0].moveToFloor(floor);
				else
					System.out.println("Ivalid Entry");
				break;
			case 2:
				a[1].moveToFloor(1);
				System.out.print("Which floor do you want? ");
				floor = keyboard.nextInt();	
				if(floor <= numberOfFloors && floor > 0)
					a[1].moveToFloor(floor);
				else
					System.out.println("Ivalid Entry");
				break;
			case 3:
				a[2].moveToFloor(1);
				System.out.print("Which floor do you want? ");
				floor = keyboard.nextInt();
				if(floor <= numberOfFloors && floor > 0)
					a[2].moveToFloor(floor);
				else
					System.out.println("Ivalid Entry");
				break;
			}
		}while(elevator == 1 || elevator == 2 
				|| elevator == 3);
		System.out.println("Process Completed");
		keyboard.close();
	}
}


