package assignment4;

public class Pairs 
{
	private double a;
	private double b;
	public Pairs()
	{
		a = 0;
		b = 0;
	}
	public Pairs(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	public Pairs(Pairs otherPair)
	{
		if(otherPair == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		this.a = otherPair.a;
		this.b = otherPair.b;
	}
	public double getA()
	{
		return a;
	}
	public double getB()
	{
		return b;
	}
	public void setA(double a)
	{
		this.a = a;
	}
	public void setB(double b)
	{
		this.b = b;
	}
	public static Pairs add(Pairs p1, Pairs p2)
	{
		if(p1 == null || p2 == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		return new Pairs((p1.a + p2.a),(p1.b + p2.b));
	}
	public static Pairs subtract(Pairs p1, Pairs p2)
	{
		if(p1 == null || p2 == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		return new Pairs((p1.a - p2.a),(p1.b - p2.b));
	}
	public String toString()
	{
		return a + " + " + b;
	}
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			Pairs otherPair = (Pairs)otherObject;
			return (this.a == otherPair.a
					&& this.b == otherPair.b);
		}
	}
	public Pairs clone()
	{
		return new Pairs(this);
	}
}
