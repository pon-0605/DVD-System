package beans;

import java.util.Date;

public class Blackmember {
    
    private String name;	// 名前
    private String number;	// 会員番号
    private Date date;          // 日付
    private Integer kasi;       // 貸出回数
    private Integer entai;      // 延滞回数
    private Integer henkyaku;   // 返却率
    private String kome;        // コメント
    
    public Blackmember() {
    }
    
    public Blackmember(String name, String number, Date date, Integer kasi, Integer entai, Integer henkyaku, String kome) {
        this.name = name;
        this.number = number;
        this.date = date;
        this.kasi = kasi;
        this.entai = entai;
        this.henkyaku = henkyaku;
        this.kome = kome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getKasi() {
        return kasi;
    }

    public void setKasi(Integer kasi) {
        this.kasi = kasi;
    }

    public Integer getEntai() {
        return entai;
    }

    public void setEntai(Integer entai) {
        this.entai = entai;
    }

    public Integer getHenkyaku() {
        return henkyaku;
    }

    public void setHenkyaku(Integer henkyaku) {
        this.henkyaku = henkyaku;
    }

    public String getKome() {
        return kome;
    }

    public void setKome(String kome) {
        this.kome = kome;
    }
    
}
