/*
Classe Voiture : 2 méthodes : Constrcuteur et toString
 */
package com.ulysselongepf.tp2_relation_1_long;

public class Voiture {
    public String Modele,Marque;
    public int PuissanceCV;
    public Personne Proprietaire;
    
    //Constructeur 
    public Voiture(String modl, String marc, int power){
        Modele = modl;
        Marque = marc;
        PuissanceCV = power;
        Proprietaire = null;
    }//Fin Constructeur
    
    //ToString
    @Override
    public String toString() {
        return Modele +" "+PuissanceCV+" chevaux fiscaux "+ "de la marque "+Marque+".";
    }//Fin ToString
}
