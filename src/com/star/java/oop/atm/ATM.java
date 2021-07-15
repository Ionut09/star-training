package com.star.java.oop.atm;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

import static com.star.java.oop.atm.Database.cards;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our ATM!");

        System.out.println("Enter your card: ");
        String cardNumber = sc.nextLine();

        if (!cards.containsKey(cardNumber)) {
            System.out.println("Unknown card, please enter a valid card.");
            return;
        }

        int tries = 3;
        int option = 0;

        Card card = cards.get(cardNumber);

        while (true) {
            print("Enter your pin: ");
            String pin = sc.next();

            tries--;

            if (!pin.equals(card.getPin())) {
                if (tries > 0) {
                    print("Wrong pin. You have " + tries + " remaining attempts!");
                    continue;
                } else {
                    print("Sorry, too many failed attempts! \nWe will retain your card.");
                    cards.remove(cardNumber);
                    return;
                }
            } else {
                break;
            }
        }

        BIG_LOOP:
        while (true) {

            if (option == 0) {
                System.out.println("Please enter an option: \n" +
                        "1 -> Withdraw \n" +
                        "2 -> Deposit \n" +
                        "3 -> Change PIN \n" +
                        "4 -> View sold \n" +
                        "5 -> Exit");

                option = sc.nextInt();
            }

            switch (option) {
                case 1: {
                    print("Enter the amount you want to withdraw: ");
                    double amount = sc.nextDouble();
                    card.getAccount().withdraw(new BigDecimal(amount));
                    option = 0;
                    break;
                }
                case 2: {
                    print("Enter the amount you want to deposit: ");
                    double amount = sc.nextDouble();
                    card.getAccount().deposit(new BigDecimal(amount));
                    option = 0;
                    break;
                }
                case 3: {
                    print("Enter the new pin: ");
                    String newPin = sc.next();
                    if (!newPin.matches("[0-9]{4}")) {
                        print("Pin should have 4 digits");
                        return;
                    }
                    card.setPin(newPin);
                    option = 0;
                    break;
                }

                case 4: {
                    print("Your current balance is: " + card.getAccount().getBalance().toString());
                    option = 0;
                    break;
                }

                case 5: {
                    print("Thank you for using our services! Have a nice day!");
                    break BIG_LOOP;
                }
                default: {
                    print("Invalid option!");
                    option = 0;
                }
            }
        }
    }

    private static void print(String message) {
        System.out.println(message);
    }

    private static void flushChangesToFiles(Map<String, Card> cards) {
//        Files.write( pathTotheFile, listWithLinesToBeWritten, StandardOpenOption.TRUNCATE_EXISTING)
    }
}
