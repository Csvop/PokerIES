package com.company;

public class Carta {
    private Naipe naipe;
    private int valor;

    public Carta (Naipe umNaipe, int umValor) {
        naipe = umNaipe;
        valor = umValor;
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

    @Override
    public String toString() {
        return "Carta: " + valorVisivel(valor) + "" + naipe;
    }
}
