package com.company.Kolekcje.Listy.Zadanie6;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(new ArrayList<>(Arrays.asList(3.5, 4.0, 4.5)), "12001", "Adam", "Kowalski");
        Student s2 = new Student(new ArrayList<>(Arrays.asList(1.5, 2.0, 1.5)), "12002", "Ewa", "Brat");
        Student s3 = new Student(new ArrayList<>(Arrays.asList(3.0, 5.0, 4.0)), "12003", "Ada", "Polo");
        Student s4 = new Student(new ArrayList<>(Arrays.asList(5.0, 4.5, 4.5)), "12004", "Dawid", "Jesion");
        Student s5 = new Student(new ArrayList<>(Arrays.asList(1.5, 1.0, 1.5)), "12005", "Ola", "Mak");

        Diary diary = new Diary(new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5)));
        System.out.println(diary);
        diary.removeStudent(s3, s4, s5);
        System.out.println(diary);
    }
}
