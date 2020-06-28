package com.company;

public class Naipe {
    private String nome;

    public Naipe (String umNome) {
        nome = umNome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
