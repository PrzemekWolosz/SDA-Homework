package com.company.Zadanie7Robot;

public enum RuchRobota {
    KROK_LEWA(20),
    KROK_PRAWA(20),
    RUCH_REKA_LEWA(10),
    RUCH_REKA_PRAWA(10),
    SKOK(50);

    private int energiaNaRuch;

    RuchRobota(int energiaNaRuch){
        this.energiaNaRuch = energiaNaRuch;
    }

    public int getEnergiaNaRuch() {
        return energiaNaRuch;
    }
}