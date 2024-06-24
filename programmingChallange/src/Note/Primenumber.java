package Note;
//55. JAVA Program To check a Number is Prime number or Not.

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		int no, fact=0;
		System.out.print("Enter a Number :");
		Scanner sc = new Scanner(System.in );
		no = sc.nextInt();
		for(int i=2; i< no; i++)
		{
			if(no%i == 0)
			{
				fact++;
				break;
			}
		}
		if(fact == 0)
			System.out.print(no+" is a Prime Number");
		else
			System.out.print(no+" is not a Prime Number");
	}
}
