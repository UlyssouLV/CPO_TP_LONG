package lightoff_.pkglong.pkg_.graphique;

import java.util.Scanner;

/**
 * Partie représente une partie du jeu LightOff en utilisant une grille de cellules
 * lumineuses. Cette classe facilite l'interaction entre le joueur et la grille, permettant de jouer
 * au jeu LightOff.
 * @author Ody
 * @version 1.0
 */
public final class Partie {
     /**
    * La matrice carrée correspondant à la grille de CelluleLumineuses. 
    */ 
    GrilleDeCellules grille;
    
     /**
    * Le nombre de coups réalisés pour gagner la partie
    */ 
    int nbCoups;


     /**
     * Constructeur Partie
     * <p>
     * A la création d'une partie,le nombre de coups est initialisé à 0
     * La taille de la grille est fixée selon le choix de l'utilsiateur
     * </p>
     *
     */
    public  Partie() {
       
        this.nbCoups = 0;
        
        Scanner sc = new Scanner(System.in);
        int difficulty;
        
        System.out.println("Lancement d'une partie de LightOff,\nChoisissez la difficulté que vous souhaitez :");
        
        do {
        System.out.println("1) Facile (Grille 2x2)\n2) Normal (Grille 3x3)\n3) Difficile (Grille 4x4)\n4) Au choix (Grille au choix)");
        difficulty = sc.nextInt();
        switch(difficulty){
            default->{
                System.out.println("Erreur de saisie");
            }
            case 1->{
                System.out.println("Choix effectué : Grille Facile");
                grille = new GrilleDeCellules(2,2);
                this.initialiserPartie();
                this.lancerPartie();
            }
            case 2->{
                System.out.println("Choix effectué : Grille Normale");
                grille = new GrilleDeCellules(3,3);
                this.initialiserPartie();
                this.lancerPartie();
            }
            case 3->{
                System.out.println("Choix effectué : Grille Difficile");
                grille = new GrilleDeCellules(4,4);
                this.initialiserPartie();
                this.lancerPartie();
            }
            case 4->{
                int size;
                System.out.println("Choix effectué : Grille au choix\nTaille de la grille voulue :");
                size = sc.nextInt();
                System.out.println("Très bien, la partie se lancera avec une grille de taille : "+size);
                grille = new GrilleDeCellules(size,size);
                this.initialiserPartie();
                this.lancerPartie();
            }
        }
        }while(!(difficulty ==1 || difficulty ==2 || difficulty ==3 || difficulty ==4));
    }
    
     /**
     * initialiserPartie permet de mélanger aléatoirement la grille créée.
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
     */
    public void lancerPartie(){
        
        Scanner sc = new Scanner(System.in);
        int coup;
       
        do{
            do{
            System.out.println("Choisissez l'action que vous souhaitez effectuer :\n1) Intervertir Ligne\n2) Intervertir Colonne\n3) Intervertir Diagonale Montante\n4) Intervertir Diagonale Descendante");
            coup=sc.nextInt();
            switch(coup){
                default ->{
                    System.out.println("Erreur de saisie");
                }
                case 1->{
                    System.out.println("Entrez le numéro de la ligne concernée");
                    int input;
                    input = sc.nextInt();
                    if(verifSaisie(input)!=-1){
                    grille.activerLigneDeCellules(input); 
                    }
                   
                }
                case 2->{
                    System.out.println("Entrez le numéro de la colonne concernée");
                    int input;
                    input = sc.nextInt();
                    if(verifSaisie(input)!=-1){
                    grille.activerColonneDeCellules(input); 
                    }
                }
                case 3->{
                    grille.activerDiagonaleMontante(); 
                }
                case 4->{
                    grille.activerDiagonaleDescendante();
                }
            }
            }while(!(coup==1 || coup==2 || coup==3 || coup==4));
            nbCoups++;
            System.out.println(grille);

            
        }while(!grille.cellulesToutesEteintes());
        System.out.println("Félicitations !\nNombre de coups necessaires pour gagner : "+nbCoups);
    }
    
    /**
     * verifSaisie permet de gérer les exceptions dans le cas des saisies non valides
     * @param input
     *              La saisie utilisateur concernant le coup à jouer
     * @return
     *              -1 dans le cas où il y a une erreur de saisie, et l'input 
     *  dans le cas d'une bonne saisie.
     */
    public int verifSaisie(int input){
        if(input>grille.nbColonnes-1 || !(input>=0)){
           System.out.println("Erreur de saisie : La taille de la grille est de "+grille.nbColonnes);
           return -1;
        } else return input;
}
    

}
