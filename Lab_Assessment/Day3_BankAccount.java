package classPractice;

class Bank{
	private int accNo;
	private double balance;
	
	
	Bank(int accNo, double balance)
	{
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void deposit(double amt_dep)
	{
		if(amt_dep >0) {
			balance = balance+amt_dep;
		}
	}
	
	void withdraw(double amt_wit)
	{
		if(amt_wit <= balance) {
			balance = balance-amt_wit;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
}

public class Day3_BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank ob = new Bank(132442314, 60000);
		ob.deposit(2000);
		ob.withdraw(1000);
		System.out.println("Balance becomes: "+ ob.getBalance());
		
		

	}

}
