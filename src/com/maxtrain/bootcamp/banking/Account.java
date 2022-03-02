package com.maxtrain.bootcamp.banking;

public class Account {
	//field to hold a piece of data (like a C# property but with no get;set; )
	private int accountNo;
	private static int nextAccountNo = 1; //static to be used only once and not create "1" every time called 
	private String description;
	private double balance;
	//right click/hover sources/click "generate getter setter"
	
	
	//throwing Exceptions (unlike .NET) you must state there is an exception after the parameters (method must end in boolean)
	public boolean deposit(double amount) throws Exception {
		if(amount <= 0) {
			throw new Exception("Amount must be GREATER THAN or EQUAL to ZERO!");
		}
		//use getters and setters (unlike .NET)
		double sum = amount + getBalance();
		setBalance(sum);
		//*short form of above statement -- "setBalance(getBalance() + amount);"
		return true;
	}
	//using void instead of boolean removes need for return
	public /*boolean*/void withdraw(double amount) throws Exception{
		if(amount <= 0) {
			throw new Exception("Amount must be GREATER THAN or EQUAL to ZERO!");
		}
		if(amount > getBalance()) {
			throw new Exception("Insufficient Funds!");
		}
		setBalance(getBalance() - amount);
		//return true;
	}
	public void transfer(double amount, Account toAccount) throws Exception {
		this.withdraw(amount);
		/*try {
			withdraw(amount);
		} catch(Exception ex) {
			throw new Exception("Withdraw fail in Transfer!");
		}*/
		toAccount.deposit(amount);
		
	}
	public String toString() {
		//concatenate string data to be called from program package
		var message = "accountNo   = " + this.getAccountNo() + "\n"
					+ "description = " + this.getDescription() + "\n"
					+ "balance     = " + this.getBalance();
		return message;
	}
	//default Constructor
	public Account() {
	}
	//Constructor (name of the class) user can ONLY edit Description
	public Account(String description) {
		this.setDescription(description);
		this.setAccountNo(this.nextAccountNo++);
		try {
			this.setBalance(0);
		} catch(Exception ex) {}
	}
	
	
	//get method public (getter)
	public int getAccountNo() {
		return accountNo;
	}
	//set method (setter) *sometimes private to avoid changes by user *protected if the inherited classes access
	protected void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBalance() {
		return balance;
	}
	//make setBalance private to prevent outside changes
	private void setBalance(double balance) throws Exception {
		//check that balance is greater than 0
		if(balance < 0) {
			throw new Exception("Balance must be GREATER THAN or EQUAL to ZERO!");
		}
		this.balance = balance;
	}
	
}
