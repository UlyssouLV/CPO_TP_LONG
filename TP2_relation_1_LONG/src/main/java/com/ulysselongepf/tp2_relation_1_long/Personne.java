/*
Classe Personne : 2 méthodes : Constructeur + toString
 */
package com.ulysselongepf.tp2_relation_1_long;

public class Personne {
    
    public String nom,prenom;
    public int nbVoitures;
    public Voiture [] liste_voitures;

    //Constructeur 
    public Personne(String name, String firstname){
        nom = name;
        prenom = firstname;
        liste_voitures = new Voiture [3] ;
        nbVoitures =0;

    }//Fin Constructeur
    
    //ToString
    @Override
    public String toString() {
        return "Cette personne s'appelle "+prenom+" "+nom;
    }//Fin ToString
    
    //Méthode qui permet d'ajouter une voiture en posession
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        
        //Test : la voiture est volée ? Deja 3 voitures ?
        if(nbVoitures>2 || !(voiture_a_ajouter.Proprietaire == null)){
            return false;
        } else { // L'ajout est possible
            
            //ajout dans le tableau des voitures possedees
            liste_voitures[nbVoitures]=voiture_a_ajouter;
            nbVoitures++;
            
            //On mentionne à la voiture son propriétaire
            voiture_a_ajouter.Proprietaire = this ; 
            
            return true; // ajout effectué
        }
    }//Fin méthode
    
}
