package assignment3;

import java.text.DecimalFormat;

public class Complex2 
{
	private double real;
	private double imaginary;
	
	public Complex2()
	{
		setComplex( 0, 0);
	}
	public Complex2(double realPart)
	{
		setComplex( realPart, 0);
	}
	public Complex2(double realPart, 
			double imaginaryPart)
	{
		setComplex(realPart, imaginaryPart);
	}
	public Complex2(Complex2 original)
	{
		if(original == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		real = original.real;
		imaginary = original.imaginary;
			
	}
	public double getReal()
	{
		return real;
	}
	public double getImaginary()
	{
		return imaginary;
	}
	public void setReal(double realPart)
	{
		real = realPart;
	}
	public void setImaginary(double imaginaryPart)
	{
		imaginary = imaginaryPart;
	}
	public void setComplex(double realPart, 
			double imaginaryPart)
	{
		real = realPart;
		imaginary = imaginaryPart;
	}
	public boolean equals(Complex2 otherComplex)
	{
		if(otherComplex == null)
			return false;
		return (real == otherComplex.real &&
				imaginary == otherComplex.imaginary);
	}
	public String toString()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("0.0");
		return formatterObject.format(real) + " + " 
				+ formatterObject.format(imaginary) 
				+ "i";
	}
	public static Complex2 add(Complex2 c1, 
			Complex2 c2)
	{
		if(c1 == null || c2 == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		Complex2 temp = new Complex2(c1.real + c2.real,
				c1.imaginary + c2.imaginary);
		return temp;
	}
	public void add(Complex2 c)
	{
		if(c == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		real = real + c.real;
		imaginary = imaginary + c.imaginary;
	}
	public static Complex2 subtract(Complex2 c1, 
			Complex2 c2)
	{
		if(c1 == null || c2 == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		Complex2 temp = new Complex2(c1.real - c2.real,
				c1.imaginary - c2.imaginary);
		return temp;
	}
	public void subtract(Complex2 c)
	{
		if(c == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		real = real - c.real;
		imaginary = imaginary - c.imaginary;
	}
	public static Complex2 multiply(Complex2 c1, 
			Complex2 c2)
	{
		if(c1 == null || c2 == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		Complex2 temp = new Complex2(c1.real * c2.real -
				c1.imaginary * c2.imaginary, 
				c1.real * c2.imaginary +
				c1.imaginary * c2.real);
		return temp;
	}
	public void multiply(Complex2 c)
	{
		if(c == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		Complex temp = new Complex(real * c.real -
				imaginary * c.imaginary, 
				real * c.imaginary +
				imaginary * c.real);
		real = temp.getReal();
		imaginary = temp.getImaginary();
	}

}
