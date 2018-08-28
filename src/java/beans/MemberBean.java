package beans;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MemberBean {

    private String Membership_number = "10101010";                                             //会員番号
    private String Phonetic_name = "たけくま　あおき";                                          //氏名ふりがな
    private String Name = "武隈　蒼季";                                                         //氏名
    private String Sex = "男";                                                                 //性別
    
    private String Postal_code;                                                                //郵便番号
    private String Phonetic_address;                                                           //住所ふりがな
    private String Address = "北海道札幌市白石区菊水6条3丁目4-28";                               //住所
    private String Phone_number = "011-831-5511";                                              //電話番号
    private String email_address;                                                              //e-mailアドレス
    private String Profession;                                                                 //職業
    private Boolean Black_membership_flag;                                                     //ブラック会員フラグ
    private Date Join_date;                                                                    //入会日
    private Date Expiration_date;                                                              //有効期限
    private String Identification_code;                                                        //身分証明書コード
    private Boolean Leave_signature_flag;                                                      //退会フラグ
    private Date Withdrawal_date;                                                              //退会日
    private String birthday= "199706050";
    private String now="20180723";

    public int calcAge() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return(Integer.parseInt(sdf.format(now)) - Integer.parseInt(sdf.format(birthday))) / 10000;
    }

    public String getMembership_number() {
        return Membership_number;
    }

    public void setMembership_number(String Membership_number) {
        this.Membership_number = Membership_number;
    }

    public String getPhonetic_name() {
        return Phonetic_name;
    }

    public void setPhonetic_name(String Phonetic_name) {
        this.Phonetic_name = Phonetic_name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getPostal_code() {
        return Postal_code;
    }

    public void setPostal_code(String Postal_code) {
        this.Postal_code = Postal_code;
    }

    public String getPhonetic_address() {
        return Phonetic_address;
    }

    public void setPhonetic_address(String Phonetic_address) {
        this.Phonetic_address = Phonetic_address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    public Boolean getBlack_membership_flag() {
        return Black_membership_flag;
    }

    public void setBlack_membership_flag(Boolean Black_membership_flag) {
        this.Black_membership_flag = Black_membership_flag;
    }

    public Date getJoin_date() {
        return Join_date;
    }

    public void setJoin_date(Date Join_date) {
        this.Join_date = Join_date;
    }

    public Date getExpiration_date() {
        return Expiration_date;
    }

    public void setExpiration_date(Date Expiration_date) {
        this.Expiration_date = Expiration_date;
    }

    public String getIdentification_code() {
        return Identification_code;
    }

    public void setIdentification_code(String Identification_code) {
        this.Identification_code = Identification_code;
    }

    public Boolean getLeave_signature_flag() {
        return Leave_signature_flag;
    }

    public void setLeave_signature_flag(Boolean Leave_signature_flag) {
        this.Leave_signature_flag = Leave_signature_flag;
    }

    public Date getWithdrawal_date() {
        return Withdrawal_date;
    }

    public void setWithdrawal_date(Date Withdrawal_date) {
        this.Withdrawal_date = Withdrawal_date;
    }

}
