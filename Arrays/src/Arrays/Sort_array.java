package Arrays;

public class Sort_array {
	public static void main(String[] args) {

		int[] a= {1,2,3,4,5,6};

		System.out.println("Original array");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");

		System.out.println("Reverse of array");
		for(int i=a.length-1;i>=0;i--) 
			System.out.println(a[i]+" ");


	}
}
