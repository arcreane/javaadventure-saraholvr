package com.projet;

public class Piece {

    Monstres toto; // déclaration de l'existance d'un monstre
    Piece(){ // création de constructeur de Piece

        toto = new Monstres();


    }

    public void ouvrir(Heros heros) {
        toto.tape (heros);

    }
}
