package arraysexmp;

import java.util.Scanner;

public class SumOf2DArray {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int row=scanner.nextInt();
		int col=scanner.nextInt();
		int [][]arr=new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <col; j++) {
				arr[i][j]=scanner.nextInt();

			}

		}
		int sum=0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum=arr[i][j];
			//	System.out.print(arr[i][j]+" ");
				
			}
			
		//	System.out.println(sum);
		}
		System.out.println(sum);
		
		

	}

}


