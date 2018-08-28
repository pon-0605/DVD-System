package db;

import entity.Taikai;
import entity.Cash_register;
import entity.Register_sales;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class VideoDb {
    
    @PersistenceContext
    private EntityManager em;
    
    public void create(Cash_register tyukan) {
        em.persist(tyukan);
    }
    
    public void find() {
        TypedQuery<Register_sales> r = em.createNamedQuery("Number", Register_sales.class);
        r.setParameter(1, Register_sales.Number);
        List<Register_sales> list = r.getResultList();
        System.out.print(list);
    }
    
    public void update() {
        //em.merge();
    }
    
    public void delete(Taikai taikai) {
        em.remove(em.merge(taikai));
    }
    
    public List<Taikai> getAll() {
        return em.createQuery("null").getResultList();
    }
}
