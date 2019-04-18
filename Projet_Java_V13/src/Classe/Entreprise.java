package Classe;


/**
 * Classe abstraite Entreprise qui rassemble les informations communes aux classes Client et Prospect
 * @author Raphaël Frantzen
 * @version 12
 * Récupération des raisons sociales des prospects
 */
public abstract class Entreprise extends Controle {

    /**
     * ---------------------------------DECLARATION DES VARIABLES--------------------------
     */
    private int IdEntrep;
    private String RaisonSociale;
    private String TypeEntrep;
    private String DomaineEntrep;
    private String AdrEntrep;
    private String TelEntrep;
    private long NbrEmpEntrep;
    private String CommentaireEntrep;
    private int CaEntrep;

    /**
     * -------------------------------------ACCESSEURS-----------------------------------------------
     */
    public int getIdEntrep() {
        return IdEntrep;
    }

    //La valeur de l'Identifiant entrée doit supérieure à zéro
    public void setIdEntrep(int IdEntrep) throws Exception {
        if(IdEntrep <= 0){
            throw(new Exception("L'identifiant de l'enteprise doit être positif."));
        }
        else{
            this.IdEntrep = IdEntrep;
        }
    }

    public String getRaisonSociale() {
        return RaisonSociale;
    }

    //Le champ Raison Sociale ne peut pas être vide
    public void setRaisonSociale(String RaisonSociale) throws Exception {
        if(RaisonSociale.length() == 0){
            throw(new Exception("Le champ Raison Sociale ne peut pas être vide"));
        }
        else{
            this.RaisonSociale = RaisonSociale;           
        }
    }

    public String getTypeEntrep() {
        return TypeEntrep;
    }

    //Le champ Type d'Entreprise ne peut pas être vide
    public void setTypeEntrep(String TypeEntrep) throws Exception {
        if(TypeEntrep.length() == 0){
            throw(new Exception("Le champ Type d'entreprise ne peut pas être vide"));
        }
        else{
            this.TypeEntrep = TypeEntrep;
        }
    }

    public String getDomaineEntrep() {
        return DomaineEntrep;
    }

    //Le champ Domaine ne peut pas être vide
    public void setDomaineEntrep(String DomaineEntrep) throws Exception {
        if(DomaineEntrep.length() == 0){
            throw(new Exception("Le champ Domaine d'entreprise ne peut pas ^tre vide"));
        }
        else{
            this.DomaineEntrep = DomaineEntrep;
        }
    }

    public String getAdrEntrep() {
        return AdrEntrep;
    }

    //Le champ Adresse ne peut pas être vide
    public void setAdrEntrep(String AdrEntrep) throws Exception{
        if(AdrEntrep.length() == 0){
            throw(new Exception("Le champ Adresse ne peut pas être vide"));
        }
        else{
            this.AdrEntrep = AdrEntrep;
        }
    }

    public String getTelEntrep() {
        return TelEntrep;
    }

    //Le champ Téléphone ne peut pas être vide
    public void setTelEntrep(String TelEntrep) throws Exception{
        if(TelEntrep.length() == 0){
            throw(new Exception("Le numéro de téléphone doit être positif et aux normes"));
        }
        else{
            this.TelEntrep = TelEntrep;
        }
    }

    public long getNbrEmpEntrep() {
        return NbrEmpEntrep;
    }

    //Le nombre d'employé ne peut être qu'un entier positif
    public void setNbrEmpEntrep(long NbrEmpEntrep) throws Exception {
        if(NbrEmpEntrep <= 0){
            throw(new Exception("Le nombre d'employé doit être un entier positif"));
        }
        else{
            this.NbrEmpEntrep = NbrEmpEntrep;
        }
    }

    public String getCommentaireEntrep() {
        return CommentaireEntrep;
    }

    //Le champ Commentaire ne peut pas être vide
    public void setCommentaireEntrep(String CommentaireEntrep) throws Exception {
        if(CommentaireEntrep.length() == 0){
            throw(new Exception("Le champ Commentaire ne doit pas être vide"));
        }
        else{
            this.CommentaireEntrep = CommentaireEntrep;        
        }
    }

    public int getCaEntrep() {
        return CaEntrep;
    }
    
    //Le chiffre d'affaire ne peut pas être null ou 1000000 de fois supérieur au nombre d'employé
    public void setCaEntrep(int CaEntrep) throws Exception {
        if((CaEntrep != 0) && ((CaEntrep/NbrEmpEntrep) > 1000000) || CaEntrep < 0){
            throw(new Exception("Le champ Chiffre d'Affaire doit être positif et ne doit pas dépasser un million de fois le nombre d'employé"));
        }
        else{
            this.CaEntrep = CaEntrep;        
        }
    }

    /**
     * ---------------------------------------------CONSTRUCTEURS--------------------------------------
     */
    /**
     * Constructeur par défaut de la classe entreprise
     */
    public Entreprise() {}
    
    /**
     * Constructeur à 8 paramètres pour la création de la classe entreprise
     */
    public Entreprise(String RaisonSociale, String TypeEntrep, String DomaineEntrep, String AdrEntrep, String TelEntrep, long NbrEmpEntrep, String CommentaireEntrep, int CaEntrep)throws Exception{
        setRaisonSociale(RaisonSociale);
        setTypeEntrep(TypeEntrep);
        setDomaineEntrep(DomaineEntrep);
        setAdrEntrep(AdrEntrep);
        setTelEntrep(TelEntrep);
        setNbrEmpEntrep(NbrEmpEntrep);
        setCommentaireEntrep(CommentaireEntrep);
        setCaEntrep(CaEntrep);
    }
    
    /**
     * Constructeur à 9 paramètres pour la modification de la classe entreprise
     */
    public Entreprise(int IdEntrep, String RaisonSociale, String TypeEntrep, String DomaineEntrep, String AdrEntrep, String TelEntrep, long NbrEmpEntrep, String CommentaireEntrep, int CaEntrep) throws Exception {
        setIdEntrep(IdEntrep);
        setRaisonSociale(RaisonSociale);
        setTypeEntrep(TypeEntrep);
        setDomaineEntrep(DomaineEntrep);
        setAdrEntrep(AdrEntrep);
        setTelEntrep(TelEntrep);
        setNbrEmpEntrep(NbrEmpEntrep);
        setCommentaireEntrep(CommentaireEntrep);
        setCaEntrep(CaEntrep);
    }

    /**
     * ---------------------------------------------METHODES----------------------------------------------
     */
    /**
     * Méthode abstraite utilisé dans les classes filles pour envoyer des modifications à réaliser dnas la base de données
     */
    public abstract void modification() throws Exception;
    
    /**
     * Méthode abstraite utilisé dans les classes filles pour créer des propsects et des clients
     */
    public abstract void creation() throws Exception;
    
    
}
