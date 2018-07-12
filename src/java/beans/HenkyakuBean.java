package beans;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HenkyakuBean {
    private Integer No;
    private String Title;   //タイトル
    private String Rank;    
    private String Henkyakubi;  //返却予定日
    private Integer Enissu;     //延滞日数
    private Integer Ehonsu;     //延滞本数
    private Integer Eryoukin;   //延滞料金
    private Integer Azukari;    //預金
    private Integer Oturi;      //おつり
    private boolean edidata;    //編集可能判定
   
    public HenkyakuBean(){
    }
    
    public HenkyakuBean(Integer No,String Title,String Rank,String Henkyakubi){
        this.No = No;
        this.Title = Title;
        this.Rank = Rank;
        this.Henkyakubi = Henkyakubi;
    }

    public Integer getNo() {
        return No;
    }

    public void setNo(Integer No) {
        this.No = No;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    public String getHenkyakubi() {
        return Henkyakubi;
    }

    public void setHenkyakubi(String Henkyakubi) {
        this.Henkyakubi = Henkyakubi;
    }

    public Integer getEnissu() {
        return Enissu;
    }

    public void setEnissu(Integer Enissu) {
        this.Enissu = Enissu;
    }

    public Integer getEhonsu() {
        return Ehonsu;
    }

    public void setEhonsu(Integer Ehonsu) {
        this.Ehonsu = Ehonsu;
    }

    public Integer getEryoukin() {
        return Eryoukin;
    }

    public void setEryoukin(Integer Eryoukin) {
        this.Eryoukin = Eryoukin;
    }

    public Integer getAzukari() {
        return Azukari;
    }

    public void setAzukari(Integer Azukari) {
        this.Azukari = Azukari;
    }

    public Integer getOturi() {
        return Oturi;
    }

    public void setOturi(Integer Oturi) {
        this.Oturi = Oturi;
    }

    public boolean isEdidata() {
        return edidata;
    }

    public void setEdidata(boolean edidata) {
        this.edidata = edidata;
    }
    
      
}
