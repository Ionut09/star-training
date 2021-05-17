package com.star.java.oop.interfaces;

public interface Phone extends Device {

    void answer();

    void dial(String number);

    boolean isRinging();

    //metode speciale cu implementare in interfete

    //default == cu metode instanta
    public default boolean hasAlarm() { //sunt publice implicit
        return alarmBehaviour();
    }

    //static == cu metode statice
    public static boolean canCall() {  //sunt publice implicit
        return false;
    }

    //private == cu metode de instanta, dar private
    private boolean alarmBehaviour(){
        return false;
    }

}
