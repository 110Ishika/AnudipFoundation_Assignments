package Assignment_16B;

import java.util.Scanner;

class Calculate 
{
	public static int calculateSalary(int hours, int rate)
	{
        if(rate<0)
		{
			throw new ArithmeticException();
		}
		
		return hours*rate;
	}
	
	public static void  processEmployee(int hours, int rate)
	{
		try
		{
			System.out.println(calculateSalary(hours,rate));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Rate is negative");
			rate=10;
			System.out.println(rate);
		}
	}
	
}

public class Excep_Propagation {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int r=sc.nextInt();
		Calculate.processEmployee(h,r);
		sc.close();
		}

}
