/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming2;

/**
 *
 * @author aya
 */
public class CurrentAccount extends Account{
    private double overdraftLimit;  // How far below $0 the account may go
    private double monthlyFee;      // Flat fee charged each month

    
   public CurrentAccount(String accountNumber, String accountHolder,
                          double initialBalance, double overdraftLimit,
                          double monthlyFee) {

        // ── Calls the parent (Account) constructor ──
        super(accountNumber, accountHolder, initialBalance);

        if (overdraftLimit < 0) {
            throw new IllegalArgumentException("Overdraft limit cannot be negative.");
        }
        if (monthlyFee < 0) {
            throw new IllegalArgumentException("Monthly fee cannot be negative.");
        }

        this.overdraftLimit = overdraftLimit;
        this.monthlyFee     = monthlyFee;
    }

    
   @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("  [ERROR] Withdrawal amount must be positive.");
            return;
        }

        double availableFunds = getBalance() + overdraftLimit;

        if (amount > availableFunds) {
            System.out.printf(
                "  [BLOCKED] Exceeds overdraft limit. Available (incl. overdraft): $%.2f%n",
                availableFunds);
            return;
        }
         setBalance(getBalance() - amount);
               if (getBalance() < 0) {
            System.out.printf(
                "  [WITHDRAW] -$%.2f  |  New Balance: $%.2f  [OVERDRAFT IN USE]%n",
                amount, getBalance());
        } else {
            System.out.printf(
                "  [WITHDRAW] -$%.2f  |  New Balance: $%.2f%n",
                amount, getBalance());
        }
    }

    
    @Override
    public String getAccountType() {
        return "Current Account";
    }
    
    
    
     @Override
    public void calculateInterest() {
        if (monthlyFee > 0) {
            setBalance(getBalance() - monthlyFee);
            System.out.printf(
                "  [MONTHLY FEE] -$%.2f deducted  |  New Balance: $%.2f%n",
                monthlyFee, getBalance());
        } else {
            System.out.println("  [INFO] No monthly fee for this account.");
        }
    }

    /**
     * Extends the parent's display to also show current-account-specific details.
     */
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.printf(
            "Overdraft Limit: " +overdraftLimit+
            "\nMonthly Fee: "+monthlyFee);
    }

    // ─── GETTERS ──────────────────────────────────────────────────────────────
    public double getOverdraftLimit() { return overdraftLimit; }
    public double getMonthlyFee()     { return monthlyFee;     }

}
