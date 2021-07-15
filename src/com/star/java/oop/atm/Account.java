package com.star.java.oop.atm;


import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Account {

    private String iban;

    private BigDecimal balance;

    private Customer customer;

    public void deposit(BigDecimal depositAmount) {
        System.out.println();
        balance = balance.add(depositAmount);
        System.out.println("Deposit of amount: " + depositAmount +
                " done.\nNew balance is: " + balance);
    }

    public void withdraw(BigDecimal withdrawalAmount) {
        if (balance.compareTo(withdrawalAmount) < 0) {
            System.out.println("Insufficient balance: " + balance);
            return;
        }

        balance = balance.subtract(withdrawalAmount);
        System.out.println("Withdrawal of amount: " + withdrawalAmount +
                " processed.\nNew balance is: " + balance);
    }

    public Account(String iban, Customer customer) {
        balance = BigDecimal.ZERO;
        this.iban = iban;
        this.customer = customer;
    }
}
