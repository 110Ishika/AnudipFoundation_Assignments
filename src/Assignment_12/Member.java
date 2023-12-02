package Assignment_12;

public class Member {
	String Name;
	int age;
	String number;
	String Address;
	double salary;
	
	public void printSalary()
	{
		System.out.println("Salary: "+salary);
	}
	
	public void printDetails()
	{
		System.out.println("Name "+Name);
		System.out.println("Age "+age);
		System.out.println("Phone Number "+number);
		System.out.println("Address "+Address);



	}

	

}

class Employee extends Member
{
	String Specialisation;
	String Department;
	Employee()
	{
		
	}
	Employee(String Name, int a, String num,String Add, double sal)
	{
		this.Name=Name;
		age=a;
		number=num;
		Address=Add;
		salary=sal;
	}
	
	
}


class Manager extends Member
{
	String Specialisation;
	String Department;
	
Manager()
{
	
}
	Manager(String Name, int a, String num,String Add, double sal)
	{
		this.Name=Name;
		age=a;
		number=num;
		Address=Add;
		salary=sal;
	
	
}
}

class MainMember
{
	
	public static void main(String ar[])
	{
		Employee e=new Employee("Tom",23,"987654321","Ranchi",32000.00);
	    e.printDetails();
		e.printSalary();
		Manager m=new Manager("Luke",38,"7897587575","Kolkata",60000.00);
		m.printDetails();
		m.printSalary();
		
	}

}
