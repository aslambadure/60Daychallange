package Perfect_Number;

import java.util.Scanner;

public class Perfect_number {
	public static void main(String[] args) {
		long n, sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");

		 n=sc.nextLong();
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
				sum=sum+i;
			i++;
		}
		if(sum==n)
			System.out.println(n+ ": is a perfrct number");
		else
			System.out.println(n+ ": is not a perfect Number");
	}

}

