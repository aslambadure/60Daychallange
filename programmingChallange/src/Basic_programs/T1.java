package objectclass;

public class T1 {
public static void main(String[] args) {
	Laptap l1=new Laptap("dell","i5",8);
	Laptap l2=new Laptap("dell","i5",8);
	System.out.println(l1.hashCode());
	System.out.println(l2.hashCode());
	System.out.println(l1.equals(l2));
}
}
