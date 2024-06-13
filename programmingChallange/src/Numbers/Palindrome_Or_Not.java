package Numbers;

import java.util.Scanner;

public class Palindrome_Or_Not
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input of Number");

		int n=in.nextInt();
		int sum=0, r;
		int temp=n;

		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Its is palindrom number");
		}
		else {
			System.out.println("It is a not palindrome");
		}

	}
}
