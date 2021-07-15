package com.star.java.oop.collections;

import com.star.java.oop.object_class.Student;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        students.put("Frank", new Student(8, "Frank", "Harvard"));
        students.put("Bob", new Student(9, "Bob", "Harvard"));
        students.put("John", new Student(10, "John", "MIT"));
        students.put("John", new Student(10, "Johnny", "MIT"));

        students.forEach((name, student) -> System.out.println(name + " -> " + student));

        if (students.containsKey("John")) {
            Student john = students.get("John"); //null daca nu exista cheia
//            students.put()
        }

        students.remove("John");

        students.getOrDefault("John", new Student());

        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
//            System.out.println(entry.setValue(new Student()));
        }

        students.computeIfAbsent("Wayne", key -> new Student(10, key, "Poli"));
        students.computeIfPresent("Mary", (key, value) -> new Student(10, key, "Delft"));

        students.replaceAll((key, value) -> {
            value.setFaculty(value.getFaculty().toUpperCase());
            return value;
        });

        students.forEach((name, student) -> System.out.println(name + " -> " + student));

    }
}
