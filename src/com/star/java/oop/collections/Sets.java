package com.star.java.oop.collections;

import com.star.java.oop.object_class.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Sets {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();  //O(1) pt toate operatiile, neordonata si nesortata
        Student john = new Student(10, "John", "MIT");
        Student bob = new Student(9, "Bob", "Harvard");
        Student frank = new Student(8, "Frank", "Harvard");

        students.add(john);
        students.add(bob);
        students.add(frank);
        Student frank2 = new Student(8, "Frank", "Harvard");

        students.add(frank2);

        System.out.println(frank.equals(frank2));

        for (Student student : students) {
            System.out.println(student.hashCode() + " :  " + student);
        }

        System.out.println(frank2.hashCode());

        students.remove(frank2);
        students.contains(frank2); //false
        students.isEmpty();
        students.size();

        Set<Student> studentsImmutable = Set.of(bob, frank);
        System.out.println("studentsImmutable = " + studentsImmutable);

        Set<Student> studentsOrdered = new LinkedHashSet<>();  //O(1) pt toate operatiile, ordonata si nesortata
        studentsOrdered.add(new Student(10, "John", "MIT"));
        studentsOrdered.add(new Student(9, "Bob", "Harvard"));
        studentsOrdered.add(new Student(8, "Frank", "Harvard"));

        for (Student student : studentsOrdered) {
            System.out.println(student.hashCode() + " :  " + student);
        }

//        SortedSet<Student> sortedStudents = new TreeSet<>((st1, st2) -> Integer.valueOf(st1.getNote()).compareTo(st2.getNote()));
        NavigableSet<Student> sortedStudents = new TreeSet<>((st1, st2) -> Integer.compare(st1.getNote(), st2.getNote()));
        System.out.println("\n\n sortedStudents");
        sortedStudents.add(new Student(10, "John", "MIT"));
        sortedStudents.add(new Student(9, "Bob", "Harvard"));
        sortedStudents.add(new Student(8, "Frank", "Harvard"));

        for (Student student : sortedStudents) {
            System.out.println(student.hashCode() + " :  " + student);
        }

        sortedStudents.first(); //Frank
        sortedStudents.last(); //John

        sortedStudents.lower(bob); //Frank

        sortedStudents.stream()
                      .filter(student -> student.getFaculty().equals("Harvard"))
                      .distinct()
//                      .collect(Collectors.toSet())
                      .forEach(System.out::println);
    }
}
