package assignment1;
/**
Problem 2
@authors Keith Docka, Isse Nur, Xavier Jackson
CSCI 1700-01
*/
public class ArcadeGame 
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
