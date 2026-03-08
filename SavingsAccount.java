/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming2;

/**
 *
 * @author aya
 */
public class SavingsAccount extends Account{
    private double interestRate;    // Annual interest rate, e.g. 0.04 = 4%
    private double minimumBalance;  // Account balance must never fall below this


    public SavingsAccount(String accountNumber, String accountHolder,
                          double initialBalance, double interestRate,
                          double minimumBalance) {
        System.out.println("Aya test sth2");
        // ── Calls the parent (Account) constructor ──
        super(accountNumber, accountHolder, initialBalance);

        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }
        if (minimumBalance < 0) {
            throw new IllegalArgumentException("Minimum balance cannot be negative.");
        }
        if (initialBalance < minimumBalance) {
            throw new IllegalArgumentException(
                "Initial balance ($" + initialBalance +
                ") must be at least the minimum balance ($" + minimumBalance + ").");
        }

        this.interestRate   = interestRate;
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        double projectedBalance = getBalance() - amount;
        if (projectedBalance < minimumBalance) {
            System.out.printf(
                "  [BLOCKED] Withdrawal of $%.2f would breach minimum balance ($%.2f).%n",
                amount, minimumBalance);
            System.out.printf("  [INFO]    Maximum withdrawable: $%.2f%n",
                getBalance() - minimumBalance);
            return;
        }
        // Delegate valid withdrawals to the parent implementation
        super.withdraw(amount);
    }
    
    
    
    @Override
    public String getAccountType() {
        return "Savings Account";
    }
    
    
    
        @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);   // uses protected setter from Account
        System.out.printf(
            "  [INTEREST] Rate: %.1f%%  |  Earned: $%.2f  |  New Balance: $%.2f%n",
            interestRate * 100, interest, getBalance());
    }
    
    
    
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();   // print the common info first
        System.out.println(
            "Interest Rate: " +interestRate * 100+
                         "%\nMin. Balance: "+minimumBalance);
    }
    
    
    public static void haha(){
           System.out.println("Savings Account static");
       }

}
