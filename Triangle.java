package assignment4;

public class Triangle extends Figure 
{
	public Triangle() 
	{
		super(9, 16, 6);
	}
	public Triangle(int height, int centerHorz, int centerVert)
	{
		super(height, centerHorz, centerVert);
	}
	public Triangle(Triangle otherTriangle)
	{
		super(otherTriangle);
	}
	//returns true if triangle reaches out of bounds
	protected boolean checkBounds()
	{
		return (super.checkBounds() || 
				(getCenterHorz() - getHeight()) < 0
				|| (getCenterHorz() + getHeight()) > 
				screen[0].length);
	}
	public void draw()
	{
		super.draw();
		if(checkBounds())
		{
			System.out.println("Fatal Error, Triangle out of bounds");
			System.out.println(" h: " + getHeight() + ""
					+ " center at P(" + getCenterHorz() + " , " 
					+ getCenterVert() + ")");
			System.exit(0);
		}
		int control = 0;
		if(getHeight()%2==0)
			for(int i = getCenterHorz()-getHeight(); 
					i <= getCenterHorz() + getHeight(); i++)
			{
				screen2[getCenterVert()+getHeight()/2][i]++;
				screen[getCenterVert()+getHeight()/2][i] = '*';
			}
		else
			for(int i = getCenterHorz()-getHeight()+1; 
					i <= getCenterHorz() + getHeight()-1; i++)
			{
				screen2[getCenterVert()+(getHeight())/2][i]++;
				screen[getCenterVert()+(getHeight())/2][i] = '*';
			}
		for(int i = getCenterVert() - getHeight()/2;
				i < getCenterVert() + getHeight()/2; i++)
		{
			screen2[i][getCenterHorz()-control]++;
			screen[i][getCenterHorz()-control] = '*';
			screen2[i][getCenterHorz()+control]++;
			screen[i][getCenterHorz()+control] = '*';			
			control++;
		}
		showScreen();
	}
	public void erase()
	{
		super.erase();
		if(checkBounds())
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		int control = 0;
		if(getHeight()%2==0)
			for(int i = getCenterHorz()-getHeight(); 
					i <= getCenterHorz() + getHeight(); i++)
			{
				screen2[getCenterVert()+getHeight()/2][i]--;
				if(screen2[getCenterVert()+getHeight()/2][i] == 0)
					screen[getCenterVert()+getHeight()/2][i] = ' ';
			}
		else
			for(int i = getCenterHorz()-getHeight()+1; 
					i <= getCenterHorz() + getHeight()-1; i++)
			{
				screen2[getCenterVert()+(getHeight())/2][i]--;
				if(screen2[getCenterVert()+(getHeight())/2][i] == 0)
					screen[getCenterVert()+(getHeight())/2][i] = ' ';
			}
		for(int i = getCenterVert() - getHeight()/2;
				i < getCenterVert() + getHeight()/2; i++)
		{
			screen2[i][getCenterHorz()-control]--;
			if(screen2[i][getCenterHorz()-control] == 0)
				screen[i][getCenterHorz()-control] = ' ';
			screen2[i][getCenterHorz()+control]--;
			if(screen2[i][getCenterHorz()+control] == 0)
				screen[i][getCenterHorz()+control] = ' ';			
			control++;
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
			Triangle otherTriangle = (Triangle)otherObject;
			return (super.equals(otherTriangle));
		}
	}
}
