package Scaller;

// 2D array
public class info1
{
	public static void main(String[] args) 
	{
		int[][] arr=new int[5][6];

		arr[1][3]=10;
		System.out.println(arr[1][3]);

		//row count
		System.out.println(arr.length);

		//col count
		System.out.println(arr[0].length);

		// traversal
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[0].length;i++)
			{
				System.out.println(arr[i][j]+"");
			}
		}
	}

}
