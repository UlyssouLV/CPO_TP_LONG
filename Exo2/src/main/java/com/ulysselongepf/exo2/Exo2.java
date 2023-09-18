/**
 * TP0 Exercice 2
 * 18 Septembre 2023
 */

package com.ulysselongepf.exo2;

import java.util.Scanner;

/**
 *
 * @author Ody
 */
public class Exo2 {

    public static void main(String[] args) {
        
    //Declaration des variables
    int nb;
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer le nombre :");
    nb=sc.nextInt(); // On demande a sc de donner le prochain entier
    int result; // resultat
    int ind; //indice
    result=0;
    
    // Addition des nb premiers entiers
    ind=1;
    while (ind <= nb) {
    result=result+ind;
    ind++;
    }
    
    // Affichage du resultat
    System.out.println();
    System.out.println("La somme des "+ nb + " entiers est: "+result);
    
    }
}
