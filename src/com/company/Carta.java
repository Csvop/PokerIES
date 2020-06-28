package com.company;

public class Carta {
    private Naipe naipe;
    private int valor;

    public Carta () {
    }

    public Carta (Naipe umNaipe, int umValor) {
        naipe = umNaipe;
        valor = umValor;
    }

    public int getValor() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public String valorVisivel (int valor) {
        String valorV = "";

        if (valor == 1) {
            valorV = "A";
        } else if (valor == 11) {
            valorV = "J";
        } else if (valor == 12) {
            valorV = "Q";
        } else if (valor == 13) {
            valorV = "K";
        } else {
            valorV = Integer.toString(valor);
        }

        return valorV;
    }

    public String valorFinal (int valor) {
        String valorV = "";

        if (valor == 1) {
            valorV = "A";
        } else if (valor == 11) {
            valorV = "J";
        } else if (valor == 12) {
            valorV = "Q";
        } else if (valor == 13) {
            valorV = "K";
        } else if(valor == 10) {
            valorV = "T";
        } else {
            valorV = Integer.toString(valor);
        }

        return valorV;
    }

    @Override
    public String toString() {
        return valorVisivel(valor) + "" + naipe;
    }
}
