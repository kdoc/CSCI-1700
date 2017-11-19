package assignment5;

public class DenominatorIsZeroException extends Exception 
{
	public DenominatorIsZeroException()
	{
		super("The denominator should not be set to zero.");
	}
	public DenominatorIsZeroException(String message)
	{
		super(message);
	}
}
