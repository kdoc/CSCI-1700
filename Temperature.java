package assignment2;

public class Temperature 
{
	private double degrees;
	private char scale;
	
	public Temperature()
	{
		
	}
	public Temperature(double degrees, char scale)
	{
		setTemperature(degrees, scale);
	}
	public Temperature(double degrees)
	{
		setTemperature(degrees);
	}
	public Temperature(char scale)
	{
		setTemperature(scale);
	}
	private void changeCase(char scale)
	{
		//Checks input and changes case of scale character
		if(scale == 'c' || scale == 'C' || scale == 'f' || scale == 'F')
		{
			switch(scale)
			{
				case 'c':
					scale = 'C';
					break;
				case 'f':
					scale = 'F';
					break;
			}
			this.scale = scale;
		}
		else
		{
			System.out.println("Critical failure.");
			System.exit(0);
		}
	
	}
	public void setTemperature(double degrees, char scale)
	{
		this.degrees = degrees;
		this.changeCase(scale);
		
	}
	public void setTemperature(double degrees)
	{
		this.degrees = degrees;
		this.scale = 'C';
	}
	public void setTemperature(char scale)
	{
		this.degrees = 0;
		this.changeCase(scale);
	}
	public double getDegreesC()
	{
		//returns value in Celsius rounded to nearest 10th
		if(scale == 'C')
			return (Math.round(degrees*10)/10.0);
		else
			return (Math.round((5*(degrees-32)/9)*10)/10.0);
	}
	public double getDegreesF()
	{
		//returns value in Fahrenheit rounded to nearest 10th
		if(scale == 'F')
			return (Math.round(degrees*10)/10.0);
		else
			return (Math.round((9*(degrees/5)+32)*10)/10.0);
	}
	public char getScale()
	{
		return scale;
	}
	public boolean equals(Temperature otherTemperature)
	{
		if(this.scale == otherTemperature.scale)
			return(this.degrees == otherTemperature.degrees);
		else
		{
			if(this.scale == 'C')
				return (this.degrees == 5*(otherTemperature.degrees-32)/9);
			else
				return (this.degrees == 9*(otherTemperature.degrees/5)+32);
		}
	}
	public boolean isGreaterThan(Temperature otherTemperature)
	{
		//Checks if argument object is greater than calling object
		if(this.scale == otherTemperature.scale)
			return(this.degrees > otherTemperature.degrees);
		else
		{
			if(this.scale == 'C')
				return (this.degrees > 5*(otherTemperature.degrees-32)/9);
			else
				return (this.degrees > 9*(otherTemperature.degrees/5)+32);
		}
	}
	public boolean isLessThan(Temperature otherTemperature)
	{
		//Checks if argument object is less than calling object
		if(this.scale == otherTemperature.scale)
			return(this.degrees < otherTemperature.degrees);
		else
		{
			if(this.scale == 'C')
				return (this.degrees < 5*(otherTemperature.degrees-32)/9);
			else
				return (this.degrees < 9*(otherTemperature.degrees/5)+32);
		}
		
	}
	public String toString()
	{
		return (this.degrees+""+this.scale);
	}
}
