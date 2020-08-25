package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("456475489", 1000.50);
		BankAccount acc2 = new BankAccount("739124292", 2000);
		BankAccount acc3 = new BankAccount("891052423", 2500);

		acc1.setName("Olaf");
		System.out.println(acc1.getName());
		acc1.makeDeposit(600);
		acc1.makeDeposit(500);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString()); 
	}

}

class BankAccount implements IInterest {
	//Props
	 private static int iD = 1000; //internal
	 private String accountNumber; //ID, random2dig, 2SSN
	 private static final String routingNumber = "007900238";
	 private String name;
	 private String SSN;
	 private double balance;
	 
	 //Constructor
	 public BankAccount(String SSN, double initDeposit) {
		 balance = initDeposit;
		 this.SSN = SSN;
		 iD++;
		 setAccountNumber();
	 }
	 
	 private void setAccountNumber() {
		 int random = (int) (Math.random() * 10);
		 accountNumber = iD + "" + random +  SSN.substring(0,2);
		 System.out.println("Your account created:" + accountNumber);
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getName() {
		return name;
	 }
	 
	 public void payBill(double amount) {
		 balance = balance - amount;
		 System.out.println("Paying bill: " + amount);
		 showBalance();
	 }
	 public void  makeDeposit(double amount) {
		 System.out.println("Making deposit: " + amount);
		 balance = balance + amount;
		 showBalance();
	 }
	 public void showBalance() {
		 System.out.println("Balance: " + balance);
	 }

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	 
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n"
	+ "[Routing Number: " + routingNumber + "]\n" + "[Balance: " +balance + "]" ; 
	}

}
