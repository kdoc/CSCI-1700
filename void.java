package newProject2;

public class videoGameMachine 
{
	public static void main(String[] args)
	{
		int coupons = 25, candyBar = 0, gumBall = 0, remainder = 0;
		candyBar = coupons / 10;
		gumBall = (coupons % 10) / 3;
		remainder = ((coupons % 10) % 3);
		System.out.printf("Your %d coupons can be redeemed for %d candy bars and %d gumballs with"
				           + " %d coupons leftover.%n", coupons, candyBar, gumBall, remainder);
	}

}
