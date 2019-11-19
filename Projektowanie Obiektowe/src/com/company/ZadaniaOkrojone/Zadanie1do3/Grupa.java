package com.company.ZadaniaOkrojone.Zadanie1do3;

public class Grupa {
    public static void main(String[] args) {

        Student Ania = new Student(124320, "Anna", "Kowalska", 'k');
        Student Bartek = new Student(125009, "Bartosz", "Bednarz", 'm');
        Student Iwona = new Student(345990, "Iwona", "Kwiecińska", 'k');


        Ania.przedstawSie();
        Bartek.przedstawSie();
        Iwona.przedstawSie();
    }
}
