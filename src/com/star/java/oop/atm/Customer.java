package com.star.java.oop.atm;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Customer {

    private String cnp;

    private String name;

    private String email;

    private String phone;

}
