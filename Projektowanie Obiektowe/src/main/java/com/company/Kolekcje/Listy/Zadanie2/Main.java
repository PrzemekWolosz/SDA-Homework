package com.company.Kolekcje.Listy.Zadanie2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        //add 10 random ints
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(50) - 25);
        }
        //sum of elements
        int listSum = 0;
        for (Integer i : list) {
            listSum += i;
        }
        System.out.println("List sum: " + listSum);
        //average
        double listAvg = (double) listSum / list.size();
        System.out.println("List average: " + listAvg);
        //sorted new list
        List<Integer> newList = new ArrayList<>(list);
        Collections.sort(newList);
        System.out.println("Unsorted list: " + list);
        System.out.println("Sorted list: " + newList);
        //median
        double m1 = newList.get(newList.size() / 2);
        double m2 = newList.get((newList.size() / 2) - 1);
        double median = (m1 + m2) / 2;
        System.out.println("Median: " + median);
        //looking for max and min element in unsorted list
        int max = 0;
        int min = 0;
        int indexMax = 0;
        int indexMin = 0;
        for (Integer i : list) {
            if (i > max) {
                max = i;
                indexMax = list.indexOf(i);
            } else if (i < min) {
                min = i;
                indexMin = list.indexOf(i);
            }
        }
        System.out.println("max element: " + max + ", min element: " + min);
        // index of max and min element
        System.out.println("max elemenet index: " + indexMax + ", min element index: " + indexMin);
    }
}