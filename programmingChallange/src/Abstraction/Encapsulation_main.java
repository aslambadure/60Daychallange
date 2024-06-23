package Abstraction;

class Employee{
	private String name;


	public String getname() {
		return name;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
}
public class Encapsulation_main {
	public static void main(String[] args) {

		Employee e=new Employee();
		e.setname("Aslam");
		System.out.println(e.getname());
	}
}
