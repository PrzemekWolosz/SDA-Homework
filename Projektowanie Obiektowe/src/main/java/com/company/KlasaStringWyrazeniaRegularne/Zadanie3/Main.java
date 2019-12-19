package com.company.KlasaStringWyrazeniaRegularne.Zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your text");
        String text = scanner.nextLine();
        System.out.println("Type word to search");
        String searched = scanner.nextLine();

        System.out.println(text.contains(searched));

    }
}
