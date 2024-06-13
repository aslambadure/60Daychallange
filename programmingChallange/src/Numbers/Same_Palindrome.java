package Numbers;

import java.util.Scanner;

public class Same_Palindrome 
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input Number");
		int n=in.nextInt();

		int sum=0;
		int r=0;
		int temp=n;

		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Its is a Palindrome");
		else
			System.out.println("Its is not Palindrome");
	}
}
