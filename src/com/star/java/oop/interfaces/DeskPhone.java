package com.star.java.oop.interfaces;

public class DeskPhone implements Phone {
    boolean on;

    boolean ringing;

    public void answer() {
        System.out.println("Answer desk phone");
    }

    public void dial(String number) {
        System.out.println("Dial: " + number);
    }

    public boolean isRinging() {
        return ringing;
    }

    public void powerON() {
        on = true;
    }

    public void powerOFF() {
        on = false;
    }
}
