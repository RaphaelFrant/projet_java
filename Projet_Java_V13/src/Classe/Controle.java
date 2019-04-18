
package Classe;

import java.util.regex.*;
import javax.swing.text.JTextComponent;

/**
 * Classe abstraite permettant de réaliser les contrôle dans les champs des formulaires
 * @author Raphaël Frantzen 
 * @version 12
 * Récupération des raisons sociales des prospects
 */
public abstract class Controle {

    
    /**
     * Méthode permettant de vérifier si les champs comportent bien des numériques
     * @param champNum les champs numériques où l'on ne veut que des chiffres
     * @throws Exception Renvoie une exception si l'un des champs concernés n'est pas composé uniquement de numérique
     */
    public static void GestChampNum(JTextComponent champNum) throws Exception{
        try{
            Pattern pattNum = Pattern.compile("^[0-9]*$");
            Matcher masqNum = pattNum.matcher(champNum.getText());
            if(!masqNum.matches()){
                throw new Exception("Le nombre d'employé, le chiffre d'affaire et le montant doivent être des entiers positifs");
            }
        }
        catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    
    /**
     * Méthode permettant de vérifier le format du numéro de téléphone
     * @param champTel Récupère la chaine présente dans le champ téléphone pour 
     * @throws Exception renvoie une exception si le numéro de téléphone est au bon format 
     */
    public static void GestNumTel(JTextComponent champTel)throws Exception{
        try{         
                Pattern pattTelephoneLoc = Pattern.compile("^0[1-9]\\d{8}$");
                Pattern pattTelInternatio = Pattern.compile("^\\+[3]{2}[1-9]{1}\\d{8}$");
                Matcher masqueTelLoc = pattTelephoneLoc.matcher(champTel.getText());
                Matcher masqueTelInternatio = pattTelInternatio.matcher(champTel.getText());
                if(!masqueTelLoc.find() && !masqueTelInternatio.find()){
                    throw new Exception("Le numéro de téléphone n'est pas aux normes.");
                }
            }
            catch(Exception ex){
                throw new Exception(ex.getMessage());
            }
    }
    
    /**
     * Méthode permettant de vérifier que la date est au bon format
     * @param champDate
     * @throws Exception 
     */
    public static void GestDate(JTextComponent champDate) throws Exception{
        try{
            Pattern pattDate = Pattern.compile("^[0-9]{4}\\-[0-9]{2}\\-[0-9]{2}$");
            Matcher masqDate = pattDate.matcher(champDate.getText());
            if(!masqDate.find()){
                throw new Exception("La date n'est pas au bon format.");
            }
        }
        catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    
    /**
     * Méthode permettant d'éviter les problèmes avec  en transformant les apostrophes
     * @param champ Champ du formulaire qui vont être vérifiés
     */
    public static void GestGuillemet(JTextComponent champ) throws Exception{
        try{
            champ.setText(Pattern.compile(" \" ").matcher(champ.getText()).replaceAll("\\\""));
        }
        catch(Exception ex){
            throw new Exception("Les apostrophes présentes dans le champ n'ont pas pu être doublées.");
        }
    }
}
