package assignment3;

public class Elevator 
{
	private int floor;
	
	public Elevator()
	{
		floor = 1;
	}
	//Added so that class can be used as a static 
	//variable in other class definitions
	public Elevator(Elevator original)
	{
		if(original == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		this.floor = original.floor;
	}
	public int getFloor()
	{
		return floor;
	}
	public void moveToFloor(int floor)
	{
		if(this.floor != floor)
		{
			System.out.println("Starting at floor " 
					+ this.floor);
			if(this.floor < floor)
				for(int i = this.floor; i < floor; i++)
				{
					this.floor++;
					System.out.println(" Going up "
							+ "- now at floor " + this.floor);
				}
			else
				for(int i = this.floor; i > floor; i--)
				{
					this.floor--;
					System.out.println(" Going down "
							+ "- now at floor " + this.floor);
				}
			System.out.println("Stopping at floor " + this.floor);
		//If this.floor == floor, do nothing
		}
	}
	public boolean equals(Elevator otherElevator)
	{
		return this.floor == otherElevator.floor;
	}
	public String toString()
	{
		return floor + "";
	}
}
