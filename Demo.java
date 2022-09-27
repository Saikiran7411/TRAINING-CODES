package com.jspiders.p1;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=ip.nextInt();
		int b=ip.nextInt();
		int c=ip.nextInt();
		//10int a=10,b=20,c=50;
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else if(b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}
