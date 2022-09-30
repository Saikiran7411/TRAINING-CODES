package Logicproblems;

public class PerfectSquare {
	public static void main(String[] args) {
		int n=6;
		boolean flag=false;
		for(int i=1;i<=n;i++)
		{
			if(i*i==n){
				flag=true;
				
				
			}
			
		}
		if(flag==false)
		{
			System.out.println("Not a Perfect Square");
		}
		else
		{
			System.out.println("Perfect Square");
		}
	}

}
