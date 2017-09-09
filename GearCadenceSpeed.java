package assignment1;

public class GearCadenceSpeed 
{
	public static final double PI = 3.14159265358979323846;
	
	public static void main(String[] args)
	{
		double gearSize = 100.0, cadence = 90.0, speed = 0;
		speed = gearSize * PI * (60 / 63360.0) * cadence;
		System.out.println("With a gear size of " + gearSize + " and a cadence of " + cadence 
				           + " you will bike "+ speed + " miles per hour.");
	}

}
