/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.model;

/**
 *
 * @author Alber
 */
public class Mail {

    String mail; 

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain(){
        return this.mail.substring(this.mail.indexOf("@")+1);
    }
    
    public static boolean isMail(String lineFile){
        return lineFile.matches("[-\\w\\.]+@\\w+\\.\\w+");
    }
    
}
