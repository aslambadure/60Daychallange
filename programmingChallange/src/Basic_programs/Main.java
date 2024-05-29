package Array1D;

//Here's an example Java program to sort the first half of an array in ascending order and the second half in descending order:


import java.util.Arrays;

public class Main 
{
	public static void sortFirstHalfAscending(int[] arr ,int n)
	{
		int mid =n /2;
		for(int i=0;i<mid;i++)
		{
			for(int j=i+1;j<mid;j++)
			{
				if(arr[i]>arr[j])
				{
				int temp=0;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
	}
	static void sortSecondHalfDescending(int[] arr, int n) {
	    int mid = n / 2;
	    for (int i = mid; i < n; i++) {
	      for (int j = i + 1; j < n; j++) {
	        if (arr[i] < arr[j]) {
	          int temp = arr[i];
	          arr[i] = arr[j];
	          arr[j] = temp;
	        }
	      }
	    }
	  }
	 
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,40,30,20,10};
		int n=arr.length;
		sortFirstHalfAscending(arr,n);
		sortSecondHalfDescending(arr,n);
	System.out.println("sorting array===" + Arrays.toString(arr));	}
}
