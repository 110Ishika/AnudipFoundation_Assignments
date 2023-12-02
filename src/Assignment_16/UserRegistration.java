package Assignment_16;

import java.util.Scanner;

class InvalidCountryException extends Exception 
{
	InvalidCountryException()
	{
		super();
		
	}
	InvalidCountryException(String massage)
	{
		super(massage);
	}
	
}
public class UserRegistration
{
	
	public void registerUser(String username,String userCountry)
	{
		try {
		if(!(userCountry.equalsIgnoreCase("India")))
				{
			 throw new InvalidCountryException("User Outside India cannot be registered");
				}
		else
		{
			System.out.println("you are eligible");
		}
	}
		catch(InvalidCountryException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		
     UserRegistration r=new UserRegistration();
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     String name=sc.next();
     r.registerUser(s,name);
     //r.registerUser("tom","uk");

	}
}
