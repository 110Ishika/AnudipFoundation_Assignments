package Assignment_16;

import java.util.Scanner;

public class InSufficientFundsException extends RuntimeException{
	
	InSufficientFundsException()
	{
		super();
		
	}
	InSufficientFundsException(String massage)
	{
		super(massage);
	}


}


class Account
{
	String accountNumber;
	double balance=100000;
	
	
	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
		
	}

	void deposit(double amount)
	{
		balance=balance+amount;
			
	}
	
	double withdraw(double amount)
	{
		try
		{
			if(amount<=balance)
			{
				balance=balance-amount;
		
			    System.out.println("Balance left:  " +(balance-amount));
		}
		else
		{
			throw new InSufficientFundsException("Insufficient Fund in your Account");
			
		}
		}
		catch(InSufficientFundsException e)
		{
			System.out.println(e.getMessage());
		}

		return balance;
	}
	
	
}

class AccountDemo
{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double d=sc.nextDouble();
		Account acc=new Account("210008901");
		acc.deposit(d);
		acc.withdraw(10000);
	
	sc.close();
	}
	
}

