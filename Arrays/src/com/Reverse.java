package com;

public class Reverse 
{
	public static void main(String[] args)
	{
		int[] myarray= {10,20,30,40,10,23,43,45,80};

		for(int index=myarray.length-1;index>=0;index--) 
		{
			System.out.println(myarray[index]);
		}

	}
}
