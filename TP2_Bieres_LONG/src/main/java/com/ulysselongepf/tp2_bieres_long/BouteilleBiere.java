/*
Classe Biere : Constructeur / Méthode pour lire etiquette / Méthode pour décapsuler / méthode toString
 */
package com.ulysselongepf.tp2_bieres_long;


//Classe Bouteille
public class BouteilleBiere {
    public String nom;
    public float degreAlcool ;
    public String brasserie;
    public boolean ouverte;
    
    // Constructeur
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    }//Fin Constructeur

    
    //Méthode pour lire les informations de l'étiquette 
    public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +
    " degres) \nBrasserie : " + brasserie ) ;

    }//Fin Méthode
    
    //Méthode pour décapsuler la bouteille
    public void Decapsuler() {
        
        if(ouverte==false){
            ouverte = true;
        } else {
            ouverte=false;
            System.out.println("Erreur, bière déja ouverte");
        }

    }//Fin Méthode
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }
    
    
}//Fin Classe

