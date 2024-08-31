package Arrays;

public class Inhance_SumOfArray {
	public static void main(String[] args) {

		int [] a= {1,2,3,4};
		int sum=0;
		
		for(int number:a) {
			sum+=number;
		}
		System.out.println("Sum of array: "+sum);
	}
}
