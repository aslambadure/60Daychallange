package com;

public class Swap_Two_variables {

	public static void main(String[] args) {
		int a,b, temp;
		a=10;
		b=20;
		System.out.println("Before swaping: "+a+" "+b);
		System.out.println("===========================");
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swaping :"+a+" "+b);
	}
}
