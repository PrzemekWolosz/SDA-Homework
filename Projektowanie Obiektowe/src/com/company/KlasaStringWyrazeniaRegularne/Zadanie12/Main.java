package com.company.KlasaStringWyrazeniaRegularne.Zadanie12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your text");
        String text = scanner.nextLine();

        String reversed = reverseString(text);
        System.out.println(reversed);


    }

    private static String reverseString(String text) {
        if (text.isEmpty()) {
            return text;
        }
        return reverseString(text.substring(1)) + text.charAt(0);
    }
}