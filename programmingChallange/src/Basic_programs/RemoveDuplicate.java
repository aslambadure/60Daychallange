package Array1D;

public class RemoveDuplicate 
{
	
	public static void check(int [] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			int count = 0;
			for(int j=i+1;j<=num.length-1;j++)
			{
				if(num[i]==num[j])
				{
					count++;
					num[j]=-1;
				}
				
			}
			if(num[i]!=-1) {
				System.out.print(num[i]+" ");
			}
		}
	}
public static void main(String[] args) {
	int[] num= {1,2,3,1,5,6,7,6,6};
	check(num);
}
}
