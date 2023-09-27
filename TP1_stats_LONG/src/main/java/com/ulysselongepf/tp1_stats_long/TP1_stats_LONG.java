/*
27 Septembre 2023
Ulysse LONG
TP1 Stats
 */

package com.ulysselongepf.tp1_stats_long;

import java.util.Random;
import java.util.Scanner;

public class TP1_stats_LONG {

    public static void main(String[] args) {
        //Variables éventuelles
        int m,n;
        
        // Création tableau de 6 entiers
        int [] entiers = new int[6];
        
        // Saisie utilisateur
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Saisissez un nombre entier");
        m = sc.nextInt();
        
        // Génération nombre aléatoire dans n
        Random generateurAleat = new Random();
        
        while(!(m==0)){
            n = generateurAleat.nextInt(5);
            entiers[generateurAleat.nextInt(5)] =n;
            m--;
        }
        
        for(int i=0;i<entiers.length;i++){
            System.out.println(entiers[i]);
        }
        
    }
}
