package db;

import entity.Taikai;
import entity.Cash_register;
import entity.Register_sales;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class VideoDb {
    
    @PersistenceContext
    private EntityManager em;
    
    public void create(Cash_register tyukan) {
        em.persist(tyukan);
    }
    /*
    public List<Register_sales> find(String key) {
        Query r = em.createNamedQuery(Register_sales.Number, Register_sales.class).setParameter("cash", key);
        return r.getResultList();       
    }
    */
    public void update() {
        //em.merge();
    }
    
    public void delete(Taikai taikai) {
        em.remove(em.merge(taikai));
    }
    
}
