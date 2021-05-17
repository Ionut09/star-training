package com.star.java.oop.interfaces;

public class CallCenter {
    public static void main(String[] args) {
        Phone ph = new MobilePhone();
        MobileDevice md = new MobilePhone();

        System.out.println(ph.hasAlarm());
        System.out.println(md.hasAlarm());

        //Phone is a Device
        //MobilePhone is a Phone
        //MobilePhone is a Device
        //MobilePhone is a MobileDevice

//        MobileDevice mobileDevice = ph; //nu, pt ca nu satisfac relatia de is-a
        Device d1 = ph;
        Device d2 = md;
    }
}
