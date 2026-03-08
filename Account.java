/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming2;

/**
 *
 * @author aya
 */
public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber  = accountNumber;
        this.accountHolder  = accountHolder;

        // Guard against a negative opening balance
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }
   
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("  [ERROR] Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.printf("  [DEPOSIT]  +$%.2f  |  New Balance: $%.2f%n", amount, balance);
    }
   
   
   
      public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("  [ERROR] Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.printf("  [ERROR] Insufficient funds. Balance: $%.2f, Requested: $%.2f%n",
                    balance, amount);
            return;
        }
        balance -= amount;
        System.out.printf("  [WITHDRAW] -$%.2f  |  New Balance: $%.2f%n", amount, balance);
    }

    public String getAccountType() {
        return "Generic Account";
    }
   
    public void calculateInterest() {
        System.out.println("  [INFO] No interest rule defined for a generic account.");
    }
    
    
    static{
        System.out.println("Aya test sth");
    }
    
        public void displayAccountInfo() {
        System.out.println( "Account Type: "+ getAccountType());
        System.out.println( "Account Number: "+ accountNumber);
        System.out.println( "Account Holder: "+ accountHolder);
        System.out.println( "Balance: "+ balance);
    }
        
    public String getAccountNumber() { return accountNumber; }

    public String getAccountHolder()  { return accountHolder; }

    public double getBalance()        { return balance; }

    // Protected setter so subclasses (e.g. overdraft in CurrentAccount) can
    // adjust the balance without making it public to the outside world.
    protected void setBalance(double balance) { this.balance = balance; }
    
        
        
       public static void haha(){
           System.out.println("Account static");
       }
        
   
}
