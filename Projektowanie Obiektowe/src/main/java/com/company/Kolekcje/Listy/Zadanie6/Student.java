package com.company.Kolekcje.Listy.Zadanie6;

import java.util.ArrayList;
import java.util.List;

public class Student {
    List<Double> studentGrades = new ArrayList<>();
    private String indexNumber;
    private String name;
    private String surname;

    public Student() {
    }

    public Student(List<Double> studentGrades, String indexNumber, String name, String surname) {
        this.studentGrades = studentGrades;
        this.indexNumber = indexNumber;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "studentGrades=" + studentGrades +
                ", indexNumber='" + indexNumber + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                "}";
    }

    public List<Double> getStudentGrades() {
        return studentGrades;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
