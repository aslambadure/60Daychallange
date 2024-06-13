package Numbers;
public class Prime_or_Not 
{
	public static void main(String[] args) 
	{
		int num=29;
		boolean flag=true;

		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("is prime ");
		else
			System.out.println("is not prime");
	}
}
