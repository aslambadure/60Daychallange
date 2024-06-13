package Numbers;

public class Palindrome {
	public static void main(String[] args) {

		int num=1331, rev=0,temp=num;

		while(num>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		if(rev==temp)
			System.out.println("Yes palindrom");
		else
			System.out.println("No palindrome");
	}
}
