package com.projet;


// tout ce qui englobera le jeu en lui même, avec appel de méthodes
// lance le Menu
public class Main {

    public static void main(String[] args) {
        Menu.lancerMenu(); //appel des methode qui sont dans le menu
        //pour le lancement du jeu

        Heros michel = new Heros();
        Donjon naheulbeuk = new Donjon();
        michel.entre(naheulbeuk);



    }
}
