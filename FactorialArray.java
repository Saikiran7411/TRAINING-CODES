package arraysexmp;

import java.util.Scanner;

public class FactorialArray {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the Size");
		
		int size=ip.nextInt();
		System.out.println("enter the numbers");
		int arr[]=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{                                     
			arr[i]=ip.nextInt();
		}
		int fact=1;
		for(int i=0;i<=arr.length-1;i++)
		{
			fact=fact*arr[i];
		}
		System.out.println(fact);
	}

}
