package Note;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		int no;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		 no=sc.nextInt();
		 
		 if(no==1)
		 {
			 System.out.println("Enter the smallest prime  number 2");
		 }
		 for(int i=2; i<no;i++)
		 {
			 if(no%i==0)
			 {
				 System.out.println("not prime");
				 break;
			 }
		 }
		 if(no==0)
		 {
			 System.out.println("prime");
		 }		
	}

}
