/*
26 Septembre 2023
TP1
Ulysse LONG
 */

package com.ulysselongepf.tp1_manipnombresint_long;

import java.util.Scanner;


public class TP1_manipNombresInt_LONG {

    public static void main(String[] args) {
        
        // Variables éventuelles
        int entier1;
        int entier2;
        
        //Demande de saisie et affectation
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Saisissez deux entiers :");
        entier1 = sc.nextInt();
        entier2 = sc.nextInt();
        
        //Affichage saisie + différence + produit + Quotient + Reste division euclidienne
        System.out.print("Entier 1 : "+entier1 +"\nEntier 2 : "+ entier2 +"\nDifférence : "+ (entier1-entier2)+"\nProduit : "+ entier1*entier2 +"\nQuotient : "+ (entier1/entier2) + "\nReste : "+(entier1%entier2));
    }
}
