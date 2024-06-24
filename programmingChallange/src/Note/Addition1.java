package Note;

import java.util.Scanner;

public class Addition1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,sum;
		System.out.println("Enter the two number");
		Scanner sc= new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		System.out.println("sum: "+sum);
		
	}

}
