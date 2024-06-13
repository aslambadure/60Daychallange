package Numbers;

public class Method_palindrome 
{
	public static void Palindrome1() 
	{
		int num=41, rev=0,temp=num;

		while(num>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(rev==temp)
			System.out.println("its a palindrome");
		else 
			System.out.println("its a not palindrome");

	}
	public static void main(String[] args) {
		Palindrome1();
	}

}
