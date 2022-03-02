package com.maxtrain.bootcamp.testing;
//using statement from separate package
import com.maxtrain.bootcamp.banking.Account;
import com.maxtrain.bootcamp.banking.Checking;
import com.maxtrain.bootcamp.banking.Savings;

public class Program {
	/*throws Exception()not a good idea will blow the whole thing since this is the main method*/
	public static void main(String[] args) /*throws Exception()*/ {
		
		try {
			
			var checking1 = new Checking("1st Checking");
			checking1.deposit(2000);
			checking1.writeCheck(3737, 300);
			checking1.writeCheck(4433, 400);
			System.out.println(checking1);
			
/*			var savings1 = new Savings("1st Savings");
			savings1.deposit(100);
			savings1.calculateAndPayInterest(6);
			System.out.println(savings1.toString()); //you don't have to put ".toString()" but i left it to show
			
			var account1 = new Account("1st Account");
			account1.deposit(500);
			//print from account in separate package
			System.out.println(account1.toString());
			
			var account2 = new Account("2nd Account");
			account2.deposit(1000);
			account2.deposit(350);
			System.out.println(account2.toString());
			
			try {
				account2.withdraw(700);
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			
			account2.transfer(150, account1);
			System.out.println(account1.toString());
			System.out.println(account2.toString());
	*/		
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

}
