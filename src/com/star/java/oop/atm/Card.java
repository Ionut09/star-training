package com.star.java.oop.atm;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
//@Getter
//@Setter
//@ToString

@Data
public class Card {

    private String cardNumber;

    private String cvv;

    private LocalDate expiryDate;

    private String pin;

    private Account account;

}
