package assignment3;

public class HotDogStand 
{
	public static int totalSold = 0;
	
	private int id;
	private int numberSold;
	
	public HotDogStand()
	{
		setHotDogStand( 0, 0);
	}
	
	public HotDogStand(int id)
	{
		setHotDogStand( id, 0);
	}
	
	public HotDogStand(int id, int numberSold)
	{
		setHotDogStand( id, numberSold);
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setHotDogStand(int id, int numberSold)
	{
		this.id = id;
		if(numberSold >= 0)
		{
			this.numberSold = numberSold;
			totalSold += numberSold;
		}
		else
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	public int getId()
	{
		return id;
	}
	public int getNumberSold()
	{
		return numberSold;
	}
	public static int getTotalSold()
	{
		return totalSold;
	}
	public void justSold()
	{
		numberSold++;
		totalSold++;
	}
	public boolean equals(HotDogStand otherStand)
	{
		return (this.id == otherStand.id &&
				this.numberSold == otherStand.numberSold);
	}
	public String toString()
	{
		return "Stand " + id + " sold " + numberSold;
	}
	public static void main(String[] args)
	{
		HotDogStand s1, s2, s3;
		s1 = new HotDogStand();
		s2 = new HotDogStand( 2, 0);
		s3 = new HotDogStand( 3, 0);
		s1.setId( 1);
		s1.justSold();
		s2.justSold();
		s1.justSold();
		System.out.printf("%s%n%s%n%s%n"
				+ "Total sold = %d%n"
				, s1.toString(),
				s2.toString(),
				s3.toString(),
				getTotalSold());
		s3.justSold();
		s1.justSold();
		System.out.printf("%s%n%s%n%s%n"
				+ "Total sold = %d%n"
				, s1.toString(),
				s2.toString(),
				s3.toString(),
				getTotalSold());
		System.out.println("Process completed");
	}
	

}
