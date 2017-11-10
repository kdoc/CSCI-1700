package assignment4;

public class Person 
{
	private String name;
	
	public Person()
	{
		name = "nobody";
	}
	public Person(String theName)
	{
		name = theName;
	}
	public Person(Person theObject)
	{
		if(theObject == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		name = theObject.name;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String theName)
	{
		name = theName;
	}
	public String toString()
	{
		return name;
	}
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			Person otherPerson = (Person)otherObject;
			return (name.equals(otherPerson.name));
		}
	}
	public Person clone()
	{
		return new Person(this);
	}
}
