package beans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@RequestScoped
public class HenkyakuBean implements Serializable{
    @Inject
    HenkyakuBb henkyakuBb;
    
    private Integer No;
    private String Title;   //タイトル
    private String Rank;    
    private String Henkyakubi;  //返却予定日
    private Integer Enissu = 10;     //延滞日数
    private Integer Ehonsu = 4;     //延滞本数
    private Integer Eryoukin ;   //延滞料金
    private Integer Azukari  ;   //預金
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
    
    public HenkyakuBean(Integer Eryoukin,Integer Azukari,Integer Oturi){
        this.Eryoukin = Eryoukin;
        this.Azukari = Azukari;
        this.Oturi = Oturi;
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
        Eryoukin = Ehonsu * (Enissu *300);
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
    
    public void clear(){
        this.No=0;
        this.Title="";
        this.Rank="";
        this.Henkyakubi="";
        this.Enissu=0;
        this.Ehonsu=0;
        this.Eryoukin=0;
        this.Azukari=0;
        this.Oturi=0;
        henkyakuBb.clear1();
    }
    public Integer turikeisan(){
        Oturi =  Enissu + Ehonsu;
        return Oturi;
    }
      
}
    
    
    
