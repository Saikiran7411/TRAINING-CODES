package arraysexmp;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the size");
		int size=ip.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{                                    
			arr[i]=ip.nextInt();
		}
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}


}
