package com.company.ZadaniaZObiektowosci.Zadanie3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        RachunekBankowy rachunekPrzemka = new RachunekBankowy(10996055550001L, 5025.05, "Przemek Wolosz");
        RachunekBankowy rachunekAdam = new RachunekBankowy(14005526250020L, 15040.25, "Adam Kowalski");
        RachunekBankowy rachunekEwy = new RachunekBankowy(60500204101514L, 3344.04, "Ewa Sikorska");

        System.out.println("Saldo rachunku " + rachunekPrzemka.getNumerKonta() + " użytkownika " + rachunekPrzemka.getImieINazwisko() + " wynosi " + rachunekPrzemka.getSrodkiNaKoncie());
        rachunekPrzemka.przelewPrzychodzacy(10000);
        System.out.println("Saldo rachunku " + rachunekPrzemka.getNumerKonta() + " użytkownika " + rachunekPrzemka.getImieINazwisko() + " wynosi " + rachunekPrzemka.getSrodkiNaKoncie());

    }
}
