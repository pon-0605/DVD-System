package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Taikai implements Serializable{
    
    @Id @NotNull
    private String no;
    private String name1;
    private String name2;
    private boolean mail;
    
    public Taikai() {}
    
    public Taikai(String no, String name1, String name2) {
        this.no = no;
        this.name1 = name1;
        this.name2 = name2;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public boolean isMail() {
        return mail;
    }

    public void setMail(boolean mail) {
        this.mail = mail;
    }
    
    
}
