package com.star.storage.oop;

import java.math.BigDecimal;

public class Account {

    private String iban;

    private BigDecimal balance; //immutabile -> nu pot fi schimbate

    private Customer customer; //has a

    public Account() {
        this("ABC", BigDecimal.ZERO, "John", "email", "00000");
//        balance = BigDecimal.ZERO;
        balance = new BigDecimal(0);
    }

    public Account(String iban, BigDecimal balance, String customerName, String customerEmail, String customerPhone) {
        this.iban = iban;
        this.balance = balance;
        this.customer = new Customer(customerName, customerEmail, customerPhone);
    }

    public Account(String iban, String customerName, String customerEmail, String customerPhone) {
        this(iban, new BigDecimal(0), customerName, customerEmail, customerPhone);
    }

    public void deposit(BigDecimal depositAmount) {
        System.out.println();
        balance = balance.add(depositAmount);
        System.out.println("Deposit of amount: " + depositAmount +
                " done.\nNew balance is: " + balance);
    }

    public void withdraw(BigDecimal withdrawalAmount) {
        System.out.println();
        if (balance.compareTo(withdrawalAmount) < 0) {
            System.out.println("Insufficient balance: " + balance);
            return;
        } //else {

        balance = balance.subtract(withdrawalAmount);
        System.out.println("Withdrawal of amount: " + withdrawalAmount +
                " processed.\nNew balance is: " + balance);
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
