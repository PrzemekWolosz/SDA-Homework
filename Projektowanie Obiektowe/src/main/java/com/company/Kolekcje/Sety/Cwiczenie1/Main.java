package com.company.Kolekcje.Sety.Cwiczenie1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>(Arrays.asList(10, 12, 10, 3, 4, 12, 12, 300, 12, 40, 55));

        System.out.println(numbers.size());
        for (Integer integer : numbers) {
            System.out.print(integer + ", ");
        }
        numbers.remove(10);
        numbers.remove(12);

        System.out.println();
        System.out.println(numbers.size());
        for (Integer integer : numbers) {
            System.out.print(integer + ", ");
        }

    }
}
