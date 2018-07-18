package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TyukanBb {
    
    private String money1; //10000
    private String money2; //5000
    private String money3; //2000
    private String money4; //1000
    private String money5; //500
    private String money6; //100
    private String money7; //50
    private String money8; //10
    private String money9; //5
    private String money10; //
    
    private int goukei; //合計額
    
   /* public TyukanBb() {
        this.money1 = null;
        this.money1 = null;
        this.money1 = null;
        this.money1 = null;
        this.money1 = null;
        this.money1 = null;
        this.money1 = null;
        this.money1 = null;
        this.money1 = null;
    }*/

    public String getMoney1() {
        return money1;
    }

    public void setMoney1(String money1) {
        this.money1 = money1;
    }

    public String getMoney2() {
        return money2;
    }

    public void setMoney2(String money2) {
        this.money2 = money2;
    }

    public String getMoney3() {
        return money3;
    }

    public void setMoney3(String money3) {
        this.money3 = money3;
    }

    public String getMoney4() {
        return money4;
    }

    public void setMoney4(String money4) {
        this.money4 = money4;
    }

    public String getMoney5() {
        return money5;
    }

    public void setMoney5(String money5) {
        this.money5 = money5;
    }

    public String getMoney6() {
        return money6;
    }

    public void setMoney6(String money6) {
        this.money6 = money6;
    }

    public String getMoney7() {
        return money7;
    }

    public void setMoney7(String money7) {
        this.money7 = money7;
    }

    public String getMoney8() {
        return money8;
    }

    public void setMoney8(String money8) {
        this.money8 = money8;
    }

    public String getMoney9() {
        return money9;
    }

    public void setMoney9(String money9) {
        this.money9 = money9;
    }

    public String getMoney10() {
        return money10;
    }

    public void setMoney10(String money10) {
        this.money10 = money10;
    }

    public int getGoukei() {
        return goukei;
    }

    public void setGoukei(int goukei) {
        this.goukei = goukei;
    }
    
    
    
    //合計額を求める
    public int goukei() {
        goukei = (Integer.parseInt(this.money1)) + (Integer.parseInt(this.money2));
        return goukei;
    }
    
}
