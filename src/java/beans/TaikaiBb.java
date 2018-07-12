package beans;

import db.VideoDb;
import entity.Taikai;
import java.io.Serializable;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

@Named
@ViewScoped
public class TaikaiBb implements Serializable {
    
    @NotNull
    private String no;
    private String name1;
    private String name2;
    
    @EJB
    VideoDb db;
    @Inject
    transient Logger log;
    
    public String delete(Taikai taikai) {
        db.delete(taikai);
        return null;
    }
    
    
}
