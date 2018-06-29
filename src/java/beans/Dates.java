/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author s20163025
 */
@Named
@RequestScoped
public class Dates {
    Dates d = new Dates();
    
    SimpleDateFormat d2 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
    String date = d2.format(d);

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
