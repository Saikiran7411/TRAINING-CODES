package Logicproblems;

public class Fabonacci {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int sum=0;
		int i=1;
		while(i<=20)
		{
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			i++;
		}
	}

}
