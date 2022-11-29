package arraysexmp;

import java.util.Scanner;

public class Numer2word {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n=scanner.nextInt();
		String arr[]= {"zero ","one ","two ","three ","four  "," five"," six"," seven"," eight"," nine"};
	//	int n=12;
		int rem=0;
		String ans="";
		while(n!=0)
		{
			rem=n%10;
			ans=arr[rem]+ans;
			n=n/10;
		}
		System.out.println(ans);

	}

}
