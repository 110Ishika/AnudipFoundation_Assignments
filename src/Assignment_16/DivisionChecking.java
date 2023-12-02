package Assignment_16;

import java.util.Scanner;

class ArithmaticTesting extends Exception{
	
	ArithmaticTesting()
	{
		super();
		
	}
	
	ArithmaticTesting(String s)
	{
		super(s);
	}

}


public class DivisionChecking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
		if((a/b)==0)
		{
			throw new ArithmaticTesting("DivideByZeroException caught");
		}
		else
		{
			System.out.println("");
		}
			
		}
    catch(ArithmaticTesting e)
		{
			
		System.out.println(e.getMessage());	
		}
	finally
	{
		System.out.println("Inside finally block");
	}
		
		sc.close();
	}

}
