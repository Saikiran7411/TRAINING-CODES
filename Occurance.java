package Logicproblems;
import java.util.Scanner;


public class Occurance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] c1=s.toCharArray();
		char[] c2=s.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			int c=0;
			for(int j=0;j<c2.length;j++) {
				if(c1[i]==c2[j]) {
					c++;
					c2[j]='\0';
					
				}
			}
			if(c>0)
			{
				System.out.println(c1[i]+" "+c);
			}
			
		}
				
		
	}

}
