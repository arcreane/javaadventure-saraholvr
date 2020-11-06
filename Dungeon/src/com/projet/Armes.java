package com.projet;

//tout ce qui englobera les armes, que ce soit Héros ou Monstres


public class Armes {
    int pointDommage;

    Armes() {
        pointDommage = 10; // PD de chaque Armes

    }

    public static void typeArmes() {

       Armes.epee();
        //Armes du Héros
        //Epée et ses caractéristiques

        Armes.fioles();
        //Fioles et ses caracteristiques

        Armes.eclairs();
        //Armes du Magicien
        //Eclair et ses effets

        Armes.hache();
        //Arme Barbare
        //Hache et ses effets

    }

    private static void hache() {
        int hachePD; // Init des Point Degat de la hache

    }

    private static void eclairs() {
        int elairPD; // Init des PD de l'éclair

    }

    private static void fioles() {
        int fiolesPD; //initialisation des PD du fiole

    }

    private static void epee() {
        int epeePD; //init des PD de l'épée

    }
}