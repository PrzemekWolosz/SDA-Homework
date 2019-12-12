package com.company.KlasaStringWyrazeniaRegularne.Zadanie13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your arithmetic expression");
        String expression = scanner.nextLine();

        correctlyMatchedBrackets(expression);

    }

    private static void correctlyMatchedBrackets(String text) {
        int countBracket1 = 0;
        int countBracket2 = 0;
        String[] charInString = text.split("");
        for (String s : charInString) {
            if (s.contains(")")) {
                countBracket1++;
            } else if (s.contains("(")) {
                countBracket2++;
            }
        }
        if (countBracket1 == countBracket2) {
            System.out.println("OK");
        } else {
            System.out.println("The brackets are incorrectly matched");
        }
    }
}