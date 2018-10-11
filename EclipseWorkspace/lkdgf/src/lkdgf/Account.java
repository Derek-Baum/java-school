package lkdgf;
//Account class represents a bank account with a customer name, a balance, a monthly interest rate, and a balance limit
public class Account {
	
	private String customerName;
	private double balance;
	private double monthlyIntRate;
	private double balanceLimit;
	
	//constructor without a balance limit
	public Account(String customerName,double balance, double monthlyIntRate){
		this(customerName,balance,monthlyIntRate,0);
	}
	//constructor with a balance limit
	public Account(String customerName,double balance, double monthlyIntRate, double balanceLimit){
		this.customerName = customerName;
		this.balance = balance;
		this.monthlyIntRate = monthlyIntRate;
		this.balanceLimit = balanceLimit;
	}

	//returns the customer name
	public String getCustomerName() {
		return customerName;
	}

	//returns the balance
	public double getBalance() {
		return balance;
	}
	//returns the monthly interest rate
	public double getMonthlyIntRate() {
		return monthlyIntRate;
	}
	// adds the corresponding amt to the balance
	public void deposit(double amt){
		balance += amt;
	}
	//withdraws the amount frmo the balance if and only if it will result in a valid balance that is greater than the balance limit
	//returns true if succeeded in withdrawing, otherwise false.
	public boolean withdraw(double amt){
		if(balance - amt >= balanceLimit){
			balance -= amt;
			return true;
		}
		return false;
	}
	//multiplies the balance by 1 + the monthly interest rate add one months interest.
	public void addMonthlyInterest(){
		balance *= 1.0 + monthlyIntRate;
	}
	//given Account a, it will take out as much money as needed/possible from this account in order to pay off account a's balance.
	public void payOffBalance(Account a){
		double abalance = a.getBalance();
		if(abalance > 0)
			return;
		if(balance > 0){
			if(balance >= Math.abs(abalance)){
				deposit(abalance);
				a.deposit(Math.abs(abalance));
			}else{
				a.deposit(balance);
				withdraw(balance);
			}
		}
		
	}
	
	
	
}
