package Note;

// ASCII code each character of a string
public class Ascii {

	public static void main(String[] args) {

		String s= "its Simple";
		System.out.println("Enther the String");
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			System.out.println(c+" "+(int)c);
		}
	}
}
