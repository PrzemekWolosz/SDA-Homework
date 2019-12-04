package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Aaa", "10000001", 1966);
        Book book2 = new Book("Bbb", "10000002", 2011);
        Book book3 = new Book("Ccc", "10000003", 1917);
        Book book4 = new Book("Ddd", "10000004", 1999);
        Book book5 = new Book("Eee", "10000005", 2019);
        Book book6 = new Book("Fff", "10000006", 2001);
        Book book7 = new Book("Ggg", "10000007", 1977);
        Book book8 = new Book("Hhh", "10000008", 1896);
        Book book9 = new Book("Iii", "10000009", 1905);
        Book book10 = new Book("Jjj", "10000010", 1956);

        Book[] tablicaKsiazek = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};

        Scanner scanner = new Scanner(System.in);
        String coRobisz;

        do {
            System.out.println("Co chcesz zrobic? [wypisz,dodaj,quit]");
            coRobisz = scanner.nextLine();
            switch (coRobisz) {
                case "wypisz":
                    System.out.println("Podaj tytuł książki");
                    String tytul = scanner.nextLine();
                    for (Book book : tablicaKsiazek) {
                        if (book.getTytul().equals(tytul)) {
                            if (book.getIloscAutorow() == 0) {
                                System.out.println("Ta książka nie ma autorów");
                            } else {
                                System.out.println(book.toString());
                            }
                            break;
                        }
                    }
                    break;
                case "dodaj":
                    System.out.println("Podaj tytuł książki");
                    tytul = scanner.nextLine();
                    for (Book book : tablicaKsiazek) {
                        if (book.getTytul().equals(tytul)) {
                            if (book.getIloscAutorow() == 3) {
                                System.out.println("Książka może mieć max 3 autorów");
                                break;
                            } else {
                                System.out.println("Podaj imie i nazwisko autora");
                                String imieNazwisko = scanner.nextLine();
                                String[] rozdzielonyString = imieNazwisko.split(" ");
                                String imie = rozdzielonyString[0];
                                String nazwisko = rozdzielonyString[1];
                                Author dodanyAutor = new Author(imie, nazwisko);
                                book.dodajAutora(dodanyAutor);
                                int ile = book.getIloscAutorow();
                                book.setIloscAutorow(++ile);
                                System.out.println("Autor dodany");
                                break;
                            }
                        }
                    }
            }
        } while (!coRobisz.equals("quit"));
    }
}