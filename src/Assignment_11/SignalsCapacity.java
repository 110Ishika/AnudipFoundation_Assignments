package Assignment_11;

import java.util.Scanner;

public class SignalsCapacity {
    public static int[] findPower(int arr[])
    {
    	int power[]=new int[arr.length];
    	power[0]=1;
    	int j=0;
    	for(int i=1;i<arr.length;i++)
    	{
    		int count=0;
    		j=i-1;
    		while(j>=0)
    		{
    			if(arr[j]<arr[i])
    			{
    				count++;
    			}
    			else
    			{
    				break;
    			}
    			j--;
    		}
    		power[i]=count+1;
    		
    	}
    	
		return power;
    	
    }
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of test cases ");
		int testCase=sc.nextInt();
		
		for(int i=0;i<testCase;i++)
		{
			System.out.println("Enter the size for case :"+(i+1));
			int a=sc.nextInt();
			int arr[]=new int[a];
			for(int j=0;j<a;j++)
			{
			arr[j]=sc.nextInt();	
			}
			arr=findPower(arr);
			for(int b:arr)
				System.out.println(b);
			
		}
sc.close();
}

}
