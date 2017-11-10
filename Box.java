package assignment4package2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Box extends Shape
{
	private double height;
	private double width;
	private double length;
	public Box()
	{
		height = 0;
		width = 0;
		length = 0;
	}
	public Box(double height, double width, double length)
	{
		this.height = height;
		this.width = width;
		this.length = length;
	}
	public Box(Box otherBox)
	{
		this.height = otherBox.height;
		this.width = otherBox.width;
		this.length = otherBox.length;
	}
	public void display()
	{
		System.out.println(this);
		area();
		volume();
	}
	public void getDimensions()
	{
		double temp = 0, temp2 = 0, temp3 = 0;
		do {
			System.out.println("Input for Box "
					+ "- enter length, width, and height(separated by space):");
			Scanner keyboard = new Scanner(System.in);
			temp = keyboard.nextDouble(); 
			temp2 = keyboard.nextDouble();
			temp3 = keyboard.nextDouble();
			if(temp > 0 && temp2 > 0 && temp3 > 0)
			{
				length = temp;
				width = temp2;
				height = temp3;
			}
			else
				System.out.println("Invalid Entry");
		}while(temp < 0 || temp2 < 0 || temp3 < 0);

	}
	public void perimeter()
	{
		//do nothing
	}
	public void area()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double area = 2 * length * height 
				+ 2 * length * width
				+ 2* width * height;
		System.out.println("Surface area = " 
				+ formatterObject.format(area));
	}
	public void volume()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double volume = length * width * height;
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
			Box otherBox = (Box)otherObject;
			return length == otherBox.length
					&& width == otherBox.width
					&& height == otherBox.height;
		}
	}
	public String toString()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		return "Shape = Box  Length = " + 
			formatterObject.format(length) + " Width = " 
			+ formatterObject.format(width) + "\nHeight = " 
			+ formatterObject.format(height);

	}
}
