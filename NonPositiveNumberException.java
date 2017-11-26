package assignment5;

public class NonPositiveNumberException extends Exception
{
	public NonPositiveNumberException()
	{
		super("NonPositiveNumberException: ");
	}
	public NonPositiveNumberException(String message)
	{
		super(message);
	}
}
