package condition;

import java.util.Scanner;

public class SwithCondition {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number: ");
		String s=scanner.next();
		String j="1";
		switch(j) {
		case "1":System.out.println("hello world");
		break;

		case "2":
			System.out.println("hello aslam");
			break;
		default:
			System.out.println("Invalid version");
		}
	}
}
