package com.ulysselongepf.lightoff_long_version_console;

import java.util.Scanner;

/**
 * Partie représente une partie du jeu LightOff en utilisant une grille de cellules
 * lumineuses. Cette classe facilite l'interaction entre le joueur et la grille, permettant de jouer
 * au jeu LightOff.
 * @author Ody
 * @version 1.0
 */
public class Partie {
    
     /**
    * La matrice carrée correspondant à la grille de CelluleLumineuses. 
    * @see GrilleDeCellules#matriceCellules
    */ 
    GrilleDeCellules grille;
    
     /**
    * Le nombre de coups réalisés pour gagner la partie
    * @see nbCoups
    */ 
    int nbCoups;


     /**
     * Constructeur Partie
     * <p>
     * A la création d'une partie,le nombre de coups Partie#nbCoups est initialisé à 0
     * La taille de la Partie#grille est fixée à une grille 3x3
     * </p>
     *
     * @see Partie#grille
     * @see Partie#nbCoups
     */
    public Partie() {
        grille = new GrilleDeCellules(3,3);
        this.nbCoups = 0;
    }
    
     /**
     * initialiserPartie permet de mélanger aléatoirement la grille créée.
     *
     * @see initialiserPartie#grille
     * @see Partie#nbCoups
     */
    public void  initialiserPartie(){
        grille.melangerMatriceAleatoirement(20);
        System.out.println(grille);
    }
    
     /**
     * lancerPartie
     * <p>
     * La méthode lancerPartie() est le cœur de la classe. Elle permet de jouer au jeu LightOff
     * en affichant l'état initial de la grille, puis en entrant dans une boucle de jeu qui continue
     * tant que toutes les cellules ne sont pas éteintes
     * </p>
     *
     * @see lancerPartie#sc
     * @see lancerPartie#coup
     * @see lancerPartie#grille
     * @see lancerPartie#nbCoups
     */
    public void lancerPartie(){
        
        Scanner sc = new Scanner(System.in);
        int coup;
        
        do{
            System.out.println("Choisissez l'action que vous souhaitez effectuer :\n1) Intervertir Ligne\n2) Intervertir Colonne\n3) Intervertir Diagonale Montante\n4) Intervertir Diagonale Descendante");
            coup=sc.nextInt();
            switch(coup){
                case 1->{
                    System.out.println("Entrez le numéro de la ligne concernée");
                    grille.activerLigneDeCellules(sc.nextInt()); 
                }
                case 2->{
                    System.out.println("Entrez le numéro de la colonne concernée");
                    grille.activerColonneDeCellules(sc.nextInt()); 
                }
                case 3->{
                    grille.activerDiagonaleMontante(); 
                }
                case 4->{
                    grille.activerDiagonaleDescendante();
                }
            }
            nbCoups++;
            System.out.println(grille);
            

            
        }while(!grille.cellulesToutesEteintes());
        System.out.println("Félicitations !\nNombre de coups necessaires pour gagner : "+nbCoups);
    }
    
    

}
