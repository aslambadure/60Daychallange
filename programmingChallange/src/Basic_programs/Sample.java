package oops;
// check the static keyword

class Demo{
	static int a=25;
	public static void check() {
		System.out.println("check the static method");
	}
}
public class Sample 
{
	public static void main(String[] args)
	{
		Demo.check();
		System.out.println(Demo.a);
	}
}
