package assignment5;

import java.text.NumberFormat;
import java.util.Locale;

public class Account 
{
	private double balance;
	public Account()
	{
		balance = 0;
	}
	public Account(double initialDeposit) 
			throws NonPositiveNumberException
	{
		if(initialDeposit > 0)
			balance = initialDeposit;
		else
			throw new NonPositiveNumberException();
	}
	public double getBalance()
	{
		return balance;
	}
	public double deposit(double amount) 
			throws NonPositiveNumberException
	{
		if(amount > 0)
			balance += amount;
		else
			throw new NonPositiveNumberException();
		return balance;
	}
	public double withdraw(double amount) 
			throws InsufficientFundsException,
			NonPositiveNumberException
	{
		if(amount > balance) 
			throw new InsufficientFundsException();
		else if(amount < 0)
			throw new NonPositiveNumberException();
		else
			balance -= amount;
		return balance;
	}
	public String toString()
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		return "Your account balance: " + formatter.format(balance);
	}
}
