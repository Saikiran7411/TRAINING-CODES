package arraysexmp;
import java.util.Scanner;
public class ZeroMovesLeft {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=ip.nextInt();

		}
		int k=0;
		int [] srr=new int[size];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				srr[k]=arr[i];
				k++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				srr[k]=arr[i];
				k++;
			}
		}
		for(int ele:srr) {
			System.out.print(ele);
		}
	}

}
