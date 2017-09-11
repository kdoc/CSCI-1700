package assignment1;
/**
 Problem 5
 @authors Keith Docka, Isse Nur, Xavier Jackson
 CSCI 1700-01
 */
public class GearCadenceSpeed 
{
	public static void main(String[] args)
	{
		double gearSize = 100.0, cadence = 90.0, speed = 0;
		speed = gearSize * Math.PI * (60 / 63360.0) * cadence;
		System.out.println("With a gear size of " + gearSize + " and a cadence of " + cadence 
				           + " you will bike "+ speed + " miles per hour.");
	}

}
