package arraysexmp;

import java.util.Scanner;

public class MaxAndMin {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<=arr.length-1;i++)                   
		{                                    
			arr[i]=ip.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(max<arr[i])                  // for if(min>arr[i]);
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}


}
