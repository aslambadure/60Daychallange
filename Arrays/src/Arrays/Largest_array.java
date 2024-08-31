package Arrays;

public class Largest_array {
	public static void main(String[] args) {

		int[] a= {2,3,1,3,12,6};
		
		
		 int largest = a[0]; 	
		 for(int i=1;i<a.length;i++) {
			 if(a[i]>largest) {
				 largest=a[i];
			 }
		 }
		 System.out.println("largest array: "+largest);
	}
}
