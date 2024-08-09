package Basic_program;

public class Swapping {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("before Swapping");
		System.out.println("value:"+x);
		System.out.println("value:"+y);

		int temp=x;
		x=y;
		y=temp;
		System.out.println("after Swapping");
		System.out.println("value:"+x);
		System.out.println("value:"+y);
	}
}
