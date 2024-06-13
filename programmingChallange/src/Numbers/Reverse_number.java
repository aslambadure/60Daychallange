package Numbers;

public class Reverse_number {

	public static void main(String[] args) {
		int number=1234, rev=0;
		int temp=0;
		System.out.println("Enter the reverse Number:"+number);
		
		while(number!=0)
		{
			temp=number%10;
			rev=rev*10+temp;
			number=number/10;
			
		}
		System.out.println("Enter the reverse Number:"+rev);
	}

}
