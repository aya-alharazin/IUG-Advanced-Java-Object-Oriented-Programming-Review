/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming2.oop;

/**
 *
 * @author aya
 */
public abstract class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected float balance;
    private static int counter = 0;
    
    public Account(String accountHolder, float balance,String prefix) {
        this.accountHolder = accountHolder;
        this.balance=balance;
        this.accountNumber=generateAccountNumber(prefix);
    }

    private String generateAccountNumber(String prefix){
        return prefix+counter++;
    }
    
    public boolean deposit(float amount){
        if(amount<=0){
            System.out.println("Invalid amount");
            return false;
        }
        this.balance+=amount;
        return true;
    }
    
    public String getReport(){
        return "Account Number: "+this.accountNumber+
                "\nAccount Holder:"+this.accountHolder+
                "\nBalance: "+this.balance;
    }
    
    public abstract boolean withdraw(float amount);
    
    
    
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    
    public static String getClassType(){
        return "Account";
    }
}
