package Assignment_13;

class Address
{
	String city,state,pincode;
	
	public Address(String city, String state, String pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}


	public  String toString()
	{
	  return ("[City= " +this.city + " , state=  " + this.state + ", pincode=" + this.pincode+"]");
      }
	
}

class Person{
	
	String name,gender;
	//Address a=new Address();
	Address a;

public Person(String name, String gender, Address a) {
		super();
		this.name = name;
		this.gender = gender;
		this.a = a;
	}
Person(){}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", a=" + a + "]";
	}
	
	
}

class Instructor extends Person
{
	int instructorId,salary;
	
	public Instructor(String name, String gender, Address a,int instructorId, int salary) {
		super(name, gender,a);
		this.instructorId = instructorId;
		this.salary = salary;
	}

	
  Instructor(){
	   
}

@Override
public String toString() {
	return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", name=" + name + ", gender=" + gender
			+ ", a=" + a + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + "]";
}

  
}

class Student extends Person
{
	int studentid,coursefee;
	String courseEnrolled;
	
	public Student(String name, String gender, Address a, int studentid, int coursefee, String courseEnrolled) {
		super(name, gender, a);
		this.studentid = studentid;
		this.coursefee = coursefee;
		this.courseEnrolled = courseEnrolled;
	}

	Student()
	{
		
	}

	public  String toString()
	
	{
		 return ("Student [StudentId = "+ this.studentid + " , Coursefee= " + coursefee+ ", CourseFee = " + this.courseEnrolled+"]"
		  + "\n" + "address= Address" +a.toString());
	}
	
}

public class Has_A_Rel {

	public static Person generatePerson(Person person)
	{
		return person;
	}
	public static void main(String[] args) {
		Person newStudent=generatePerson(new Student("Ishika","f",new Address("Chhains","TM","60001"),1,5000,"MCA"));
        Person newTeacher=generatePerson(new Instructor());
		System.out.println(newStudent);
		System.out.println(newTeacher);
		
	}

}
