package Binary;

//Convert binary to decimal

public class Demo 
{
	
	public static int print(int num)
	{
		int res=0;
		int i=0;
		while(num>0)
		{
			int rem=num%2;
			res=res*(int)Math.pow(10,i)+res;
			i++;
			num=num/2;
		}
		return res;
	}
 public static void main(String[] args) {
	
	 
	 System.out.println(print(100));
}
}
