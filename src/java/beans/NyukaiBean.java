/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Arrays;


public class NyukaiBean {
    private Integer Kno;
    private Integer Id;
    private String Namek;
    private String Name;
    private String Birth;
    private Integer Age;
    private String Addressk;
    private String Address;
    private Integer Pno;
    private String Email;
    private String Job;
    private String Certificate;
    private String No;
    private Integer[] Check;
    
    @Override 
        public String toString(){
        return Arrays.toString(Check);
    }

    public Integer getKno() {
        return Kno;
    }

    public void setKno(Integer Kno) {
        this.Kno = Kno;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getNamek() {
        return Namek;
    }

    public void setNamek(String Namek) {
        this.Namek = Namek;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBirth() {
        return Birth;
    }

    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public String getAddressk() {
        return Addressk;
    }

    public void setAddressk(String Addressk) {
        this.Addressk = Addressk;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Integer getPno() {
        return Pno;
    }

    public void setPno(Integer Pno) {
        this.Pno = Pno;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        this.Job = job;
    }

    public String getCertificate() {
        return Certificate;
    }

    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String No) {
        this.No = No;
    }

    public Integer[] getCheck() {
        return Check;
    }

    public void setCheck(Integer[] Check) {
        this.Check = Check;
    }
    
    
    
    
    
}
