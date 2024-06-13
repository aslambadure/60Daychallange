package condition;

import java.util.Scanner;

public class SwithCondition1 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number 1");
		int num1 =scanner.nextInt();

		System.out.println("Enter the number 2");
		int num2 =scanner.nextInt();

		System.out.println("choose the option: [+,-,*,/] ");
		char ch=scanner.next().charAt(0);

		switch(ch) {
		case '+': System.out.println("addition"+(num1+num2));
		break;

		case '-': System.out.println("Sub:"+(num1-num2));
		break;

		case '*': System.out.println("mul "+(num1*num2));
		break;

		case '/':System.out.println("div"+(num1/num2));
		break;

		default:System.out.println("You enter wrong option");
		break;
		}

	}
}
