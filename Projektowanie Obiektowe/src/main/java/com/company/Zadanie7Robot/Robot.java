package com.company.Zadanie7Robot;

public class Robot {
    private int poziomBaterii;
    private String nazwaRobota;
    private boolean czyWlaczony;

    public Robot(int poziomBaterii, String nazwaRobota, boolean czyWlaczony) {
        this.poziomBaterii = poziomBaterii;
        this.nazwaRobota = nazwaRobota;
        this.czyWlaczony = czyWlaczony;
    }

    public int getPoziomBaterii() {
        return poziomBaterii;
    }

    public void setPoziomBaterii(int poziomBaterii) {
        this.poziomBaterii = poziomBaterii;
    }

    public boolean isCzyWlaczony() {
        return czyWlaczony;
    }

    public void poruszRobotem(RuchRobota ruch) {
        if (czyWlaczony) {
            if (poziomBaterii - ruch.getEnergiaNaRuch() >= 0) {
                poziomBaterii -= ruch.getEnergiaNaRuch();
            } else {
                System.out.println("Za słaba bateria - naładuj robota");
            }
        } else {
            System.out.println("Robot wyłączony - włącz robota");
        }
    }

    public void naladujRobota() {
        if (isCzyWlaczony()) {
            setPoziomBaterii(100);
            System.out.println("Bateria naładowana");
        } else {
            System.out.println("Włącz robota jeżeli chcesz naładować baterię");
        }
    }

    public void wlaczRobota() {
        if (!isCzyWlaczony()) {
            this.czyWlaczony = !this.czyWlaczony;
        } else {
            System.out.println("Robot już został włączony");
        }
    }

    public void wylaczRobota() {
        if (isCzyWlaczony()) {
            this.czyWlaczony = !this.czyWlaczony;
        } else {
            System.out.println("Robot już został wyłączony");
        }
    }
}