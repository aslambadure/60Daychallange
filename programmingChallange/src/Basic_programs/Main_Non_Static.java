package oops;


class A1{
	int a=10;
	public void count()
	{
		System.out.println("count non static ");
	}
}
public class Main_Non_Static {
	public static void main(String[] args)
	{
		new A1().count();
		System.out.println(new A1().a);
	}
}
