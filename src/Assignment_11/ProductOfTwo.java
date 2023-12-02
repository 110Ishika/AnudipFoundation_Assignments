package Assignment_11;

//import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;


public class ProductOfTwo {
	
	static void findProduct(int array[],int k)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
        

		for(int i=0;i<array.length;i++)
		{
		if(map.containsValue(k/array[i])  &&  k/array[i]*array[i]==k)	
		{
		System.out.println(map.get(k/array[i])+ " " + (i+1));	
		}
		else
		{
			map.put(array[i],i+1);
		}
		}
	
	}
	

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);

	int size=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[size];
	for(int j=0;j<arr.length;j++)
	{
		arr[j]=sc.nextInt();
		}
	 findProduct(arr,k);
   

   sc.close();
	}
	

}
