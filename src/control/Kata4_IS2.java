/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

/**
 *
 * @author Pablo
 */
public class Kata4_IS2 {

    /**
     * @param args the command line arguments
     */
    
    private String fileName;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    
    public static void main(String[] args) {
        Kata4_IS2 kata = new Kata4_IS2();
        kata.execute();
    }
    
    private void execute() {
        input();
        process();
        output();
    }
    
    private void input() {
        fileName = "mail.txt";
        mailList =  MailListReader.read(fileName);
    }
    
    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output() {
        histoDisplay = new HistogramDisplay(
                "Histograma Leyendo de Fichero", histogram);
        histoDisplay.execute();
    }
    
}
