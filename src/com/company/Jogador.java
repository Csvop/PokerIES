package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Jogador {
    private ArrayList<Carta> mao;
    int fichas;

    public Jogador(ArrayList<Carta> umaMao, int umasFichas) {
        mao = umaMao;
        fichas = umasFichas;
    }

    void addNaMao(Carta carta) {
        mao.add(carta);
    }

    public int getFichas() { return fichas; }

    public void setFichas(int fichas) { this.fichas = fichas; }

    @Override
    public String toString() {
        return mao + "";
    }
    public static boolean jogarMais(){

        boolean loop=true;
        boolean jogar=true;
        Scanner in = new Scanner(System.in);

        while (loop){
            System.out.println("Mais um jogo (s /n)?");
            String jogarMais=in.next();

            if (jogarMais.equalsIgnoreCase("s")){
                jogar=true;
                loop=false;

            }

            else if (jogarMais.equalsIgnoreCase("n")){
                jogar=false;
                loop=false;
            }
            else
                System.out.println("Não entendi sua resposta. Responda com s/n");
        }
        return jogar;
    }
}

