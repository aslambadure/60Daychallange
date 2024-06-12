package oops;
class AA{
	static int z1=5;
	public static void count() 
	{
		System.out.println("count method");
	}
}

class B
{
	public static void test()
	{
		System.out.println("test method");
	}
}

public class C {
	public static void display()
	{
		System.out.println("Display method");
	}

	public static void main(String[] args) 
	{
		display();
		AA.count();
		B.test();
		C.display();
		System.out.println(AA.z1);
	}

}
