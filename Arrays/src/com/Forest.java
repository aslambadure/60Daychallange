package Abstraction;

abstract class Animal
{
	public abstract void sound();
}

class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Dog is barking");
	}
}
class lion extends Animal
{
	public void sound()
	{
		System.out.println("Lion is Roar");
	}
}
public class Forest {
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.sound();

		lion l= new lion();
		l.sound();
	}
}
