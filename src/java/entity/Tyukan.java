package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="CASH_REGISTER")
public class Tyukan implements Serializable{
   @Transient
    private int money1 ; //10000 
   @Transient
    private int money2 ; //5000
   @Transient
    private int money3; //2000
   @Transient
    private int money4; //100
   @Transient
    private int money5; //500
   @Transient
    private int money6; //100
   @Transient
    private int money7; //50
   @Transient
    private int money8; //10
   @Transient
    private int money9; //5
   @Transient
    private int money10; //1
    
    private int earnings; //合計額
    private int planned_amount; //予定額
    private int profit_loss; //差額
    
    @Temporal(TemporalType.TIMESTAMP)
    @Id
    private Date datec; //日付
    @Id
    private String cash_number;//レジ番号
    private String store_code;//店舗Code
       
    public Tyukan(){}
    
    public Tyukan(int money1, int money2, int money3, int money4, int money5, int money6, int money7,
            int money8, int money9, int money10) {
        this.money1 = money1;
        this.money2 = money2;
        this.money3 = money3;
        this.money4 = money4;
        this.money5 = money5;
        this.money6 = money6;
        this.money7 = money7;
        this.money8 = money8;
        this.money9 = money9;
        this.money10 = money10;
    }
    
    
    public Tyukan(Date datec, String cash_number, String store_code, int profit_loss, int earnings, int planned_amount) {
        this.earnings = earnings;
        this.planned_amount = planned_amount;
        this.profit_loss = profit_loss;
        this.datec = datec;
        this.cash_number = cash_number;
        this.store_code = store_code;
    }
    
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

    public int getEarnings() {
        return earnings;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }

    public int getPlanned_amount() {
        return planned_amount;
    }

    public void setPlanned_amount(int planned_amount) {
        this.planned_amount = planned_amount;
    }

    public int getProfit_loss() {
        return profit_loss;
    }

    public void setProfit_loss(int profit_loss) {
        this.profit_loss = profit_loss;
    }

    public Date getDatec() {
        return datec;
    }

    public void setDatec(Date datec) {
        this.datec = datec;
    }

    public String getCash_number() {
        return cash_number;
    }

    public void setCash_number(String cash_number) {
        this.cash_number = cash_number;
    }

    public String getStore_code() {
        return store_code;
    }

    public void setStore_code(String store_code) {
        this.store_code = store_code;
    }
    
}


