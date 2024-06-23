package Abstraction;

// Example of Abstract class that has an abstract method

abstract class Car
{
	abstract void run();
}

class Honda extends Car
{
	void run() {
		System.out.println("Running Car");
	}
}


public class Bike {
	public static void main(String[] args) {

		Car b=new Honda();
		b.run();
	}

}
