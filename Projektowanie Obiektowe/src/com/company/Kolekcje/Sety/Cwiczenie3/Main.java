package com.company.Kolekcje.Sety.Cwiczenie3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ParaLiczb> list = new ArrayList<>(Arrays.asList(
                new ParaLiczb(1,2),
                new ParaLiczb(2,1),
                new ParaLiczb(1,1),
                new ParaLiczb(1,2)));

        System.out.println(list);
    }
}
