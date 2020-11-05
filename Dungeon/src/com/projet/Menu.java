package com.projet;

import java.util.Scanner;

// Tout ce qui en rapport avec le menu du jeu


public class Menu {

    public static void lancerMenu() {
//Choix du joeur: jouer ou sortir
        System.out.println("Veuillez tapez 1 pour jouer, ou tout autre chiffre pour quitter.");
        Scanner lectureClavier = new Scanner(System.in);

        int choix = lectureClavier.nextInt();

        if (choix == 1) {
            System.out.println(" Tagazok à toi, mon ami. Paix et guérison sur ton peuple"); // Début du jeu
        } else
            System.out.println(" Chaussette! Chaussette!! ");  // Sortie du jeu
    }

}