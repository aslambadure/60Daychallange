package com;

public class Info {

	public static void main(String[] args) 
	{
		int arr[] = {1,2,4,5,6};
		
		int arr1[]=new int[5];
		// get the array
		System.out.println(arr[4]);
		System.out.println(arr1[2]);
		
		//set the arrays
		arr[4] =30;
		System.out.println(arr[4]);
		
		System.out.println("-------------------");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
