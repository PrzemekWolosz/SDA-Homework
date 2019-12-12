package com.company.Kolekcje.Listy.Zadanie5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>(Arrays.asList(
                new Student(11478, "Adam", "Kowalski", Gender.MALE),
                new Student(10098, "Ola", "Baka", Gender.FEMALE),
                new Student(13900, "Ewa", "Patyczek", Gender.FEMALE),
                new Student(21006, "Dawid", "Jesion", Gender.MALE),
                new Student(35505, "Konrad", "Koral", Gender.MALE)
        ));

        for (Student student : studentsList) {
            System.out.println(student);
        }
        System.out.println("______________________");
        for (Student student : studentsList) {
            if (student.getGender().equals(Gender.FEMALE)) {
                System.out.println(student);
            }
        }
        System.out.println("______________________");
        for (Student student : studentsList) {
            if (student.getGender().equals(Gender.MALE)) {
                System.out.println(student);
            }
        }
        System.out.println("______________________");
        for (Student student : studentsList) {
            System.out.println(student.getIndexNumber());
        }
    }
}