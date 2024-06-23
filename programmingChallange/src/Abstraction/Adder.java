package Abstraction;
//1) Method Overloading: changing no. of arguments

class apple
{
	static int add(int a, int b) {
		return a+b; 
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class Adder {
	public static void main(String[] args) {
		System.out.println(apple.add(11, 11));
		System.out.println(apple.add(23, 21));

	}
}
