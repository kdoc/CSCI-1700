package assignment4;

public class Figure 
{
	private int height;
	private int centerHorz;
	private int centerVert;
	protected static char[][] screen = new char[25][80];
	protected static int[][] screen2 = new int[25][80];
	public Figure()
	{
		height = 0;
		centerHorz = 0;
		centerVert = 0;
	}
	public Figure(int height, int centerHorz, int centerVert)
	{
		if(checkBounds())
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		this.height = height;
		this.centerVert = centerVert;
		this.centerHorz = centerHorz;
	}
	public Figure(Figure otherFigure)
	{
		if(otherFigure == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		height = otherFigure.height;
		centerHorz = otherFigure.centerHorz;
		centerVert = otherFigure.centerVert;
	}
	public int getHeight()
	{
		return height;
	}
	public int getCenterHorz()
	{
		return centerHorz;
	}
	public int getCenterVert()
	{
		return centerVert;
	}
	public void setHeight(int newHeight)
	{
		if(newHeight >= 0)
			height = newHeight;
		else
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	public void setCenterHorz(int newCenterHorz)
	{
		if(newCenterHorz >= 0)
			centerHorz = newCenterHorz;
		else
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	public void setCenterVert(int newCenterVert)
	{
		if(newCenterVert >= 0)
			centerVert = newCenterVert;
		else
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	//returns true if shape reaches out of bounds
	protected boolean checkBounds()
	{
		return ((centerVert - (height/2) < 0)
				|| (centerVert + (height/2) > screen.length-1));
	}
	public static void showScreen()
	{
		for(int i = 0; i < screen.length; i++)
		{
			for(int i2 = 0; i2 < screen[i].length; i2++)
				System.out.print(screen[i][i2]);
			System.out.println();
		}
	}
	public void draw()
	{
		topBottomBorders();
	}
	
	public void erase()
	{
		topBottomBorders();
	}
	
	public void center()
	{
		topBottomBorders();
		erase();
		centerHorz = 40;
		centerVert = 13;
		draw();
	}
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			Figure otherFigure = (Figure)otherObject;
			return (height == otherFigure.height
					&& centerHorz == otherFigure.centerHorz
					&& centerVert == otherFigure.centerVert);
		}
	}
	protected void topBottomBorders()
	{
		for(int i = 0; i < screen[0].length; i++)
		{
			screen[0][i] = '-';
			screen[screen.length-1][i] = '-';
		}
	}
	public String toString()
	{
		return ( "Height: " + height + " Center at " + "P( " 
				+ centerHorz + " , " + centerVert + ")");
	}
}

