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
        int nb;
        int essai=1;
        boolean condition = true;
        
        // Génération nombre aléatoire dans n
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        System.out.print(n);
        
         // Affichage Saisie et Input
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("\n Please enter a number :"); 
        nb = sc.nextInt(); // Saisie nombre
        
        do {
            if(nb==n){
                System.out.println("Gagné en "+essai+" tentatives");
                condition=false;
            }else if(nb>n){
                System.out.println("Trop grand");
                essai++;
            } else {
                System.out.println("Trop petit");
                essai++;
            }
        }while(condition);
    }
}
