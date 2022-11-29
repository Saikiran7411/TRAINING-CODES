package arraysexmp;

import java.util.Scanner;



public class Array2D {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int row=scanner.nextInt();
		int col=scanner.nextInt();
		int [][]arr=new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=scanner.nextInt();

			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();

		}
		

	}

}
