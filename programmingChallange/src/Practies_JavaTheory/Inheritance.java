package Practies_JavaTheory;

class Animal
{
	String name="anil";
	public void eat()
	{
		System.out.println("i can eat");
	}
}

class Dog extends Animal
{
	public void display()
	{
		System.out.println("My name is : "+ name);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Dog a1= new Dog();
		//a1.name="Aslam";
		a1.display();
	}
}
