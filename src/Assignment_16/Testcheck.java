package Assignment_16;

import java.util.Scanner;

class InsufficientFund extends RuntimeException//RuntimeException unchecked Exception
{
	InsufficientFund()
	{
		super();
		
	}
	InsufficientFund(String massage)
	{
		super(massage);
	}


	
}

 class Account123{
	 
	 String Accountnumber;
	 Double balance;
	 Account123(String Accountn,double d)
	 {
		Accountnumber=Accountn;
		balance=d;
	 }
	 public void deposit(int a)
	 {
		balance=balance+a;
		System.out.println("your current balance  "+balance);
		
	 }
	 public void withdraw(double a) throws InsufficientFund
	 {
		 if(a<=balance)
		 {
			 balance=balance-a;
			System.out.println("Withdraw successful amount left: "+  balance); 
		 }
		 else
		 {
			throw new InsufficientFund("Insufficient Fund withdraw not possible"); 
		 }
	 }
	 
	 
 }


public class Testcheck {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
Account123 acc=new Account123("210000899",a);
double w=sc.nextDouble();
try
{
acc.withdraw(w);
}
catch(InsufficientFund f)
{
System.out.println(f.getMessage());	
}
System.out.println("yes done");
}
}
