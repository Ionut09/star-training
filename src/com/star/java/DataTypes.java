package com.star.java;

/**
 * fully qualified name: com.star.storage.DataTypes
 */
public class DataTypes {

    public static void main(String[] aaa) {
        //printam in Java
        System.out.println("Hello Java");

        for (int i = 0; i < 10; i++) {
//            System.out.print(i + ", ");
        }

        int a = 5;
        byte x = 2, y = 3, z = 5;

        x = (byte) a;

//      long l = 123456789999997l;
        long l = 123456789999997L;

        y = (byte) (x + z);
        y = 2 + 5;

        System.out.println(x / y); //0
        System.out.println((float) x / y); //

        float f = 3.5f;//decimal literals are double in Java
        double d = 3.5;

//        Integer.MIN_VALUE;
//        Integer.MAX_VALUE;

        String number = "123";
        System.out.println(Integer.parseInt(number) + 7);

        //underflow si overflow
        System.out.println("overflow Integer.MAX_VALUE + 1 -> " + (Integer.MAX_VALUE + 1));
        System.out.println("underflow Integer.MIN_VALUE - 1 -> " + (Integer.MIN_VALUE - 1));

        System.out.println('a');
        System.out.println('\141');    //ASCII code este in baza 8
        System.out.println('\u0061');  //Unicode code este in baza 16

        System.out.println('a' + 0); //int -> Unicode-ul lui 'a' + 1
        System.out.println(Integer.toOctalString(97));
        System.out.println(Integer.toHexString(97));

        char start = 'A';

        for (int i = 0; i < 26; i++) {
//          System.out.println(start++); //char start = start + 1;
            System.out.println((char) (start + i));
        }

        int formatted = 21_782_187; //nu are semnificatie asupra valorii
        System.out.println("formatted = " + formatted);

        int sum;

        if (formatted > 20000) {
            sum = formatted - 100;
        } else {
            sum = formatted + 100;
        }
        //ternarul se poate folosi doar pt a genera o valoare care sa fie folosita ulterior, ca mai jos
//        return (formatted > 20000) ? formatted - 100 : formatted + 100;

        sum = (formatted > 20000) ? formatted - 100 : formatted + 100;

    }
}
