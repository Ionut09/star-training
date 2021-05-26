package com.star.java.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import static java.lang.Character.isLetter;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

/**
 *
 * Write a method to find total number of alphabets, digits or special character in a string.
 * Write a method to count total number of vowels and consonants in a string.
 *
 * Write a method to find reverse of a string.
 * Write a method to reverse order of words in a given string.
 * Write a method to find highest frequency character in a string.
 */

public class StringAPI {
    public static void main(String[] args) {
        StringAPI api = new StringAPI();
        String s = "QWERTyuio"; //are index 0 - (length-1) pt fiecare caracter
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + ",");
        }

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.println("aChar = " + aChar);
        }

        System.out.println(api.lowestFrequencyChar("uiewunewdhoIPEWENUPB`P2UD"));

        s = "iouab  eiaunjan lksnuk l";
        System.out.println(api.removeFromString(s));

        System.out.println("Hgvg_AQW-kjnskj9AKMKAJN");
        System.out.println(api.toggleCase("Hgvg_AQW-kjnskj9AKMKAJN"));

        System.out.println(api.palindrom("skalsna"));

        System.out.println(api.countWords("kjas jksja [;][ksj_akmsl"));

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("You entered: " + i);
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

    /**
     * * Write a method to find lowest frequency character in a string.
     *  * Write a method to count frequency of each character in a string.
     */
    private char lowestFrequencyChar(String s) {
        int n = s.length(); //n^2

//        <key, value>

        Map<Character, Integer> charMap = new HashMap<>();

        char[] charactersArray = s.toCharArray();
        Arrays.sort(charactersArray);
        System.out.println(Arrays.toString(charactersArray));

        for (char character : charactersArray) {
            if (charMap.containsKey(character)) {
                int oldNumberOfOcurrences = charMap.get(character);
                charMap.put(character, oldNumberOfOcurrences + 1);
            } else {
                charMap.put(character, 1);
            }
        }
        int minOccurrences = charMap.get(charactersArray[0]);
        char lowChar = charactersArray[0];
        for (Entry<Character, Integer> entry : charMap.entrySet()) {
            Integer value = entry.getValue();

            if (minOccurrences > value) {
                minOccurrences = value;
                lowChar = entry.getKey();
            }
        }
        System.out.println(charMap);
        return lowChar;
    }

    /**
     *
     * Write a method to remove first occurrence of a character from string.
     * Write a method to remove last occurrence of a character from string.
     * Write a method to remove all occurrences of a character from string.
     * Write a method to remove all repeated characters from a given string.
     * Write a method to replace first occurrence of a character with another in a string.
     * Write a method to replace last occurrence of a character with another in a string.
     * Write a method to replace all occurrences of a character with another in a string.
     * Write a method to remove first occurrence of a word from string.
     * Write a method to remove last occurrence of a word in given string.
     * Write a method to remove all occurrence of a word in given string.
     */
    private String removeFromString(String s) {
        //un string nu e niciodata schimbat cand se apeleaza o metoda pe el
        s = s.replace("a", "A");
        s = s.replaceAll("\\s+", "_");
        s = s.replaceFirst("[A]", "O");
        s = s.replace("e", "");
        s = s.toUpperCase();
        return s;
    }

    /**
     *  * Write a method to convert lowercase string to uppercase.
     *  * Write a method to convert uppercase string to lowercase.
     */
    private String covnertCase(String s) {
//        return s.toLowerCase();
        return s.toUpperCase();
    }

    /**
     *  * Write a method to find first occurrence of a word in a given string.
     *  * Write a method to find last occurrence of a word in a given string.
     *   * Write a method to search all occurrences of a word in given string.
     *  * Write a method to count occurrences of a word in a given string.
     *   * Write a method to find first occurrence of a character in a given string.
     *  * Write a method to find last occurrence of a character in a given string.
     *  * Write a method to search all occurrences of a character in given string.
     *  * Write a method to count occurrences of a character in given string.
     */
    private int findChars(String s, String word) {
        int indexOfWrd = s.indexOf(word);//prima aparitie a lui word, daca nu-l gaseste returneaza -1
        indexOfWrd = s.lastIndexOf(word);
        return indexOfWrd;
    }

    /*
     * Write a method to remove all extra blank spaces from given string.
     */
    private String trimSpaces(String s) {
        return s.trim();
    }

    /*
     * Write a method to count total number of words in a string.

     */
    private int countWords(String s) {
        String[] words = s.split("[^a-zA-Z]+");
        System.out.println(Arrays.toString(words));
        Object arrayIsAnObjectToo = words;
        return words.length;
    }

    private boolean isAValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("[0-9]{10}");
    }

    private String toggleCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];

            if (isLetter(currentChar)) {
                if (isUpperCase(currentChar)) {
                    chars[i] = toLowerCase(currentChar);
                } else {
                    chars[i] = toUpperCase(currentChar);
                }
            }

        }
        return new String(chars);
    }

    /*
     * Write a method to check whether a string is palindrome or not.
     */
    private boolean palindrom(String s) {
        StringBuilder builder = new StringBuilder(s); //este un string mutable la care
        // efectul operatiilor se reflecta direct pe obiect
        return builder.reverse().toString().equals(s);
    }
}





