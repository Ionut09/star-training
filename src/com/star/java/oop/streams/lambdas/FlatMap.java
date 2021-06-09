package com.star.java.oop.streams.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        List<String> words = List.of("one", "two", "three");

        Function<String[], Stream<String>> streamFunction = (String[] charArray) -> Arrays.stream(charArray);

        List<String> chraracters = words.stream()
                                        .map((String word) -> word.split(""))
                                        .flatMap(streamFunction)
                                        .distinct()
                                        .sorted() //
                                        .collect(Collectors.toList());

        System.out.println("chraracters = " + chraracters);

        exerciseSlide(Arrays.asList("Toby", "Anna", "Leroy", "Alex", "Jamie"));
        //Exe
    }

    /**
     * Get first 2 names of 4 letters sorted alphabetically
     * @param names
     */
    public static void exerciseSlide(List<String> names) {
        names.stream() //Stream<String>
             .filter((String name) -> name.length() == 4) // boolean test(T t); unde T e String
             .sorted()
             .limit(2)
             .forEach((String name) -> System.out.println(name)); //    void accept(T t); unde T e String
    }
}
