package Assign_08;
import java.util.Scanner;


public class ApplyBasicMath {
	
	public static int getIndex(int arr[])
	{
		int sum=0;
		int sml=arr[0];
		int pos=-1;
		
		for(int i=0;i<arr.length;i++)
		{
	     sum+=arr[i];
	     
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if((sum-arr[i])%7==0)
			{
				if(sml>=arr[i])
				{
					sml=arr[i];
					 pos=i+1;
				}
		}
		}
	return pos;
	}
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]= sc.nextInt();
		}
	 
		System.out.println(ApplyBasicMath.getIndex(arr));
		
         sc.close();		
}

}



