package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TaikaiBean {
    
    public String next(){
        return "templates/taikai.xhtml";
    }
}
