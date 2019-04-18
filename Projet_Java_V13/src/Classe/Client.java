package Classe;


import java.time.*;
import java.util.ArrayList;

/**
 * Classe Client
 * 
 * Classe Client héritée de la classe entreprise rassemblant les méthodes nécessaires à la gestion des clients
 * @author Raphaël Frantzen 
 * @version 12
 * Récupération des raisons sociales des prospects
 */
public class Client extends Entreprise {

    /**
     * -----------------------------------------VARIABLES---------------------------------------------
     */
    private LocalDate DateDebContr;
    private int MontantCLient;

    /**
     * -----------------------------------------------ACCESSEURS------------------------------------------
     */
    public LocalDate getDateDebContr() {
        return DateDebContr;
    }

    //On vérifie que la date entrée est inférieur à la date du jour
    public void setDateDebContr(LocalDate DateDebContr) throws Exception {
        LocalDate dateJour = LocalDate.now();
        if(DateDebContr.isAfter(dateJour)){
            throw(new Exception("La date de début de contrat ne peut pas être postérieure à la date du jour"));
        }
        else{
            this.DateDebContr = DateDebContr;        
        }
    }

    public int getMontantCLient() {
        return MontantCLient;
    }

    //Le montant payé par le client ne peut pas être négatif
    public void setMontantCLient(int MontantCLient) throws Exception {
        if(MontantCLient < 0){
            throw(new Exception("Le montant payé par le client ne peut pas être négatif."));
        }
        else{
            this.MontantCLient = MontantCLient;            
        }
    }

    /**
     * -----------------------------------------------------------CONSTRUCTEUR----------------------------------------------------
     */
    //Constructeurr par défaut
    public Client() {}

    //Constructeur avec 10 paramètres pour la création d'un client
    public Client(String RaisonSociale, String TypeEntrep, String DomaineEntrep, String AdrEntrep, String TelEntrep, long NbrEmpEntrep, String CommentaireEntrep, int CaEntrep, LocalDate DateDebContr, int MontantCLient) throws Exception {
        super(RaisonSociale, TypeEntrep, DomaineEntrep, AdrEntrep, TelEntrep, NbrEmpEntrep, CommentaireEntrep, CaEntrep);
        setDateDebContr(DateDebContr);
        setMontantCLient(MontantCLient);
    }

    //Constructeur avec 11 paramètres pour la modification d'un client
    public Client(int IdEntrep, String RaisonSociale, String TypeEntrep, String DomaineEntrep, String AdrEntrep, String TelEntrep, long NbrEmpEntrep, String CommentaireEntrep, int CaEntrep, LocalDate DateDebContr, int MontantCLient) throws Exception {
        super(IdEntrep, RaisonSociale, TypeEntrep, DomaineEntrep, AdrEntrep, TelEntrep, NbrEmpEntrep, CommentaireEntrep, CaEntrep);
        setDateDebContr(DateDebContr);
        setMontantCLient(MontantCLient);
    }
    
    /**
     * --------------------------------------------------------METHODES---------------------------------------------------------
     */

    /**
     * Méthode d'instance permettant de récupérer les données du formulaires visant à modifier un client
     * @throws Exception Renvoie une exception si les éléments n'ont pas pu être chargés dans l'arrayList
     */
    @Override
    public void modification() throws Exception {
        ArrayList modifClient = new ArrayList();
        BddClient ConnexBddClient = new BddClient();
        
        try{
            modifClient.add(this.getIdEntrep());
            modifClient.add(this.getRaisonSociale());
            modifClient.add(this.getTypeEntrep());
            modifClient.add(this.getDomaineEntrep());
            modifClient.add(this.getAdrEntrep());
            modifClient.add(this.getTelEntrep());
            modifClient.add(this.getNbrEmpEntrep());
            modifClient.add(this.getCommentaireEntrep());
            modifClient.add(this.getCaEntrep());
            modifClient.add(this.getDateDebContr());
            modifClient.add(this.getMontantCLient());
            ConnexBddClient.modifCli(modifClient);
        }
        catch(Exception ex){
            throw(new Exception(ex.getMessage()));
        }
    }

    /**
     * Méthode permettant de construire une chaine de caractère qui servira à réaliser une instruction SQl dans la classe BddClient
     * @throws Exception Renvoie une erreur si les setteurs n'ont pas fonctionné ou si la requête échoue
     */
    public void creation() throws Exception {
        ArrayList creaClientInfo = new ArrayList();
        BddClient lienBddClient = new BddClient();
        try{
            creaClientInfo.add(this.getRaisonSociale());
            creaClientInfo.add(this.getTypeEntrep());
            creaClientInfo.add(this.getDomaineEntrep());
            creaClientInfo.add(this.getAdrEntrep());
            creaClientInfo.add(this.getTelEntrep());
            creaClientInfo.add(this.getNbrEmpEntrep());
            creaClientInfo.add(this.getCommentaireEntrep());
            creaClientInfo.add(this.getCaEntrep());
            creaClientInfo.add(this.getDateDebContr());
            creaClientInfo.add(this.getMontantCLient());
            lienBddClient.creaClient(creaClientInfo);
        }
        catch(Exception ex){
            throw(new Exception(ex.getMessage()));
        }
    }
}
