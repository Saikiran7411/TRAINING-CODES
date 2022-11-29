package arraysexmp;

import java.util.Scanner;

public class IdenticalArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter size1:-");
		int size1=ip.nextInt();
		System.out.println("enter size2:-");
		int size2=ip.nextInt();
		int[] arr1=new int[size1];
		int[] arr2=new int[size2];
			for(int i=0;i<arr1.length;i++) {
				arr1[i]=ip.nextInt();
			}
			for(int i=0;i<arr2.length;i++) {
				arr2[i]=ip.nextInt();
			}
			if(arr1.length==arr2.length){
			for(int i=0;i<arr1.length;i++) {
				int count=0;
				for(int j=0;j<arr2.length;j++) {
					if(arr1[i]==arr2[i]) {
						count++;
					}
				}
				if(count==arr1.length) {
					System.out.println("Identical Array");
					break;

				}
				else {
					System.out.println("Not A identical Array");
					break;

				}

			}


		}
		else {
			System.out.println("not identical ");
		}

	}
	

}
