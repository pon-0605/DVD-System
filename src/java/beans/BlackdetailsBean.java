package beans;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class BlackdetailsBean {
    
    private List <blackdetailsBb> details ;
    {
        details = new ArrayList<>();
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","○"));
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","×"));
        details.add(new blackdetailsBb(null,5,"○","×"));
    }
    
    public String next(){
        return "/templates/blackdetails.xhtml";
    }
    
    public List<blackdetailsBb> getDetails() {
        return details;
    }

    public void setDetails(List<blackdetailsBb> details) {
        this.details = details;
    }
    
}
