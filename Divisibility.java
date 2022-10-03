package Logicproblems;
import java.util.Scanner;

public class Divisibility {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		if(x%3==0 && x%7==0 && x%9==0)
		{
			System.out.println("number is divisible");
		}
		else
		{
			System.out.println("number is not divisible");
		}
		
		
	}

}
