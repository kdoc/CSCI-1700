package assignment4package2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle extends Shape
{
	private double side1;
	private double side2;
	private double side3;
	public Triangle()
	{
		side1 = 0;
		side2 = 0;
		side3 = 0;
	}
	public Triangle(double side1, double side2, double side3)
	{
		if(triangleOK(side1,side2,side3))
		{
			this.side1 = side1; 
			this.side2 = side2;
			this.side3 = side3;
		}
		else
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	public Triangle(Triangle otherTriangle)
	{
		this.side1 = otherTriangle.side1; 
		this.side2 = otherTriangle.side2;
		this.side3 = otherTriangle.side3;
	}
	public void display()
	{
		System.out.println(this);
		area();
		perimeter();
	}
	private boolean triangleOK(double a, double b, double c)
	{
		double sumOfAngles = Math.acos((b*b+c*c-a*a)/(2*b*c)) 
				+ Math.acos((a*a+c*c-b*b)/(2*a*c)) 
				+ Math.acos((b*b+a*a-c*c)/(2*b*a));
		return Math.round(sumOfAngles*(180.0/Math.PI)) == 180;
	}
	public void getDimensions()
	{
		double temp = 0, temp2 = 0, temp3 = 0;
		do {
			System.out.println("Input for Triangle "
					+ "- enter three side lengths(Seperated by space):");
			Scanner keyboard = new Scanner(System.in);
			temp = keyboard.nextDouble(); 
			temp2 = keyboard.nextDouble();
			temp3 = keyboard.nextDouble();
			if(temp > 0 && temp2 > 0 && temp3 > 0
					&& triangleOK(temp, temp2,temp3))
			{
				side1 = temp;
				side2 = temp2;
				side3 = temp3;
			}
			else
				System.out.println("Invalid Entry");
		}while(temp < 0 || temp2 < 0 || temp3 < 0 
				|| !triangleOK(temp, temp2,temp3));
	}
	public void perimeter()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double perimeter = side1 + side2 + side3;
		System.out.println("Perimeter = " + formatterObject.format(perimeter));
	}
	public void area()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double s = 0.5*(side1 + side2 + side3);
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));    
		System.out.println("Area = " 
				+ formatterObject.format(area));
	}
	public void volume()
	{
		//do nothing
	}
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			Triangle otherTriangle = (Triangle)otherObject;
			return  side1 == otherTriangle.side1
					&& side2 == otherTriangle.side2
					&& side3 == otherTriangle.side3;
		}
	}
	public String toString()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		return "Shape = Triangle  Side 1 = " + 
		formatterObject.format(side1) + 
				" Side 2 = " + 
				formatterObject.format(side2) + 
				" \nSide3 = " + formatterObject.format(side3);
	}
}
