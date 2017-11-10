package assignment4;

public class Truck extends Vehicle 
{
	private double loadCapacity;
	private int towCapacity;
	
	public Truck()
	{
		super();
		loadCapacity = 0;
		towCapacity = 0;
	}
	public Truck(String manufacturer, int cylinders, 
			Person owner, double loadCapacity, int towCapacity)
	{
		super(manufacturer, cylinders, owner);
		if(loadCapacity < 0 || towCapacity < 0)
		//negative values are illogical
		//0 if truck is broken
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		this.loadCapacity = loadCapacity;
		this.towCapacity = towCapacity;
	}
	public Truck(Truck otherTruck)
	{
		super(otherTruck);
		loadCapacity = otherTruck.loadCapacity;
		towCapacity = otherTruck.towCapacity;
	}
	public int getTowCapacity()
	{
		return towCapacity;
	}
	public double getLoadCapacity()
	{
		return loadCapacity;
	}
	public void setTowCapacity(int newCapacity)
	{
		if(newCapacity < 0)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		towCapacity = newCapacity;
	}
	public void setLoadCapacity(double newCapacity)
	{
		if(newCapacity < 0)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		loadCapacity = newCapacity;
	}
	public String toString()
	{
		return super.getManufacturer() + " (" + super.getCylinders() +
				" cylinders, " + loadCapacity + " ton load, "
				+ towCapacity + " ton towing capacity) owned by "
				+ super.getOwner();
	}
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			Truck otherTruck = (Truck)otherObject;
			return super.equals(otherTruck)
					&& loadCapacity == otherTruck.loadCapacity
					&& towCapacity == otherTruck.towCapacity;
		}
	}
	public Truck clone()
	{
		return new Truck(this);
	}
}
