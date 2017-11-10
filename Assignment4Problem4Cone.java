package assignment4package2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cone extends Shape
{
	private double height;
	private double radius;
	public Cone()
	{
		height = 0;
		radius = 0;
	}
	public Cone(double radius, double height)
	{
		this.height = height;
		this.radius = radius;
	}
	public Cone(Cone otherCone)
	{
		this.height = otherCone.height;
		this.radius = otherCone.radius;
	}
	public void display()
	{
		System.out.println(this);
		area();
		volume();
	}
	public void getDimensions()
	{
		double temp = 0, temp2 = 0;
		do {
			System.out.println("Input for Cone - enter radius and height"
					+ "(seperated by space):");
			Scanner keyboard = new Scanner(System.in);
			temp = keyboard.nextDouble();
			temp2 = keyboard.nextDouble(); 
			if(temp > 0 && temp2 > 0)
			{
				radius = temp;
				height = temp2;
			}
			else
				System.out.println("Invalid Entry");
		}while(temp <= 0 || temp2 <= 0);
	}
	public void perimeter()
	{
		//do nothing
	}
	public void area()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double area = Math.PI*radius*(radius + 
				Math.sqrt(height*height + radius*radius));
				
		System.out.println("Surphase area = " 
				+ formatterObject.format(area));
	}
	public void volume()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double volume = (1.0/3.0)*Math.PI*radius*radius*height;
		System.out.println("Volume = " 
				+ formatterObject.format(volume));
	}
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			Cone otherCone = (Cone)otherObject;
			return radius == otherCone.radius
					&& height == otherCone.height;
		}
	}
	public String toString()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		return "Shape = Cone  Radius = " 
						+ formatterObject.format(radius)
						+ " Height = " 
						+ formatterObject.format(height);
	}
}
