package Assignment_16B;

import java.util.Scanner;

class Person
{
	String name;
	int age;
	String Address;
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.Address = address;
	}
	
	Person(){}
	
	public void getDetails()
	{
		System.out.println("Name:  "+ name);
		System.out.println("Age:  "+ age);
		System.out.println("Address:  "+ Address);
	}	
}


class Student extends Person
{
	String studentId;
	String grade;
	
 public Student(String name, int age, String address, String studentId) {
		super(name, age, address);
		this.studentId = studentId;
	}

 
public Student() {}

	String calAverageGrade()
	 {
			 
		 return grade;
	 }
	
	public void getDetails()
	{  
		System.out.println("-----Student Details------");
		super.getDetails();
		System.out.println("Grade:  "+ grade);
		System.out.println("studentId:  "+ studentId);
		
	}
}

class Teacher extends Person
{
	String employeeId;
	String subject;
	
Teacher(){}

public Teacher(String name, int age, String address, String employeeId, String subject) {
			super(name, age, address);
			this.employeeId = employeeId;
			this.subject = subject;
	}

	 public void assignGrade(String g,Student s)
	 {
		s.grade=g;
	 }
	 
	public void getDetails()
	{  
		System.out.println("-----Teacher's Details------");
		System.out.println("Name:  "+super.name);
		System.out.println("Age:  "+super.age);
		System.out.println("Address:  "+super.Address);
        System.out.println("EmployeeId:  "+ employeeId);
		System.out.println("Subject:  "+ subject);
	}
	

}
public class SchoolSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student details: ");
       	   String name=sc.next();
	       int  age=sc.nextInt();
	       String address=sc.next();
	       String stdid=sc.next();
	       Student np=new Student(name,age,address,stdid);
	       System.out.println("Enter Teacher details: ");
	       name=sc.next();
	       age=sc.nextInt();
	       address=sc.next();
	        String empid=sc.next();
	        String sub=sc.next();
	        String g=sc.next();
			Person t=new Teacher(name,age,address,empid,sub);
            ((Teacher)t).assignGrade(g,np);
	        t.getDetails();
	  	    np.getDetails();
		    //((Student)s).calAverageGrade();
	  	    sc.close();
		
		}

}
