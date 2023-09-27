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
        int nb,test;
        double pourcentage=0;
        
        // Création tableau de 6 entiers
        double [] entiers = new double[6];
        // Saisie utilisateur
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Saisissez le nombre de générations par face");
        nb = sc.nextInt(); // nb nombre de tour de boucle
        
        // Génération nombre aléatoire dans n
        Random generateurAleat = new Random();
        
        //Etablissement des pourcentages
        //Boucle sur taille du dé : 6
        for(int i=0;i<entiers.length;i++){
            //Boucle sur le nombre de generation
            for(int j=0;j<nb;j++){
                test = generateurAleat.nextInt(6); // Test est la valeur testée qui prend une face aléatoire du dé
                if(test==i){ // Si cette valeur est l'indice de la face tombée
                    pourcentage++; // On compte le nombre de fois que la face tombe
                }  // Fin du test
            } // Fin de generation pour la face d'indice i
            
            // On calcule le pourcentage obtenu : nombre de fois que la face est tombée / nombre de génération aléatoire
            pourcentage = 100*(pourcentage/(nb));
            // On rentre le pourcentage dans l'indice du tableau du dé
            entiers[i] = pourcentage;
            
            // On réinitialise cette valeur pour tester la prochaine face
            // Sauf à la dernière itération pour ne pas supprimer la derniere info
            if(!(i==entiers.length-1)){
            pourcentage=0;
            }

        } // Fin du test pour l'entiereté des faces
        
        // Affichage des résultats
        System.out.print("Résultats obtenus :\n[  0   1    2    3    4    5 ]\n[");
        for(int i=0;i<entiers.length;i++){
            System.out.print(entiers[i]+"% ");
        }
        System.out.print("]");
       
        
    }
}
