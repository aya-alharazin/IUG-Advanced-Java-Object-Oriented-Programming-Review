/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming2.oop;

/**
 *
 * @author aya
 */
public class SavingsAccount extends Account{
    private float interestRate;
    private float minBalance;

    public SavingsAccount(String accountHolder, float balance,float minBalance) {
        super(accountHolder, balance, "Sav - ");
        this.minBalance=minBalance;
    }

    @Override
    public boolean withdraw(float amount) {
        if(amount <=0){
            System.out.println("Invalid amount");
            return false;
        }
        float expectedBalance = this.balance-amount;
        if(expectedBalance<minBalance){
            System.out.println("Withdrawal of "+amount+" can reach the min balance");
            return false;
        }
        this.balance = expectedBalance;
        return true;
    }
    @Override
    public String getReport(){
        return super.getReport()+"\ninterest Rate: "+this.interestRate+
                "\nmin balance: "+this.minBalance;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(float minBalance) {
        this.minBalance = minBalance;
    }
    
    public static String getClassType(){
        return "Savings Account";
    }
    
}
