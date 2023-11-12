package lightoff_.pkglong.pkg_.graphique;

import java.util.Random;


/**
 * GrilleDeCellules est la classe ou on trouve une grille contenant des references vers les cellules
 * lumineuses du jeu et les méthodes permettant d'agir sur ces dernières.
 * @author Ody
 * @version 1.0
 */
public class GrilleDeCellules {
    
    /**
    * La matrice carrée correspondant à la grille de CelluleLumineuses. 
    */ 
    CelluleLumineuse[][] matriceCellules ;
    
     /**
     * Le nombre de lignes de la grille.
     */
     /**
     * Le nombre de colonnes de la grille.
     */
    int nbLignes, nbColonnes;
    
    /**
     * Constructeur GrilleDeCellules
     * <p>
     * A la construction d'une grille de Cellules, le nombre de lignes est fixé à p_nbLignes
     * le nombre de colonnes est fixé à p_nbColonnes
     * la matrice de la grille de cellules est initialisée avec une taille p_nbLignes x p_nbColonnes
     * Chaque emplacement de la matrice est une référence à une nouvelle Cellule lumineuse créée.
     * </p>
     * 
     * @param p_nbLignes
     *          Le nombre de lignes de la grille
     * @param p_nbColonnes
     *          Le nombre de colonne de la grille
     */
    public GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        this.matriceCellules = new CelluleLumineuse[this.nbLignes][this.nbColonnes];
        
        for(int i=0;i<this.nbLignes;i++){
            for(int j=0;j<this.nbColonnes;j++){
                matriceCellules[i][j]=new CelluleLumineuse();
            }
        }
    }
    
    /**
     *Eteint toutes les cellules de la grille.
     */
    public void eteindreToutesLesCellules(){
        for(int i=0;i<nbLignes;i++){
            for(int j=0;j<nbColonnes;j++){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    /**
     * Active une ligne ou une colonne aléatoirement de la grille.
     * Ce choix aléatoire dépend de loc
     * Si ce nombre est 0 c'est la ligne qui s'active si c'est 1 c'est la colonne, si c'est 3 c'est la diagonale
     * Ensuite la ligne ou la colonne ou la diagonale qu'il faut modifier correspond respectivement
     * au numéro lr et cr
     * dr (Si dr=0 c'est la montante si dr=1 c'est la descendante)
     */
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random r = new Random();
        int loc =r.nextInt(3);        
        switch (loc) {
            case 0 -> {
                int lr =r.nextInt(nbLignes);
                this.activerLigneDeCellules(lr);
            }
            case 1 -> {
                int cr =r.nextInt(nbColonnes);
                this.activerColonneDeCellules(cr);
            }
            case 2 -> {
                int dr =r.nextInt(2);
                if(dr==0){
                    this.activerDiagonaleMontante();
                } else this.activerDiagonaleDescendante();
            }
            default -> {
            }
        }
        
    }
    /**
     * Retourne une chaine de carractère correspondant à l'état de la grille de cellule.
     * 
     * @return Etat de la Grille
     */
    @Override
    public String toString() {
        String grille="";
        String trait="----";
        String line1="   |";
        for(int i=0;i<nbLignes+1;i++){
            if(i==0){
                    for(int k=0;k<nbColonnes;k++){
                        line1+=" "+Integer.toString(k)+ " |";
                        trait+="----";
                    }
                    line1+="\n"+trait+"\n";
                }    
        } grille+=line1;
            
        for(int i=0;i<nbLignes;i++){
            for(int j=0;j<nbColonnes;j++){
                if(j==0){
                    grille+= " "+Integer.toString(i)+" |";
                }
                if(matriceCellules[i][j].estEteint()){
                    grille+=" O |";
                } else {
                    grille+=" X |";
                }
                if(j==nbColonnes-1){
                    grille+="\n"+trait+"\n";
                }
            }
        } return grille;
    } 
    
    
     /**
     * Active la les Cellules lumineuses de la ligne d'indice activerColonneDeCellules#idLigne
     * 
     * @param idLigne
     *          L'indice de la ligne dont il faut activer les cellules lumieuses
     * */
    public void activerLigneDeCellules(int idLigne){
        for(int i=0;i<nbColonnes;i++){
                    matriceCellules[idLigne][i].activerCellule();
                }  
    }
    
    /**
     * Active la les Cellules lumineuses de la colonne d'indice activerColonneDeCellules#idColonne
     * 
     * @param idColonne
     *          L'indice de la colonne dont il faut activer les cellules lumieuses
     */
    public void activerColonneDeCellules(int idColonne){
        for(int i=0;i<nbLignes;i++){
                    matriceCellules[i][idColonne].activerCellule();
                }  
    }
    
    /**
     * Activer les cellules lumineuses de la diagonale descendante
     * 
     * @see matriceCellules
     */
    public void activerDiagonaleDescendante(){
        for(int i=0;i<nbLignes;i++){
            matriceCellules[i][i].activerCellule();

        }
        
    }
    
    /**
     * Activer les cellules lumineuses de la diagonale montante
     * 
     * @see matriceCellules
     */
    public void activerDiagonaleMontante(){
        for(int i=0;i<nbLignes;i++){
            matriceCellules[i][nbLignes-1-i].activerCellule();
        }
        
    }
    
    /**
     * Verifie si toutes les cellules de la grille sont éteintes.
     * 
     * @return Vrai si c'est le cas, faux dans le cas contraire.
     */
    public boolean cellulesToutesEteintes(){
        for(int i=0;i<nbLignes;i++){
            for(int j=0;j<nbColonnes;j++){
                if(!(matriceCellules[i][j].estEteint())){
                    return false;
                }
            }
        } return true;
    }
    
    /**
     * melangerMatriceAleatoirement permet de mélanger plus ou moins la grille de cellules.
     * 
     * @param nbTours
     *          Le nombre d'itération de mélange effectuées
     */
    public void melangerMatriceAleatoirement(int nbTours){
        for(int i=0;i<nbTours;i++){
            this.activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
   
    
     
     
     
     
}
