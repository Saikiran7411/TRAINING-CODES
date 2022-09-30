package Logicproblems;
import java.util.Scanner;
public class CountFactors {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the number");
		int n=21;
		int x=ip.nextInt();
		int c=0;
		for(int i=0;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
