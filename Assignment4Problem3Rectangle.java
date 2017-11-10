package assignment4;

public class Rectangle extends Figure
{
	private int width;
	
	public Rectangle() 
	{
		super(10, 16, 15);
		width = 5;
	}
	public Rectangle(int height, int width, int centerHorz, 
			int centerVert)
	{
		super(height, centerHorz, centerVert);
		this.width = width;
	}
	public Rectangle(Rectangle otherRectangle)
	{
		super(otherRectangle);
		this.width = otherRectangle.width;
	}
	//returns true if output is within bounds of screen
	protected boolean checkBounds()
	{
		return (super.checkBounds() 
				|| (getCenterHorz() - (width/2.0) < 0)
				|| (getCenterHorz() + (width/2.0) > screen[0].length));
	}	
	public void draw()
	{
		super.draw();
		if(checkBounds())
		{
			System.out.println("Fatal Error, rectangel out of bounds");
			System.exit(0);
		}
		for(int i = getCenterVert() + (getHeight()/2); 
				i >= getCenterVert() - (getHeight()/2); i--)
		{
			screen[i][getCenterHorz() - width/2] = '*';
			screen[i][getCenterHorz() + width/2] = '*';
		}
		for(int i = getCenterHorz() - (width/2); 
				i <= getCenterHorz() + (width/2); i++)
		{
			screen[getCenterVert() + getHeight()/2][i] = '*';
			screen[getCenterVert() - getHeight()/2][i] = '*';
		}
		for(int i = getCenterVert() + (getHeight()/2)-1; 
				i >= getCenterVert() - (getHeight()/2)+1; i--)
		{
			screen2[i][getCenterHorz() - width/2]++;
			screen2[i][getCenterHorz() + width/2]++;
		}
		for(int i = getCenterHorz() - (width/2); 
				i <= getCenterHorz() + (width/2); i++)
		{
			screen2[getCenterVert() + getHeight()/2][i]++;
			screen2[getCenterVert() - getHeight()/2][i]++;
		}
		showScreen();
	}
	public void erase()
	{
		super.erase();
		for(int i = getCenterVert() + (getHeight()/2)-1; 
				i >= getCenterVert() - (getHeight()/2)+1; i--)
		{
			screen2[i][getCenterHorz() - width/2]--;
			if(screen2[i][getCenterHorz() - width/2] == 0)
				screen[i][getCenterHorz() - width/2] = ' ';
			screen2[i][getCenterHorz() + width/2]--;
			if(screen2[i][getCenterHorz() + width/2] == 0)
				screen[i][getCenterHorz() + width/2] = ' ';
		}
		for(int i = getCenterHorz() - (width/2); 
				i <= getCenterHorz() + (width/2); i++)
		{
			screen2[getCenterVert() + getHeight()/2][i]--;
			if(screen2[getCenterVert() + getHeight()/2][i] == 0)
				screen[getCenterVert() + getHeight()/2][i] = ' ';
			screen2[getCenterVert() - getHeight()/2][i]--;
			if(screen2[getCenterVert() - getHeight()/2][i] == 0)
				screen[getCenterVert() - getHeight()/2][i] = ' ';
		}
		showScreen();
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
			return (super.equals(otherRectangle)
					&& width == otherRectangle.width);
		}
	}
	public String toString()
	{
		return ("Height: " + getHeight() + " Width: " + width + 
				"Center at " + "P( " + getCenterHorz() + " , " 
				+ getCenterVert() + ")");
	}
}
