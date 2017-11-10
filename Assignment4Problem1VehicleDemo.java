package assignment4;

public class VehicleDemo 
{
	public static void main(String[] args)
	{
		Vehicle geo = new Vehicle();
		Vehicle jaguar = new Vehicle("Jaguar", 12, 
				new Person("John Doe"));
		Vehicle jaguarCopy = new Vehicle(jaguar);
		System.out.println("Test the Vehicle construtors: \n" + 
				"\nNo arg constructor: " + geo + "\n" + 
				"Three arg constructor: " + jaguar + "\n" + 
				"Copy constructor: " + jaguarCopy + "\n");
		System.out.println("Test the equality tests:\r\n" + 
				"\r\n" + 
				"jaguar == otherJaguar ? " + (jaguar == jaguarCopy) + 
				"\njaguar.equals(otherJaguar) ? " + 
				jaguar.equals(jaguarCopy) + 
				"\r\notherJaguar.equals(jaguar) ? " 
				+ jaguarCopy.equals(jaguar) 
				+ "\r\njaguar.equals(null) ? " + jaguar.equals(null) 
				+ "\r\njaguar.equals(geo) ? " + jaguar.equals(geo)
				+ "\r\njaguar.equals(\"jaguar\") ? " + 
				jaguar.equals("jaguar") + "\r\n");
		System.out.println("Test the getter and setter methods:\n");
		geo.setManufacturer("Geo");
		geo.setCylinders(2);
		geo.setOwner(new Person("Joe Smith"));
		System.out.println("After setters: " + geo 
				+ "\nGeo's manufacturer: " + geo.getManufacturer()
				+ "\nNumber of cylinders in a Geo: " 
				+ geo.getCylinders()
				+ "\r\nGeo's owner: " + geo.getOwner() + "\r\n");
		System.out.println("Try changing an owner's name:\n");
		jaguarCopy.setOwner(new Person("Jane Doe"));
		System.out.println("After changing otherJaguar's owner "
				+ "name:\n" + "jaguar: " + jaguar +
				"\notherJaguar: " + jaguarCopy + 
				"\notherJaguar.equals(jaguar): " + 
				jaguarCopy.equals(jaguar) + "\n");
		System.out.println("Test Trucks:\n");
		Truck chevy = new Truck();
		Truck ford = 
				new Truck("Ford", 8, new Person("John Doe"), 0.5, 2);
		Truck otherFord = new Truck(ford);
		Vehicle vFord = 
				new Vehicle("Ford", 8, new Person("John Doe"));
		System.out.println("No arg constructor: " + chevy + 
				"\r\nFive-arg constructor: " + ford + 
				"\r\nCreate a Vehicle vFord with Manufacuter: "
				+ "\"Ford\", number of cylinder: 8 Owner: John Doe"
				+ "\r\nVehicle vFord: " + vFord + "\r\n");
		System.out.println("Test equality:\r\n" + 
				"\r\n" + 
				"ford.equals(chevy) ? " + ford.equals(chevy) + 
				"\r\nford.equals(otherFord) ? " 
				+ ford.equals(otherFord) + "\r\nford.equals(vFord) ? "
				+ ford.equals(vFord) + "\r\nvFord.equals(ford) ? " 
				+ vFord.equals(ford) + "\r\nford.equals(null) ? "
				+ ford.equals(null) + "\r\n");
		System.out.println("Test getters and setters: ");
		chevy.setManufacturer("Chevrolet");
		chevy.setCylinders(6);
		chevy.setLoadCapacity(0.75);
		chevy.setTowCapacity(2);
		System.out.println("After setting fields, chevy: " + chevy +
				"\nChevy's towing capacity: " + chevy.getTowCapacity() 
				+ "\nChevy's load capacity: " + chevy.getLoadCapacity()
				+ "\nProcess completed.");
	}
}
