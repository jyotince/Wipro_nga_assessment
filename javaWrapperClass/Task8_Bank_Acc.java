package classPractice.javaWrapperClass;


//Task 10: Wrapper Classes with Sorting 
class BankAccount { 
    private String accNo; 
    private Double balance; 
 
    public BankAccount(String accNo) { 
        this.accNo = accNo; 
        this.balance = 0.0; 
    } 
 
    public void deposit(double amount) { 
        balance += amount; 
    } 
 
    public void withdraw(double amount) { 
        if (balance >= amount) 
            balance -= amount; 
        else 
            System.out.println("Insufficient funds"); 
    } 
 
    public void showBalance() { 
        System.out.println("Balance: ₹" + balance); 
    } 
} 
 
public class Task8_Bank_Acc { 
    public static void main(String[] args) { 
        BankAccount acc = new BankAccount("AC12345"); 
        acc.deposit(5000); 
        acc.withdraw(1200); 
        acc.showBalance(); 
    } 
} 
