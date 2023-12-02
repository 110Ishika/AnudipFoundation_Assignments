package Assignment_12;

public class Animal {

	public void makeNoise(){
		System.out.println("Animal making Noise");
		}
		public void eat(){
		System.out.println("Animal is eating");
		}
		public void walk(){
		System.out.println("Animal is walking");
		}

}

class Dog extends Animal
{
	public void makeNoise(){
		System.out.println("Barking...");
		}
	
}

class Cat extends Animal
{
	public void makeNoise(){
		System.out.println("Meaw...");
		}
	
}
class Tiger extends Animal
{
	public void makeNoise(){
		System.out.println("Raoring...");

		}
	
}



class MainAnimal{
public static void main(String[] args){
//create an array of Animal class with size 3
	Animal A[]=new Animal[3];
//Initialize all 3 elements of this Animal class with
//Dog, Cat and Tiger class object.
	A[0]=new Dog();
	A[1]=new Cat();
	A[2]=new Tiger();
	
	for(Animal ss:A)
	{
		ss.eat();
		ss.walk();
		ss.makeNoise();
	}
}
}
