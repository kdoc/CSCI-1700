package assignment5;

public class InsufficientFundsException extends Exception
{
	public InsufficientFundsException()
	{
		super("InsufficientFundsException: "
				+ "Insufficient funds to withdraw this amount.");
	}
	public InsufficientFundsException(String message)
	{
		super(message);
	}
}
