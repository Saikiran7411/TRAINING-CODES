package jspiders;

public class Bankimp implements Bank {
	
	private int  balance;
	
	Bankimp(int balance)
	{
		this.balance=balance;
	}
	@Override
	
	public void deposit(int amount)
	{
		System.out.println("Depositing Rs:"+ amount);
		balance=balance+amount;
		System.out.println("Amount Deposited Succesfully");
	}
	
	public void withdraw(int amount)
	{
		if(amount<=balance)
		{
			
		System.out.println("Withdrawing Rs:"+ amount);
		balance=balance-amount;
		System.out.println("Amount withdrawn Succesfully");
		}
		else
		{
			try {
						
			throw new InsufficientBalanceException("Insufficient Balance");  
			}
			catch(Exception e)
			{
				System.out.println("e.getMessage");//invoke an exception
			}
		}
	}
	
	public int checkBalance()
	{
		return balance;
	}
	
	public String  displayErrorMessage()
	{
		return "Invalid Choice,Kindly Enter valid choice";
	}
	
	
	
	
	

}
