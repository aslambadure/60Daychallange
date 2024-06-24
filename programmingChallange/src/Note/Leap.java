package Note;
//27. JAVA Program To Check Whether The Given Year is Leap Year or Not.

import java.util.Scanner;

public class Leap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		System.out.println("Enter the year");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year %400==0|| ((year%4==0) &&( year%100!=0)))
		{
			System.out.println(year+ ": leap year");
		}
		else
		{
			System.out.println(year+": Not leap year");
		}				
	}
}
