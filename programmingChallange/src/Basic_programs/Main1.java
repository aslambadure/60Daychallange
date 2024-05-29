package Array1D;

public class Main1 
{
	static int mergeNumbers(int actualNum, int givenNum) 
	{
		String actualNumString = String.valueOf(actualNum);
		String givenNumString = String.valueOf(givenNum);
		String resultString = actualNumString + givenNumString;
		return Integer.parseInt(resultString);   
	}

	public static void main(String[] args)
	{
		int actualNum = 123;
		int givenNum = 57;
		int result = mergeNumbers(actualNum, givenNum);
		System.out.println("Result: " + result);
	}
}

