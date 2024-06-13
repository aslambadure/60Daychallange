package condition;

import java.util.Scanner;

public class ElseCondition {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int num=scanner.nextInt();

		if(num%2==0 ) {
			System.out.println("even number");

		}
		else {
			System.out.println("odd numbers");
		}
	}
}
