package com.company.KlasaStringWyrazeniaRegularne.Zadanie14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your text to code");
        String text = scanner.nextLine();
        System.out.println("Type number to code your text");
        int number = scanner.nextInt();

        codeUserText(text, number);

    }

    private static void codeUserText(String text, int number) {

        String[] charInText = text.split("");

        for (String s : charInText) {
            char codeChar = (char)s.charAt(0);
            System.out.print((char)(codeChar + number));
        }
    }
}