package Assign_08;
import java.util.Scanner;

public class AreaAndPeri {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		int l=sc.nextInt();
		int b=sc.nextInt();
        System.out.println("Area = "+l*b);
        System.out.println("Perimeter =" + (2*(l+b)));
        }
      sc.close();
}
}
