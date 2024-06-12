package oops;
// Method Overloading: changing no. of arguments

class Adder
{
	static int  add(int a, int b)
	{
		return a+b;
	}
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
}
public class Method_Overloadinf {
	public static void main(String[] args) 
	{
		System.out.println(Adder.add(11,22));
		System.out.println(Adder.add(11,22,33));
	}
}
