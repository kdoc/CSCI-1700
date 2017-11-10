package assignment4package2;

public abstract class Shape 
{
	//outputs the type and dimensions for an object of the class
	public abstract void display();
	//read the dimensions for an object of the class from the keyboard
	public abstract void getDimensions();
	//Calculate and display the perimeter of an object of a 
	//2-dimensional shape class; do nothing for an object of 
	//a 3-dimensional shape class.
	public abstract void perimeter();
	//Calculate and display the area of an object of a 2-dimensional 
	//shape class; calculate and display the surface area for an 
	//object of a 3-dimensional shape class.
	public abstract void area();
	//Calculate and display the volume of an object of a 3-dimensional 
	//shape class; do nothing for an object of a 2-dimensional shape 
	//class.
	public abstract void volume();
	
}
