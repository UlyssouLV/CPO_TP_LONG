package lightoff_.pkglong.pkg_.graphique;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Cette JFrame est la fenêtre principale du jeu, à noter que le code 
 * s'execute directement dans la JFrame on n'a pas distancé le code du jeu 
 * dans des classes différentes.
 * @author Ody
 * @version finale
 */
public final class FenetrePrincipale extends javax.swing.JFrame {
    int nbCoups=1;
    GrilleDeCellules grille;

    private FenetrePrincipale() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     *Methode qui permet d'initialiser une grille de partie non gagné dés le
     * premier tour
     * @see grille
     *          La grile de jeu
     */
    public void initialiserPartie() {
    grille.eteindreToutesLesCellules();
    grille.melangerMatriceAleatoirement(10);
    //Pour forcer à ne pas gagner dés le premier tour
    if(grille.cellulesToutesEteintes()){
        grille.activerLigneColonneOuDiagonaleAleatoire();
    }
    }
    
    /**
     * Constructeur de la fenetre
     * @param size
     *          La taille de la grille
     * @see grille
     *          La grille de jeu
     * @see PanneauGrille
     *          Le Layout de la fenetre
     */
    public FenetrePrincipale(int size) {
        initComponents();
        this.grille = new GrilleDeCellules( size , size);
        initialiserPartie();
       
        PanneauGrille.setLayout(new GridLayout(size, size));
        setLayoutGrid(size);
        setLayoutCommand(size);
        this.setVisible(true);  
    }
    
    /**
     *Methode qui permet de détecter si la partie est gagnée ou non
     * Dans le cas favorable on ferme cette fenetre et on affiche la Jframe 
     * Gagne
     */
    public void gagne(){
        if(grille.cellulesToutesEteintes()){
            dispose();
            Gagne victoire = new Gagne(nbCoups);
        }
    }
    
    /**
     * Methode qui configure l'affiche de la grille dans la fenetre
     * @param size
     *          La taille de la grile
     */
    public void setLayoutGrid(int size){

        for (int i=0; i < size; i++) { 
            for (int j=0; j < size; j++ ) {
            CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matriceCellules[i][j], 36,36);  
            if(grille.matriceCellules[i][j].estEteint()==true){
                    bouton_cellule.setBackground(Color.BLACK);
                } else bouton_cellule.setBackground(Color.YELLOW);

            PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
                }
        } 
    }
    
    /**
     * Methode qui vient modifier la grille en fonction des boutons de commande
     * cliqués
     * @param size
     *            La taille de la grille
     */
    public void changeLayoutGrid(int size){
        PanneauGrille.removeAll();
        setLayoutGrid(size);
        PanneauGrille.revalidate();
        PanneauGrille.repaint();
        
    }
    
    /**
     * Methode qui configure l'affichage des boutons de commande dans le 
     * layout
     * @param size
     */
    public void setLayoutCommand(int size){
        

        Font police = new Font("Arial", Font.PLAIN, 10);

        Columns.setLayout(new GridLayout(1,size));
        for(int i=0;i<size;i++){
            Columns.add(new JButton(String.valueOf(i+1)));
            Columns.getComponent(i).setFont(police);
            
            JButton bouton_colonne= (JButton) Columns.getComponent(i);
            bouton_colonne.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Récupération du nom du bouton (indice) cliqué
                    String nomBouton = e.getActionCommand();
                    // Convertir le nom du bouton en un indice
                    int indice = Integer.parseInt(nomBouton);
                    // Code à exécuter lorsque le bouton est cliqué
                    grille.activerColonneDeCellules(indice-1);
                    changeLayoutGrid(size);
                    gagne();
                    nbCoups++;

                }
            });
        }
        
        Lines.setLayout(new GridLayout(size,1));
        for(int i=0;i<size;i++){
            Lines.add(new JButton(String.valueOf(i+1)));
            Lines.getComponent(i).setFont(police);
            
            JButton bouton_ligne= (JButton) Lines.getComponent(i);
            bouton_ligne.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Récupération du nom du bouton (indice) cliqué
                    String nomBouton = e.getActionCommand();
                    // Convertir le nom du bouton en un indice
                    int indice = Integer.parseInt(nomBouton);
                    // Code à exécuter lorsque le bouton est cliqué
                    grille.activerLigneDeCellules(indice-1);
                    changeLayoutGrid(size);
                    gagne();
                    nbCoups++;


                }
            });
        }

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Columns = new javax.swing.JPanel();
        PanneauGrille = new javax.swing.JPanel();
        Lines = new javax.swing.JPanel();
        DiagMont = new javax.swing.JButton();
        DiagDesc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Columns.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout ColumnsLayout = new javax.swing.GroupLayout(Columns);
        Columns.setLayout(ColumnsLayout);
        ColumnsLayout.setHorizontalGroup(
            ColumnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        ColumnsLayout.setVerticalGroup(
            ColumnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(Columns, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 390, 50));

        PanneauGrille.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 390, 370));

        Lines.setBackground(new java.awt.Color(102, 255, 0));

        javax.swing.GroupLayout LinesLayout = new javax.swing.GroupLayout(Lines);
        Lines.setLayout(LinesLayout);
        LinesLayout.setHorizontalGroup(
            LinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        LinesLayout.setVerticalGroup(
            LinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        getContentPane().add(Lines, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, 370));

        DiagMont.setText("/");
        DiagMont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagMontActionPerformed(evt);
            }
        });
        getContentPane().add(DiagMont, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 50, 50));

        DiagDesc.setText("\\");
            DiagDesc.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    DiagDescActionPerformed(evt);
                }
            });
            getContentPane().add(DiagDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 50, 50));

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void DiagMontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagMontActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontante();
        changeLayoutGrid(grille.nbColonnes);
        gagne();
        nbCoups++;
    }//GEN-LAST:event_DiagMontActionPerformed

    private void DiagDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagDescActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendante();
        changeLayoutGrid(grille.nbColonnes);
        gagne();
        nbCoups++;
    }//GEN-LAST:event_DiagDescActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Columns;
    private javax.swing.JButton DiagDesc;
    private javax.swing.JButton DiagMont;
    private javax.swing.JPanel Lines;
    private javax.swing.JPanel PanneauGrille;
    // End of variables declaration//GEN-END:variables
}
