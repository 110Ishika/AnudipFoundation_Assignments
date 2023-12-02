package Assignment_12;

public class Bird {

	public void fly()
	{
		System.out.println("Bird is flying");	
		
	}
}

class Parrot extends Bird
{
	
	public void fly()
	{
		System.out.println("I am flying");
		
	}
	public void sing()
	{
		System.out.println("I am Singing");
	}
}

class MainTest{
	
public static void main(String[] args){
Bird b1 = new Parrot();
//with this b1 reference call the fly method of Parrot
b1.fly();
//and after downcasting this b1 reference to the Parrot class object, call the sing method also
if(b1 instanceof Bird )
{
Parrot p=(Parrot)b1;
p.sing();
}

}
}

