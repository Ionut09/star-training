package com.star.storage.oop;

import java.math.BigDecimal;

public class Bank {

    public static void main(String[] args) {
        Account account = new Account();
        Customer customer = account.getCustomer();
        System.out.println(customer.toString());
        System.out.println("Customer: " + customer);

        account.setIban("RO20INGB3298279727392");
        account.setCustomer(new Customer("john.doe@gmail.com", "John Doe", "07672716217"));
        account.deposit(new BigDecimal(1000)); //euro
        account.withdraw(new BigDecimal(100));

        account = null; //dupa asta obiectul creat pe linia 8 va fi sters

        Account account1 = new Account("RO20INGB3298279727392",
                new BigDecimal(100),
                "john.doe@gmail.com",
                "John Doe",
                "07672716217");

        account1.deposit(new BigDecimal(5000)); //euro
        account1.withdraw(new BigDecimal(200));


    }
}
