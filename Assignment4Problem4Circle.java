package assignment4package2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle extends Shape 
{
	private double radius;
	public Circle()
	{
		radius = 1;
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public Circle(Circle otherCircle)
	{
		this.radius = otherCircle.radius;
	}
	public void display()
	{
		System.out.println(this);
		area();
		perimeter();
	}
	public void getDimensions()
	{
		double temp = 0;
		do {
			System.out.println("Input for Circle - enter radius:");
			Scanner keyboard = new Scanner(System.in);
			temp = keyboard.nextDouble(); 
			if(temp > 0)
				radius = temp;
			else
				System.out.println("Invalid Entry");
		}while(temp <= 0);
	}
	public void perimeter()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Perimeter = " 
				+ formatterObject.format(perimeter));
	}
	public void area()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double area = Math.PI * radius * radius;
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
			 Circle otherCircle = (Circle)otherObject;
			return  radius == otherCircle.radius;
		}
	}
	public String toString()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		return "Shape = Circle  Radius = " 
						+ formatterObject.format(radius);
	}
}
