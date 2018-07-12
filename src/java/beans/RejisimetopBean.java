package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class RejisimetopBean {
    
    public String next() {
        return "/templates/rejisimetop.xhtml";
    }
    
    public String next1() {
        return null;
    }
    
    public String next2() {
        return null;
    }
}
