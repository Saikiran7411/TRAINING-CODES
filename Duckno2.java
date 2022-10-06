package Logicproblems;

public class Duckno2 {
	public static void main(String[] args) {
		int n=158007;
		int rem=0;
		int prod=1;
		while(n!=0)
		{
			rem=n%10;
			prod=prod*rem;
			n=n/10;
		}
		if(prod==0)
		{
			System.out.println("Duck no");
		}
		else
		{
			System.out.println("Not a duck no");
		}
	}

}
