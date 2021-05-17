package com.star.java.oop.object_class;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    private int note;

    private String name;

    private String faculty;

    public static void main(String[] args) {
        Student john = new Student(10, "John", "MIT");
        Student bob = new Student(9, "Bob", "Harvard");
        Student frank = new Student(8, "Frank", "Harvard");
        System.out.println(john == bob);
        //seful de e promotie

        System.out.println(john.compareTo(bob));
        Student[] students = new Student[]{john, bob, frank};
        Arrays.sort(students);

        System.out.println(Arrays.toString(students));
    }

    public Student(int note, String name, String faculty) {
        this.note = note;
        this.name = name;
        this.faculty = faculty;
    }

    @Override
    public int compareTo(Student student) {
        if (this.note < student.note) {
            return -1;
        } else if (this.note > student.note) {
            return 1;
        }
        return 0;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "note=" + note +
                ", name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    public boolean equals() {
        return false;
    }
}
