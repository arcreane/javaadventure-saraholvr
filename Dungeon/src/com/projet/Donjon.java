package com.projet;



public class Donjon {
    Piece[] pieces;
    Donjon(){
        pieces = new Piece[5]; // tableau qui peut contenir 5 pièces crées dans le Donjon
        for (int i = 0; i <pieces.length ; i++) {
           pieces[i] = new Piece();
        }

    }

    public void parcours(Heros heros) {
        for (int i = 0; i < pieces.length; i++) {// hero va parcouri pièce par pièce si reussite
pieces[i].ouvrir(heros);
        }

    }
}
