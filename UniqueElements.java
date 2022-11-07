package Logicproblems;

import java.util.Scanner;

public class UniqueElements {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		char []arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int c=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
				}
			}
			if(c==1)
			{
				System.out.println(arr[i]);
			}
				
		}
		
		
	}

}
