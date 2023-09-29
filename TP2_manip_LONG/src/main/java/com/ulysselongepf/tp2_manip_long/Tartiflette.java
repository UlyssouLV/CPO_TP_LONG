/*
Classe Tartiflette
29 Septembre 
TP 2 : Manip objets
 */
package com.ulysselongepf.tp2_manip_long;


public class Tartiflette {
    public int nbCalories;


    //Constructeur 
    public Tartiflette(int qtt){
        nbCalories =qtt;
    }//Fin Constructeur
    
    //ToString
    @Override
    public String toString() {
        return "Cette tartiflette contient "+nbCalories +" calories.";
    }//Fin ToString
    
}//Fin de classe
