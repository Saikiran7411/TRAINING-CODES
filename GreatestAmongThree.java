package Logicproblems;
import java.util.Scanner;

public class GreatestAmongThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int x=10;
		int y=20;
		int z=30;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a<c)
		{
			System.out.println("a is greater");
		}
		else if(b<a&&b<c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		
	}

}
