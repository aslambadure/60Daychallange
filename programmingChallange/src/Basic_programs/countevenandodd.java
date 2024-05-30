
public class countevenandodd {
public static void main(String[] args) {
	int[] x= {23,45,57,37,84,45,3,57};
	 int cou=getcount(x);
	 System.out.println("count is:"+cou);
}
public static int getcount(int[] ar)
{
	int count=0;int temp=0;
	for(int i=0;i<=ar.length-1;i++)
	{
		if(ar[i]%2==0) 
			count++;
		else
			temp++;
	}
return temp;

}
}