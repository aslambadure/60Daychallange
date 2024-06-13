package com;

public class Swapping {

	public static void main(String[] args) {
		int a,b;
		a=20;
		b=30;
		System.out.println("Before swaping: a, b ="+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping: a, b ="+a+" "+b);
	}

}
