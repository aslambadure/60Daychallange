package com;

import java.util.Scanner;

public class Arrays_Input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the subjects");
		
		int size=sc.nextInt();
		int[] marks=new int[size];

		System.out.println("Enter the marks of the Subjects");
		for(int i=0;i<size;i++) {
			marks[i]=sc.nextInt();

		}
		for(int i=0;i<size;i++)
			System.out.print("marks= "+marks[i]+",");
	}

}
