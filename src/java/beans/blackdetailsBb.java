package beans;

import java.util.Date;

public class blackdetailsBb {
    
    private Date hiduke;          // 日付
    private Integer kasihon;      // 貸出本数
    private String henzumi;       // 返却済みか否か 本来ならboolean?
    private String entai;         // 延滞したか否か 本来ならboolean?
    
    public blackdetailsBb() {
    }
    
    public blackdetailsBb(Date hiduke,Integer kasihon,String henzumi,String entai) {
        this.hiduke = hiduke;
        this.kasihon = kasihon;
        this.henzumi =  henzumi;
        this.entai = entai;
    }

    public Date getHiduke() {
        return hiduke;
    }

    public void setHiduke(Date hiduke) {
        this.hiduke = hiduke;
    }

    public Integer getKasihon() {
        return kasihon;
    }

    public void setKasihon(Integer kasihon) {
        this.kasihon = kasihon;
    }

    public String getHenzumi() {
        return henzumi;
    }

    public void setHenzumi(String henzumi) {
        this.henzumi = henzumi;
    }

    public String getEntai() {
        return entai;
    }

    public void setEntai(String entai) {
        this.entai = entai;
    }
    
}
