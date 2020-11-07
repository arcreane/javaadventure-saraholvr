package com.projet;

//Tout ce qui englobera le héros

public class Heros {
    //objet Heros a pour instance: PV =200
    // possède 2 Armes: Flasque = taper Magicienne
    //                  Epée = taper Barbare

    Armes epee; //déclaration de Type Armes nommé Epée
    Armes flasque; //déclaration de Type Armes nommé Flasque
    int pv; //déclaration de PointdeVie

    public Heros() {
        epee = new Armes(); //affectation de nouvelle arme de type épee à l'héros
        flasque = new Armes(); // affectation de nouvelle arme de type flasque à l'héros
        Heros() { //Affectation de PointdeVie à Heros
            pv = 200;

        }
    }

    public static void aventurierHeros() {

    }

    public void entre(Donjon naheulbeuk) {
        naheulbeuk.parcours(this);  //methods que je vais passer en param: Heros qui parcourira les pièces 1 par 1

    }

    public void recoitDommage(int pointDommage) {
        pv -= pointDommage;


    }

    public boolean estvivant() { // Créer un paramètre "Est vivant" à heros pour qu'il puisse passer à la pièce suivante
    return pv > 0; // Instruction pour savoir si heros est vivant (ou pas!)
    }
}
