package com.company.Zadanie2Glosowanie;

public class Main {

    public static void main(String[] args) {

        Citizen peasant1 = new Peasant("Zenek");
        Citizen peasant2 = new Peasant("Mietek");
        Citizen townsman1 = new Townsman("Bartek");
        Citizen townsman2 = new Townsman("Wiesiu");
        Citizen soldier1 = new Soldier("Ksawery");
        Citizen soldier2 = new Soldier("Wilhelm");
        Citizen king = new King("Ryszard");

        Citizen[] tablicaMieszkancow = {peasant1, peasant2,townsman1,townsman2,soldier1,soldier2,king};

        System.out.println(Town.howManyCanVote(tablicaMieszkancow));

        Town.whoCanVote(tablicaMieszkancow);
    }
}
