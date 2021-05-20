package com.star.java.strings;

/**
 *
 * Write a method to convert lowercase string to uppercase.
 * Write a method to convert uppercase string to lowercase.
 * Write a method to toggle case of each character of a string.
 * Write a method to find total number of alphabets, digits or special character in a string.
 * Write a method to count total number of vowels and consonants in a string.
 * Write a method to count total number of words in a string.
 * Write a method to find reverse of a string.
 * Write a method to check whether a string is palindrome or not.
 * Write a method to reverse order of words in a given string.
 * Write a method to find first occurrence of a character in a given string.
 * Write a method to find last occurrence of a character in a given string.
 * Write a method to search all occurrences of a character in given string.
 * Write a method to count occurrences of a character in given string.
 * Write a method to find highest frequency character in a string.
 */
public class StringAPI {
    public static void main(String[] args) {
        String s = "QWERTyuio"; //are index 0 - (length-1) pt fiecare caracter
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i)+",");
        }

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.println("aChar = " + aChar);
        }
    }

    //Write a method to find length of a string.
    public int length(String s) {
        int length = s.length();
        System.out.println("length of " + s + " = " + length);
        return length;
    }

    //Write a method to concatenate two strings.
    private String concat(String s1, String s2) {
        String concat = s1.concat(s2); //s1+s2
        return concat;
    }

    //String comparison
    private boolean equality(String s1, String s2) {
        return s1.equals(s2); //verifica daca au aceleasi caractere in aceeasi ordine, cu acleasi case
//      return s1.equalsIgnoreCase(s2); //verifica daca au aceleasi caractere in aceeasi ordine, indiferent de case
    }

    //String comparison //-1, 0, 1 -> s1 < s2, s1==s2, s1>s2
    private int comparison(String s1, String s2) {
        return s1.compareTo(s2);
    }

    private int lowestFrequencyChar(String s) {
        return 0;
    }

}


/* Write a method to find lowest frequency character in a string.
 * Write a method to count frequency of each character in a string.
 * Write a method to remove first occurrence of a character from string.
 * Write a method to remove last occurrence of a character from string.
 * Write a method to remove all occurrences of a character from string.
 * Write a method to remove all repeated characters from a given string.
 * Write a method to replace first occurrence of a character with another in a string.
 * Write a method to replace last occurrence of a character with another in a string.
 * Write a method to replace all occurrences of a character with another in a string.
 * Write a method to find first occurrence of a word in a given string.
 * Write a method to find last occurrence of a word in a given string.
 * Write a method to search all occurrences of a word in given string.
 * Write a method to count occurrences of a word in a given string.
 * Write a method to remove first occurrence of a word from string.
 * Write a method to remove last occurrence of a word in given string.
 * Write a method to remove all occurrence of a word in given string.
 * Write a method to trim both leading and trailing white space characters from given string.
 * Write a method to remove all extra blank spaces from given string.
 */
