package assignment3;

import java.text.DecimalFormat;

public class Complex 
{
	private double real;
	private double imaginary;
	
	public Complex()
	{
		setComplex( 0, 0);
	}
	public Complex(double realPart)
	{
		setComplex( realPart, 0);
	}
	public Complex(double realPart, double imaginaryPart)
	{
		setComplex(realPart, imaginaryPart);
	}
	public Complex(Complex original)
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
	public void setComplex(double realPart, double imaginaryPart)
	{
		real = realPart;
		imaginary = imaginaryPart;
	}
	public boolean equals(Complex otherComplex)
	{
		if(otherComplex == null)
			return false;
		return (real == otherComplex.real &&
				imaginary == otherComplex.imaginary);
	}
	public String toString()
	{
		DecimalFormat formatterObject = new DecimalFormat("0.0");
		return formatterObject.format(real) + " + " 
				+ formatterObject.format(imaginary) + "i";
	}
	public static Complex add(Complex c1, Complex c2)
	{
		if(c1 == null || c2 == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		Complex temp = new Complex(c1.real + c2.real,
				c1.imaginary + c2.imaginary);
		return temp;
	}
	public Complex add(Complex c)
	{
		if(c == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		Complex temp = new Complex(real + c.real,
				imaginary + c.imaginary);
		return temp;
	}
	public static Complex subtract(Complex c1, Complex c2)
	{
		if(c1 == null || c2 == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		Complex temp = new Complex(c1.real - c2.real,
				c1.imaginary - c2.imaginary);
		return temp;
	}
	public Complex subtract(Complex c)
	{
		if(c == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		Complex temp = new Complex(real - c.real,
				imaginary - c.imaginary);
		return temp;
	}
	public static Complex multiply(Complex c1, Complex c2)
	{
		if(c1 == null || c2 == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		Complex temp = new Complex(c1.real * c2.real -
				c1.imaginary * c2.imaginary, 
				c1.real * c2.imaginary +
				c1.imaginary * c2.real);
		return temp;
	}
	public Complex multiply(Complex c)
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
		return temp;
	}

}
