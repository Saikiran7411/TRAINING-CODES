package arraysexmp;

public class SumOfAll {
	public static void main(String[] args) 
	{
		int sum=0;
		int []arr= {10,3,4,7,3,4,9,6,8,7,7};
		int []arr1= {10,3,4,7,3,4,9,6,8,7,7};
		
		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]==arr1[j]) 
				{
					c++;
					arr1[j]=0;
				}
				}		
				if(c>1) {
					sum=sum+arr[i];
				}
			}
		System.out.println(sum);
		}

}
