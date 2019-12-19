package com.company.KlasaStringWyrazeniaRegularne.Zadanie7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type tour text");
        String text = scanner.nextLine();

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

    }
}
