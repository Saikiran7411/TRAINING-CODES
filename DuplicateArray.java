package arraysexmp;

import java.util.Scanner;

public class DuplicateArray {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{                                  
			arr[i]=ip.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}


}
