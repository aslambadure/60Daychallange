package oops;

public class Account
{
	String name= "maya";
	long accno=23463673;
	String ifsc="SBI0005";
	String branch= "BTR";
	double bal=0.0;

	static String bankName="SBI";
	public static void ShowbankName()
	{
		System.out.println("BankName");
	}
	
	public void ShowDetails()
	{
		System.out.println(name);
		System.out.println(accno);
		System.out.println(ifsc);
		System.out.println(branch);
	}
	
	public void Deposit(double amt)
	{
		bal=bal-amt;
		System.out.println(bal);
	}
	public void withdraw(double amt)
	{
		if(bal>amt)
		{
			bal=bal-amt;
			System.out.println(bal);
		}
		else
		{
			System.out.println("Invalid transaction");
		}
	}
	public static void main(String[] args) 
	{
		new Account().ShowDetails();
		new Account().Deposit(4000.0);
		new Account().withdraw(420.0);
	}

}
