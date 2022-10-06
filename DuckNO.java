package Logicproblems;

public class DuckNO {
	public static void main(String[] args) {
		int n=10848;
		int rem=0,c=0;
		while(n!=0)
		{
			rem=n%10;
			if(rem==0)
			{
				c++;
				break;
			}
			n=n/10;
			System.out.println("duck no");
		}
	}

}
