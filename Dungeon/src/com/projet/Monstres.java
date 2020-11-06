package com.projet;

//tout ce qui englobera le monstre


public class Monstres {

    Armes pouetpouet;

    Monstres() {
        pouetpouet = new Armes();

        //Tout ce qui concerne le Magicien


        //Tout ce qui concerne le Barbares


    }


    public void tape(Heros heros) {
        heros.recoitDommage(pouetpouet.pointDommage);

    }
}
