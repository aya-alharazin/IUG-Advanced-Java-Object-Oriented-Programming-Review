/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming2.oop;

import java.util.ArrayList;

/**
 *
 * @author aya
 */
public class BankDemo {
    public static void main(String[] args) {
        
        SavingsAccount savings =new SavingsAccount("Aya",5000,2000);
        CurrentAccount current =new CurrentAccount("Ahmed", 5000, 2000);
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(savings);
        accounts.add(current);
        
        for(Account c:accounts){
            c.withdraw(5000);
        }
        for(Account c:accounts){
            System.out.println(c.getReport());
            System.out.println("---------------");
        }
        
        
       for(Account c:accounts){
            System.out.println(c.getClassType());
            System.out.println("---------------");
        }
        
        
    }
}
