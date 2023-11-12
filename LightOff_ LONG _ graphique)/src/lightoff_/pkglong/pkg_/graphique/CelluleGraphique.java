package lightoff_.pkglong.pkg_.graphique;

import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Ody
 */
public class CelluleGraphique extends JButton{
    CelluleLumineuse cell;
    int largeur,longueur;

    public CelluleGraphique(CelluleLumineuse cell, int largeur, int longueur) {
        this.cell = cell;
        this.largeur = largeur;
        this.longueur = longueur;
    }
    
    
    @Override 
    protected void paintComponent(Graphics g) { 
        super.paintComponent(g);

    } 
    
    
    
}
