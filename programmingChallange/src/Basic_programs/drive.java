import java.util.*;
public class drive {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		for(int i=0;i<10;i++)
		{
			l.add(i);
		}
		
		ListIterator li=l.listIterator();
		System.out.println(li.nextIndex());
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
}
}