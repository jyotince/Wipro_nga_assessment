package classPractice.multiThreading_tasks;

class BankAccount { 
    private int balance = 1000; 
 
    synchronized void withdraw(int amount, String user) { 
        if (balance >= amount) { 
            System.out.println(user + " is withdrawing $" + amount); 
            balance = balance - amount; 
            System.out.println("Remaining Balance: $" + balance); 
        } else { 
            System.out.println(user + " tried to withdraw but insufficient funds."); 
        } 
    } 
} 
 
public class Task8_BankAccountWithdrawal { 
    public static void main(String[] args) { 
        BankAccount account = new BankAccount(); 
 
        Runnable Customer1 = () -> account.withdraw(700, "Person1"); 
        Runnable Customer2 = () -> account.withdraw(500, "Person2"); 
 
        new Thread(Customer1).start(); 
        new Thread(Customer2).start(); 
    } 
} 
