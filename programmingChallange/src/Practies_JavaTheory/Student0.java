package Practies_JavaTheory;

//Example of default constructor that displays the default values

public class Student0 {
	
	int id;
	String name;
	public void disply()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		 Student0 s=new Student0();
		 s.disply();
	}
}
