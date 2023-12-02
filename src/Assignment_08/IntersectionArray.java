package Assignment_08;

import java.util.Scanner;

public class IntersectionArray {
	
	static void getMatchedArray(int arr1[],int arr2[],int n)
	{
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
		if(arr1[i]==arr2[j])
		{
		System.out.println(arr1[i]);
		
		}
		}
		}
		
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];

		for(int i=0;i<n;i++)
		{
		arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		arr2[i]=sc.nextInt();
		}
		IntersectionArray.getMatchedArray(arr1, arr2,n);
		
    sc.close();
	}

}
