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
    Date d = new Date();
    SimpleDateFormat d2 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
    String day = d2.format(d); 

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
