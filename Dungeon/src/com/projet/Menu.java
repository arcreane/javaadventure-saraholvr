package com.projet;

import java.util.Scanner;

// Tout ce qui en rapport avec le menu du jeu
public class Menu {

    public static void lancerMenu(String[] args) {

        System.out.println("Jouez tapez: 1. Qiuittez, tapez 0");
        Scanner lectureClavier = new Scanner(System.in);

        int choix = lectureClavier.nextInt();

        if (choix == 0) {
            System.out.println("Vous sortez du jeu");
        } else
            System.out.println("Le jeu va commencer");
    }
}