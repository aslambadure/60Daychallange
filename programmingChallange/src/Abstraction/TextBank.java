package Abstraction;
// Another example of Abstract class in java

abstract class Bank{
	abstract int getRateOfInterest(); 
}

class SBI extends Bank
{
	int getRateOfInterest(){
		return 8;
	}	
}

class PNB extends Bank{    
	int getRateOfInterest()
	{
		return 8;
	}    
}  
public class TextBank{
	public static void main(String[] args) {

		Bank b= new SBI();
		System.out.println("Rate Of Interest: "+b.getRateOfInterest()+"%");

		b= new PNB();
		System.out.println("Rate of Interest: "+b.getRateOfInterest()+"%");

	}
}
