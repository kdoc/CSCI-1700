package assignment4package2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ball extends Shape
{
	public double radius;
	
	public Ball()
	{
		radius = 0;
	}
	public Ball(double radius)
	{
		this.radius = radius;
	}
	public Ball(Ball otherBall)
	{
		this.radius = otherBall.radius;
	}
	public void display()
	{
		System.out.println(this);
		area();
		volume();
	}
	public void getDimensions()
	{
		double temp = 0;
		do {
			System.out.println("Input for Ball - enter radius:");
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
		//do nothing
	}
	public void area()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double area = 4*Math.PI*radius*radius;
		System.out.println("Surface area = " 
				+ formatterObject.format(area));
	}
	public void volume()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		double volume = (4.0/3.0)*Math.PI*radius*radius*radius;
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
			Ball otherBall = (Ball)otherObject;
			return radius == otherBall.radius;
		}
	}
	public String toString()
	{
		DecimalFormat formatterObject = 
				new DecimalFormat("#0.0########");
		return "Shape = Ball  Radius = " 
						+ formatterObject.format(radius);
	}
}
