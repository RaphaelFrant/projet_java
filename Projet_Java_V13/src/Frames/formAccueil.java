
package Frames;

import Classe.BddClient;
import static Classe.BddClient.choixCmbBox;
import Classe.BddProspect;
import java.util.ArrayList;
import static javax.swing.JOptionPane.*;


/**
 * Formulaire d'Accueil
 * 
 * Formulaire d'accueil de l'application permettant à l'utilisateur de créer, modifier ou afficher un client ou un prospect
 * @author Raphaël Frantzen 
 * @version 12
 * Récupération des raisons sociales des prospects
 */
public class formAccueil extends javax.swing.JFrame {

    boolean ActionCreer;
    /**
     * Création d'un nouveau formulaire d'accueil
     */
    public formAccueil() {
        initComponents();
        PanelChoixClient.setVisible(false);
        PanelChoixProsp.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabAccueil = new javax.swing.JLabel();
        PanneauChoix = new javax.swing.JTabbedPane();
        PanneauClient = new javax.swing.JPanel();
        PanelClient = new javax.swing.JPanel();
        BtnCreaClient = new javax.swing.JButton();
        BtnModifClient = new javax.swing.JButton();
        BtnAffClient = new javax.swing.JButton();
        PanelChoixClient = new javax.swing.JPanel();
        LabChoixClient = new javax.swing.JLabel();
        CmbBoxChoixClient = new javax.swing.JComboBox<>();
        BtnValidChoixClient = new javax.swing.JButton();
        BtnRetourClient = new javax.swing.JButton();
        PanneauProsp = new javax.swing.JPanel();
        PanelProsp = new javax.swing.JPanel();
        BtnCreaProsp = new javax.swing.JButton();
        BtnModifProsp = new javax.swing.JButton();
        BtnAffProsp = new javax.swing.JButton();
        PanelChoixProsp = new javax.swing.JPanel();
        LabChoixProsp = new javax.swing.JLabel();
        CmbBoxChoixProsp = new javax.swing.JComboBox<>();
        BtnValidChoixProsp = new javax.swing.JButton();
        BtnRetourProsp = new javax.swing.JButton();
        BtnQuitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabAccueil.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        LabAccueil.setText("Application de Gestion");
        LabAccueil.setName("LabAppliAccueil"); // NOI18N

        PanneauChoix.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        BtnCreaClient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnCreaClient.setText("Créer");
        BtnCreaClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreaClientActionPerformed(evt);
            }
        });

        BtnModifClient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnModifClient.setText("Modifier");
        BtnModifClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifClientActionPerformed(evt);
            }
        });

        BtnAffClient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnAffClient.setText("Afficher");
        BtnAffClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAffClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelClientLayout = new javax.swing.GroupLayout(PanelClient);
        PanelClient.setLayout(PanelClientLayout);
        PanelClientLayout.setHorizontalGroup(
            PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(BtnCreaClient, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(BtnModifClient, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(BtnAffClient, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        PanelClientLayout.setVerticalGroup(
            PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(BtnModifClient, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCreaClient, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAffClient, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        LabChoixClient.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabChoixClient.setText("Choisissez le client à modifier :");

        CmbBoxChoixClient.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        BtnValidChoixClient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnValidChoixClient.setText("Valider");
        BtnValidChoixClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValidChoixClientActionPerformed(evt);
            }
        });

        BtnRetourClient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnRetourClient.setText("Retour");
        BtnRetourClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetourClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelChoixClientLayout = new javax.swing.GroupLayout(PanelChoixClient);
        PanelChoixClient.setLayout(PanelChoixClientLayout);
        PanelChoixClientLayout.setHorizontalGroup(
            PanelChoixClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoixClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelChoixClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabChoixClient)
                    .addGroup(PanelChoixClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelChoixClientLayout.createSequentialGroup()
                            .addComponent(BtnValidChoixClient)
                            .addGap(39, 39, 39)
                            .addComponent(BtnRetourClient))
                        .addComponent(CmbBoxChoixClient, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PanelChoixClientLayout.setVerticalGroup(
            PanelChoixClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoixClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabChoixClient)
                .addGap(18, 18, 18)
                .addComponent(CmbBoxChoixClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(PanelChoixClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnValidChoixClient)
                    .addComponent(BtnRetourClient))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanneauClientLayout = new javax.swing.GroupLayout(PanneauClient);
        PanneauClient.setLayout(PanneauClientLayout);
        PanneauClientLayout.setHorizontalGroup(
            PanneauClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanneauClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanneauClientLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(PanelChoixClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PanneauClientLayout.setVerticalGroup(
            PanneauClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauClientLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(PanelClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(PanelChoixClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        PanneauChoix.addTab("Client", PanneauClient);

        BtnCreaProsp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnCreaProsp.setText("Créer");
        BtnCreaProsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreaProspActionPerformed(evt);
            }
        });

        BtnModifProsp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnModifProsp.setText("Modifier");
        BtnModifProsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifProspActionPerformed(evt);
            }
        });

        BtnAffProsp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnAffProsp.setText("Afficher");

        javax.swing.GroupLayout PanelProspLayout = new javax.swing.GroupLayout(PanelProsp);
        PanelProsp.setLayout(PanelProspLayout);
        PanelProspLayout.setHorizontalGroup(
            PanelProspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProspLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(BtnCreaProsp, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(BtnModifProsp, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(BtnAffProsp, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        PanelProspLayout.setVerticalGroup(
            PanelProspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProspLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(PanelProspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(BtnModifProsp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCreaProsp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAffProsp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        LabChoixProsp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabChoixProsp.setText("Choisissez le prospect à modifier :");

        CmbBoxChoixProsp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        BtnValidChoixProsp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnValidChoixProsp.setText("Valider");
        BtnValidChoixProsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValidChoixProspActionPerformed(evt);
            }
        });

        BtnRetourProsp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnRetourProsp.setText("Retour");
        BtnRetourProsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetourProspActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelChoixProspLayout = new javax.swing.GroupLayout(PanelChoixProsp);
        PanelChoixProsp.setLayout(PanelChoixProspLayout);
        PanelChoixProspLayout.setHorizontalGroup(
            PanelChoixProspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoixProspLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelChoixProspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabChoixProsp)
                    .addGroup(PanelChoixProspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelChoixProspLayout.createSequentialGroup()
                            .addComponent(BtnValidChoixProsp)
                            .addGap(39, 39, 39)
                            .addComponent(BtnRetourProsp))
                        .addComponent(CmbBoxChoixProsp, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PanelChoixProspLayout.setVerticalGroup(
            PanelChoixProspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoixProspLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabChoixProsp)
                .addGap(18, 18, 18)
                .addComponent(CmbBoxChoixProsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(PanelChoixProspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnValidChoixProsp)
                    .addComponent(BtnRetourProsp))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanneauProspLayout = new javax.swing.GroupLayout(PanneauProsp);
        PanneauProsp.setLayout(PanneauProspLayout);
        PanneauProspLayout.setHorizontalGroup(
            PanneauProspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauProspLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanneauProspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelProsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanneauProspLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(PanelChoixProsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PanneauProspLayout.setVerticalGroup(
            PanneauProspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauProspLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(PanelProsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(PanelChoixProsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        PanneauChoix.addTab("Prospect", PanneauProsp);

        BtnQuitter.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BtnQuitter.setText("Quitter");
        BtnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(LabAccueil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(PanneauChoix, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LabAccueil)
                .addGap(31, 31, 31)
                .addComponent(PanneauChoix, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnQuitter, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Bouton permettant de créer un client
    private void BtnCreaClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreaClientActionPerformed
        ActionCreer = true;
        this.hide();
        new formClient(ActionCreer).setVisible(true);
        
    }//GEN-LAST:event_BtnCreaClientActionPerformed

    //Bouton permettant la création d'un prospect
    private void BtnCreaProspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreaProspActionPerformed
        ActionCreer = true;
        this.hide();
        formProspect CreaProsp;
        try {
            CreaProsp = new formProspect(ActionCreer);
            CreaProsp.setVisible(true);
        } catch (Exception ex) {
            showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_BtnCreaProspActionPerformed

    //Bouton permettant la modification d'un client
    private void BtnModifClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifClientActionPerformed
        PanelClient.setVisible(false);
        PanelChoixClient.setVisible(true);
        
        try {
            ArrayList ClientRecup = new ArrayList(choixCmbBox());
            for(Object s : ClientRecup){
                CmbBoxChoixClient.addItem(s.toString());
            }
        } catch (Exception ex) {
            showMessageDialog(null, "La comboBox n'a pas pu être chargée");
        }
    }//GEN-LAST:event_BtnModifClientActionPerformed

    //Bouton permettant de quitter l'application
    private void BtnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuitterActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnQuitterActionPerformed

    //Bouton permettant la modification d'un prospect
    private void BtnModifProspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifProspActionPerformed
        PanelProsp.setVisible(false);
        PanelChoixProsp.setVisible(true);
        
        try {
            ArrayList ProspRecup = new ArrayList(BddProspect.choixCmbBox());
            for(Object s : ProspRecup){
                CmbBoxChoixProsp.addItem(s.toString());
            }
        } catch (Exception ex) {
            showMessageDialog(null, "La comboBox n'a pas pu être chargée");
        }
    }//GEN-LAST:event_BtnModifProspActionPerformed

    //Bouton permettant de retourner au choix de base pour le client
    private void BtnRetourClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetourClientActionPerformed
        PanelClient.setVisible(true);
        PanelChoixClient.setVisible(false);
    }//GEN-LAST:event_BtnRetourClientActionPerformed

    //Bouton permettant de retourner au choix de base pour le prospect
    private void BtnRetourProspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetourProspActionPerformed
        PanelProsp.setVisible(true);
        PanelChoixProsp.setVisible(false);
    }//GEN-LAST:event_BtnRetourProspActionPerformed

    //Bouton permettant de valider le choix du client à modifier
    private void BtnValidChoixClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValidChoixClientActionPerformed
        ActionCreer = false;
        String NomClient = CmbBoxChoixClient.getSelectedItem().toString();
        //Regex utilisé pour empécher les injections SQL lors de la récupération du client à modifier
        NomClient = NomClient.replaceAll("'", "\\\\'");
        try {
            BddClient ConnexModif = new BddClient();
            formClient FormClientModif = new formClient(ConnexModif.formModifClient(NomClient));
            this.hide();
            FormClientModif.setVisible(true);
        } catch (Exception ex) {
            showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_BtnValidChoixClientActionPerformed

    //Bouton permettant de valider le choix du prospect à modifier
    private void BtnValidChoixProspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValidChoixProspActionPerformed
        ActionCreer = false;
        String NomProsp = CmbBoxChoixProsp.getSelectedItem().toString();
        NomProsp = NomProsp.replaceAll("'", "\\\\'");
        try{
            BddProspect ConnexProspModif = new BddProspect();
            formProspect FormProspModif = new formProspect(ConnexProspModif.formModifProsp(NomProsp));
            this.hide();
            FormProspModif.setVisible(true);
        }
        catch(Exception ex){
            showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_BtnValidChoixProspActionPerformed

    //Bouton permettant afficher les dix clients les plus important
    private void BtnAffClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAffClientActionPerformed
        this.hide();
        formAffichage NouvAff = new formAffichage();
        NouvAff.setVisible(true);
    }//GEN-LAST:event_BtnAffClientActionPerformed

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
            java.util.logging.Logger.getLogger(formAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formAccueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAffClient;
    private javax.swing.JButton BtnAffProsp;
    private javax.swing.JButton BtnCreaClient;
    private javax.swing.JButton BtnCreaProsp;
    private javax.swing.JButton BtnModifClient;
    private javax.swing.JButton BtnModifProsp;
    private javax.swing.JButton BtnQuitter;
    private javax.swing.JButton BtnRetourClient;
    private javax.swing.JButton BtnRetourProsp;
    private javax.swing.JButton BtnValidChoixClient;
    private javax.swing.JButton BtnValidChoixProsp;
    private javax.swing.JComboBox<String> CmbBoxChoixClient;
    private javax.swing.JComboBox<String> CmbBoxChoixProsp;
    private javax.swing.JLabel LabAccueil;
    private javax.swing.JLabel LabChoixClient;
    private javax.swing.JLabel LabChoixProsp;
    private javax.swing.JPanel PanelChoixClient;
    private javax.swing.JPanel PanelChoixProsp;
    private javax.swing.JPanel PanelClient;
    private javax.swing.JPanel PanelProsp;
    private javax.swing.JTabbedPane PanneauChoix;
    private javax.swing.JPanel PanneauClient;
    private javax.swing.JPanel PanneauProsp;
    // End of variables declaration//GEN-END:variables
}