package Assign_08;
import java.util.Scanner;

class Zigzag {
	public static void main(String arg[])
	{
	Scanner sc= new Scanner(System.in);
	int k=0;
	int r= sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
      
 for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
arr[i][j]=sc.nextInt();
}
}

while(k<r)
{
if(k%2==0)
{
for(int n=(c-1);n>=0;n--)
{
System.out.print(arr[k][n]+ "  ");
}
}

else
{
for(int n=0;n<c;n++)
{
System.out.print(arr[k][n]+ "  ");
}
}
k++;
}

sc.close();
}
}

