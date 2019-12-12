package com.company.Kolekcje.Listy.Zadanie5;

public class Student {
    private int indexNumber;
    private String name;
    private String surname;
    private Gender gender;

    public Student(int indexNumber, String name, String surname, Gender gender) {
        this.indexNumber = indexNumber;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "indexNumber=" + indexNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                "}";
    }
}
