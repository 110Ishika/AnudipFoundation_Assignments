package Assignment_13;

import java.util.Scanner;

class Hotel {

}

class TajHotel extends Hotel
{
	
	public  String toString()
	{
		return "Taj Hotel";
	}

	
}

class RoadSideHotel extends Hotel
{
	public  String toString()
	{
		return "Road Side Hotel";
	}
	
	
}

class Demo
{
	public Hotel provideFood(int amount)
	{
		if(amount>1000)
		{
			return(new TajHotel());
		}
		else if(amount>200 && amount<1000)
		{
		return(new RoadSideHotel());	
		}
		else
		 return null;
	}
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		Demo d=new Demo();
		if(amount>1000)
		{
			System.out.println( d.provideFood(amount));
		}
		else if(amount>200 && amount<1000)
		{
			System.out.println( d.provideFood(amount));	
		}
		else
		{
			System.out.println("Enter a valid amount");
		}
	sc.close();
	}
	
}