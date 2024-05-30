import java.util.Scanner;

public class Arrayoperation {
	int[] readarray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("enter the "+n+" values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	void disparray(int[] b)
	{
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}
	int[] merge(int[] x,int[] y)
	{
		int[] c=new int[x.length+y.length];
		for(int i=0;i<x.length;i++)
		{
			c[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			c[x.length+i]=y[i];
		}
		return c;
	}
	
public static void main(String[] args) {
	Arrayoperation ao=new Arrayoperation();
	System.out.println("read first array");
	int[] x=ao.readarray();
	System.out.println("read second array");
	int[] y=ao.readarray();
	System.out.println("user entered first array");
	ao.disparray(x);
	System.out.println("user entered second array");
	ao.disparray(y);
	int[] z=ao.merge(x,y);
	System.out.println("after the merging");
	ao.disparray(z);
}


}
