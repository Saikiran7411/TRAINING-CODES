package arraysexmp;

public class NumberToWord {
	public static void main(String[] args) {
		int n=12345,m=n,k=n;
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		int []arr=new int[count];
		int rem=0;
		int res=0;
		for(int i=0;i<=arr.length-1;i++) 
		{
			rem=m%10;
			arr[i]=rem;
			m=m/10;
		}
		for(int j=0;j<=arr.length-1;j++) {
			for(int h=j+1;h<=arr.length-1;h++) 
			{
				if(arr[j]<arr[h]) {
					int temp=arr[j];
					arr[j]=arr[h];
					arr[h]=temp;
				}
			}

		}
		int rem1=0;
		for(int i=0;i<=arr.length-1;i++) {
			rem1=(rem1*10)+arr[i];
		}
		System.out.println(rem1);
	}

}
