package assignment4package2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Can extends Shape
{
	private double radius;
	private double height;

	public Can()
	{
		radius = 0;
		height = 0;
	}
	public Can(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	public Can(Can otherCan)
	{
		this.radius = otherCan.radius;
		this.height = otherCan.height;
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
			System.out.println("Input for Can - enter radius and height"
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
		double area = 2*Math.PI*radius*(radius + height);
		System.out.println("Surface area = " 
				+ formatterObject.format(area));
	}
	public void volume()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double volume = Math.PI*radius*radius*height;
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
			 Can otherCan = (Can)otherObject;
			return  radius == otherCan.radius
					&& height == otherCan.height;
		}
	}
	public String toString()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		return "Shape = Can Radius = " 
						+ formatterObject.format(radius) 
						+ " Height = " 
						+ formatterObject.format(height);
	}
}
