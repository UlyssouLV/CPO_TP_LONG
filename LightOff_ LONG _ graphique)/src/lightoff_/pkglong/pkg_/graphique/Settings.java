/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_.pkglong.pkg_.graphique;

import java.awt.Color;

/**
 *
 * @author Ody
 */
public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    public Settings() {
        initComponents();
        CustomSize.hide();
        jLabel6.hide();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Radios = new javax.swing.ButtonGroup();
        Difficile = new javax.swing.JRadioButton();
        Facile = new javax.swing.JRadioButton();
        Custom = new javax.swing.JRadioButton();
        Normal = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        DifficultyLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CustomSize = new javax.swing.JTextField();
        Play = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Settings");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Bauhaus 93", 0, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(600, 250));
        setPreferredSize(new java.awt.Dimension(600, 250));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Radios.add(Difficile);
        Difficile.setText("Difficile");
        Difficile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DifficileActionPerformed(evt);
            }
        });
        getContentPane().add(Difficile, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        Radios.add(Facile);
        Facile.setText("Facile");
        Facile.setName("easy"); // NOI18N
        Facile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacileActionPerformed(evt);
            }
        });
        getContentPane().add(Facile, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        Radios.add(Custom);
        Custom.setText("Personnalisée");
        Custom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomActionPerformed(evt);
            }
        });
        getContentPane().add(Custom, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        Radios.add(Normal);
        Normal.setText("Normale");
        Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormalActionPerformed(evt);
            }
        });
        getContentPane().add(Normal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel1.setText("LightOff");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        DifficultyLabel.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        DifficultyLabel.setText("Choix de la difficulté :");
        getContentPane().add(DifficultyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, 30));

        jLabel2.setText(": Taille de grille 4 x 4");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel4.setText(": Taille de grille 2 x 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel5.setText(": Taille de grille 3 x 3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel6.setText("Taille souhaitée :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        CustomSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomSizeActionPerformed(evt);
            }
        });
        getContentPane().add(CustomSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 40, 30));

        Play.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        Play.setText("Jouer");
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        getContentPane().add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomActionPerformed
        // TODO add your handling code here:
        if(Custom.isSelected() == true){
            CustomSize.show();
            jLabel6.show();
        } 
    }//GEN-LAST:event_CustomActionPerformed

    private void FacileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacileActionPerformed
        // TODO add your handling code here:
        CustomSize.hide();
        jLabel6.hide();
    }//GEN-LAST:event_FacileActionPerformed

    private void NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalActionPerformed
        // TODO add your handling code here:
        CustomSize.hide();
        jLabel6.hide();
    }//GEN-LAST:event_NormalActionPerformed

    private void DifficileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DifficileActionPerformed
        // TODO add your handling code here:
        CustomSize.hide();
        jLabel6.hide();
    }//GEN-LAST:event_DifficileActionPerformed

    private void CustomSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomSizeActionPerformed

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        // TODO add your handling code here:
        if(Facile.isSelected() == true){
            dispose();   
            FenetrePrincipale jeu = new FenetrePrincipale(2);
        } else if(Normal.isSelected() ==true){
            dispose();    
            FenetrePrincipale jeu = new FenetrePrincipale(3);
        } else if(Difficile.isSelected() ==true) {
            dispose();       
            FenetrePrincipale jeu = new FenetrePrincipale(4);
        } else if(Custom.isSelected() ==true && verifInput()==true) {
            dispose();
            FenetrePrincipale jeu = new FenetrePrincipale(Integer.parseInt(CustomSize.getText()));
        }

    }//GEN-LAST:event_PlayActionPerformed
    
    public boolean verifInput(){
        try {
            int size = Integer.parseInt(CustomSize.getText());
            return size>0;
        } catch (NumberFormatException e){
            return false;
        }
    }
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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Custom;
    private javax.swing.JTextField CustomSize;
    private javax.swing.JRadioButton Difficile;
    private javax.swing.JLabel DifficultyLabel;
    private javax.swing.JRadioButton Facile;
    private javax.swing.JRadioButton Normal;
    private javax.swing.JButton Play;
    private javax.swing.ButtonGroup Radios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
