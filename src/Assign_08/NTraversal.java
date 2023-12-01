package Assign_08;

import java.util.Scanner;

public class NTraversal {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int r= sc.nextInt();
		int arr[][]=new int[r][r];


		for(int i=0;i<r;i++){    
		for(int j=0;j<r;j++){    
		arr[i][j]=sc.nextInt();
		}
		}

		for(int i=(r-1);i>=0;i--){    
		System.out.print(arr[i][0]);  
		}

		for(int i=1;i<r;i++)
		{
		System.out.print(arr[i][i]);   
		}

		for(int i=(r-2);i>=0;i--)
		{
		System.out.print(arr[i][r-1]);  
		}


sc.close();
	}

}
