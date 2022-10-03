package Logicproblems;
import java.util.Scanner;
public class Factoraial {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		int fact=1;
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorail of given number is "+fact);
		
	}

}
