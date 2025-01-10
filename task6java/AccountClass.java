package task6java;

public class AccountClass {

	private String accountHolderName;
	private double balance;
	
	public AccountClass() {
		this.accountHolderName = "Raj";
		this.balance = 2345.032;
	}
	
	public AccountClass(String accountHolderName, double balance) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	//Deposit Method
	public void deposit(double amount) {
		if(amount>0) {
			balance = balance+amount;
			System.out.println("Deposited: "+amount);
			System.out.println("Current balance: "+balance);
		} else {
			System.out.println("Invalid Deposit amount");
		}
	}
	
	//Withdraw
	public void withdraw(double amount) {
		if(amount>0 && amount <= balance) {
			balance = balance-amount;
			System.out.println("Withdrawed: "+amount);
			System.out.println("Current Balance: "+balance);
		} else {
			System.out.println("Insufficient Amount");
		}
		
	}
		public double checkBalance() {
			return balance;
		}
		
		public String getAccountHolderName() {
			return accountHolderName;
		}

	
	
	
	
	public static void main(String[] args) {
		// using no Argument
		AccountClass account1 = new AccountClass();
		
		System.out.println("Account 1");
		System.out.println("AccountHolder: "+account1.getAccountHolderName());
		System.out.println("Balance: "+account1.checkBalance());
		account1.deposit(100);
		account1.withdraw(20);
		System.out.println("Balance after transaction: "+account1.checkBalance());
		System.out.println();
		
		//using Argument 
		AccountClass account2 = new AccountClass("Raj", 500);
		
		System.out.println("Account 2");
		System.out.println("Account Holder: "+account2.accountHolderName);
		System.out.println("Balance: "+account2.checkBalance());
		account2.deposit(10000);
		account2.withdraw(15000);
		System.out.println("Balance after Transaction: "+account2.checkBalance());
		
	}

}
