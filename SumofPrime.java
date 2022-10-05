package Logicproblems;

public class SumofPrime {
	static boolean primeno(int n){
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int n=97;
		int sum=0,rem=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		boolean ans=primeno(sum);
		if(ans==true)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("not a prime");
		}
	}

}
