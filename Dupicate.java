class Dupicate
{
	public static void duplicate(int [] a)
	{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}

		}
	}
	public static void main(String[] args) 
	{
		int [] a1={1,3,5,7,10,3,5,1,7};
		duplicate(a1);
	}
}