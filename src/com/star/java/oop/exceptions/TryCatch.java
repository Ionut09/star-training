package com.star.java.oop.exceptions;

public class TryCatch {

    public static void main(String[] args) throws MyCustomCheckedException {//args[0]=13, args[1]=14, args[2]=15
        int parsedInt;
        try {
            Student john = new Student();
            john.setNote(12);
            parsedInt = parse(args[0]); //tb sa fie in try-catch
            System.out.println("After parsing...");
            //
        } catch (NumberFormatException exception) { //EHM ia mereu in ordine catch-urile
            System.out.println(exception);
            parsedInt = 0;
        } catch (IllegalArgumentException | ArithmeticException ex) { //in catch putem folosi doar clase (exceptii/erori) ce extind java.lang.Throwable
            System.out.println("Exception caught");
            System.out.println(ex);
            parsedInt = 0;
        } catch (Exception exception) {
            System.out.println(exception);
            System.err.println(exception.getMessage());
            exception.printStackTrace();
            System.err.println("Nothing escapes from our last catch");
            parsedInt = 0;
        }

        System.out.println("After the try catch. All good: " + parsedInt);
        throwsChecked(); //handle or declare rule
        throwsUnchecked();
    }

    private static int parse(String s) {
        throw new IllegalStateException("Our custom message");
//        return Integer.parseInt(s);
    }

    private static void throwsChecked() throws MyCustomCheckedException {
        throw new MyCustomCheckedException("A good message");
    }

    private static void throwsUnchecked() throws MyCustomUncheckedException{
        throw new MyCustomUncheckedException("A good message");
    }
}
