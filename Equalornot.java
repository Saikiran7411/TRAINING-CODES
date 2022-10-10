package Logicproblems;
import java.util.Scanner;

public class Equalornot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
	//	int n1=8;
		//int n2=9;
		
		if(x>y || y>x)
		{
			System.out.println("not equal");
			
		}
		else 
		{
			System.out.println("equal");
		}
	}

}
