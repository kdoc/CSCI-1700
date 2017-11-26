package assignment5;

/**
Problem 1
@authors Keith Docka, Isse Nur, Xavier Jackson
@throws DenominatorIsZeroException, NullPointerException
CSCI 1700-01
*/
public class Fraction 
{
	private int numerator;
	private int denominator;
	
	public Fraction() 
	{
		numerator = 0;
		denominator = 1;
	}
	public Fraction(int numerator) 
	{
		this.numerator = numerator;
		denominator = 1;
	}
	/**
	 * Multiple argument constructor
	 * @param numerator
	 * @param denominator
	 * @throws DenominatorIsZeroException
	 */
	public Fraction(int numerator, int denominator) 
			throws DenominatorIsZeroException
	{
		this.numerator = numerator;
		setDenominator(denominator);
	}
	/**
	 * Copy constructor
	 * @param original another object of 
	 * Fraction type
	 * @throws NullPointerException
	 */
	public Fraction(Fraction original) 
			throws NullPointerException
	{
		if(original == null)
			throw new NullPointerException
			("Can't copy null object.");
		else
		{
			numerator = original.numerator;
			denominator = original.denominator;
		}
			
	}
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}
	/**
	 * Sets instance variable denominator
	 * @param denominator
	 * @throws DenominatorIsZeroException
	 */
	public void setDenominator(int denominator) 
			throws DenominatorIsZeroException
	{
		if(denominator == 0)
			throw new DenominatorIsZeroException();
		else
			this.denominator = denominator;
	}
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	public double getDouble()
	{
		return (double)numerator/denominator;
	}
	/** 
	 * Calculates Greatest Common Denominator
	 * of instance variables
	 * @return Returns integer value of GCD
	 */
	private int gcd()
	{
		int nTemp = Math.abs(numerator), 
				dTemp = Math.abs(denominator);
		int r1 = 0, r2 = 0, r3 = 0, gcd = 1;
		if(nTemp > dTemp)
		{
			r1 = r3 = nTemp % dTemp;
			r2 = dTemp;
			if(r1 == 0)
				return dTemp;
		}
		else if(dTemp > nTemp)
		{
			if(nTemp == 0)
				return 1;
			else
			{
				r1 = r3 = dTemp % nTemp;
				r2 = dTemp;
				if(r1 == 0)
					return nTemp;
			}
		}
		else
			return nTemp;
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
	/**
	 * Modified toString() method
	 * @return Returns reduced fraction
	 * as a String object
	 */
	public String toStringReduced()
	{
		if(numerator < 0 && denominator < 0)
			return (Math.abs(numerator) / this.gcd() + "/" 
					+ Math.abs(denominator) / this.gcd());
		if(denominator < 0)
			return ((-1 * numerator)/ this.gcd() + "/" 
					+ Math.abs(denominator)/ this.gcd());
		return (numerator / this.gcd() + "/" 
				+ denominator / this.gcd());
	}
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			Fraction otherFraction = (Fraction) otherObject; 
			return ((this.numerator == otherFraction.numerator) 
					&& (this.denominator == 
							otherFraction.denominator));
		}
		
	}
	public String toString()
	{
		if(numerator < 0 && denominator < 0)
			return (Math.abs(numerator) + "/" 
					+ Math.abs(denominator));
		if(denominator < 0)
			return ((-1 * numerator) + "/" 
					+ Math.abs(denominator));
		return (numerator + "/" + denominator);
	}
	public Fraction clone()
	{
		return new Fraction(this);
	}
	
}

