package Numbers;

public class leap_year {

	public static void main(String[] args) {
		
		int year=2016; //2017
		
		if((year%400==0)||(year%4==0 && year%100!=0))
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("Its is not leap year");
		}

	}

}
