package beans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SeisanBb implements Serializable {
    
        private int money1; //10000
        private int money2; //5000
        private int money3; //2000
        private int money4; //1000
        private int money5; //500
        private int money6; //100    
        private int money7; //50
        private int money8; //10
        private int money9; //5
        private int money10; //1

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

    public int getMoney1() {
        return money1;
    }

    public void setMoney1(int money1) {
        this.money1 = money1;
    }

    public int getMoney2() {
        return money2;
    }

    public void setMoney2(int money2) {
        this.money2 = money2;
    }

    public int getMoney3() {
        return money3;
    }

    public void setMoney3(int money3) {
        this.money3 = money3;
    }

    public int getMoney4() {
        return money4;
    }

    public void setMoney4(int money4) {
        this.money4 = money4;
    }

    public int getMoney5() {
        return money5;
    }

    public void setMoney5(int money5) {
        this.money5 = money5;
    }

    public int getMoney6() {
        return money6;
    }

    public void setMoney6(int money6) {
        this.money6 = money6;
    }

    public int getMoney7() {
        return money7;
    }

    public void setMoney7(int money7) {
        this.money7 = money7;
    }

    public int getMoney8() {
        return money8;
    }

    public void setMoney8(int money8) {
        this.money8 = money8;
    }

    public int getMoney9() {
        return money9;
    }

    public void setMoney9(int money9) {
        this.money9 = money9;
    }

    public int getMoney10() {
        return money10;
    }

    public void setMoney10(int money10) {
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
        goukei = 9;
        return goukei;
    }
    
}
