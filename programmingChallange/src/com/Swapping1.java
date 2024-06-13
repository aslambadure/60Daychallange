package com;

import java.util.Scanner;

public class Swapping1 {
	public static void main(String[] args) {
		int x,y,z;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter first input values: ");
		x=in.nextInt();
		
		System.out.println("Enter second input values: ");
		y=in.nextInt();
		
		z=x;
		x=y;
		y=z;
		
		System.out.println("swaping values are 3: "+x+" "+y);

	}
}
