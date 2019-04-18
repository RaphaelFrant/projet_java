package Classe;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Classe abstraire pour lier l'application à la base de données
 * @author Raphaël Frantzen 
 * @version 12
 * Récupération des raisons sociales des prospects
 */

public abstract class ClasseConnexion {
    
    protected static Connection connexBase = null;

    
    /**
     * Méthode permettant d'éviter les injections sql en transformant les apostrophes
     * @param phraseVerif Chaine de caractère à vérifier et à remplacer
     * @return Retourne une phrase qui empèche les injections SQL dans les champs du formulaire qui seront envoyés à la BDD
     */
    protected static String GestStringInject(String phraseVerif) {
        return phraseVerif.replaceAll("'", "\\\\'");
    }
    
    /**
     * Méthode pour effectuer la connection avec la base de données
     * @return retourne un élément de type Connection qui permet d'ouvrir le lien avec la base de données
     * @throws Exception Renvoie une exception si la connection n'a pas eu lieu ou si le driver est erroné
     */
    public static Connection connection() throws Exception{
        File fichierConnex = null;
        try{
            final Properties propConnex = new Properties();
            fichierConnex = new File("C:\\Users\\Stagiaire\\Documents\\Cours\\dev_appli_interactive\\projet_java\\Projet_Java\\src\\Properties\\config.properties");
            
            if(!fichierConnex.exists()){
                fichierConnex = new File("config.properties");
            }
            
            FileInputStream lienConnex = new FileInputStream(fichierConnex);
            propConnex.load(lienConnex);
            String driver = (propConnex.getProperty("sgbd.driver"));
            String adrBdd = propConnex.getProperty("sgbd.chaineConnex");
            String user = propConnex.getProperty("sgbd.login");
            String password = propConnex.getProperty("sgbd.password");
            
            Class.forName(driver);
            connexBase = DriverManager.getConnection(adrBdd, user, password);
        }
        catch(ClassNotFoundException ex){
            throw new Exception("problème class.forname" + ex.getMessage());
        }
        
        catch(Exception ex){
            throw new Exception("La connexion n'a pas pu avoir lieu" + ex.getMessage());
        }
        return connexBase;
    }
}
