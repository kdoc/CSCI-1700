package assignment4;

public class Vehicle 
{
	private String manufacturer;
	private int cylinders;
	private Person owner;
	
	public Vehicle()
	{
		manufacturer = "Unknown";
		cylinders = 0;
		owner = new Person();
	}
	public Vehicle(String manufacturer, int cylinders, Person owner)
	{
		this.manufacturer = manufacturer;
		this.cylinders = cylinders;
		if(owner == null)
			this.owner = new Person();	
		else
			this.owner = new Person(owner);
	}
	public Vehicle(Vehicle otherVehicle)
	{
		if(otherVehicle == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		manufacturer = otherVehicle.manufacturer;
		cylinders = otherVehicle.cylinders;
		owner = new Person(otherVehicle.owner);
	}
	public String getManufacturer()
	{
		return manufacturer;
	}
	public int getCylinders()
	{
		return cylinders;
	}
	public Person getOwner()
	{
		return new Person(owner);
	}
	public void setManufacturer(String manufacturer)
	{
		if(manufacturer == null)
			this.manufacturer = "Unknown";
		this.manufacturer = manufacturer;
	}
	public void setCylinders(int cylinders)
	{
		if(cylinders < 0)
		//0 cylinders for electric
		//negative cylinders is illogical
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		this.cylinders = cylinders;
	}
	public void setOwner(Person newOwner)
	{
		if(newOwner == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		owner = new Person(newOwner);
	}
	public String toString()
	{
		return manufacturer + " (" + cylinders + " "
				+ "cylinders) owned by " + owner;
	}
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			Vehicle otherVehicle = (Vehicle)otherObject;
			return (manufacturer.equals(otherVehicle.manufacturer)
					&& cylinders == otherVehicle.cylinders
					&& owner.equals(otherVehicle.owner));
		}
	}
	public Vehicle clone()
	{
		return new Vehicle(this);
	}
}
