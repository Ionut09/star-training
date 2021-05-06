package com.star.java.oop.overloading;

public class Sum {

    public static void main(String[] args) {
        Sum calc = new Sum();
        System.out.println(calc.sum(new int[]{1, 2}));
        System.out.println(calc.sum(1, 2, 3));
        System.out.println(calc.sum(1, 2, 3, 4, 5));
        System.out.println(calc.sum());
    }

    //    private int sum(int a, int b) {
//        return a + b;
//    }
//
//    private int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    private int sum(int a, int b, int c, int d, int e) {
//        return a + b + c + d + e;
////    }
//
    private int sum(int... arr) { //var-args e privit ca un array(vector)
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

//    private int sum(int[] arr) { //var-args e privit ca un array(vector)
//        int sum = 0;
//        for (int element : arr) {
//            sum += element;
//        }
//        return sum;
//    }
}
