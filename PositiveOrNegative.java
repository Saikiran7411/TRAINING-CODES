package Logicproblems;
import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("number is equal");
		}
		else if(n<0)
		{
			System.out.println(" number is negative ");
		}
		else
		{
			System.out.println(" number is positive");
		}

	}

}
