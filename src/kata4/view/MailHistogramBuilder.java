/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.view;

import java.util.List;
import kata4.model.Histograma;
import kata4.model.Mail;

/**
 *
 * @author Alber
 */
public class MailHistogramBuilder {
    public static Histograma build(List<Mail>mailList){
        Histograma<String> histogram =  new Histograma();
        for(Mail mail : mailList){
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
