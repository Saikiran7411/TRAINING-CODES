package arraysexmp;

public class RecSum {
	static int sum=0;
	static void sum(int n)
	{
		if(n<11)
		{
		sum=sum+n;
		sum(n+1);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1);

	}

}
