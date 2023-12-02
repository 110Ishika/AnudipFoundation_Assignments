package Assignment_16B;

public class Employee
{
String name;
String empid;
int salary;
Employee(String n,String eid,int s)
{
	name=n;
	empid=eid;
	salary=s;
	
}

Employee()
{
	
}

	void getDetails()
	{
		System.out.println("Name:  "+name);
		System.out.println("EmployeeId:  "+empid);
		System.out.println("Salary:  "+salary);
		
	}
	
}

class Manager extends Employee
{
String dept;
String nOfr;

Manager(String n, String eid, int s, String dept, String nOfr) {
	super(n, eid, s);
	this.dept = dept;
	this.nOfr = nOfr;
}

void meetingSchedule()
{
	System.out.println("Meeting Timing is: ");
}

int performanceBonus(int bsal)
{
	return bsal;
}
	
void getDetails()
{
	System.out.println("Name:  "+name);
	System.out.println("EmployeeId:  "+empid);
	System.out.println("Salary:  "+salary);
	System.out.println("Department:  "+dept);
	System.out.println("Number Of Report:  "+nOfr);
}
}

class Developer extends Employee
{
	String pl;
	boolean pcom;
	
	public Developer(String n, String eid, int s, String pl, boolean pcom) {
		super(n, eid, s);
		this.pl = pl;
		this.pcom = pcom;
	}


	void projectInfo()
	{
		System.out.println("Code In prograss....");
	}
	
	
	void showBonus(int p)
	{
		System.out.println("Performance bonus:  "+p);
	}
	
  
	void getDetails()
	{
	super.getDetails();
	System.out.println("Department:  "+pl);
	System.out.println("Project Complete:  "+pcom);
	
	}
}

 class EmployeeMain {

	public static void main(String[] args) {
		Manager m= new Manager("Megha", "Mn456",43000,"Hr","10");
		System.out.println("Manager Details-----------");
		 m.getDetails();
		 m.meetingSchedule();
         Developer d=new Developer("Rhea","Em1234",23000,"Java",true);
         System.out.println("Developer Details--------");
         d.getDetails();
         d.projectInfo();
         d.showBonus(m.performanceBonus(3000));
}

}
