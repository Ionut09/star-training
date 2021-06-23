package com.star.java.oop.streams.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WallStreet {
    static Trader raoul = new Trader("Raoul", "Cambridge");

    static Trader mario = new Trader("Mario", "Milan");

    static Trader alan = new Trader("Alan", "Cambridge");

    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    /**
     1. Find all transactions in the year 2011 and sort them by value (small to high).
     2. What are all the unique cities where the traders work?
     3. Find all traders from Cambridge and sort them by name.
     4. Return a string of all traders’ names sorted alphabetically.
     5. Are any traders based in Milan?
     6. Print all transactions’ values from the traders living in Cambridge.
     7. What’s the highest value of all the transactions?
     8. Find the transaction with the smallest value.
     */
    public static void main(String[] args) {
        System.out.println(ex4());
        System.out.println("Are traders from Milan? " + ex5());
        ex6();
    }

    private static String ex4() {
        return transactions.stream()
                           .map(transaction -> transaction.getTrader().getName())
                           .distinct()
                           .sorted()
                           .collect(Collectors.joining("\n"));
    }

    private static boolean ex5() {
        return transactions.stream()
                           .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));
    }

    private static void ex6() {
        int sum = transactions.stream()
                              .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                              .mapToInt(transaction -> transaction.getValue())
//                             .forEach(tr -> System.out.println(tr.getValue()));
                              .sum();
        System.out.println("sum = " + sum);
    }
}
