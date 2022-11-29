package arraysexmp;

import java.util.Scanner;

public class Twoo {
	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		
		int [][] num = new int [3][3];
	    int [] sum = new int[10];
	    int [] sum1 = new int [10];
	    
	    System.out.println("\n3 by 3 Array - Enter Matrix Elements.");

	    for(int i = 0; i < 3; i++)
	    {
	        for(int j = 0; i < 3; i++)
	        {
	            System.out.print("Enter elements in pockets [" + i + "]["+ j + "]: ");
	            num[i][j] = Input.nextInt();
	        }
	        System.out.println();
	    }
	    
	    for(int i = 0; i < 3; i++)
	    {    
	        for(int j = 0; j < 3; j++)
	        {
	            sum[i] = sum[i] + num[i][j];
	            sum1[i] = sum1[i] + num[j][i];
	        }
	    }

	    System.out.println("Matrix is ...");
	    for(int i = 0; i < 3; i++)
	    {
	        for(int j = 0; j < 3; j++)
	        {
	            System.out.print(num[i][j] + "\t");
	        }
	        System.out.println("\t" + sum[i]);
	    }
	    System.out.println();
	    
	    for(int i = 0; i < 3; i++)
	    {
	        System.out.print(sum1[i] + "\t");
	    }
	}
	}


