package com.company.ZadaniaInterfejsyOrazKolekcje.Kolekcje.Zadanie2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Figura kwadrat1 = new Kwadrat(2.0);
        Figura kwadrat2 = new Kwadrat(2.5);
        Figura kwadrat3 = new Kwadrat(3.0);
        Figura prostokat1 = new Prostokat(1.5,2.0);
        Figura prostokat2 = new Prostokat(1.9,2.0);
        Figura prostokat3 = new Prostokat(1.5,3.0);

        Set<Figura> zbiorFigur = new HashSet<>();

        zbiorFigur.add(kwadrat1);
        zbiorFigur.add(kwadrat2);
        zbiorFigur.add(kwadrat3);
        zbiorFigur.add(prostokat1);
        zbiorFigur.add(prostokat2);
        zbiorFigur.add(prostokat3);

        System.out.println(zbiorFigur.toString());
    }
}