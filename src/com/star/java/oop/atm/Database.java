package com.star.java.oop.atm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.SneakyThrows;

public class Database {

    public static Map<String, Card> cards = new HashMap<>();

    public static final String customers = "/home/ionut/workspace/trainings/star-training/files/customers.csv";

    public static final String accounts = "/home/ionut/workspace/trainings/star-training/files/accounts.csv";

    public static final String card = "/home/ionut/workspace/trainings/star-training/files/cards.csv";

    static {
//        Customer johnDoe = new Customer("105827873982739872", "John Doe", "john.doe@gmail.com", "07672716217");
//
//        cards.put("1234 2615 2612 2121", new Card(
//                "1234 2615 2612 2121",
//                "233",
//                LocalDate.of(2025, 6, 6),
//                "1234",
//                new Account("RO20INGB3298279727392", johnDoe)));
//
//        cards.put("1234 2222 3333 4444", new Card(
//                "1234 2222 3333 4444",
//                "344",
//                LocalDate.of(2025, 6, 6),
//                "0000",
//                new Account("RO27BRDE0762267271212", johnDoe)));

        try {
            List<Customer> customers = importCustomers();
            List<Account> accounts = importAccounts(customers);
            cards = importCards(accounts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows
    private static Map<String, Card> importCards(List<Account> accounts) {

        return Files.lines(Paths.get(card))
                    .map(line -> {
                        String[] cardDetails = line.split(",");
                        return new Card(cardDetails[0],
                                cardDetails[1],
                                LocalDate.parse(cardDetails[2], DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                                cardDetails[3],
                                accounts.stream()
                                        .filter(c -> c.getIban().equals(cardDetails[4]))
                                        .findFirst()
                                        .get());
                    })
                    .collect(Collectors.toMap(card1 -> card1.getCardNumber(), card1 -> card1));
    }

    private static List<Account> importAccounts(List<Customer> customers) throws IOException {

        return Files.lines(Paths.get(accounts))
                    .map(line -> {
                        String[] accDetails = line.split(",");
                        return new Account(accDetails[0], customers.stream()
                                                                   .filter(c -> c.getCnp().equals(accDetails[1]))
                                                                   .findFirst()
                                                                   .get());
                    })
                    .collect(Collectors.toList());
    }

    private static List<Customer> importCustomers() throws IOException {
        return Files.lines(Paths.get(customers))
                    .map(line -> {
                        String[] custDetails = line.split(",");
                        return new Customer(custDetails[0], custDetails[1], custDetails[2], custDetails[3]);
                    })
                    .collect(Collectors.toList());
    }
}
