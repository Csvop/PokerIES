package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Main {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);

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

        //Mostra as cartas
//        int cont = 0;
//
//        Collections.shuffle(baralho);
//        Baralho deck = new Baralho(baralho);
//
//        for (Carta carta : baralho) {
//            System.out.println(carta);
//            cont++;
//        }
//        System.out.println(cont);

        //Jogo
        System.out.println("Bem vindo ao IES Poker!");
        System.out.println(
                "---------Menu----------\n" +
                        "1- Jogar\n" +
                        "2- Leia as Regras\n" +
                        "3- Sair");
        int opt = in.nextInt();
        switch (opt) {
            case 1:
                boolean winCond = true;
                while (winCond == true) {
                    int mesa = 0;
                    Collections.shuffle(baralho);
                    Baralho deck = new Baralho(baralho);
                    for(int i = 0; i < 5; i++) {
                        j1.addNaMao(baralho.get(i));
                        baralho.remove(i);
                        j2.addNaMao(baralho.get(i+5));
                        baralho.remove(i+5);
                    }

                    System.out.println("Jogador 1, sua mão é: ");
                    System.out.println(j1 + "\n");

                    System.out.println("Jogador 2, sua mão é: ");
                    System.out.println(j2 + "\n");

                    //Round1
                    boolean r1 = true;
                    while(r1 == true) {
                        int escolhaRounds = 0;
                        int aposta = 0;

                        System.out.println("Jogador 1, 1-aposte ou 2-sair/passar");
                        escolhaRounds = in.nextInt();

                        if (escolhaRounds == 1) {
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
                        } else {
                            //sair/passar
                            if(mesa%2==0 && mesa != 0) {
                                //passar

                            } else {
                                //sair
                                r1 = false;
                            }
                        }

                        System.out.println("Jogador 2, 1-aposte ou 2-sair/passar");
                        escolhaRounds = in.nextInt();

                        if (escolhaRounds == 1) {
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
                            int aux = j2.getFichas() - aposta;
                            j2.setFichas(aux);
                        } else {
                            //sair/passar
                            if(mesa%2==0 && mesa != 0) {
                                //passar

                            } else {
                                //sair
                                r1 = false;
                            }
                        }
                        r1=false;
                    }

                    //Round2
                    boolean r2 = true;
                    while(r2 == true) {


                        r2 = false;
                    }

                    //Round3
                    boolean r3 = true;
                    while(r3 == true) {
                        int apostaJ1=0;
                        int apostaJ2=0;
                        int escolhaRound=0;
                        System.out.println("Jogador 1, 1-check ou 2-raise");
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
                        }

                        System.out.println("Jogador 2, 1-check ou 2-raise");
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

                        }
                        else {
                            if(apostaJ1!=0){
                                System.out.println("Você é obrigado a pagar a aposta do jogador 1 !");
                                j2.setFichas(j2.getFichas() - apostaJ1);
                                apostaJ2 = apostaJ1;
                            }
                            r3=false;
                            break;
                        }

                        while(escolhaRound!=1){
                            System.out.println(" Jogador 1, 1-check ou 2-raise ");
                            int escolhaRoundJ1=in.nextInt();
                            if(escolhaRoundJ1==1){System.out.println("Você é obrigado a pagar a aposta do jogador 2 !");
                                j1.setFichas(j1.getFichas() - apostaJ2);
                                apostaJ1 = apostaJ2;
                            }
                            else{System.out.println("Digite o valor da nova aposta:");
                                apostaJ1=in.nextInt();
                                j1.setFichas(j1.getFichas() - apostaJ1);
                            }

                            System.out.println(" Jogador 2, 1-check ou 2-raise ");
                            int escolhaRoundJ2=in.nextInt();
                            if(escolhaRoundJ2==1 && escolhaRoundJ1==2){System.out.println("Você é obrigado a pagar a aposta do jogador 1 !");
                                j2.setFichas(j2.getFichas() - apostaJ1);
                                apostaJ2 = apostaJ1;
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

                        }

                    }

                    winCond = false;
                }
                if(j1.getFichas()!=0 && j2.getFichas()!=0){
                    Jogador.jogarMais();
                }
                ;break;
            case 2:
                System.out.println("2");;break;
            case 3:
                System.out.println("3");;break;
        }
    }

}
















