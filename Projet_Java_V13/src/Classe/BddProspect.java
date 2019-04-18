package Classe;


import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Classe héritée de la classe Connection à la base de données pour le prospect
 * @author Raphaël Frantzen 
 * @version 12
 * Récupération des raisons sociales des prospects
 */
public class BddProspect extends BddClient {
    
    //Variable
    private static int DernIdEntr = 0;

    public static ArrayList recupProspect() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Méthode pour envoyer la requête SQL à la base de données locale
     * @param listParamCrea Reçoit une arraylist regroupant toutes les informations du prospect entrées dans les champs du formulaire
     * @throws Exception Renvoit  une exception si la requête SQL est erronée ou si les éléments de l'ArrayList récupérée ne sont pas conforme à la tablea client
     */
    @Override
    public void creaClient(ArrayList listParamCrea) throws Exception {
        String RequetCreaProsp;
        try{
            RequetCreaProsp = "Insert into prospect (IdProspect, RaisonSocialeProsp, TypeEntrep, DomaineEntrep, AdrEntrep, "
                    + "TelEntrep, NbrEmpEntrep, CommentaireEntrep, CaEntrep, DateProspection, Interesse) values (";
            RequetCreaProsp += "'" + listParamCrea.get(0) + "', ";
            RequetCreaProsp += "'" + GestStringInject(listParamCrea.get(1).toString())  + "', ";
            RequetCreaProsp += "'" + GestStringInject(listParamCrea.get(2).toString())  + "', ";
            RequetCreaProsp += "'" + GestStringInject(listParamCrea.get(3).toString())  + "', ";
            RequetCreaProsp += "'" + GestStringInject(listParamCrea.get(4).toString())  + "', ";
            RequetCreaProsp += "'" + listParamCrea.get(5) + "', ";
            RequetCreaProsp += "'" + listParamCrea.get(6)  + "', ";
            RequetCreaProsp += "'" + GestStringInject(listParamCrea.get(7).toString())  + "', ";
            RequetCreaProsp += "'" + listParamCrea.get(8)  + "', ";
            RequetCreaProsp += "'" + listParamCrea.get(9)  + "', ";
            RequetCreaProsp += "'" + GestStringInject(listParamCrea.get(10).toString())  + "')";
            
            connection();
            Statement DeclarInsert = connexBase.createStatement();
            DeclarInsert.executeUpdate(RequetCreaProsp);
            DeclarInsert.close();
        }
        catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * Méthode permettant de charger la comboBox de la page d'accueil pour choisir le prospect à modifier
     * @return Retourne une ArrayList de toutes les raisons sociales dans la base de données
     * @throws Exception Retourne une exceptio si la requête est erronée ou si l'Arraylist ne peut pas être chargée
     */
    public static ArrayList choixCmbBox() throws Exception{
        try{
            connection();
            Statement DeclarModifProsp = connexBase.createStatement();
            String ReqRecupProsp = "Select RaisonSocialeProsp from prospect";
            ResultSet ListProsp = DeclarModifProsp.executeQuery(ReqRecupProsp);
            ArrayList ListChoixProsp = new ArrayList();
            while(ListProsp.next()){
                ListChoixProsp.add(ListProsp.getString(1));
            }
            ListProsp.close();
            return ListChoixProsp;
        }
        catch(Exception ex){
            throw new Exception("La requête SQL n'a pas pu aboutir.");
        }
    }

    /**
     * Méthode permettant de réaliser la modification des informations d'un prospect dans la base de données
     * @param listParamModif Reçoit une arraylist regroupant toutes les informations du prospect entrées dans les champs du formulaire
     * @throws Exception Renvoie une exception si la requête est erronée ou si la modification n'a pas eu lieu 
     */
    public void modifProsp(ArrayList listParamModif) throws Exception{
        String ModifProspBdd;
        try{
            ModifProspBdd  = "Update prospect set ";
            ModifProspBdd += "RaisonSocialeProsp = '" +     GestStringInject(listParamModif.get(1).toString())  + "', ";
            ModifProspBdd += "TypeEntrep = '" +             listParamModif.get(2)                               + "', ";
            ModifProspBdd += "DomaineEntrep = '" +          GestStringInject(listParamModif.get(3).toString())  + "', ";
            ModifProspBdd += "AdrEntrep = '" +              GestStringInject(listParamModif.get(4).toString())  + "', ";
            ModifProspBdd += "TelEntrep = '" +              listParamModif.get(5)                               + "', ";
            ModifProspBdd += "NbrEmpEntrep = '" +           listParamModif.get(6)                               + "', ";
            ModifProspBdd += "CommentaireEntrep = '" +      GestStringInject(listParamModif.get(7).toString())  + "', ";
            ModifProspBdd += "CaEntrep = '" +               listParamModif.get(8)                               + "', ";
            ModifProspBdd += "DateProspection = '" +        listParamModif.get(9)                               + "', ";
            ModifProspBdd += "Interesse = '" +              listParamModif.get(10)                              + "'";
            ModifProspBdd += " where IdProspect = '" +      listParamModif.get(0)                               + "'";
            
            connection();
            Statement DeclarProspModif = connexBase.createStatement();
            DeclarProspModif.executeUpdate(ModifProspBdd);
            DeclarProspModif.close();
        }
        catch(Exception ex){
            throw(new Exception(ex.getMessage()));
        }
    }

    /**
     * Méthode de classe permettant de récupérer les éléments de la base de données concernant un prospect pour remplir le formumlaire de modification
     * @param NomProsp reçoit en entrée la raison sociale du prospect à modifier
     * @return Retourne un objet Prospect qui permet de remplir les champs du formulaire de modification du prospect
     * @throws Exception Renvoie une exception si la requête est erronée ou si l'ArrayList n'a pas pu être chargée
     */
    public static Prospect formModifProsp(String NomProsp) throws Exception {
        try{
            Prospect LeProspect = new Prospect();
            connection();
            Statement DeclarInfoProsp = connexBase.createStatement();
            String RequetSelectProsp = "Select * from prospect where RaisonSocialeProsp = '" + NomProsp + "'";
            ResultSet InfoProsp = DeclarInfoProsp.executeQuery(RequetSelectProsp);
            while(InfoProsp.next()){
                LeProspect.setIdEntrep(InfoProsp.getInt("IdProspect"));
                LeProspect.setRaisonSociale(InfoProsp.getString("RaisonSocialeProsp"));
                LeProspect.setTypeEntrep(InfoProsp.getString("TypeEntrep"));
                LeProspect.setDomaineEntrep(InfoProsp.getString("DomaineEntrep"));
                LeProspect.setAdrEntrep(InfoProsp.getString("AdrEntrep"));
                LeProspect.setTelEntrep(InfoProsp.getString("TelEntrep"));
                LeProspect.setNbrEmpEntrep(InfoProsp.getInt("NbrEmpEntrep"));
                LeProspect.setCommentaireEntrep(InfoProsp.getString("CommentaireEntrep"));
                LeProspect.setCaEntrep(InfoProsp.getInt("CaEntrep"));
                LeProspect.setDateProspection(LocalDate.parse(InfoProsp.getString("DateProspection").substring(0, 10)));
                LeProspect.setInteresse(InfoProsp.getString("Interesse"));
            }
            InfoProsp.close();
            return LeProspect;
        }
        catch(Exception ex){
            throw new Exception("La récupération des informations du prospect n'a pas pu avoir lieu.");
        }
    }

    /**
     * Méthode permettant de récupérer le dernier numéro de prospect créé
     * @return Retourn une chaine de caractère avec le dernier numéro de prospect créé
     * @throws Exception Renvoie une exception en cas d'erreur dans la requête
     */
    public static int RecupDernIdProsp() throws Exception {
        try{
            connection();
            Statement DeclarDernId = connexBase.createStatement();
            String RequetSelectIdProsp = "Select max(IdProspect) from prospect";
            ResultSet IdProspCrea = DeclarDernId.executeQuery(RequetSelectIdProsp);
            while(IdProspCrea.next()){
                DernIdEntr = IdProspCrea.getInt(1);
            }
            IdProspCrea.close();
            return DernIdEntr;
        }
        catch(Exception ex){
            throw new Exception("Impossible de récupérer le numéro d'identifiant du dernier prospect créé");
        }
    }
    
    /**
     * Méthode de classe permettant de récupérer l'identifiant du prospect qui va être créé dans le champ correspondant du formulaire prospect
     * @return Retourne une chaine de caractère 
     * @throws Exception Renvoie une exception si la modification du dernier identifiant entré n'a pas eu lieu
     */
    public static String AffDernId() throws Exception{
        String DernId;
        int tailleChaine;
        int PartModif;
        try{
            RecupDernIdProsp();
            tailleChaine = Integer.toString(DernIdEntr).length();
            PartModif = Integer.parseInt(Integer.toString(DernIdEntr).substring(4, tailleChaine));
            DernId = Integer.toString(DernIdEntr).substring(0, 4) + Integer.toString(PartModif + 1);
            return DernId;
        }
        catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    
    /**
     * Méthode de classe permettant de créer un identifiant prospect au format indiqué dans le cahier des charges
     * @return Retourne un identifiant qui correspont au format demandé dans le cahier des charges
     * @throws Exception Retourne une erreur si un nouveau identifiant de prospect n'a pas pu être créé
     */
    public static int NouvIdProsp() throws Exception{
        try{
            int idNouvProsp = 0;
            String nouvEntr;
            Calendar calendrier =new GregorianCalendar();
            calendrier.setTime(new Date());
            int annee =calendrier.get(Calendar.YEAR);
            int longueurChaine;
            int PartIdModif;
            
            if(DernIdEntr == 0){
                RecupDernIdProsp();
                if(DernIdEntr == 0){
                    nouvEntr = Integer.toString(annee) + "1";
                    idNouvProsp = Integer.parseInt(nouvEntr);
                }
                else{
                   int DernAnnEntr = Integer.parseInt(Integer.toString(DernIdEntr).substring(0, 4));
                   if(DernAnnEntr != annee){
                       nouvEntr = Integer.toString(annee) + "1";
                       idNouvProsp = Integer.parseInt(nouvEntr);
                       DernIdEntr = idNouvProsp;
                   }
                   else{
                       longueurChaine = Integer.toString(DernIdEntr).length();
                       PartIdModif = Integer.parseInt(Integer.toString(DernIdEntr).substring(4, longueurChaine));
                       nouvEntr = Integer.toString(DernAnnEntr) + Integer.toString(PartIdModif + 1);
                       idNouvProsp = Integer.parseInt(nouvEntr);
                       DernIdEntr = idNouvProsp;
                   }
                }
            }
            else{
                int DernAnnEntr = Integer.parseInt(Integer.toString(DernIdEntr).substring(0, 4));
                   if(DernAnnEntr != annee){
                       nouvEntr = Integer.toString(annee) + "1";
                       idNouvProsp = Integer.parseInt(nouvEntr);
                       DernIdEntr = idNouvProsp;
                   }
                   else{
                       longueurChaine = Integer.toString(DernIdEntr).length();
                       PartIdModif = Integer.parseInt(Integer.toString(DernIdEntr).substring(4, longueurChaine));
                       nouvEntr = Integer.toString(DernAnnEntr) + Integer.toString(PartIdModif + 1);
                       idNouvProsp = Integer.parseInt(nouvEntr);
                       DernIdEntr = idNouvProsp;
                   }
            }
            return idNouvProsp;
        }
        catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
