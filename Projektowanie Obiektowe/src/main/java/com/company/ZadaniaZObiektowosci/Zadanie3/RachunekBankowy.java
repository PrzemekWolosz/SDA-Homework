package com.company.ZadaniaZObiektowosci.Zadanie3;

public class RachunekBankowy {

    private long numerKonta;
    private double srodkiNaKoncie;
    private String imieINazwisko;

    public RachunekBankowy (long numerKonta, double srodkiNaKoncie, String imieINazwisko){
        this.numerKonta = numerKonta;
        this.srodkiNaKoncie = srodkiNaKoncie;
        this.imieINazwisko = imieINazwisko;
    }

    public long getNumerKonta() {
        return numerKonta;
    }
    public double getSrodkiNaKoncie () {
        return srodkiNaKoncie;
    }
    public String getImieINazwisko () {
        return imieINazwisko;
    }

    public void przelewPrzychodzacy (double kwota) {
        srodkiNaKoncie += kwota;
    }

    public void przelewWychodzacy (double kwota) {
        srodkiNaKoncie -= kwota;
    }
}