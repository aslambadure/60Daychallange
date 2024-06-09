package Note;

public class Count_uppercase {
	public static void main(String[] args) {
		int count=0;
		String s="its simple ";
		System.out.println("Enter the string :"+s);
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				count++;
		}
		System.out.println("count number: "+count);
	}
}
