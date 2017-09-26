package assignment2;


public class FractionDemo
{ 
	public static void main(String[] args)
	{
		System.out.println("Create a fraction with numerator 4, denominator 2");
		Fraction f1 = new Fraction(4,2);
		System.out.println("Fraction f1: " + f1.toString());
		System.out.println("Create a fraction with numerator 0, denominator 1");
		Fraction f2 = new Fraction(0,1);
		System.out.println("Fraction f2: " + f2.toString());
		System.out.println("Output fraction f1 as double: " + f1.getDouble());
		System.out.println("Ouyput fraction f1 as reduced fraction: " + f1.toStringReduced());
		System.out.println("Reset fraction f2 numerator: 20");
		f2.setNumerator(20);
		System.out.println("Reset fraction f2 denominator: 60");
		f2.setDenominator(60);
		System.out.println("Output fraction f2 as a double: " + f2.getDouble());
		System.out.println("Ouyput fraction f2 as reduced fraction: " + f2.toStringReduced());
		System.out.println("Process completed");
	}
}
