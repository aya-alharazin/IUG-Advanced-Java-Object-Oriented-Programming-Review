/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming2.oop;

/**
 *
 * @author aya
 */
public class CurrentAccount extends Account{
    
    private float overdraftLimit;
    private float monthlyFee;
    public CurrentAccount(String accountHolder, float balance,float overdraftLimit) {
        super(accountHolder, balance, "Curr - ");
        this.overdraftLimit=overdraftLimit;
    }

    @Override
    public boolean withdraw(float amount) {

        if(amount<=0){
            System.out.println("Invalid amount");
            return false;
        }
        float availableFund = this.balance+overdraftLimit;
        if(amount>availableFund){
            System.out.println("Amount exceeds overdraft limit");
            return false;
        }
        this.balance-=amount;
        return true;
    }
    
    
    @Override
    public String getReport(){
        return super.getReport()+"\nOverdraft limit: "+this.overdraftLimit+
                "\nMonthly Fee: "+this.monthlyFee;
    }

    public float getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(float overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public float getMonthltFee() {
        return monthlyFee;
    }

    public void setMonthltFee(float monthltFee) {
        this.monthlyFee = monthltFee;
    }
    
    public static String getClassType(){
        return "Current Account";
    }
    
}
