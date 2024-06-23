package Abstraction;

//Abstract class having constructor, data member and methods

abstract class Bike1
{
	Bike1()
	{
		System.out.println("Bike is created");
	}
	abstract void run();

	void changeGear() {
		System.out.println("Gear charged");
	}
}

class Honda1 extends Bike1
{
	void run() {
		System.out.println("running safty");
	}
}

public class TestAbstraction1 {
	public static void main(String[] args) {

		Bike1  obj= new Honda1 ();
		obj.changeGear();
		obj.run();

	}
}
