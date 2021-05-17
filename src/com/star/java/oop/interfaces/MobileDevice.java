package com.star.java.oop.interfaces;

public interface MobileDevice extends Device {
    //static + final = const
//   public final static boolean isPortable = true; //final --> nu poate fi reinitializat
    boolean PORTABLE = true; //final --> nu poate fi reinitializat

    void charge();

    default boolean hasAlarm() {
        return true;
    }
}
