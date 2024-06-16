package com;

public class Print_Duplicate 
{
	public static void check(int[] num) 
	{
		
		for(int i=0;i<=num.length-1; i++)
		{
			int count=0;
			for(int j=i+1; j<=num.length-1;i++)
			{
				if(num[i] ==num[j])
					count++;
				num[j]=-1;
			}
		}
		int i = 0;
		if(num[i]!=-1 && i>0)
		{
			System.out.println(num[i]+" ");
		}
	}


	public static void main(String[] args) 
	{
		int [] num = {1,2,3,1,5,6,7,6,6};
		check(num);
	}
}
