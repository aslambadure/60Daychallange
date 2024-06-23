package Abstraction;

class Vehical{
	void run() {
		System.out.println("vehical is running");
	}
}
public class P1 extends Vehical {
	
	public static void main(String[] args) {
		P1 p= new P1();
		p.run();
	}
}
