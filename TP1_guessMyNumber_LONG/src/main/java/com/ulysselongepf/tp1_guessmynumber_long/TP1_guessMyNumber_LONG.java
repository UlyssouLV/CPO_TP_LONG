/*
26 Septembre 2023
Ulysse LONG
TP1
 */

package com.ulysselongepf.tp1_guessmynumber_long;

import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_LONG {

    public static void main(String[] args) {
        
        //Variables éventuelles
        int nb, difficulty, diff;
        int essai=1;
        boolean condition = true;
        
        
        // Génération nombre aléatoire dans n
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        System.out.print(n);
        
         // Affichage Saisie et Input
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Choisissez le niveau de difficulté :\n1) Facile\n2) Normal\n3) Difficile");
        difficulty = sc.nextInt();
       
        //Exception difficulté
        while(true){
            switch(difficulty){
                case 1 -> System.out.println("Difficulté facile choisie");
                case 2 -> System.out.println("Difficulté normale choisie");
                case 3 -> System.out.println("Difficulté difficile choisie");
                default -> {
                    System.out.println("Erreur de saisie, choisissez parmi 1/2/3");
                }
            } // fin du switch
            break;
        }//fin du while
        
        //Jeu
        do {
            //Saisie nombre utilisateur
            System.out.println("\n Please enter a number :"); 
            nb = sc.nextInt(); // Saisie nombre
            diff = n-nb; // Différence entre n et nb 
            
            //Gagné
            if(nb==n){
                System.out.println("Gagné en "+essai+" tentatives");
                condition=false;
            } 
            
            // si n < nb : diff <0 => trop Grand
            else if(n<nb){
                diff=-diff;

                switch (difficulty) {
                    // difficulté facile          
                    case 1 -> {
                        //Distance > 40
                        if (diff>40){
                            System.out.println("Vraiment trop grand");
                            essai++;
                        } 
                        // Distance <40 et >20
                        else if ( diff <=40 && (diff)>=10){
                            System.out.println("Trop grand");
                            essai++;
                        } 
                        // Distance < 10
                        else if (diff < 10 ){
                            System.out.println("Un tout petit peu trop grand");
                            essai++;
                        }
                        //On incrémente de 1 le nombre d'essai
                        essai++;
                    }
                    
                    // difficulté Normale 
                    case 2 -> {
                       System.out.println("Trop grand");
                       essai++;
                    }
                    
                    // difficulté Difficile
                    case 3 -> {
                        
                        System.out.println("Trop grand");
                        
                        //Moins de 10 tentatives
                        if(essai<10){
                        System.out.println("Il vous reste "+(10-essai)+" tentatives");
                        essai++;
                        } else {
                            System.out.println("Perdu");
                            condition=false;
                        }
                    }
                    default -> {
                    }
                }// Fin du switch 
                }// Fin trop grnad
            
                // si n > nb : diff > 0 => Trop petit
                else if (n>nb){
               
                switch (difficulty) {
                    // difficulté facile
                    case 1 -> {
                        //Distance > 40
                        if (diff>40){
                            System.out.println("Vraiment trop petit");
                            essai++;
                        } 
                        // Distance <40 et > 20
                        else if ( diff <=40 && diff>=10){
                            System.out.println("Trop petit");
                            essai++;
                        } 
                        // Distance < 10
                        else if (diff < 10 ){
                            System.out.println("Un tout petit peu trop petit");
                            essai++;
                        }
                    }
                    
                    // Difficulté Normale
                    case 2 -> {
                       System.out.println("Trop petit");
                       essai++;
                    }
                    // Difficulté Difficile
                    case 3 ->  {
                        
                        System.out.println("Trop petit");
                        //Moins de 10 tentatives
                        if(essai<10){
                        System.out.println("Il vous reste "+(10-essai)+" tentatives");
                        essai++;
                        } else {
                            System.out.println("Perdu");
                            condition=false;
                        }
                    }
                    default -> {
                    }
                } // Fin du switch

            }
        }while(condition);
        
    }//Fin Main
}//Fin Programme

