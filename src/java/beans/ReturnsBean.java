package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ReturnsBean {
    
    public String next() {
        return "return.xhtml";
    }
}
