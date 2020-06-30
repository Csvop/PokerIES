package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Main {
    public static boolean isOnePair(ArrayList<Carta> umaMao) {
        int i = 0;
        int cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(0).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 2) {
            return true;
        }

        i = 0;
        cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(1).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 2) {
            return true;
        }

        i = 0;
        cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(2).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 2) {
            return true;
        }

        i = 0;
        cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(3).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 2) {
            return true;
        }

        i = 0;
        cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(4).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 2) {
            return true;
        }

        return false;
    }

    public static boolean isTwoPair(ArrayList<Carta> umaMao) {
        int posCarta = 0;
        int cont = 0;
        for (Carta carta : umaMao) {
            for (int i = 0; i < umaMao.size(); i++) {
                if(carta.getValor() == umaMao.get(i).getValor()) {
                    cont++;
                }
            }
        }
        if(cont == 9) { return true; } else { return false;}
    }

    public static boolean is3ofaKind(ArrayList<Carta> umaMao) {
        int i = 0;
        int cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(0).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 3) {
            return true;
        }

        i = 0;
        cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(1).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 3) {
            return true;
        }

        i = 0;
        cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(2).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 3) {
            return true;
        }

        i = 0;
        cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(3).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 3) {
            return true;
        }

        i = 0;
        cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(4).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 3) {
            return true;
        }

        return false;
    }

    public static boolean isStraight(ArrayList<Carta> umaMao) {
        String possibilidade1 = "A2345";
        String possibilidade2 = "23456";
        String possibilidade3 = "34567";
        String possibilidade4 = "45678";
        String possibilidade5 = "56789";
        String possibilidade6 = "6789T";
        String possibilidade7 = "789TJ";
        String possibilidade8 = "89TJQ";
        String possibilidade9 = "9TJQK";
        String possibilidade10 ="TJQKA";

        int ii = 0;
        for(Carta carta: umaMao) {
            if(possibilidade1.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                return true;
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade2.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                return true;
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade3.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                return true;
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade4.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                return true;
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade5.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                return true;
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade6.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                return true;
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade7.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                return true;
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade8.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                return true;
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade9.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                return true;
            }
        }

        ii = 0;

        for(Carta carta: umaMao) {
            if (possibilidade10.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if (ii == 5) {
                return true;
            }
        }

        return false;
    }

    public static boolean isFlush(ArrayList<Carta> umaMao) {
        if(umaMao.get(0).getNaipe() == umaMao.get(1).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(2).getNaipe()
                && umaMao.get(0).getNaipe() == umaMao.get(3).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(4).getNaipe() ) {
            return true;
        }

        return false;
    }

    public static boolean isFullHouse(ArrayList<Carta> umaMao) {
        if(is3ofaKind(umaMao) && isOnePair(umaMao)) {
            return true;
        }

        return false;
    }

    public static boolean is4ofaKind(ArrayList<Carta> umaMao) {
        int i = 0;
        int cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(0).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 4) {
            return true;
        }

        i = 0;
        cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(1).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 4) {
            return true;
        }

        i = 0;
        cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(2).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 4) {
            return true;
        }

        i = 0;
        cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(3).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 4) {
            return true;
        }

        i = 0;
        cicla = 0;
        for (Carta carta : umaMao) {
            if(umaMao.get(4).getValor() == umaMao.get(cicla).getValor()) {
                i++;
            }
            cicla++;
        }
        if(i == 4) {
            return true;
        }

        return false;
    }

    public static boolean isStraightFlush(ArrayList<Carta> umaMao) {
        String possibilidade1 = "A2345";
        String possibilidade2 = "23456";
        String possibilidade3 = "34567";
        String possibilidade4 = "45678";
        String possibilidade5 = "56789";
        String possibilidade6 = "6789T";
        String possibilidade7 = "789TJ";
        String possibilidade8 = "89TJQ";
        String possibilidade9 = "9TJQK";

        int ii = 0;
        for(Carta carta: umaMao) {
            if(possibilidade1.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                if(umaMao.get(0).getNaipe() == umaMao.get(1).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(2).getNaipe()
                        && umaMao.get(0).getNaipe() == umaMao.get(3).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(4).getNaipe() ){
                    return true;
                }
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade2.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                if(umaMao.get(0).getNaipe() == umaMao.get(1).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(2).getNaipe()
                        && umaMao.get(0).getNaipe() == umaMao.get(3).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(4).getNaipe() ){
                    return true;
                }
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade3.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                if(umaMao.get(0).getNaipe() == umaMao.get(1).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(2).getNaipe()
                        && umaMao.get(0).getNaipe() == umaMao.get(3).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(4).getNaipe() ){
                    return true;
                }
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade4.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                if(umaMao.get(0).getNaipe() == umaMao.get(1).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(2).getNaipe()
                        && umaMao.get(0).getNaipe() == umaMao.get(3).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(4).getNaipe() ){
                    return true;
                }
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade5.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                if(umaMao.get(0).getNaipe() == umaMao.get(1).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(2).getNaipe()
                        && umaMao.get(0).getNaipe() == umaMao.get(3).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(4).getNaipe() ){
                    return true;
                }
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade6.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                if(umaMao.get(0).getNaipe() == umaMao.get(1).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(2).getNaipe()
                        && umaMao.get(0).getNaipe() == umaMao.get(3).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(4).getNaipe() ){
                    return true;
                }
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade7.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                if(umaMao.get(0).getNaipe() == umaMao.get(1).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(2).getNaipe()
                        && umaMao.get(0).getNaipe() == umaMao.get(3).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(4).getNaipe() ){
                    return true;
                }
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade8.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                if(umaMao.get(0).getNaipe() == umaMao.get(1).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(2).getNaipe()
                        && umaMao.get(0).getNaipe() == umaMao.get(3).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(4).getNaipe() ){
                    return true;
                }
            }
        }
        ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade9.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                if(umaMao.get(0).getNaipe() == umaMao.get(1).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(2).getNaipe()
                        && umaMao.get(0).getNaipe() == umaMao.get(3).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(4).getNaipe() ){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isRoyalFlush(ArrayList<Carta> umaMao) {
        String possibilidade1 = "TJQKA";

        int ii = 0;

        for(Carta carta: umaMao) {
            if(possibilidade1.contains(carta.valorFinal(carta.getValor()))) {
                ii++;
            }
            if(ii == 5) {
                if(umaMao.get(0).getNaipe() == umaMao.get(1).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(2).getNaipe()
                        && umaMao.get(0).getNaipe() == umaMao.get(3).getNaipe() && umaMao.get(0).getNaipe() == umaMao.get(4).getNaipe() ){
                    return true;
                }
            }
        }


        return false;
    }

    public static int isHighCard(ArrayList<Carta> umaMao) {
        Carta cartaAux = umaMao.get(0);
        for (int i = 0; i < umaMao.size(); i++) {
            if(umaMao.get(i).getValor() > cartaAux.getValor()) {
                cartaAux = umaMao.get(i);
            }
        }
        return cartaAux.getValor();
    }

    public static Jogador isVencedor(Jogador jogador1, Jogador jogador2) {
        //teste para valor da mao do jogador 1
        String nomeDaJogada = "";
        int pontos1 = 0;
        ArrayList<Carta> mao1 = jogador1.getMao();
        if(isOnePair(mao1)) {
            pontos1 = 1;
            nomeDaJogada = "Um Par";
        }
        if(isTwoPair(mao1)) {
            pontos1 = 2;
            nomeDaJogada = "Dois Pares";
        }
        if(is3ofaKind(mao1)) {
            pontos1 = 3;
            nomeDaJogada = "Tres Cartas Iguais";
        }
        if(isStraight(mao1)) {
            pontos1 = 4;
            nomeDaJogada = "Straight";
        }
        if(isFlush(mao1)) {
            pontos1 = 5;
            nomeDaJogada = "Flush";
        }
        if(isFullHouse(mao1)) {
            pontos1 = 6;
            nomeDaJogada = "Full House";
        }
        if(is4ofaKind(mao1)) {
            pontos1 = 7;
            nomeDaJogada = "Quatro Cartas Iguais";
        }
        if(isStraightFlush(mao1)) {
            pontos1 = 8;
            nomeDaJogada = "Straight Flush";
        }
        if(isRoyalFlush(mao1)) {
            pontos1 = 9;
            nomeDaJogada = "Royal Flush";
        }
        if(pontos1 == 0){
            nomeDaJogada = "Maior Carta";
        }

        //teste para valor da mao do jogador 2
        String nomeDaJogada2 = "";
        int pontos2= 0;
        ArrayList<Carta> mao2 = jogador2.getMao();
        if(isOnePair(mao2)) {
            pontos2 = 1;
            nomeDaJogada2 = "Um Par";
        }
        if(isTwoPair(mao2)) {
            pontos2 = 2;
            nomeDaJogada2 = "Dois Pares";
        }
        if(is3ofaKind(mao2)) {
            pontos2 = 3;
            nomeDaJogada2 = "Tres Cartas Iguais";
        }
        if(isStraight(mao2)) {
            pontos2 = 4;
            nomeDaJogada2 = "Straight";
        }
        if(isFlush(mao2)) {
            pontos2 = 5;
            nomeDaJogada2 = "Flush";
        }
        if(isFullHouse(mao2)) {
            pontos2 = 6;
            nomeDaJogada2 = "Full House";
        }
        if(is4ofaKind(mao2)) {
            pontos2 = 7;
            nomeDaJogada2 = "Quatro Cartas Iguais";
        }
        if(isStraightFlush(mao2)) {
            pontos2 = 8;
            nomeDaJogada2 = "Straight Flush";
        }
        if(isRoyalFlush(mao2)) {
            pontos2 = 9;
            nomeDaJogada2 = "Royal Flush";
        }
        if(pontos2 == 0){
            nomeDaJogada2 = "Maior Carta";
        }

        if (pontos1 > pontos2) {
            System.out.println("\nJogador 1 ganhou com "+nomeDaJogada+"\n");
            return jogador1;
        } else if(pontos1 < pontos2){
            System.out.println("\nJogador 2 ganhou com "+nomeDaJogada2+"\n");
            return jogador2;
        } else {
            if (isHighCard(mao1) > isHighCard(mao2)) {
                System.out.println("\nJogador 1 ganhou com "+nomeDaJogada+"\n");
                return jogador1;
            } else if(isHighCard(mao1) < isHighCard(mao2)) {
                System.out.println("\nJogador 2 ganhou com "+nomeDaJogada2+"\n");
                return jogador2;
            } else {
                System.out.println("Incrvel!!! temos um empate!");
                return null;
            }
        }
    }

    public static Jogador isVencedorSP(Jogador jogador1, Jogador jogador2) {
        //teste para valor da mao do jogador 1
        String nomeDaJogada = "";
        int pontos1 = 0;
        ArrayList<Carta> mao1 = jogador1.getMao();
        if(isOnePair(mao1)) {
            pontos1 = 1;
            nomeDaJogada = "Um Par";
        }
        if(isTwoPair(mao1)) {
            pontos1 = 2;
            nomeDaJogada = "Dois Pares";
        }
        if(is3ofaKind(mao1)) {
            pontos1 = 3;
            nomeDaJogada = "Tres Cartas Iguais";
        }
        if(isStraight(mao1)) {
            pontos1 = 4;
            nomeDaJogada = "Straight";
        }
        if(isFlush(mao1)) {
            pontos1 = 5;
            nomeDaJogada = "Flush";
        }
        if(isFullHouse(mao1)) {
            pontos1 = 6;
            nomeDaJogada = "Full House";
        }
        if(is4ofaKind(mao1)) {
            pontos1 = 7;
            nomeDaJogada = "Quatro Cartas Iguais";
        }
        if(isStraightFlush(mao1)) {
            pontos1 = 8;
            nomeDaJogada = "Straight Flush";
        }
        if(isRoyalFlush(mao1)) {
            pontos1 = 9;
            nomeDaJogada = "Royal Flush";
        }
        if(pontos1 == 0){
            nomeDaJogada = "Maior Carta";
        }

        //teste para valor da mao do jogador 2
        String nomeDaJogada2 = "";
        int pontos2= 0;
        ArrayList<Carta> mao2 = jogador2.getMao();
        if(isOnePair(mao2)) {
            pontos2 = 1;
            nomeDaJogada2 = "Um Par";
        }
        if(isTwoPair(mao2)) {
            pontos2 = 2;
            nomeDaJogada2 = "Dois Pares";
        }
        if(is3ofaKind(mao2)) {
            pontos2 = 3;
            nomeDaJogada2 = "Tres Cartas Iguais";
        }
        if(isStraight(mao2)) {
            pontos2 = 4;
            nomeDaJogada2 = "Straight";
        }
        if(isFlush(mao2)) {
            pontos2 = 5;
            nomeDaJogada2 = "Flush";
        }
        if(isFullHouse(mao2)) {
            pontos2 = 6;
            nomeDaJogada2 = "Full House";
        }
        if(is4ofaKind(mao2)) {
            pontos2 = 7;
            nomeDaJogada2 = "Quatro Cartas Iguais";
        }
        if(isStraightFlush(mao2)) {
            pontos2 = 8;
            nomeDaJogada2 = "Straight Flush";
        }
        if(isRoyalFlush(mao2)) {
            pontos2 = 9;
            nomeDaJogada2 = "Royal Flush";
        }
        if(pontos2 == 0){
            nomeDaJogada2 = "Maior Carta";
        }

        if (pontos1 > pontos2) {
            return jogador1;
        } else if(pontos1 < pontos2){
            return jogador2;
        } else {
            if (isHighCard(mao1) > isHighCard(mao2)) {
                return jogador1;
            } else if(isHighCard(mao1) < isHighCard(mao2)) {
                return jogador2;
            } else {
                return null;
            }
        }
    }

    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        //Jogo
        System.out.println("Bem vindo ao IES Poker!");
        System.out.println(
                "---------Menu----------\n" +
                        "1- Jogar\n" +
                        "2- Sair");
        int opt = in.nextInt();
        switch (opt) {
            case 1:
                boolean winCond = true;
                while (winCond == true) {
                    //Naipes das cartas
                    Naipe ouros = new Naipe("♦");
                    Naipe copas = new Naipe("♥");
                    Naipe paus = new Naipe("♣");
                    Naipe espadas = new Naipe("♠");

                    //Cartas
                    Carta o1 = new Carta(ouros, 1);
                    Carta c1 = new Carta(copas, 1);
                    Carta p1 = new Carta(paus, 1);
                    Carta e1 = new Carta(espadas, 1);
                    Carta o2 = new Carta(ouros, 2);
                    Carta c2 = new Carta(copas, 2);
                    Carta p2 = new Carta(paus, 2);
                    Carta e2 = new Carta(espadas, 2);
                    Carta o3 = new Carta(ouros, 3);
                    Carta c3 = new Carta(copas, 3);
                    Carta p3 = new Carta(paus, 3);
                    Carta e3 = new Carta(espadas, 3);
                    Carta o4 = new Carta(ouros, 4);
                    Carta c4 = new Carta(copas, 4);
                    Carta p4 = new Carta(paus, 4);
                    Carta e4 = new Carta(espadas, 4);
                    Carta o5 = new Carta(ouros, 5);
                    Carta c5 = new Carta(copas, 5);
                    Carta p5 = new Carta(paus, 5);
                    Carta e5 = new Carta(espadas, 5);
                    Carta o6 = new Carta(ouros, 6);
                    Carta c6 = new Carta(copas, 6);
                    Carta p6 = new Carta(paus, 6);
                    Carta e6 = new Carta(espadas, 6);
                    Carta o7 = new Carta(ouros, 7);
                    Carta c7 = new Carta(copas, 7);
                    Carta p7 = new Carta(paus, 7);
                    Carta e7 = new Carta(espadas, 7);
                    Carta o8 = new Carta(ouros, 8);
                    Carta c8 = new Carta(copas, 8);
                    Carta p8 = new Carta(paus, 8);
                    Carta e8 = new Carta(espadas, 8);
                    Carta o9 = new Carta(ouros, 9);
                    Carta c9 = new Carta(copas, 9);
                    Carta p9 = new Carta(paus, 9);
                    Carta e9 = new Carta(espadas, 9);
                    Carta o10 = new Carta(ouros, 10);
                    Carta c10 = new Carta(copas, 10);
                    Carta p10 = new Carta(paus, 10);
                    Carta e10 = new Carta(espadas, 10);
                    Carta o11 = new Carta(ouros, 11);
                    Carta c11 = new Carta(copas, 11);
                    Carta p11 = new Carta(paus, 11);
                    Carta e11 = new Carta(espadas, 11);
                    Carta o12 = new Carta(ouros, 12);
                    Carta c12 = new Carta(copas, 12);
                    Carta p12 = new Carta(paus, 12);
                    Carta e12 = new Carta(espadas, 12);
                    Carta o13 = new Carta(ouros, 13);
                    Carta c13 = new Carta(copas, 13);
                    Carta p13 = new Carta(paus, 13);
                    Carta e13 = new Carta(espadas, 13);

                    //Baralho
                    ArrayList<Carta> baralho = new ArrayList<Carta>();
                    baralho.add(o1);
                    baralho.add(c1);
                    baralho.add(p1);
                    baralho.add(e1);
                    baralho.add(o2);
                    baralho.add(c2);
                    baralho.add(p2);
                    baralho.add(e2);
                    baralho.add(o3);
                    baralho.add(c3);
                    baralho.add(p3);
                    baralho.add(e3);
                    baralho.add(o4);
                    baralho.add(c4);
                    baralho.add(p4);
                    baralho.add(e4);
                    baralho.add(o5);
                    baralho.add(c5);
                    baralho.add(p5);
                    baralho.add(e5);
                    baralho.add(o6);
                    baralho.add(c6);
                    baralho.add(p6);
                    baralho.add(e6);
                    baralho.add(o7);
                    baralho.add(c7);
                    baralho.add(p7);
                    baralho.add(e7);
                    baralho.add(o8);
                    baralho.add(c8);
                    baralho.add(p8);
                    baralho.add(e8);
                    baralho.add(o9);
                    baralho.add(c9);
                    baralho.add(p9);
                    baralho.add(e9);
                    baralho.add(o10);
                    baralho.add(c10);
                    baralho.add(p10);
                    baralho.add(e10);
                    baralho.add(o11);
                    baralho.add(c11);
                    baralho.add(p11);
                    baralho.add(e11);
                    baralho.add(o12);
                    baralho.add(c12);
                    baralho.add(p12);
                    baralho.add(e12);
                    baralho.add(o13);
                    baralho.add(c13);
                    baralho.add(p13);
                    baralho.add(e13);

                    //Jogador
                    ArrayList<Carta> mao1 = new ArrayList<>();
                    ArrayList<Carta> mao2 = new ArrayList<>();
                    Jogador j1 = new Jogador(mao1,100);
                    Jogador j2 = new Jogador(mao2,100);

                    int mesa = 0;
                    Collections.shuffle(baralho);
                    Baralho deck = new Baralho(baralho);
                    for(int i = 0; i < 5; i++) {
                        j1.addNaMao(baralho.get(i));
                        baralho.remove(i);
                        j2.addNaMao(baralho.get(i+5));
                        baralho.remove(i+5);
                    }



                    //Round1
                    boolean r1 = true;
                    boolean r3 = true;
                    while(r1 == true) {
                        int escolhaRounds = 0;
                        int aposta = 0;
                        System.out.println("Deseja ver as regras? 1-Sim / Qualquer outro numero-Não ");
                        int regras=in.nextInt();
                        if(regras==1){
                            System.out.println("------Regras------");
                            System.out.println("POKER FECHADO");
                            System.out.println("Cada jogador recebe cinco cartas da mão fechadas." +
                                    "\nO primeiro jogador começa apostando. O segundo jogador pode apostar a quantia dada pelo jogador ou aumentá-la." +
                                    "\nSe aumentada o outro jogador deve pagar essa quantia, desistir ou aumentá-la novamente… " +
                                    "\nUma vez que a primeira rodada de apostas estiver concluída, acontece uma troca." +
                                    "\nOu seja, cada jogador escolhe quais cartas (se alguma) quer descartar, assim trocando-as. " +
                                    "\nApós a troca, outra rodada de apostas acontece, começando pelo primeiro jogador. Assim a sequência da ação é: " +
                                    "\n1-Cinco cartas são dadas a cada jogador" + "\n2-Rodada de apostas #1, começando com o primeiro jogador" +
                                    "\n3-Troca das mãos, começando com o primeiro jogador" + "\n4-Rodada de apostas #2, começando com o primeiro jogador" +
                                    "\n5-Showdown" + "\n\nShowdown - Determinando o Vencedor: " + "O jogador com a melhor mão de cinco cartas ganha o pote." +
                                    "\nDepois do pote ser concedido à melhor mão, um novo jogo de Five Card Draw está pronto para ser jogado." +
                                    "\nSe duas ou mais mãos tiverem o mesmo valor, o pote é igualmente dividido entre elas." +
                                    "\nNão existe diferenciação de naipes para propósitos de conceder o pote." +"\n\nINDICAÇÃO: 18 anos ou mais" +
                                    "\nPARTICIPANTES: 2 jogadores");
                            System.out.println("\n\nMãos do poker: ");
                            System.out.println("\nRoyal Flush:" + "\nA mão mais forte no poker é o royal flush. " +
                                    "\nTrata-se de uma sequência formada por dez, valete, dama, rei e ás, sendo todos do mesmo naipe, p.ex. espadas. ");
                            System.out.println("\nStraight Flush:" + "\nA segunda mão mais forte no poker é o straight flush." +
                                    "\nÉ composta por cinco cartas consecutivas do mesmo naipe." +
                                    " Se dois jogadores conseguirem um straight flush, o jogador com as cartas mais altas será o vencedor.");
                            System.out.println("\nQuadra/Poker):"  + "\nUma quadra (ou poker) são quatro cartas iguais, p.ex. quatro reis." +
                                    "\nSe dois jogadores tiverem um poker, então ganha aquele que tiver o poker da carta com maior valor. "+
                                    "\nSe ambos tiverem o mesmo poker (quatro cartas iguais na mesa), então ganhará o jogador com a quinta carta mais alto.");
                            System.out.println("\nFull House:" + "\nUm full house é a combinação de um trio com um par. " +
                                    "\nSe dois jogadores tiverem um full house, então ganhará aquele que tiver o trio maior." +
                                    "\nSe partilharem o mesmo trio, então o desempate será decidido pelo par. ");
                            System.out.println("\nFlush:" + "\nCinco cartas do mesmo naipe formam um flush (ou cor)." +
                                    "\nSe dois jogadores tiverem um flush, então ganha aquele que tiver a carta mais alta.");
                            System.out.println("\nSequência:" + "\nCinco cartas consecutivas formam uma sequência (straight)." +
                                    "\nSe dois jogadores tiverem uma sequência, então ganha aquele que tiver a carta mais alta.");
                            System.out.println("\nTrio/Trinca:" + "\nUm trio (ou trinca) é uma combinação de poker formada por três cartas iguais." +
                                    "\nSe dois jogadores tiverem o mesmo trio, então as outras cartas, ou ambas as cartas, determinarão o vencedor," +
                                    "\ndado que uma mão de poker é sempre formada por cinco cartas.");
                            System.out.println("\nDois pares:" + "\nMãos com dois pares são, como é óbvio, compostas por dois pares. " +
                                    "\nSe dois jogadores tiverem dois pares, o maior par determinará o vencedor." +
                                    "\nSe estes partilharem o maior par, então o desempate será decidido por quem tiver o melhor segundo par." +
                                    "\nSe também o partilharem, então o desenmpate será decidido pela quinta carta.");
                            System.out.println("\nPar: " + "\nUm par é composto por duas cartas iguais."+
                                    "\nComo uma mão de poker é sempre constituída por cinco cartas, as restantes cartas são os chamados 'kickers'."  +
                                    "\nNo caso de dois jogadores partilharem o mesmo par, então ganhará aquele com melhor kicker.");
                            System.out.println("\nCarta alta: " + "\nSe não tiver nem mesmo um par," +
                                    "\nentão você precisa olhar para a força das suas cartas de poker." +
                                    "\nSe dois jogadores no showdown não tiverem um par ou melhor, então o vencedor será aquele com as cartas mais altas.");
                        }
                        System.out.println("\n\nComeçando o jogo...");
                        System.out.println("Jogador 1 você tem " + j1.getFichas() +" fichas !");
                        System.out.println("Jogador 1, sua mão é: ");
                        System.out.println(j1 + "\n");

                        //aposta
                        System.out.println("Quantia para apostar: " + "\n(5 é a aposta minima!)");
                        aposta = in.nextInt();
                        if(aposta < 5) {
                            System.out.println("Sua aposta é menor que o valor minimo de 5!" +
                                    "\nA sua aposta foi redefinida para 5 fichas");
                            aposta = 5;
                        } else if(aposta > j1.getFichas()) {
                            do {
                                System.out.println("Sua aposta é maior que a quantia de fichas que você possui!" +
                                        "\nFaça uma nova aposta: ");
                                aposta = in.nextInt();
                            }while(aposta > j1.getFichas());
                        }
                        mesa = mesa + aposta;
                        int aux = j1.getFichas() - aposta;
                        j1.setFichas(aux);
                        System.out.println("Agora você tem " + j1.getFichas() +" fichas!");
                        System.out.println("Jogador 2 jogando em 5 segundos");
                        try{TimeUnit.SECONDS.sleep(5);} catch (InterruptedException e) {e.printStackTrace();}
                        System.out.println("Jogador 2 você tem " + j2.getFichas() +" fichas !");
                        System.out.println("\fJogador 2, sua mão é: ");
                        System.out.println(j2 + "\n");


                        //aposta
                        System.out.println("Quantia para apostar: " + "\n(5 é a aposta minima!)");
                        aposta = in.nextInt();
                        if(aposta < 5) {
                            System.out.println("Sua aposta é menor que o valor minimo de 5!" +
                                    "\nA sua aposta foi redefinida para 5 fichas");
                            aposta = 5;
                        } else if(aposta > j2.getFichas()) {
                            do {
                                System.out.println("Sua aposta é maior que a quantia de fichas que você possui!" +
                                        "\nFaça uma nova aposta: ");
                                aposta = in.nextInt();
                            }while(aposta > j2.getFichas());
                        }
                        mesa = mesa + aposta;
                        aux = j2.getFichas() - aposta;
                        j2.setFichas(aux);
                        System.out.println("Agora você tem " + j2.getFichas() +" fichas!");
                        r1=false;
                    }

                    //Round2
                    boolean r2 = true;
                    while(r2 == true) {
                        //Jogador 1
                        System.out.println("Jogador 1 jogando em 5 segundos");
                        try{TimeUnit.SECONDS.sleep(5);} catch (InterruptedException e) {e.printStackTrace();}
                        System.out.println("\fJogador 1, sua mão é: ");
                        System.out.println(j1 + "\n");
                        System.out.println("Você deseja trocar as cartas ou sair? 1-Trocar / Qualquer outro número-Desistir");
                        int escolhaRound=in.nextInt();
                        if(escolhaRound==1){
                            for (int i = 0; i < 5; i++) {

                                System.out.println("\fQuais cartas você deseja trocar?");
                                int fs = 0;
                                for (Carta carta : j1.getMao()) {
                                    System.out.println(fs + "- " + carta);
                                    fs++;
                                }
                                System.out.println("5- Continuar");
                                System.out.println("Digite o indice da carta que deseja tocar:");
                                int x = in.nextInt();
                                if(x < 5) {
                                    j1.getMao().remove(x);
                                } else {
                                    break;
                                }
                            }
                            int j = 0;
                            while(j1.getMao().size() < 5) {
                                j1.addNaMao(baralho.get(j));
                                baralho.remove(j);
                            }

                            System.out.println("Jogador 1 sua nova mão é: \n" + j1 + "\n");
                        }
                        else{
                            System.out.println("Você saiu ! Jogador 2 ganhou essa rodada!");
                            j2.setFichas(j2.getFichas() +mesa);
                            r2=false;
                            r3=false;
                            break;
                        }
                        System.out.println("\fJogador 2 jogando em 5 segundos");
                        try{TimeUnit.SECONDS.sleep(5);} catch (InterruptedException e) {e.printStackTrace();}
                        //Jogador 2
                        System.out.println("Jogador 2, sua mão é: ");
                        System.out.println(j2 + "\n");
                        System.out.println("Você deseja trocar as cartas ou sair? 1-Trocar / Qualquer outro número-Desistir");
                        escolhaRound=in.nextInt();
                        if(escolhaRound==1){
                            for (int i = 0; i < 5; i++) {

                                System.out.println("\fQuais cartas você deseja trocar?");
                                int fs = 0;
                                for (Carta carta : j2.getMao()) {
                                    System.out.println(fs + "- " + carta);
                                    fs++;
                                }
                                System.out.println("5- Continuar");
                                System.out.println("Digite o indice da carta que deseja tocar:");
                                int x = in.nextInt();
                                if(x < 5) {
                                    j2.getMao().remove(x);
                                } else {
                                    break;
                                }
                            }
                            int l = 0;
                            while(j2.getMao().size() < 5) {
                                j2.addNaMao(baralho.get(l));
                                baralho.remove(l);
                            }

                            System.out.println("Jogador 2 sua nova mão é: \n" + j2 + "\n");
                        }
                        else{
                            System.out.println("Você saiu! Jogador 1 ganhou essa rodada!");
                            j1.setFichas(j1.getFichas() + mesa);
                            r2=false;
                            r3=false;
                            break;
                        }


                        r2 = false;
                    }

                    //Round3

                    while(r3 == true) {
                        int apostaJ1=0;
                        int apostaJ2=0;
                        int escolhaRound=0;
                        System.out.println("\fJogador 1, 1-Check ou 2-Raise");
                        escolhaRound=in.nextInt();
                        if(escolhaRound==2){
                            System.out.println("Quantia para apostar: " + "\n(Aposta mínima dobrada! 10 é a aposta minima!)");
                            apostaJ1 = in.nextInt();
                            if(apostaJ1 < 10) {
                                System.out.println("Sua aposta é menor que o valor minimo de 10!" +
                                        "\nA sua aposta foi redefinida para 10 fichas");
                                apostaJ1 = 10;
                            } else if(apostaJ1 > j1.getFichas()) {
                                do {
                                    System.out.println("Sua aposta é maior que a quantia de fichas que você possui!" +
                                            "\nFaça uma nova aposta: ");
                                    apostaJ1 = in.nextInt();
                                }while(apostaJ1 > j1.getFichas());
                            }
                            mesa = mesa + apostaJ1;
                            int aux = j1.getFichas() - apostaJ1;
                            j1.setFichas(aux);
                            System.out.println("Agora você tem " + j1.getFichas() +" fichas!");
                        }

                        System.out.println("\fJogador 2, 1-Check ou 2-Raise");
                        escolhaRound=in.nextInt();
                        if(escolhaRound==2){
                            System.out.println("Quantia para apostar: " + "\n(Aposta mínima dobrada! 10 é a aposta minima!)");
                            apostaJ2 = in.nextInt();
                            if(apostaJ2 < 10) {
                                System.out.println("Sua aposta é menor que o valor minimo de 10!" +
                                        "\nA sua aposta foi redefinida para 10 fichas");
                                apostaJ2 = 10;
                            } else if(apostaJ2 > j2.getFichas()) {
                                do {
                                    System.out.println("Sua aposta é maior que a quantia de fichas que você possui!" +
                                            "\nFaça uma nova aposta: ");
                                    apostaJ2 = in.nextInt();
                                }while(apostaJ2 > j2.getFichas());
                            }
                            mesa = mesa + apostaJ1;
                            int aux = j1.getFichas() - apostaJ1;
                            j1.setFichas(aux);
                            System.out.println("Agora você tem " + j2.getFichas() +"fichas");
                        }
                        else {
                            if(apostaJ1!=0){
                                System.out.println("Você é obrigado a pagar a aposta do jogador 1 !");
                                j2.setFichas(j2.getFichas() - apostaJ1);
                                apostaJ2 = apostaJ1;
                                System.out.println("Agora você tem " + j2.getFichas() +" fichas!");
                            }
                            r3=false;
                            break;
                        }

                        while(escolhaRound!=1){
                            System.out.println("\fJogador 1, 1-Check ou 2-Raise ");
                            int escolhaRoundJ1=in.nextInt();
                            if(escolhaRoundJ1==1){System.out.println("Você é obrigado a pagar a aposta do jogador 2 !");
                                j1.setFichas(j1.getFichas() - apostaJ2);
                                apostaJ1 = apostaJ2;
                                System.out.println("Agora você tem " + j1.getFichas() +" fichas!");
                            }
                            else{System.out.println("Digite o valor da nova aposta:");
                                apostaJ1=in.nextInt();
                                if(apostaJ1 < 10) {
                                    System.out.println("Sua aposta é menor que o valor minimo de 10!" +
                                            "\nA sua aposta foi redefinida para 10 fichas");
                                    apostaJ1 = 10;
                                } else if(apostaJ1 > j1.getFichas()) {
                                    do {
                                        System.out.println("Sua aposta é maior que a quantia de fichas que você possui!" +
                                                "\nFaça uma nova aposta: ");
                                        apostaJ1 = in.nextInt();
                                    }while(apostaJ1 > j1.getFichas());
                                }
                                j1.setFichas(j1.getFichas() - apostaJ1);
                                System.out.println("Agora você tem " + j1.getFichas() +" fichas!");
                            }

                            System.out.println("\fJogador 2, 1-Check ou 2-Raise ");
                            int escolhaRoundJ2=in.nextInt();
                            if(escolhaRoundJ2==1 && escolhaRoundJ1==2){
                                System.out.println("Você é obrigado a pagar a aposta do jogador 1 !");
                                j2.setFichas(j2.getFichas() - apostaJ1);
                                apostaJ2 = apostaJ1;
                                System.out.println("Agora você tem " + j2.getFichas() +" fichas!");
                                r3=false;
                                break;
                            }

                            else if(escolhaRoundJ2==1 & escolhaRoundJ1==1){
                                r3=false;
                                break;
                            }
                            System.out.println("Digite o valor da nova aposta:");
                            apostaJ2=in.nextInt();
                            j2.setFichas(j2.getFichas() - apostaJ2);
                            System.out.println("Agora você tem " + j2.getFichas() +" fichas!");
                        }

                    }
                    isVencedor(j1,j2);
                    isVencedorSP(j1,j2).setFichas(isVencedorSP(j1,j2).getFichas()+mesa);
                    System.out.println("Jogador 1 você tem " + j1.getFichas() +" fichas !");
                    System.out.println("Jogador 2 você tem " + j2.getFichas() +" fichas !");
                    if(j1.getFichas()!=0 && j2.getFichas()!=0){
                        if(Jogador.jogarMais() == true) {
                            System.out.println("\f\n------Novo Jogo------");
                            winCond = true;
                        } else {
                            System.out.println("\fObrigado por Jogar!");
                            System.out.println("Jogador 1 terminou o jogo com " + j1.getFichas() +" fichas !");
                            System.out.println("Jogador 2 terminou o jogo com " + j2.getFichas() +" fichas !");
                            winCond = false;
                        }
                    } else {
                        System.out.println("Um dos jogadores ficou sem fichas ! Game over!");
                        winCond = false;
                    }
                }
                break;
            case 2:
                System.out.println("Obrigado por jogar!");
                break;
        }
    }

}
















