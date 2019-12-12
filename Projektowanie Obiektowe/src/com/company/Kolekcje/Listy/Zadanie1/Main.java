package com.company.Kolekcje.Listy.Zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("Type your number");
            list.add(scanner.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt());
        }

        System.out.println(list);
    }
}