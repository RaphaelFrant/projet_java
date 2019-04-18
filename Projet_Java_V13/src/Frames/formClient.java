
package Frames;

import static Classe.BddClient.RecupDernIdEntr;
import Classe.Client;
import static Classe.Controle.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.*;


/**
 * Formulaire du client permettant de remplir le schamps pour la création ou la modification d'un client
 * 
 * @author Raphaël Frantzen 
 * @version 12
 * Récupération des raisons sociales des prospects
 */
public class formClient extends javax.swing.JFrame {

    Client nouvClient = new Client();
    boolean VarCreation;
    
    /**
     * Modification d'un client
     */
    public formClient(){
        initComponents();
        GroupBoxNumClient.setVisible(true);
    }
    
    /**
     * Création d'un nouveau client
     * @param ActionCreer booléen permettant de savoir si on a une création ou une modification de client
     */
    public formClient(boolean ActionCreer) {
        initComponents();
        VarCreation = ActionCreer;
        GroupBoxNumClient.setVisible(false);
    }
    
    //On charge les champs du formulaire avec les informations du client à modifier
    public formClient(Client LeClient) {
        initComponents();
        GroupBoxNumClient.setVisible(true);
        //On charge les champs du formulaire avec les informations du client à modifier
        TxtNumClient.setText(Integer.toString(LeClient.getIdEntrep()));
        TxtRaisSocClient.setText(LeClient.getRaisonSociale());
        CmbBoxTypeClient.setSelectedItem(LeClient.getTypeEntrep());
        TxtDomaineClient.setText(LeClient.getDomaineEntrep());
        TxtAdrClient.setText(LeClient.getAdrEntrep());
        TxtTelClient.setText(LeClient.getTelEntrep());
        TxtNbEmpClient.setText(Long.toString(LeClient.getNbrEmpEntrep()));
        TxtChiffAffClient.setText(Integer.toString(LeClient.getCaEntrep()));
        TxtCommentClient.setText(LeClient.getCommentaireEntrep());
        TxtDateDebContr.setText(LeClient.getDateDebContr().toString());
        TxtMontant.setText(Integer.toString(LeClient.getMontantCLient()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabGestClient = new javax.swing.JLabel();
        GroupBoxNumClient = new javax.swing.JPanel();
        LabNumClient = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtNumClient = new javax.swing.JTextPane();
        LabRaisonSociale = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtRaisSocClient = new javax.swing.JTextPane();
        LabTypeClient = new javax.swing.JLabel();
        LabDomaineClient = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtDomaineClient = new javax.swing.JTextPane();
        LabAdrClient = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtAdrClient = new javax.swing.JTextPane();
        LabTelClient = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TxtTelClient = new javax.swing.JTextPane();
        CmbBoxTypeClient = new javax.swing.JComboBox<>();
        LabNbrEmpClient = new javax.swing.JLabel();
        TxtNbrEmpClient = new javax.swing.JScrollPane();
        TxtNbEmpClient = new javax.swing.JTextPane();
        LabChiffAffClient = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtChiffAffClient = new javax.swing.JTextPane();
        LabCommentaireClient = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TxtCommentClient = new javax.swing.JTextArea();
        BtnRetourCli = new javax.swing.JButton();
        BtnConfirmClient = new javax.swing.JButton();
        LabMontantClient = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TxtDateDebContr = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        TxtMontant = new javax.swing.JTextPane();
        LabDateContr = new javax.swing.JLabel();
        LabDateContr2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabGestClient.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        LabGestClient.setText("Gestion des Clients");

        LabNumClient.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabNumClient.setText("Numéro Client :");

        TxtNumClient.setEditable(false);
        TxtNumClient.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(TxtNumClient);

        javax.swing.GroupLayout GroupBoxNumClientLayout = new javax.swing.GroupLayout(GroupBoxNumClient);
        GroupBoxNumClient.setLayout(GroupBoxNumClientLayout);
        GroupBoxNumClientLayout.setHorizontalGroup(
            GroupBoxNumClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GroupBoxNumClientLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LabNumClient)
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        GroupBoxNumClientLayout.setVerticalGroup(
            GroupBoxNumClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GroupBoxNumClientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GroupBoxNumClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabNumClient, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        LabRaisonSociale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabRaisonSociale.setText("Raison Sociale :");

        TxtRaisSocClient.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(TxtRaisSocClient);

        LabTypeClient.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabTypeClient.setText("Type de Client :");

        LabDomaineClient.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabDomaineClient.setText("Domaine Client :");

        jScrollPane4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(TxtDomaineClient);

        LabAdrClient.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabAdrClient.setText("Adresse Client :");

        jScrollPane5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane5.setViewportView(TxtAdrClient);

        LabTelClient.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabTelClient.setText("Téléphone Client :");

        TxtTelClient.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane6.setViewportView(TxtTelClient);

        CmbBoxTypeClient.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CmbBoxTypeClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Public", "Privé" }));

        LabNbrEmpClient.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabNbrEmpClient.setText("Nombre d'Employé :");

        TxtNbEmpClient.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TxtNbrEmpClient.setViewportView(TxtNbEmpClient);

        LabChiffAffClient.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabChiffAffClient.setText("Chiffre d'Affaire :");

        TxtChiffAffClient.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(TxtChiffAffClient);

        LabCommentaireClient.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabCommentaireClient.setText("Commentaires :");

        TxtCommentClient.setColumns(20);
        TxtCommentClient.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TxtCommentClient.setRows(5);
        jScrollPane8.setViewportView(TxtCommentClient);

        BtnRetourCli.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnRetourCli.setText("Retour");
        BtnRetourCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetourCliActionPerformed(evt);
            }
        });

        BtnConfirmClient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnConfirmClient.setText("Confirmer");
        BtnConfirmClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmClientActionPerformed(evt);
            }
        });

        LabMontantClient.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabMontantClient.setText("Montant Payé :");

        jScrollPane7.setViewportView(TxtDateDebContr);

        jScrollPane9.setViewportView(TxtMontant);

        LabDateContr.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabDateContr.setText("Date de début de contrat :");

        LabDateContr2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabDateContr2.setText("(au format AAAA-MM-JJ)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GroupBoxNumClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(LabGestClient))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabNbrEmpClient)
                                    .addComponent(LabTelClient)
                                    .addComponent(LabChiffAffClient)
                                    .addComponent(LabCommentaireClient)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnRetourCli, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabMontantClient, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabRaisonSociale)
                                            .addComponent(LabTypeClient)
                                            .addComponent(LabDomaineClient)
                                            .addComponent(LabAdrClient))
                                        .addGap(67, 67, 67))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabDateContr2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(LabDateContr)))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNbrEmpClient, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnConfirmClient, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(172, 172, 172))
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                                    .addComponent(CmbBoxTypeClient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabGestClient)
                .addGap(28, 28, 28)
                .addComponent(GroupBoxNumClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabRaisonSociale)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabTypeClient)
                    .addComponent(CmbBoxTypeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabDomaineClient)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabAdrClient)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabTelClient)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabNbrEmpClient)
                    .addComponent(TxtNbrEmpClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabChiffAffClient))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(LabCommentaireClient))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabDateContr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabDateContr2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabMontantClient, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnConfirmClient, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnRetourCli, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Bouton confirmant la validation des données saisies dans les champs du formulaire
    private void BtnConfirmClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmClientActionPerformed

        try{
            if(VarCreation){
                //on instancie un objet client avec le constructeur à 10 paramètres
                GestGuillemet(TxtCommentClient);
                GestChampNum(TxtNbEmpClient);
                GestChampNum(TxtChiffAffClient);
                GestChampNum(TxtMontant);
                GestNumTel(TxtTelClient);
                GestDate(TxtDateDebContr);
                DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate dateLocaleCrea = LocalDate.parse(TxtDateDebContr.getText(), formatDate);
                Client unClientCrea = new Client(TxtRaisSocClient.getText(), CmbBoxTypeClient.getSelectedItem().toString(), TxtDomaineClient.getText(), 
                        TxtAdrClient.getText(), TxtTelClient.getText(), Long.parseLong(TxtNbEmpClient.getText()),
                        TxtCommentClient.getText(), Integer.parseInt(TxtChiffAffClient.getText()), dateLocaleCrea, Integer.parseInt(TxtMontant.getText()));
                unClientCrea.creation();
                showMessageDialog(null, "Le client " + RecupDernIdEntr() + " a été créé!");
            }
            else{
                //On instancie un objet particulier de la classe client pour une modification  avec 11 paramètres après vérification de la validité des champs
                GestGuillemet(TxtCommentClient);
                GestChampNum(TxtNumClient);
                GestChampNum(TxtNbEmpClient);
                GestChampNum(TxtChiffAffClient);
                GestChampNum(TxtMontant);
                GestNumTel(TxtTelClient);
                GestDate(TxtDateDebContr);
                DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate dateLocaleCrea = LocalDate.parse(TxtDateDebContr.getText(), formatDate);
                Client unClientModif = new Client(Integer.parseInt(TxtNumClient.getText()), TxtRaisSocClient.getText(), CmbBoxTypeClient.getSelectedItem().toString(), 
                        TxtDomaineClient.getText(), TxtAdrClient.getText(), TxtTelClient.getText(), Long.parseLong(TxtNbEmpClient.getText()),
                        TxtCommentClient.getText(), Integer.parseInt(TxtChiffAffClient.getText()), dateLocaleCrea, Integer.parseInt(TxtMontant.getText()));
                unClientModif.modification();
                showMessageDialog(null, "Le client " + TxtNumClient.getText() + " a été modifié");
            }
            this.dispose();
            new formAccueil().setVisible(true);
        }    
        catch(Exception ex){
            showMessageDialog(null, ex.getMessage(), "Erreur", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnConfirmClientActionPerformed

    //Bouton permettant de revenir à la page d'accueil
    private void BtnRetourCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetourCliActionPerformed
        this.dispose();
        formAccueil RetourAcc = new formAccueil();
        RetourAcc.setVisible(true);
    }//GEN-LAST:event_BtnRetourCliActionPerformed

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
            java.util.logging.Logger.getLogger(formClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirmClient;
    private javax.swing.JButton BtnRetourCli;
    private javax.swing.JComboBox<String> CmbBoxTypeClient;
    private javax.swing.JPanel GroupBoxNumClient;
    private javax.swing.JLabel LabAdrClient;
    private javax.swing.JLabel LabChiffAffClient;
    private javax.swing.JLabel LabCommentaireClient;
    private javax.swing.JLabel LabDateContr;
    private javax.swing.JLabel LabDateContr2;
    private javax.swing.JLabel LabDomaineClient;
    private javax.swing.JLabel LabGestClient;
    private javax.swing.JLabel LabMontantClient;
    private javax.swing.JLabel LabNbrEmpClient;
    private javax.swing.JLabel LabNumClient;
    private javax.swing.JLabel LabRaisonSociale;
    private javax.swing.JLabel LabTelClient;
    private javax.swing.JLabel LabTypeClient;
    private javax.swing.JTextPane TxtAdrClient;
    private javax.swing.JTextPane TxtChiffAffClient;
    private javax.swing.JTextArea TxtCommentClient;
    private javax.swing.JTextPane TxtDateDebContr;
    private javax.swing.JTextPane TxtDomaineClient;
    private javax.swing.JTextPane TxtMontant;
    private javax.swing.JTextPane TxtNbEmpClient;
    private javax.swing.JScrollPane TxtNbrEmpClient;
    private javax.swing.JTextPane TxtNumClient;
    private javax.swing.JTextPane TxtRaisSocClient;
    private javax.swing.JTextPane TxtTelClient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}