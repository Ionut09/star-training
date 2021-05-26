package com.star.java.oop.collections;

import com.star.java.oop.object_class.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        Student john = new Student(10, "John", "MIT");
        Student bob = new Student(9, "Bob", "Harvard");
        Student frank = new Student(8, "Frank", "Harvard");

        Student[] students = new Student[]{john, bob, frank};
        Student newbie = new Student(7, "Paul", "Poli");

        students[2] = newbie;
        System.out.println(Arrays.toString(students));

        List<Student> students1 = new LinkedList<>();
        //adaugam intr-o lista
        students1.add(john);
        students1.add(bob);
        students1.add(frank);

        //update la o anumita pozitie
        students1.set(2, newbie);
        System.out.println(students1);

        //retrieve
        Student student = students1.get(1); //Bob
        System.out.println("index of newbie = " + students1.indexOf(newbie)); //-1 daca nu gaseste obiectul

        //remove
//      students1.remove(bob);//se bazeaza pe equals()
        students1.remove(1);
        System.out.println(students1);

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(7);
        ints.remove(2);
        Integer i = new Integer(2); //autoboxing
        Integer i1 = Integer.valueOf(2); //autoboxing
        ints.remove(i);
        ints.remove(Integer.valueOf(7));
        System.out.println(ints);

        int a = i;
        Integer sum = i + 12;
        System.out.println(sum);

        students1.contains(new Student(10, "John", "MIT"));//true
        students1.add(0, new Student(10, "Jenny", "MIT"));
        System.out.println(students1);

        //dimensiunea listei
        System.out.println(students1.size()); //nr de elemeente
//        students1.clear(); //sterge tot
        List<Student> studentList = students1.subList(1, 2);
        System.out.println(studentList);
        students1.isEmpty();//true if size == 0

//        students1.sort();
    }
}
