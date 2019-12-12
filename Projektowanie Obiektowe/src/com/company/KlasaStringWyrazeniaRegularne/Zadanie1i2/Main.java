package com.company.KlasaStringWyrazeniaRegularne.Zadanie1i2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("type your text");
        String text = scanner.nextLine();

        System.out.println(text.contains("ania"));
        System.out.println(text.startsWith("ania"));
        System.out.println(text.endsWith("ania"));
        System.out.println(text.equals("ania"));
        System.out.println(text.toLowerCase().contains("ania"));
        System.out.println(text.indexOf("ania"));

    }
}
