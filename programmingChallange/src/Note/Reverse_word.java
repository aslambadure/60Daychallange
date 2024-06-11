package Note;

public class Reverse_word {

	public static void main(String[] args) {

		String str="hello word";
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		System.out.println("String is : "+ sb);
		sb.reverse();
		System.out.println("string is : "+ sb);
	}

}
