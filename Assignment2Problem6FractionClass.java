package assignment2;

public class Fraction 
{
	private int numerator;
	private int denominator;
	
	public Fraction()
	{
		setFraction( 0, 1);
	}
	public Fraction(int numerator)
	{
		setFraction(numerator, 1);
	}
	public Fraction(int numerator, int denominator)
	{
		setFraction(numerator, denominator);
	}
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}
	public void setDenominator(int denominator)
	{
		if(denominator == 0)
		{
			System.out.println("Critical failure");
			System.exit(0);
		}
		else
			this.denominator = denominator;
	}
	public void setFraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public double getDouble()
	{
		return (double)numerator/denominator;
	}
	public boolean equals(Fraction otherFraction)
	{
		return ((this.numerator == otherFraction.numerator) 
				&& (this.denominator == otherFraction.denominator));
	}
	public String toString()
	{
		return (numerator + "/" + denominator);
	}
	private int gcd()
	{
		int r1 = 0, r2 = 0, r3 = 0, gcd = 1;
		if(numerator > denominator)
		{
			r1 = r3 = numerator % denominator;
			r2 = denominator;
			if(r1 == 0)
				return denominator;
		}
		else if(denominator > numerator)
		{
			r1 = r3 = denominator % numerator;
			r2 = denominator;
			if(r1 == 0)
				return numerator;
		}
		else
			return numerator;
		while(r3 > 0)
		{
			r3 = r1 % r2; 
			r1 = r2;
			r2 = r3;
			if(r3 > 0)
				gcd = r3;
		}
		return gcd;
	}
	public String toStringReduced()
	{
		return (numerator / this.gcd() + "/" + denominator / this.gcd());
	}
	
}
