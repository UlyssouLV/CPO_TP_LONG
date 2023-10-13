/*
13 /10 / 23
TP 3 : Héritage et polymorhpisme
 */

package com.ulysselongepf.tp3_long;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import java.util.ArrayList;

public class TP3_LONG {

    public static void main(String[] args) {
        
       //Creation des Personnages
       Guerrier Ulysse = new Guerrier(100,true,"Ulysse");
       Magicien Adrien = new Magicien(100,true,"Adrien");
       
       //Creation des Armes
       Epee Excalibur = new Epee(7,5,"Excalibur");
       Epee Durandal = new Epee(1,1,"Durandal");
       Epee Legende = new Epee(10,10,"Epee de légende");
       Baton Charme = new Baton(5,6,"Charme");
       Baton Chene = new Baton(4,5,"Chêne");
       Baton Bois = new Baton(1,1,"Branche");
       
       //Armement Guerrier
       Ulysse.addWeaponToInv(Legende);
       Ulysse.addWeaponToInv(Excalibur);
       Ulysse.addWeaponToInv(Bois);
       Ulysse.equipWeapon("Epee de légende");
       
       //Armement Magicien
       Adrien.addWeaponToInv(Chene);
       Adrien.addWeaponToInv(Charme);
       Adrien.addWeaponToInv(Durandal);
       Adrien.equipWeapon("Charme");
       
       //Affichage du nombre d'armes de prédilection
       System.out.println(Ulysse.numberOfWeaponOfChoice());
       System.out.println(Adrien.numberOfWeaponOfChoice());
       
       //Affichage Caractéristique des personnages
       System.out.println(Ulysse);
       System.out.println(Adrien);
        
    }
}
