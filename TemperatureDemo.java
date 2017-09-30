package assignment2;

public class TemperatureDemo 
{
	public static void main(String[] args)
	{
		System.out.println("Test Constructors: \n" + 
				"Create an object freezingC using constructor Temperature(double, char): ");
		Temperature freezingC = new Temperature(0,'c');
		System.out.println("The values in freezingC: " + freezingC);
		System.out.println("Create an object freezingF using constructor "
				+ "Temperature(double, char):");
		Temperature freezingF = new Temperature(32,'f');
		System.out.println("The values in freezingF: " + freezingF);
		System.out.println("Create an object coldC using constructor Temperature(): ");
		Temperature coldC = new Temperature();
		coldC.setTemperature(-40.0);
		System.out.println("Create an object coldF using constructor Temperature(): ");
		Temperature coldF = new Temperature();
		coldF.setTemperature(-40.0,'f');
		System.out.println("The values in coldC and coldF: " + coldC + " (" + coldF + ")");
		System.out.println("Create an object boilingF using constructor Temperature(char): ");
		Temperature boilingF = new Temperature('f');
		boilingF.setTemperature(212.0, 'f');
		System.out.println("Create an object boilingC using constructor Temperature(double): ");
		Temperature boilingC = new Temperature(100.0);
		System.out.println("The values in boilingF and boilingC: " + boilingF + " (" + boilingC + ")"); 
		System.out.println("Test equals method: "); 
		System.out.println("Is boilingF equal to boilingF?"); 
		System.out.println(boilingF + " = " + boilingF + "? " + boilingF.equals(boilingF)); 
		System.out.println("Is freezingC equal to freezingF? ");
		System.out.println(freezingC + " = " + freezingF + "? " + freezingC.equals(freezingF));
		System.out.println("Is boilingF equal to boilingC? "); 
		System.out.println(boilingF + " = " + boilingC + "? " + boilingF.equals(boilingC));
		System.out.println("Is boilingC equal to boilingF? "); 
		System.out.println(boilingC + " = " + boilingF + "? " + boilingC.equals(boilingF));
		System.out.println("Is coldC equal to coldF? "); 
		System.out.println(coldC + " = " + coldF + "? " + coldC.equals(coldF));
		System.out.println("Test isGreaterThan and isLessThan methods: "); 
		System.out.println("Is coldC < boilingC? "); 
		System.out.println(coldC + " < " + boilingC + " ? " + coldC.isLessThan(boilingC));
		System.out.println("Is coldC > boilingC? ");
		System.out.println(coldC + " > " + boilingC + " ? " + coldC.isGreaterThan(boilingC));
		System.out.println("Is coldC < freezingF? "); 
		System.out.println(coldC + " < " + freezingF + " ? " + coldC.isLessThan(freezingF)); 
		System.out.println("Is coldC > freezingF? "); 
		System.out.println(	coldC +	" > " + freezingF + " ? " + coldC.isGreaterThan(freezingF)); 
		System.out.println("Process completed."); 
	}
	
}

