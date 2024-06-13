package com;

import java.util.Scanner;

public class Add_Two_Binary_Number {
	public static void main(String[] args) {

		long binary1,binary2;
		int i=0,rem=0;
		int[] sum=new int[20];
		Scanner sc= new Scanner(System.in);
		
		System.out.println("input first Binary Number: ");
		binary1=sc.nextLong();
		
		System.out.println("input second Binary Number: ");
		binary2=sc.nextLong();
		
		while(binary1 !=0 || binary2!=0)
		{
			sum[i++]=(int)((binary1%10+binary2%10+rem)%2);
			rem=(int)((binary1%10 + binary2 % 10 +rem)/2);
			binary1=binary1/10;
			binary2=binary2/10;
		}
		if(rem!=0)
		{
			sum[i++] = rem;
		}
		--i;
		System.out.println("sum of Binary numbers: ");
		while(i>=0)
		{
			System.out.println(sum[i--]);
		}
		System.out.print("\n");
	}
}











