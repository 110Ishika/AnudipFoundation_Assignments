package Assignment_16B;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	
	InvalidAgeException()
	{
		super();
		
	}
	
	InvalidAgeException(String msg)
	{
		super(msg);
	}
	
}



class Age
{
	public  void validateAge(int age) throws InvalidAgeException
	{
		if((age<0)||(age>120))
		{
			throw new InvalidAgeException("Not eligible"); 
		}
		else
			System.out.println("you r eligible");
	}
}
public class ValidateAge {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int age=sc.nextInt();
 Age a=new Age();
 try {
    a.validateAge(age);
 }
 catch(InvalidAgeException e)
 {
	 System.out.println(e.getMessage());
 }
 
      sc.close();

	}

}
