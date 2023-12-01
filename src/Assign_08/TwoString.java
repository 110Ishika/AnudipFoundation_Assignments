package Assign_08;
import java.util.Scanner;

public class TwoString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String v="",c="";
		for(int i=0;i<s.length();i++)
		{
		if((s.charAt(i)=='a') ||(s.charAt(i)=='e') ||(s.charAt(i)=='i') ||(s.charAt(i)=='o')||(s.charAt(i)=='u'))   
		v=v+s.charAt(i);
		else
		c=c+s.charAt(i);
		}
		System.out.println(v);
		System.out.println(c);
	
  sc.close();
	}


}
