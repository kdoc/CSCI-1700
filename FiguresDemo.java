package assignment4;

public class FiguresDemo 
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		for(int i = 0; i < 20; i++)
			System.out.print("-");
		System.out.print("Configuration: <Default>");
		for(int i = 0; i < 20; i++)
			System.out.print("-");
		System.out.println("\nTesting the draw() methods");
		t.draw();
		System.out.println("End of draw() method for Triangle");
		r.draw();
		System.out.println("End of draw() method for Rectangle");
		System.out.println("Testing the center() methods");
		t.center();
		System.out.println("End of center() method for Triangle");
		r.center();
		System.out.println("End of center() method for Rectangle");
		System.out.println("Testing the erase() methods");
		t.erase();
		System.out.println("End of erase() method for Triangle");
		r.erase();
		System.out.println("End of erase() method for Rectangle");
		System.out.println("\nProcess completed.");
	}
}
