package com.company.Kolekcje.Listy.Zadanie4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        List<String> list = new ArrayList<>();
        //add 100 random elements do list
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(random.nextInt(101)));
        }
        // count average value for list
        int sum = 0;
        for (String s : list) {
            sum += Integer.parseInt(s);
        }
        double average = (double) sum / list.size();
        System.out.println("average: " + average);
        //only elements lower than average
        System.out.println("List of elements lower than average: ");
        for (String s : list) {
            if (Integer.parseInt(s) < average) {
                System.out.print(s + ", ");
            }
        }
        //print all numbers from list
        System.out.println("\nFull list: ");
        System.out.println(list);

        //copy list to table
        String[] table = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            table[i] = list.get(i);
        }
    }
}