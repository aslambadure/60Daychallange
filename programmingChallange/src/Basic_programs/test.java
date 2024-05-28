package arrays;

public class test {
public static void main(String[] args) {
	array ar=new array();
	System.out.println("read first array ");
	int[] a=ar.readar();
	System.out.println(" read second array ");
	int[] b=ar.readar();
	  int[] c=ar.zigzag(a, b);
	  System.out.println(" after zigzag of an array ");
	  ar.disparray(c);
	
}
}
