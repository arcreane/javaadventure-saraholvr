package com.projet;

//Tout ce qui englobera le héros

public class Heros {

    int pv;

    Heros() {
        pv = 200;

    }

    public static void aventurierHeros() {

    }

    public void entre(Donjon naheulbeuk) {
        naheulbeuk.parcours(this);  //methods que je vais passer en param: Heros qui parcourira les pièces 1 par 1

    }

    public void recoitDommage(int pointDommage) {
pv -= pointDommage;

    }


    //objet Heros a pour instance: PV =200
    // possède 2 Armes: Flasque = taper Magicienne
    //                  Epée = taper Barbare


}
