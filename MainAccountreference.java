class Acoount2
{
	String name="Sai";
	long accountno=89765676567l;
	double bal=0.0;
	String ifsc="icic00";
    static String bankname="icici";
	String branch="btr";

	public  void showbankname()
	{
		System.out.println(bankname);
	}
	public void bankdetails()
	{
		System.out.println(name);
		System.out.println(bankname);
		System.out.println(accountno);
		System.out.println(bal);
		System.out.println(ifsc);
		System.out.println(branch);
	}
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println(bal);
	}
	public void withdraw(double amt)
	{
		bal=bal-amt;
		System.out.println(bal);
	}

	
}
class MainAccountreference
{
	public static void main(String[] args) 
	{
	Acoount2 a1=new Acoount2();
	//System.out.println(a1);
	a1.showbankname();
	a1.deposit(1000.0);
	a1.withdraw(500.0);
	a1.bankdetails();

	}
}