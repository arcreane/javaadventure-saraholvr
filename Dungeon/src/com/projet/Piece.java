package com.projet;

public class Piece {

    Monstres zangdar; // déclaration de l'existance d'un monstre
    Piece(){ // création de constructeur de Piece

        zangdar = new Monstres();


    }

    public void ouvrir(Heros heros) {
        zangdar.tape (heros);

    }
}
