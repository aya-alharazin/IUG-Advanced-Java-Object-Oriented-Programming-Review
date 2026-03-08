/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author aya
 */
class BankDemo {

    public static void main(String[] args) throws IOException {


        DataOutputStream dos = new DataOutputStream(
                                    new FileOutputStream("src/programming2/test.dat"));
        dos.writeUTF("Aya");
        dos.writeInt(12);
        dos.writeFloat(12.5f);
        dos.close();
        DataInputStream dis = new DataInputStream(
                                    new FileInputStream("src/programming2/test.dat"));
        
        System.out.println(dis.readUTF());
        System.out.println(dis.readInt());
        System.out.println(dis.readFloat());
        dis.close();
        
        
        
        
//        CurrentAccount current = new CurrentAccount(
//            "CUR-001",     // accountNumber
//            "Bob Jones",   // accountHolder
//            500.00,        // initialBalance
//            300.00,        // overdraftLimit → can go $300 below zero
//            10.00          // monthlyFee
//        );

        // ── POLYMORPHISM: both variables are of type Account ────────────────
//        Account[] accounts = { savings, current };
//
//        for (Account acc : accounts) {
//            acc.displayAccountInfo();   // calls overridden version in each subclass
//            System.out.println();
//        }

        // ─────────────────────────────────────────────────────────────────────
//        System.out.println("SAVINGS ACCOUNT - Transaction");
//
//        System.out.println("Deposit $500:");
//        savings.deposit(500.00);//1500
//
//        System.out.println("Withdraw $200 (valid):");
//        savings.withdraw(200.00);//1300
//
//        System.out.println("Attempt to withdraw $1,200 (would breach minimum $200):");
//        savings.withdraw(1_200.00);   // BLOCKED — overridden withdraw() kicks in
//
//        System.out.println("\n  > Apply annual interest (4%):");
//        savings.calculateInterest();  // OVERRIDDEN — credits interest
//
//        System.out.println("-----------------------------");
//        savings.displayAccountInfo();

        // ─────────────────────────────────────────────────────────────────────
//        System.out.println("CURRENT ACCOUNT - Transactions");
//
//        System.out.println("\n  > Deposit $100:");
//        current.deposit(100.00);
//
//        System.out.println("\n  > Withdraw $550 (uses part of overdraft):");
//        current.withdraw(550.00);     // OVERRIDDEN — overdraft logic
//
//        System.out.println("\n  > Attempt to withdraw $400 (exceeds overdraft limit):");
//        current.withdraw(400.00);     // BLOCKED — overdraft exceeded
//
//        System.out.println("\n  > Apply monthly maintenance fee ($10):");
//        current.calculateInterest();  // OVERRIDDEN — deducts fee instead of adding interest
//
//        System.out.println();
//        current.displayAccountInfo();
//
//        // ─────────────────────────────────────────────────────────────────────
//        System.out.println("POLYMORPHISM IN ACTION - same call, different behaviour");
//
//        System.out.println("  Calling calculateInterest() on each account:\n");
//        for (Account acc : accounts) {
//            System.out.printf("  [%s — %s]%n",
//                acc.getAccountType(), acc.getAccountHolder());
//            acc.calculateInterest();  // dispatched at RUNTIME to correct subclass
//            System.out.println();
//        }

    }

    
}
