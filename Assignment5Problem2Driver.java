package assignment5;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Problem2Driver 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String prompt = null;
		double amount = 0;
		Account a = null;
		System.out.println("--------------------"
				+ "Configuration: <Default>------"
				+ "--------------");
		do 
		{
			System.out.println("Do you want to "
					+ "open an account, deposit, "
					+ "or withdraw?\n\nEnter O for "
					+ "open an account, D for deposit,"
					+ " W for withdraw:\n");
			prompt = keyboard.next();
			prompt.toLowerCase();
			try 
			{
				switch(prompt)
				{
				case "o":
					keyboard.nextLine();
					System.out.println("Enter the initial deposit "
							+ "for your new account:");
					amount = keyboard.nextDouble();
					a = new Account(amount);
					System.out.println(a);
					break;
				case "d":
					keyboard.nextLine();
					System.out.println("Enter the amount to deposit: ");
					amount = keyboard.nextDouble();
					a.deposit(amount);
					System.out.println(a);
					break;
				case "w":
					keyboard.nextLine();
					System.out.println("Enter the amount to withdraw: ");
					amount = keyboard.nextDouble();
					a.withdraw(amount);
					System.out.println(a);
					break;
				default:
					System.out.println("Invalid selection!");
					break;
				}
			}
			catch(NonPositiveNumberException e)
			{
				keyboard.nextLine();
				System.out.println(e.getMessage());
				if(prompt.equals("d") || prompt.equals("o"))
					System.out.println("Deposit amount must be positive");
				else
					System.out.println("Withdrawl amount must be positive");
				while(amount < 0)
				{
					System.out.println("Enter a positive number:");
					amount = keyboard.nextDouble();
				}
				if(prompt.equals("d"))
				{
					try
					{
						a.deposit(amount);
					}
					catch(NonPositiveNumberException e2)
					{
						//to keep compiler happy
					}
				}
				else if(prompt.equals("o"))
					try 
					{
						a = new Account(amount);
					}
					catch(NonPositiveNumberException e2)
					{
						//to keep compiler happy
					}
				else
				{
					try
					{
						a.withdraw(amount);
					}
					catch(NonPositiveNumberException e3)
					{
						//to keep compiler happy
					}
					catch(InsufficientFundsException e4)
					{
						keyboard.nextLine();
						System.out.println("Not enough money.");
						System.out.println(e4.getMessage());
						System.out.println(a);
					}
				}
				System.out.println(a);
			}
			catch(InsufficientFundsException e5)
			{
				keyboard.nextLine();
				System.out.println("Not enough money.");
				System.out.println(e5.getMessage());
				System.out.println(a);
			}
			catch(InputMismatchException e6)
			{
				keyboard.nextLine();
				System.out.println("Invalid Input, "
						+ "returning to main menu.");
			}
			catch(NullPointerException e7)
			{
				keyboard.nextLine();
				System.out.println("No account selected.\n"
						+ "Open new account first.");
			}
			catch(Exception e8)
			{
				System.out.println("Unknown Error, "
						+ "aborting program.");
				keyboard.close();
				System.exit(0);
			}
			System.out.println("More banking? answer Y to continue, N to exit");
			String temp = keyboard.next();
			temp.toLowerCase();
			while(!(temp.equals("y") || temp.equals("n")))
			{
				System.out.println("Invalid entry, "
						+ "please reenter.");
				temp = keyboard.next();
			}
			prompt = temp;
		}while(prompt.equalsIgnoreCase("y"));
		System.out.println("Process completed.");
		keyboard.close();
	}
}
