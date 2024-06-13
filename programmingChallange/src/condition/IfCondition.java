package condition;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {

		int a=10;

		//		if(a<20) {
		//			System.out.println("print the Statement 20");
		//		}




		//		if(a%2!=0) {
		//			System.out.println("print even number");
		//		}
		//		else {
		//			System.out.println("print odd number");
		//		}

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num =scanner.nextInt();
		if(num%2==0) {
			System.out.println("printing a even number: ");
		}
		else if(num!=0){
			System.out.println("printing a odd number: ");
		}
		else {
			System.out.println("None of these");
		}
	}
}
