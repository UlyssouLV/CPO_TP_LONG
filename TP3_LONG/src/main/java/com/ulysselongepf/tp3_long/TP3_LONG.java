/*
13 /10 / 23
TP 3 : Héritage et polymorhpisme
 */

package com.ulysselongepf.tp3_long;

import Armes.Baton;
import Armes.Epee;
import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;

public class TP3_LONG {

    public static void main(String[] args) {
        
       //Creation des Personnages
       Guerrier Ulysse = new Guerrier(100,true,"Ulysse");
       Magicien Adrien = new Magicien(100,false,"Adrien");
       
       //Creation des Armes
       Epee Excalibur = new Epee(7,5,"Excalibur");
       Epee Durandal = new Epee(1,1,"Durandal");
       Baton Charme = new Baton(5,6,"Charme");
       Baton Chene = new Baton(4,5,"Chêne");
       
       //Armement Guerrier
       Ulysse.addWeaponToInv(Excalibur);
       Ulysse.addWeaponToInv(Chene);
       Ulysse.equipWeapon("Excalibur");
       
       //Armement Magicien
       Adrien.addWeaponToInv(Chene);
       Adrien.addWeaponToInv(Durandal);
       Adrien.equipWeapon("Chêne");
       
       //Affichage des personnages céés 
       System.out.println("------Personnages------");
       System.out.println("Nombre de Personnages : "+Personnage.getNbCarracter());
       System.out.println("Nombre de Guerriers : "+Guerrier.getNbWarrior());
       System.out.println("Nombre de Magiciens : "+Magicien.getNbMage());
       System.out.println("-----------------------");
          
       //Affichage Caractéristique des personnages
       System.out.println(Ulysse);
       System.out.println(Adrien);

       //Attaques
       Ulysse.attaquer(Adrien);
       Adrien.attaquer(Ulysse);
       
       //Affichage Caractéristique des personnages
       System.out.println(Ulysse);
       System.out.println(Adrien);
       
       //Personnages vivants
       if(Ulysse.estVivant()==true) System.out.println("Ulysse est vivant");
       else System.out.println("Ulysse est mort");
       if(Adrien.estVivant()==true) System.out.println("Adrien est vivant");
       else System.out.println("Adrien est mort");
          
       
       
       
    }
}
