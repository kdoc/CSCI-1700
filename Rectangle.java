package assignment4package2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Rectangle extends Shape
{
	private double length;
	private double width;

	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	public Rectangle(Rectangle otherRectangle)
	{
		this.length = otherRectangle.length;
		this.width = otherRectangle.width;
	}
	public void display()
	{
		System.out.println(this);
		area();
		perimeter();
	}
	public void getDimensions()
	{
		double temp = 0, temp2 = 0;
		do {
			System.out.println("Input for Rectangle "
					+ "- enter length and width (separated by space):");
			Scanner keyboard = new Scanner(System.in);
			temp = keyboard.nextDouble(); 
			temp2 = keyboard.nextDouble();
			if(temp > 0 && temp2 > 0)
			{
				length = temp;
				width = temp2;
			}
			else
				System.out.println("Invalid Entry");
		}while(temp < 0 || temp2 < 0);
	}
	public void perimeter()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double perimeter =
				2*length + 2*width;
		System.out.println("Perimeter = " 
				+ formatterObject.format(perimeter));
	}
	public void area()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double area = length * width;
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
			Rectangle otherRectangle = (Rectangle)otherObject;
			return  length == otherRectangle.length
					&& width == otherRectangle.width;
		}
	}
	public String toString()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		return "Shape = Rectangle  Length = " 
						+ formatterObject.format(length) + 
				" Width = " + formatterObject.format(width);
	}
}
