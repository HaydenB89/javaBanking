package com.maxtrain.bootcamp.banking;
//Inheritance syntax for java is "extends" vs. C# ":"
public class Savings extends Account {
	
	private double interestRate = .12;
	
	public void calculateAndPayInterest(int months) throws Exception {
		if(months < 0) {
			throw new Exception("Months must be greater than 0");
		}
		var interestToBePaid = getBalance() * (getInterestRate() / 12) * months;
		try {
			deposit(interestToBePaid);
		} catch(Exception ex) {}
	}
	
	public Savings(String description) {
		//super() calls the parent class or C# : base
		super(description); // gives us account numbers
		//setDescription(description); *don't need this after we call super
		setAccountNo(getAccountNo() + 10000); //ADD 10000 to make more realistic to banks acct.No
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) throws Exception{
		if(interestRate < 0) {
			throw new Exception("Interest Rate cannot be negative!");
		}
		this.interestRate = interestRate;
	}
}
