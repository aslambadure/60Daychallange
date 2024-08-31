package Arrays;

public class Smalest_array {
	public static void main(String[] args) {


		int[] a= {1,2,5,6,7,8};
		
		int smalest=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]< smalest)
			{
				smalest=a[i];
			}
		}
		System.out.println("Smalest array: "+smalest);
	}
}
