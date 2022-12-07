package jspiders;

public interface  Bank {

	void deposit(int amount);
	void withdraw(int amount);
	int checkBalance();
	String displayErrorMessage();
	//all the above methods are automatically public and abstract


}
