package beans;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TaikaiBean implements Serializable{
    
   
    private String no = "114514";
    private String name1 = "おおもりちな";
    private String name2 = "大森ちな";
    private boolean mail;
    
    public TaikaiBean() {}
    
    public TaikaiBean(String no, String name1, String name2) {
        this.no = no;
        this.name1 = name1;
        this.name2 = name2;
    }
    
    public String next(){
        return "/templates/taikai.xhtml";
    }
    
    public void clear() {
        no = null;
        name1 = null;
        name2 = null;
    }
    
    public boolean isMail() {
        return mail;
    }

    public void setMail(boolean mail) {
        this.mail = mail;
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
}
