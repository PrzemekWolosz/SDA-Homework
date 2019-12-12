package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie6;

public class Main {
    public static void main(String[] args) {

        Mieszkanie m1 = new Mieszkanie(48.5,8500,2,1,SunGeographicalLocation.N, new double[]{28.5, 10, 5, 5});
        Mieszkanie m2 = new Mieszkanie(49.8, 8600,2,1,SunGeographicalLocation.E,new double[]{29.8,10,5,5});
        Mieszkanie m3 = new Mieszkanie(75,7900,3,1,SunGeographicalLocation.SE,new double[]{35, 12.5,9.5,8,10});
        Mieszkanie m4 = new Mieszkanie(69,8000,3,1,SunGeographicalLocation.S,new double[]{29,12.5,9.5,8,10});
        Mieszkanie m5 = new Mieszkanie(102,7200,4,2,SunGeographicalLocation.SE, new double[]{42, 14, 12, 11, 8, 5, 10});
        Mieszkanie m6 = new Mieszkanie(108,7100,4,2,SunGeographicalLocation.NE, new double[]{48, 14, 12, 11, 8, 5, 10});

        Budynek b1 = new Budynek("Osiedle Bursztynowe", 3,"ul. Piękna 7", 1,2020,1,19.5,1, new Mieszkanie[]{m1, m3, m5});
        Budynek b2 = new Budynek("Osiedle Bursztynowe", 3,"ul. Piękna 7", 1,2020,2,19.5,2, new Mieszkanie[]{m2, m4, m6});

        Developer developer = new Developer("Budex", 1000000.10, 5.5, new Budynek[]{b1,b2});

        System.out.println(developer.podajLacznaWartoscInwestycjiNetto());
        System.out.println(developer.podajLacznaWartoscInwestycjiBrutto());

        developer.wypiszOfertyBudynkow();
        developer.wypiszOfertyMieszkan();

    }
}