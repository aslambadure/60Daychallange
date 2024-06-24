package Note;
//1. JAVA Program to Add and Subtract Two Numbers.

import java.util.Scanner;

public class AddSub {
	public static void main(String[] args) {

		int a, b, add, sub;
		System.out.println("Enther two number");
		
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		add=a+b;
		sub=a-b;
		System.out.println("Add: "+add);
		System.out.println("Sub: "+sub);
	}
}
