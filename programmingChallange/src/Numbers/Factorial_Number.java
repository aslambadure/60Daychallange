package Numbers;

public class Factorial_Number 
{

	public static void main(String[] args) 
	{
		
		int number=6;
		int fact=number;
		for(int i=(number - 1);i>1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial: " + number+ " :is "+fact);
	}

}
