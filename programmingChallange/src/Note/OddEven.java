package Note;
//Java Program to Find Odd or Even

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int no;
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);

		no=sc.nextInt();
		if(no % 2==0)
		{
			System.out.println("Even Number");
		}
		else 
		{
			System.out.println("Odd number");
		}
	}
}
