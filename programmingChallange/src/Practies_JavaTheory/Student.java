package Practies_JavaTheory;

//Example of parameterized constructor

public class Student {
	int id;
	String name;
	
	public 	Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println(id+" "+name);
		//System.out.println(name);
	}

	public static void main(String[] args) {
		Student s1=new Student(111,"Aslam");
		Student s2= new Student(222,"Anil");
		
		s1.display();
		s2.display();
	}
}
