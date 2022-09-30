package Logicproblems;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%1==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("Prime no");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}

}
