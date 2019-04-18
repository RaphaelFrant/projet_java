package Classe;


import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Classe héritée de la classe Connection à la base de données pour le client
 * @author Raphaël Frantzen 
 * @version 12
 * Récupération des raisons sociales des prospects
 */

public class BddClient extends ClasseConnexion {

    /**
     * Méthode permettant de récupérer les 10 clients avec le plus gros chiffre d'affaire
     * @return Retourne une ArrayList avec les informations qui serviront à remplir le formulaire Affichage
     * @throws Exception Renvoie une exception si la requête SQL est erronée ou si l'ArrayList ne peut pas être remplie
     */
    public static ArrayList recupClient() throws Exception {
        try{
            connection();
            String RequetRecup = "Select IdClient, RaisonSociale, CaEntrep from Client order by CaEntrep DESC LIMIT 10";
            Statement DeclarTabRecup = connexBase.createStatement();
            ResultSet ListInfClient = DeclarTabRecup.executeQuery(RequetRecup);
            ArrayList ClientRecup = new ArrayList();
            while(ListInfClient.next()){
                ClientRecup.add(ListInfClient.getInt(1));
                ClientRecup.add(ListInfClient.getString(2));
                ClientRecup.add(ListInfClient.getInt(3));
            }
            ListInfClient.close();
            return ClientRecup;
        }
        catch(Exception ex){
            throw new Exception("Impossible de récupérer les clients");
        }
    }

    /**
     * Méthode pour envoyer la requête SQL à la base de données locale
     * @param listParamCrea Reçoit une arraylist regroupant toutes les informations du client entrées dans les champs du formulaire
     * @throws Exception Renvoit  une exception si la requête SQL est erronée ou si les éléments de l'ArrayList récupérée ne sont pas conforme à la tablea client
     */
    public void creaClient(ArrayList listParamCrea) throws Exception{
        String RequetCrea;
        try{
            RequetCrea = "Insert into client (RaisonSociale, TypeEntrep, DomaineEntrep, AdrEntrep, TelEntrep, NbrEmpEntrep, CommentaireEntrep, "
                    + "CaEntrep, DateDebContr, MontantClient) values ( ";
            RequetCrea += "'" + GestStringInject(listParamCrea.get(0).toString())   + "', ";
            RequetCrea += "'" + GestStringInject(listParamCrea.get(1).toString())   + "', ";
            RequetCrea += "'" + GestStringInject(listParamCrea.get(2).toString())   + "', ";
            RequetCrea += "'" + GestStringInject(listParamCrea.get(3).toString())   + "', ";
            RequetCrea += "'" + listParamCrea.get(4)                                + "', ";
            RequetCrea += "'" + listParamCrea.get(5)                                + "', ";
            RequetCrea += "'" + GestStringInject(listParamCrea.get(6).toString())   + "', ";
            RequetCrea += "'" + listParamCrea.get(7)                                + "', ";
            RequetCrea += "'" + listParamCrea.get(8)                                + "', ";
            RequetCrea += "'" + listParamCrea.get(9)                                + "') ";
            
            connection();
            Statement Declaration = connexBase.createStatement();
            Declaration.executeUpdate(RequetCrea);
            Declaration.close();
        }
        catch(Exception ex){
            throw new Exception("La requête SQL comporte des erreurs et n'a pas pu aboutir.");
        }
    }

    /**
     * Méthode pour récupérer les raisons sociales de tous les clients afin de charger la combobox pour choisir le client à modifier
     * @return Retourne une arrayList avec la liste des clients existants dans la base de données
     * @throws Exception Renvoie une exception si l'arrayList n'a pas pu être chargé
     */
    public static ArrayList choixCmbBox() throws Exception{
        try{
            connection();
            Statement StateModifCli = connexBase.createStatement();
            ResultSet ListClient = StateModifCli.executeQuery("Select RaisonSociale from client");
            ArrayList ListChoixClient = new ArrayList();
            while(ListClient.next()){
                ListChoixClient.add(ListClient.getString(1));
            }
            ListClient.close();
            return ListChoixClient;
        }
        catch(Exception ex){
            throw new Exception("La requête SQL n'a pas pu aboutir.");        
        }
    }

    /**
     * Méthode permettant de réaliser la modification des informations d'un client dans la base de données
     * @param listParamModif Reçoit une arraylist regroupant toutes les informations du client entrées dans les champs du formulaire
     * @throws Exception Renvoie une exception si la requête est erronée ou si la modification n'a pas eu lieu
     */
    public void modifCli(ArrayList listParamModif) throws Exception {
        String ModifClientBdd;
        try{
            ModifClientBdd  = "Update client set ";
            ModifClientBdd += "RaisonSociale = '" +           GestStringInject(listParamModif.get(1).toString())  + "', ";
            ModifClientBdd += "TypeEntrep = '" +              listParamModif.get(2)                               + "', ";
            ModifClientBdd += "DomaineEntrep = '" +           GestStringInject(listParamModif.get(3).toString())  + "', ";
            ModifClientBdd += "AdrEntrep = '" +               GestStringInject(listParamModif.get(4).toString())  + "', ";
            ModifClientBdd += "TelEntrep = '" +               listParamModif.get(5)                               + "', ";
            ModifClientBdd += "NbrEmpEntrep = '" +            listParamModif.get(6)                               + "', ";
            ModifClientBdd += "CommentaireEntrep = '" +       GestStringInject(listParamModif.get(7).toString())  + "', ";
            ModifClientBdd += "CaEntrep = '" +                listParamModif.get(8)                               + "', ";
            ModifClientBdd += "DateDebContr = '" +            listParamModif.get(9)                               + "', ";
            ModifClientBdd += "MontantClient = '" +           listParamModif.get(10)                              + "'";
            ModifClientBdd += " where IdClient = " + "'" +    listParamModif.get(0)                               + "'";
            connection();
            Statement DeclarClientModif = connexBase.createStatement();
            DeclarClientModif.executeUpdate(ModifClientBdd);
            DeclarClientModif.close();
        }
        catch(Exception ex){
            throw(new Exception(ex.getMessage()));
        }
    }

    /**
     * Méthode permettant de récupérer les informations d'un client dans la base de données pour modification
     * @param NomRsClient Récupère la raison sociale du client à modifier choisi par l'utilisateur
     * @return Renvoie un client avec l'ensemble des champs remplis
     */
    public static Client formModifClient(String NomRsClient)throws Exception{
        try{
            Client LeClient = new Client();
            connection();
            Statement DeclarInfoClient = connexBase.createStatement();
            String RequetSelectCli = "Select * from client where RaisonSociale = '" + NomRsClient + "'";
            ResultSet InfoClient = DeclarInfoClient.executeQuery(RequetSelectCli);
            while(InfoClient.next()){
                LeClient.setIdEntrep(InfoClient.getInt("IdClient"));
                LeClient.setRaisonSociale(InfoClient.getString("RaisonSociale"));
                LeClient.setTypeEntrep(InfoClient.getString("TypeEntrep"));
                LeClient.setDomaineEntrep(InfoClient.getString("DomaineEntrep"));
                LeClient.setAdrEntrep(InfoClient.getString("AdrEntrep"));
                LeClient.setTelEntrep(InfoClient.getString("TelEntrep"));
                LeClient.setNbrEmpEntrep(InfoClient.getLong("NbrEmpEntrep"));
                LeClient.setCommentaireEntrep(InfoClient.getString("CommentaireEntrep"));
                LeClient.setCaEntrep(InfoClient.getInt("CaEntrep"));
                LeClient.setDateDebContr(LocalDate.parse(InfoClient.getString("DateDebContr").substring(0, 10)));
                LeClient.setMontantCLient(InfoClient.getInt("MontantClient"));
            }    
            InfoClient.close();
            return LeClient; 
        }
        catch(Exception ex){
            throw new Exception("La récupération des informations du client n'a pas pu avoir lieu.");
        }
    }
    
    /**
     * Méthode permettant de récupérer le dernier numéro de client créé
     * @return Retourn une chaine de caractère avec le dernier numéro de client créé
     * @throws Exception Renvoie une exception en cas d'erreur dans la requête
     */
    public static String RecupDernIdEntr() throws Exception{
        try{
            connection();
            String DernIdEntr = null;
            Statement DeclarDernId = connexBase.createStatement();
            String RequetSelectId = "Select max(IdClient) from Client";
            ResultSet IdClientCrea = DeclarDernId.executeQuery(RequetSelectId);
            while(IdClientCrea.next()){
                DernIdEntr = IdClientCrea.getString(1);
            }
            IdClientCrea.close();
            return DernIdEntr;
        }
        catch(Exception ex){
            throw new Exception("Impossible de récupérer le numéro d'identifiant du dernier client créé");
        }
    }

}
