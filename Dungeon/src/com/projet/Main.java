package com.projet;


// tout ce qui englobera le jeu en lui même, avec appel de méthodes
// lance le Menu
public class Main {

    public static void main(String[] args) {
        Menu.lancerMenu(); //appel des methode qui sont dans le menu
        //pour le lancement du jeu

        Heros.aventurierHeros(); // appels des methodes en reference avec le heros


        Armes.typeArmes(); //appel de metode concernant le types d'armes


        Monstres.ennemis(); // appel de methode concernant les ennemis

    }
}
