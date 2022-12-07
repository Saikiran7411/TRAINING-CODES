package jspiders;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Bank bank=new Bankimp(5000);
		while(true)
		{
			System.out.println("1:Deposit Amount\n2:Withdraw amount\n3:Check Balance");
			System.out.println("4:EXIT\nEnter choice");
			int choice =sc.nextInt();

			switch(choice)
			{
			case 1:System.out.println("Enter Amount to be Deposited:");
			bank.deposit(sc.nextInt());
			break;

			case 2:System.out.println("Enter amount to be Withdrawn");
			bank.withdraw(sc.nextInt());
			break;

			case 3:System.out.println("Available Balance: Rs "+bank.checkBalance());
			break;

			case 4:
				System.out.println("THANK YOU!!!");
				System.exit(0);

			default:
				String message=bank.displayErrorMessage();
				System.out.println(message);
			}
				System.out.println("+++++++++++++++++++++");
			}//after switch Statement

		}
	}


