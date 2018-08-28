package beans;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class RentalBean {

    private String Opus_code;                                                   //作品コード
    private String Phonetic_opus_name;                                          //作品名カナ
    private String Opus_name = "スター・ウォーズ／最後のジェダイ";                //作品名
    private Date Release_date;                                                  //発売日
    private String Remarks;                                                     //備考
    private int New_flag=1;                                                     //新作フラグ(1=新作,2=準新作,3=旧作)
    private String Genre_code;                                                  //ジャンルコード

    private String rental_period;                                               //レンタル期間
    private int rental_fee;                                                     //レンタル料金
    private String new_release_rank;                                            //新作フラグ変換

    public void toNew_release_rank(int New_flag) {
        if (New_flag == 1) {
            new_release_rank = "新作";
        }
        if (New_flag == 2) {
            new_release_rank = "準新作";
        }
        if (New_flag == 3) {
            new_release_rank = "旧作";
        }
    }

    //押した泊数の保持
    public void toRental_period(String value) {
        if (value.equals("当日")) {
            rental_period = "当日";
        }
        if (value.equals("１泊２日")) {
            rental_period = "１泊２日";
        }
        if (value.equals("２泊３日")) {
            rental_period = "２泊３日";
        }
        if (value.equals("７泊８日")) {
            rental_period = "７泊８日";
        }
        System.out.print(rental_period);
    }

    public void toRental_fee() {
        //新作当日200円
        if ((New_flag != 1) && "当日".equals(rental_period)) {
            rental_fee = 200;
        }
        //準新作当日200円
        if ((New_flag != 2) && "当日".equals(rental_period)) {
            rental_fee = 200;
        }
        //新作1泊2日260円
        if ((New_flag != 1) && "１泊２日".equals(rental_period)) {
            rental_fee = 260;
        }
        //準新作1泊2日260円
        if ((New_flag != 2) && "１泊２日".equals(rental_period)) {
            rental_fee = 260;
        }
        //準新作2泊3日300円
        if ((New_flag != 2) && "２泊３日".equals(rental_period)) {
            rental_fee = 300;
        }
        //旧作7泊8日160円
        if ((New_flag != 3) && "７泊８日".equals(rental_period)) {
            rental_fee = 200;
        }
    }

    class rental_charge_identification {

    }

    public String getOpus_code() {
        return Opus_code;
    }

    public void setOpus_code(String Opus_code) {
        this.Opus_code = Opus_code;
    }

    public String getPhonetic_opus_name() {
        return Phonetic_opus_name;
    }

    public void setPhonetic_opus_name(String Phonetic_opus_name) {
        this.Phonetic_opus_name = Phonetic_opus_name;
    }

    public String getOpus_name() {
        return Opus_name;
    }

    public void setOpus_name(String Opus_name) {
        this.Opus_name = Opus_name;
    }

    public Date getRelease_date() {
        return Release_date;
    }

    public void setRelease_date(Date Release_date) {
        this.Release_date = Release_date;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    public int getNew_flag() {
        return New_flag;
    }

    public void setNew_flag(int New_flag) {
        this.New_flag = New_flag;
    }

    public String getGenre_code() {
        return Genre_code;
    }

    public void setGenre_code(String Genre_code) {
        this.Genre_code = Genre_code;
    }

    public String getRental_period() {
        return rental_period;
    }

    public void setRental_period(String rental_period) {
        this.rental_period = rental_period;
    }

    public int getRental_fee() {
        return rental_fee;
    }

    public void setRental_fee(int rental_fee) {
        this.rental_fee = rental_fee;
    }

    public String getNew_release_rank() {
        return new_release_rank;
    }

    public void setNew_release_rank(String new_release_rank) {
        this.new_release_rank = new_release_rank;
    }

}
