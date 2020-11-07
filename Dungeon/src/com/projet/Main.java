package com.projet;


// tout ce qui englobera le jeu en lui même, avec appel de méthodes
// lance le Menu
public class Main {

    public static void main(String[] args) {
        Menu.lancerMenu(); //appel des methode qui sont dans le menu
        //pour le lancement du jeu

        Heros nabot = new Heros(); //Création d'un heros de nom Nabot qui va visiter le donjon
        Donjon naheulbeuk = new Donjon(); // création de Donjon de nom naheulbeuk qui permettra au hero de visiter le donjon
        nabot.entre(naheulbeuk); // Permet à l'heros de penetrer le donjon
                                // Peut être aussi: le donjon permet à l'héros d'entrer




    }
}
