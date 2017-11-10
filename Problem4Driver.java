package assignment4package2;

import java.util.Scanner;

public class Problem4Driver 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Shape[] array = new Shape[20];
		String prompt = "y";
		int control = 0;
		do {
			System.out.println("It is time "
					+ "to enter your shape "
					+ "selection and "
					+ "dimensions.\n" + 
					"Enter the number of the "
					+ "shape type:\n" + 
					"   1 - Rectangle\n" + 
					"   2 - Circle\n" + 
					"   3 - Triangle\n" + 
					"   4 - Box\n" + 
					"   5 - Can\n" + 
					"   6 - Cone\n" + 
					"   7 - Ball\n" + 
					"=>");
			int sel;
			do {
				sel = keyboard.nextInt();
				switch(sel)
				{
				case 1:
					Rectangle r = new Rectangle();
					r.getDimensions();
					array[control] = r;
					control++;
					break;
				case 2:
					Circle ci = new Circle();
					ci.getDimensions();
					array[control] = ci;
					control++;
					break;
				case 3:
					Triangle t = new Triangle();
					t.getDimensions();
					array[control] = t;
					control++;
					break;
				case 4:
					Box b = new Box();
					b.getDimensions();
					array[control] = b;
					control++;
					break;
				case 5:
					Can ca = new Can();
					ca.getDimensions();
					array[control] = ca;
					control++;
					break;
				case 6:
					Cone co = new Cone();
					co.getDimensions();
					array[control] = co;
					control++;
					break;
				case 7:
					Ball ba = new Ball();
					ba.getDimensions();
					array[control] = ba;
					control++;
					break;
				default:
					System.out.println("Invalid Entry"
								+ "\nPlease Reenter");
					break;
				}
			}while(sel < 1 && sel > 7);
			System.out.println("Select another shape? (y or n): ");
			prompt = keyboard.next();
			keyboard.nextLine();
		}while(prompt.equalsIgnoreCase("y") && control < array.length - 1);
		System.out.println("Next, a display of your selected shapes, "
				+ "dimensions. and other data\n");
		for(int i = 0; i < control; i++)
		{
			array[i].display();
			System.out.println();
		}
		System.out.println("End of the program\n" + 
				"\nProcess completed.\n");
	}
}
