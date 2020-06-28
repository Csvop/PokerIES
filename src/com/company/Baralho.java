package com.company;

import java.util.ArrayList;

public class Baralho {
    private ArrayList<Carta> baralho;

    public Baralho(ArrayList<Carta> baralho) {
        this.baralho = baralho;
    }

    void remove(int index) {
        baralho.remove(index);
    }

    void getCarta(int index) {
        baralho.get(index);
    }

    @Override
    public String toString() {
        return "" + baralho;
    }
}
