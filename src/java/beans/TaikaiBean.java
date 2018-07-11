package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TaikaiBean {
    
    private boolean mail;
    private String name1 = "おおもりぴえろ";
    private String name2 = "大森ピエロ";
    
    public String next(){
        return "templates/taikai.xhtml";
    }
    
    public void clear() {
        name1 = null;
        name2 = null;
    }

    public boolean isMail() {
        return mail;
    }

    public void setMail(boolean mail) {
        this.mail = mail;
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
    
    

}
