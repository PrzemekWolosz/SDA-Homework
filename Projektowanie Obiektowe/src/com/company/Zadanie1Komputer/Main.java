package com.company.Zadanie1Komputer;

public class Main {
    public static void main(String[] args) {

        Komputer komputer1 = new Komputer(10,"HP", TypProcesora.WIELORDZENIOWY);
        Komputer komputer2 = new Komputer(15, "Acer", TypProcesora.JEDNORDZENIOWY);
        Komputer komputer3 = new Komputer(22, "Asus", TypProcesora.WIELORDZENIOWY);

        Laptop laptop1 = new Laptop(7, "HP", TypProcesora.WIELORDZENIOWY, 15.6, false);
        Laptop laptop2 = new Laptop(15, "Toshiba", TypProcesora.JEDNORDZENIOWY, 17.3, false);
        Laptop laptop3 = new Laptop(6, "Apple", TypProcesora.WIELORDZENIOWY, 13.3, true);

        Komputer[] tabelaKomputerow = {komputer1, komputer2, komputer3};
        Komputer[] tabelaLaptopow = {laptop1, laptop2, laptop3};

        for (int i = 0; i < tabelaKomputerow.length; i++) {
            System.out.println(tabelaKomputerow[i].toString());
        }
        System.out.println();
        for (int i = 0; i < tabelaLaptopow.length; i++) {
            System.out.println(tabelaLaptopow[i].toString());
        }
    }
}
