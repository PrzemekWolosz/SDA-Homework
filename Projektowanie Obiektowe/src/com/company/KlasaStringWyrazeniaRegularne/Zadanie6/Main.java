package com.company.KlasaStringWyrazeniaRegularne.Zadanie6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your text");
        String text = scanner.nextLine();

        text = text.replaceAll(", ", "makarena");

        System.out.println(text);
    }
}