/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

/**
 *
 * @author Pablo
 */
public class MailListReader {
    
    public static List<Mail> read(String fileName) {
        List<Mail> mailList = new ArrayList<>();
        
        try {
            System.out.println("hey");
            BufferedReader br = new BufferedReader(
                    new FileReader(new File(fileName)));
            
            String line = "";
            while((line = br.readLine()) != null) {
                if(Mail.isValidMail(line)) {
                    mailList.add(new Mail(line));
                }
            }
        } catch(Exception e) {
            System.out.println("Problema leyendo el fichero " + fileName + ".");
        }
        
        return mailList;
    }
    
    public boolean isValidMail(String mail) {
        return true;
    }
    
}
