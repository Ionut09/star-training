package com.star.java.oop.exceptions;

public class MyCustomUncheckedException extends IllegalArgumentException {
    public MyCustomUncheckedException(String message) {
        super(message);
    }
}
