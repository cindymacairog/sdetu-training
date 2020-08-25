package oop;

public class BankAccount implements IRate {
	String accountNumber;
	private static final String routingNumber = "0436253";
	
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructor definitions: unique methods
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT:$" +  initDeposit);
		String Msg = null;
		if(initDeposit < 1000) {
			 Msg = "ERROR: Minimum deposit must be at least $1,000";
		}
		else {
			 Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	//GETTERS / SETTERS
	
	//Allow  the user to define the name
	public void setName(String name) {
		this.name = "Agent " + name;
	}
	public String getName() {
		return name;
	}
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	//Interface Methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	//Define Methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");

	}
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[NAME: " + name + ", ACCOUNT#: " + accountNumber + " ROUTING #" +
	routingNumber + " . BALANCE: $" + balance + " ]";
	}
}


