import java.util.Scanner;
public class howmanyevenandodd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);   //define a method to return how many even and odd numbers in user enterd array
	System.out.println("enter the size of an array");
	int n=sc.nextInt();
	int[] ar=new int[n];
	System.out.println("enter the "+n+" values");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	int[] ct= countecoc(ar);
	System.out.println("no of even values"+ct[0]);
	System.out.println("no of odd values"+ct[1]);
}
static int[] countecoc(int[] ar)
{
	int ec=0,oc=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]%2==0)
			ec++;
		else
			oc++;
	}
	int[] rs= {ec,oc};
	return rs;
}
}