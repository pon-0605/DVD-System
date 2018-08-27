package beans;

import db.VideoDb;
import entity.Tyukan;
import java.util.Date;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Named
@RequestScoped
public class TyukanBean {

    private int money1; //10000 
    private int money2; //5000
    private int money3; //2000
    private int money4; //100
    private int money5; //500
    private int money6; //100
    private int money7; //50
    private int money8; //10
    private int money9; //5
    private int money10; //1

    private static int earnings; //合計額
    private int planned_amount; //予定額
    private int profit_loss; //差額

    @Temporal(TemporalType.TIMESTAMP)
    private Date datec; //日付
    private String cash_number = "130001A";//レジ番号
    private String store_code = "9701001";//店舗Code
    
    @EJB
    VideoDb db;
    
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
    
    //合計額を求める
    public int goukeiKeisan() {
        earnings = ((money1 * 10000) + (money2 * 5000) + (money3 * 2000) + (money4 * 1000) + (money5 * 500) + (money6 * 100)
                + (money7 * 50) + (money8 * 10) + (money9 * 5) + (money10 * 1));
        this.setEarnings(earnings);
        
        return 0;
    }

    //差額を求める
    public int sagakuKeisan() {
        profit_loss = earnings - planned_amount;
        this.setPlanned_amount(planned_amount);
        return 0;
    }
    
    public Date getTime(Date datec) {
        datec = new Date();
        this.setDatec(datec);
        return null;
    }
    
    public void create() {
        this.getTime(datec);
        this.sagakuKeisan();
        Tyukan ty = new Tyukan(datec, cash_number, store_code, profit_loss, earnings, planned_amount);
       
        try {
            db.create(ty);
        }catch(Exception e) {
            System.out.print("はいだめーーーー");
        }
    }
    
    public String find() {
        
    }
    
    //クリアボタン押下
    
    public void clear() {
        this.money1 = 0;
        this.money2 = 0;
        this.money3 = 0;
        this.money4 = 0;
        this.money5 = 0;
        this.money6 = 0;
        this.money7 = 0;
        this.money8 = 0;
        this.money9 = 0;
        this.money10 = 0;
       
    }
}
