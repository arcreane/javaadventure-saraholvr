package com.projet;


public class Donjon {
    Piece[] pieces; // tableau qui peut contenir des pièces

    Donjon() { // = Constructeur Donjon
        pieces = new Piece[5]; // Déclaration (instancier) d'un nouveau tableau de 5 pièces MAIS vide pour le moment
        for (int i = 0; i < pieces.length; i++) { // l'initialiser en affectanr un nouvel objet
            pieces[i] = new Piece(); // en l'indexant pour que le héros puisse viséter chaque pièce
        }

    }

    public void parcours(Heros heros) { // Permet à l'heros de visiter le donjon piècve en pièce

        for (int i = 0; i < pieces.length; i++) {// hero va parcouri pièce par pièce si reussite
            pieces[i].ouvrir(heros); //parametrer "heros" à "ouvrir", à la case "piece[concerné]"


            //Après avoir visiter la pièce et aller au suivant, verifier que Heros soit DoA
            if (!heros.estvivant()) {
                break;
            }
        }
        // Condition donnant l'accès au level suivant, OU PAS!
        if (heros.estvivant()) {
            System.out.println(" Le Nabot gagne un niveau");
        } else {
            System.out.println("Coup Fatal! Le Nabot perd lamentablement! Aurevoir, et merci d'avoir jouer!");
        }
    }

}