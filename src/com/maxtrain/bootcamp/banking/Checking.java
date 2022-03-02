package com.maxtrain.bootcamp.banking;

public class Checking extends Account {
	
	private int nbrOfChecks = 0;
	//private static int nextCheckNo = 1;
	
	public void writeCheck(int checkNo, double amount) throws Exception {
		withdraw(amount);
		nbrOfChecks++;
	}
	
	public Checking(String description) {
		super(description);
		this.setNbrOfChecks(0);
	}
	
	public String toString() {
		return super.toString() + "\nchecks written: " + nbrOfChecks;
	}

	public int getNbrOfChecks() {
		return nbrOfChecks;
	}

	private void setNbrOfChecks(int checkNo) {
		this.nbrOfChecks = checkNo;
	}
	
	
}
