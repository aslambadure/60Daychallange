package Note;

// print the character of the string  in separate line
public class Simple {

	public static void main(String[] args) {
		
		String s="its simple";
		System.out.println("Ether the String:");
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			System.out.println(ch);
		}
	}
}
