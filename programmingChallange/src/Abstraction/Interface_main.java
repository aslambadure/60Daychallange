package Abstraction;
//Java Interface Example

interface Printable{
	void print();
}

class A implements Printable{
	public void print() {
		System.out.println("hello");
	}
}

public class Interface_main {
	public static void main(String[] args) {

		Printable p= new A();
		p.print();
	}
}
