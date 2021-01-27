/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Histogram;
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
    public static void main(String[] args) {
        Histogram<String> histogram = MailHistogramBuilder.build(
                MailListReader.read("mail.txt"));
        
        HistogramDisplay histoDisplay = new HistogramDisplay(
                "Histograma Leyendo de Fichero", histogram);
        
        histoDisplay.execute();
    }
    
}
