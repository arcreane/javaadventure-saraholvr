package com.projet;

public class Piece {

    Monstres zangdar; // déclaration de l'existance d'un monstre
    Piece(){ // création de constructeur Piece

        zangdar = new Monstres();


    }
    // Avant que le héros n'entre dans la pièce on peut savoir si il est DoA

    public void ouvrir(Heros heros) {
        zangdar.tape (heros);

    }
}
