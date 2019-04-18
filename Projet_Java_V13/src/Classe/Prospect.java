package Classe;


import java.time.*;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Classe Prospect
 * 
 * Classe Prospect héritée de la classe entreprise rassemblant les méthodes nécessaires à la gestion des prospects
 * @author Raphaël Frantzen 
 * @version 12
 * Récupération des raisons sociales des prospects
 */

public class Prospect extends Entreprise {

    /**
     * ---------------------------------------VARIABLES--------------------------------------------
     */
    private LocalDate DateProspection;
    private String Interesse;
    
    /**
     * -------------------------------------------ACCESSEUR-----------------------------------------
     */

    public LocalDate getDateProspection() {
        return DateProspection;
    }

    //On vérifie que la date de prospection est inférieure à la date du jour
    public void setDateProspection(LocalDate DateProspection) throws Exception {
        LocalDate dateJour = LocalDate.now();
        if(DateProspection.isAfter(dateJour)){
            throw(new Exception("La date de début de contrat ne peut pas être postérieure à la date du jour"));
        }    
        else{
            this.DateProspection = DateProspection;        
        }
    }

    public String getInteresse() {
        return Interesse;
    }

    //Le champ Intéressé ne peut pas être vide
    public void setInteresse(String Interesse) throws Exception {
        if(Interesse.length() == 0){
            throw(new Exception("Le champ Interesse ne doit pas être vide"));
        }
        else{
            this.Interesse = Interesse;        
        }
    }

    /**
     * ------------------------------------------------CONSTRUCTEUR-------------------------------------------------
     */
  
    public Prospect() {}

    public Prospect(String RaisonSociale, String TypeEntrep, String DomaineEntrep, String AdrEntrep, String TelEntrep, long NbrEmpEntrep, String CommentaireEntrep, int CaEntrep, LocalDate DateProspection, String Interesse) throws Exception {
        super(RaisonSociale, TypeEntrep, DomaineEntrep, AdrEntrep, TelEntrep, NbrEmpEntrep, CommentaireEntrep, CaEntrep);
        setDateProspection(DateProspection);
        setInteresse(Interesse);
    }

    public Prospect(int IdEntrep, String RaisonSociale, String TypeEntrep, String DomaineEntrep, String AdrEntrep, String TelEntrep, long NbrEmpEntrep, String CommentaireEntrep, int CaEntrep, LocalDate DateProspection, String Interesse) throws Exception {
        super(IdEntrep, RaisonSociale, TypeEntrep, DomaineEntrep, AdrEntrep, TelEntrep, NbrEmpEntrep, CommentaireEntrep, CaEntrep);
        setDateProspection(DateProspection);
        setInteresse(Interesse);
    }
    
    

    /**
     * -------------------------------------------METHODES--------------------------------------------
     */
    /**
     * Méthode d'instance permettant de charger les informations modifiés du prospect vers la base de données
     * @throws Exception Renvoie une exception si la liste n'a pas pu être créée
     */
    public void modification() throws Exception {
        ArrayList modifProsp = new ArrayList();
        BddProspect ConnexBddProsp = new BddProspect();
        
        try{
            modifProsp.add(this.getIdEntrep());
            modifProsp.add(this.getRaisonSociale());
            modifProsp.add(this.getTypeEntrep());
            modifProsp.add(this.getDomaineEntrep());
            modifProsp.add(this.getAdrEntrep());
            modifProsp.add(this.getTelEntrep());
            modifProsp.add(this.getNbrEmpEntrep());
            modifProsp.add(this.getCommentaireEntrep());
            modifProsp.add(this.getCaEntrep());
            modifProsp.add(this.getDateProspection());
            modifProsp.add(this.getInteresse());
            ConnexBddProsp.modifProsp(modifProsp);
        }
        catch(Exception ex){
            throw(new Exception(ex.getMessage()));
        }
    }

    public void creation() throws Exception {
         ArrayList creaProsp = new ArrayList();
         BddProspect lienBddProsp = new BddProspect();
         try{
             creaProsp.add(this.getIdEntrep());
             creaProsp.add(this.getRaisonSociale());
             creaProsp.add(this.getTypeEntrep());
             creaProsp.add(this.getDomaineEntrep());
             creaProsp.add(this.getAdrEntrep());
             creaProsp.add(this.getTelEntrep());
             creaProsp.add(this.getNbrEmpEntrep());
             creaProsp.add(this.getCommentaireEntrep());
             creaProsp.add(this.getCaEntrep());
             creaProsp.add(this.getDateProspection());
             creaProsp.add(this.getInteresse());
             lienBddProsp.creaClient(creaProsp);
         }
         catch(Exception ex){
            throw(new Exception(ex.getMessage()));
         }
    }
}
