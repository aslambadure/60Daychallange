package Binary;

public class Binary {

	public static int print(int num)
	{
		
//		int num=1010;
		int sum=0;
		int i=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+(int)Math.pow(2, i)*rem;
			i++;
			num=num/10;
		}
		
		
		return num;	
	}
	public static void main(String[] args) {
		System.out.println("Convert binary to decimal");
		print(10);

	}

}
