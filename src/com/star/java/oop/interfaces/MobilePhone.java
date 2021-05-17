package com.star.java.oop.interfaces;

public class MobilePhone implements Phone, MobileDevice {

    boolean on;

    boolean ringing;

    public final void powerON() { //metoda nu mai poate fi suprascrisa
        on = true;
    }

    public final void powerOFF() {
        on = false;
    }

    public void answer() {
        if (ringing) {
            System.out.println(hasAlarm());
            System.out.println("Answer phone");
        }
    }

    public void dial(String number) {
        System.out.println("Dialing: " + number);
    }

    public boolean isRinging() {
        return ringing;
    }

    @Override
    public void charge() {
        System.out.println("Charging phone");
    }

    public boolean hasAlarm() {
        return true;
    }
}
