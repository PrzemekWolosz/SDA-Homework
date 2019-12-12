package com.company.ZadaniaOkrojone.Zadanie4;

import java.time.LocalDate;
import java.util.Scanner;

public class MyDate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day");
        int day = scanner.nextInt();
        System.out.println("Enter number of a month");
        int month = scanner.nextInt();
        System.out.println("Enter a year");
        int year = scanner.nextInt();

        date1(day, month, year);
        date2(day, month ,year);
        date3(day, month, year);

    }

    public static void date1(int day, int month, int year) {
        String monthName = "styczen";
        switch (month) {
            case 1:
                monthName = "stycznia";
                break;
            case 2:
                monthName = "lutego";
                break;
            case 3:
                monthName = "marca";
                break;
            case 4:
                monthName = "kwietnia";
                break;
            case 5:
                monthName = "maja";
                break;
            case 6:
                monthName = "czerwca";
                break;
            case 7:
                monthName = "lipca";
                break;
            case 8:
                monthName = "sierpnia";
                break;
            case 9:
                monthName = "wrzesnia";
                break;
            case 10:
                monthName = "pazdziernika";
                break;
            case 11:
                monthName = "listopada";
                break;
            case 12:
                monthName = "grudnia";
                break;
        }

        System.out.println(day + "." + month + "." + year + " " + "(" + day + " " + monthName + " " + year + ")");
    }

    public static void date2(int day, int month, int year) {

        System.out.println(String.format("%02d", day) + "." + month + "." + year);
    }

    public static void date3(int day, int month, int year) {
        String monthName = "styczen";
        switch (month) {
            case 1:
                monthName = "sty";
                break;
            case 2:
                monthName = "lut";
                break;
            case 3:
                monthName = "mar";
                break;
            case 4:
                monthName = "kwi";
                break;
            case 5:
                monthName = "maj";
                break;
            case 6:
                monthName = "cze";
                break;
            case 7:
                monthName = "lip";
                break;
            case 8:
                monthName = "sie";
                break;
            case 9:
                monthName = "wrz";
                break;
            case 10:
                monthName = "paz";
                break;
            case 11:
                monthName = "lis";
                break;
            case 12:
                monthName = "gru";
                break;
        }

        System.out.println(day + " " + monthName + " " + year);
    }
}
