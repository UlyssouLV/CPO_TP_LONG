package com.ulysselongepf.lightoff_long_version_console;

/**
 * CelluleLumineuse est la classe qui représente une cellule dans deux états : Allumée ou éteinte
 * @author Ody
 * @version 1.0
 */

public class CelluleLumineuse {
   
    /**
     * L'Etat de la cellule. Cet etat est modifiable.
     * @see CelluleLumineuse#getEtat()
     */
    private boolean etat;

    /**
     * Constructeur CelluleLumineuse
     * <p>
     * A la construction d'une Cellule, son "etat" est fixé à false
     * ce qui correspond à éteint.
     * </p>
     * 
     * @see etat
     */
    
    public CelluleLumineuse() {
        this.etat = false;
    }
    
    /**
     *Active la Cellule.
     * 
     * @see etat
     */
    public void activerCellule(){
        if(!(this.etat))this.etat=true;
        else this.etat=false;
    }
    
    /**
     *Eteint la Cellule.
     * 
     * @see etat
     */
    public void eteindreCellule(){
        this.etat =false;
    }
    
    /**
     * Retourne l'indication que la cellule est éteinte.
     * 
     * @return La Cellule est éteinte.
     */
    public boolean estEteint(){
        if(!(this.etat)) return true;
        else return false;
    }
    
    /**
     * Retourne l'état de la cellule.
     * 
     * @return L'état de la Cellule.
     */
    public boolean getEtat() {
        return etat;
    }
    
    /**
     * Retourne un "X" en cas de Cellule Allumée ou un "O" en cas de Cellule Eteinte.
     * 
     * @return Etat de la Cellule.
     */
    @Override
    public String toString() {
        if(this.etat){
        return "X";
        } else return "O";
    } 
    
}
